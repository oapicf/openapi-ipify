<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 * The version of the OpenAPI document: 5.3.1-pre.0
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region getIp
    /**
     * Get your public IP address
     * @param \App\DTO\GetIpParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getIpRaw(
        \App\DTO\GetIpParameterData $parameters,
        string $responseMediaType = 'text/plain'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/', [], $this->getQueryParameters($parameters));
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get your public IP address
     * @param \App\DTO\GetIpParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getIp(
        \App\DTO\GetIpParameterData $parameters,
        string $responseMediaType = 'text/plain'
    ): array
    {
        $response = $this->getIpRaw($parameters, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Your public IP address */
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get your public IP address
     * @param \App\DTO\GetIpParameterData $parameters
     * @param string $responseMediaType
     * @return string
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getIpResult(
        \App\DTO\GetIpParameterData $parameters,
        string $responseMediaType = 'text/plain'
    ): string
    {
        return $this->getSuccessfulContent(...$this->getIp($parameters, $responseMediaType));
    }
    //endregion
}

