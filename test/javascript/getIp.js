const assert = require('assert');
const validator = require('validator');
const Ipify = require('openapi_ipify');
const api = new Ipify.DefaultApi();

describe('ipify', function() {
  describe('without format', function() {
    it('should return IP address in plain text', function(done) {
      var callback = function(error, data, response) {
        assert.equal(error, null);
        assert.equal(typeof data, 'string');
        assert.equal(validator.isIP(data), true);
        assert.equal(response.type, 'text/plain');
        assert.equal(response.res.statusCode, 200);
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
          assert.equal(typeof data, 'string');
          assert.equal(typeof JSON.parse(data).ip, 'string');
          assert.equal(validator.isIP(JSON.parse(data).ip), true);
          assert.equal(response.type, 'application/json');
          assert.equal(response.res.statusCode, 200);
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
  describe('with JSONP format', function() {
    it('should return IP address as function string', function(done) {
      var callback = function(error, data, response) {
        assert.equal(error, null);
        assert.equal(typeof data, 'string');
        const payload = data.match(/callback\((.*)\)/)[1];
        assert.equal(validator.isIP(JSON.parse(payload).ip), true);
        assert.equal(response.type, 'application/javascript');
        assert.equal(response.res.statusCode, 200);
        done();
      };
      var opts = {
        'format': 'jsonp'
      };
      api.getIp(opts, callback);
    });
  });
  describe('with JSONP format and callback function name', function() {
    it('should return IP address as function string', function(done) {
      var callback = function(error, data, response) {
        assert.equal(error, null);
        assert.equal(typeof data, 'string');
        const payload = data.match(/foobar\((.*)\)/)[1];
        assert.equal(validator.isIP(JSON.parse(payload).ip), true);
        assert.equal(response.type, 'application/javascript');
        assert.equal(response.res.statusCode, 200);
        done();
      };
      var opts = {
        'format': 'jsonp',
        'callback': 'foobar'
      };
      api.getIp(opts, callback);
    });
  });
});
