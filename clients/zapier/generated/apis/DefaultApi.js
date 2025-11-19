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
                    url: utils.replacePathParameters('https://api64.ipify.org/'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'text/plain, text/javascript, application/javascript, application/json',
                    },
                    params: {
                        'format': bundle.inputData?.['format'],
                        'callback': bundle.inputData?.['callback'],
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getIp', response.json);
                    return { data: results };
                })
            },
            sample: { data: {} }
        }
    },
}
