const samples = require('../samples/DefaultApi');
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
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://api.ipify.org/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'text/plain, application/javascript, application/json',
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
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
}
