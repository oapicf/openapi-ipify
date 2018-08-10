const assert = require('assert');
const Ipify = require('ipify');
const api = new Ipify.DefaultApi();

describe('ipify', function() {
  describe('without format', function() {
    it('should return IP address in plain text', function(done) {
      var callback = function(error, data, response) {
        assert.equal(error, null);
        assert.equal(typeof data, 'string');
        done();
      };
      var opts = {
      };
      api.getIp(opts, callback);
    });
  });
  describe('with JSON format', function() {
    it('should return IP address within an object', function(done) {
      var callback = function(error, data, response) {
        assert.equal(error, null);
        try {
          assert.equal(typeof data.ip, 'string');
          done();
        } catch (e) {
          assert.fail(e);
        }
      };
      var opts = {
        'format': 'json'
      };
      api.getIp(opts, callback);
    });
  });
});
