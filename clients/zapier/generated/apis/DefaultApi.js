const samples = require('../samples/DefaultApi');
const Ip = require('../models/Ip');
const utils = require('../utils/utils');

module.exports = {
    getIp: {
        key: 'getIp',
        noun: 'default',
        display: {
            label: 'Get your public IP address',
            description: '',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'format',
                    label: 'Response format',
                    type: 'string',
                    choices: [
                        'json',
                        'jsonp',
                    ],
                },
                {
                    key: 'callback',
                    label: 'JSONP callback function name',
                    type: 'string',
                },
            ],
            outputFields: [
                ...Ip.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.ipify.org/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json, application/javascript, text/plain',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                        'callback': bundle.inputData?.['callback'],
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['IpSample']
        }
    },
}
