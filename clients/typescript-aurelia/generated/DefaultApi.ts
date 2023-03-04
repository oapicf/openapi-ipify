/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 3.3.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  Ip,
} from './models';

/**
 * getIp - parameters interface
 */
export interface IGetIpParams {
  format?: 'json' | 'jsonp';
  callback?: string;
}

/**
 * DefaultApi - API class
 */
@autoinject()
export class DefaultApi extends Api {

  /**
   * Creates a new DefaultApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Get your public IP address
   * @param params.format Response format
   * @param params.callback JSONP callback function name
   */
  async getIp(params: IGetIpParams): Promise<Ip> {
    // Verify required parameters are set

    // Create URL to call
    const url = `${this.basePath}/`;

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'format': params['format'],
        'callback': params['callback'],
      })

      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}

