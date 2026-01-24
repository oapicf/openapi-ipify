--
-- Schema objects for PostgreSQL
-- "openapi-ipify"
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--

--
-- DROP OBJECTS
-- (remove comment prefix to start using DROP commands)
--
-- TABLES
--
-- DROP TABLE IF EXISTS get_ip_200_response;

--
-- TYPES
--


--
-- CREATE OBJECTS
--
-- TYPES
--

--
-- TABLES
--
--
-- Table 'get_ip_200_response' generated from model 'getIpUnderscore200Underscoreresponse'
--
CREATE TABLE IF NOT EXISTS get_ip_200_response (
    ip TEXT DEFAULT NULL
);
COMMENT ON TABLE get_ip_200_response IS 'Original model name - getIp_200_response.';

