param(
    [Parameter()][Alias("g")][String]$GitHost = "github.com",
    [Parameter()][Alias("u")][String]$GitUserId = "oapicf",
    [Parameter()][Alias("r")][String]$GitRepoId = "openapi-ipify",
    [Parameter()][Alias("m")][string]$Message = "Minor update",
    [Parameter()][Alias("h")][switch]$Help
)

function Publish-ToGitHost{
    if ([string]::IsNullOrWhiteSpace($Message) -or $Message -eq "Minor update"){
        # it seems unlikely that we would want our git commit message to be the default, so lets prompt the user
        $Message = Read-Host -Prompt "Please provide a commit message or press enter"
        $Message = if([string]::IsNullOrWhiteSpace($Message)) { "no message provided" } else { $Message }
    }

    git init
    git add .
    git commit -am "${Message}"
    $branchName=$(git rev-parse --abbrev-ref HEAD)
    $gitRemote=$(git remote)

    if([string]::IsNullOrWhiteSpace($gitRemote)){
        git remote add origin https://${GitHost}/${GitUserId}/${GitRepoId}.git
    }

    Write-Output "Pulling from https://${GitHost}/${GitUserId}/${GitRepoId}.git"
    git pull origin $branchName --ff-only

    if ($LastExitCode -ne 0){
        if (${GitHost} -eq "github.com"){
            Write-Output "The ${GitRepoId} repository may not exist yet. Creating it now with the GitHub CLI."
            gh auth login --hostname github.com --web
            gh repo create $GitRepoId --private
            # sleep 2 seconds to ensure git finishes creation of the repo
            Start-Sleep -Seconds 2
        }
        else{
            throw "There was an issue pulling the origin branch. The remote repository may not exist yet."
        }
    }

    Write-Output "Pushing to https://${GitHost}/${GitUserId}/${GitRepoId}.git"
    git push origin $branchName
}

$ErrorActionPreference = "Stop"
Set-StrictMode -Version 3.0

if ($Help){
    Write-Output "
    This script will initialize a git repository, then add and commit all files.
    The local repository will then be pushed to your preferred git provider.
    If the remote repository does not exist yet and you are using GitHub,
    the repository will be created for you provided you have the GitHub CLI installed.
    
    Parameters:
    -g | -GitHost   -> ex: github.com
    -m | -Message   -> the git commit message
    -r | -GitRepoId -> the name of the repository
    -u | -GitUserId -> your user id
    "

    return
}

$rootPath=Resolve-Path -Path $PSScriptRoot/../..

Push-Location $rootPath

try {
    Publish-ToGitHost $GitHost $GitUserId $GitRepoId $Message
}
finally{
    Pop-Location
}