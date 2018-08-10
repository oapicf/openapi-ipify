function Invoke-DefaultApiGetIp {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${format},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [String]
        ${callback}
    )

    Process {
        'Calling method: DefaultApi-GetIp' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:DefaultApi.GetIp(
            ${format},
            ${callback}
        )
    }
}

