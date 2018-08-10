function New-Ip {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${ip}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.Ip' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.Ip -ArgumentList @(
            ${ip}
        )
    }
}
