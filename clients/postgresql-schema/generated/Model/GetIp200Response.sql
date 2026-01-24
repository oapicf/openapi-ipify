--
-- "openapi-ipify"
-- Prepared SQL queries for 'getIp_200_response' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'get_ip_200_response'
--
SELECT ip FROM get_ip_200_response WHERE 1=1;

--
-- INSERT template for table 'get_ip_200_response'
--
INSERT INTO get_ip_200_response (ip) VALUES (?);

--
-- UPDATE template for table 'get_ip_200_response'
--
UPDATE get_ip_200_response SET ip = ? WHERE 1=2;

--
-- DELETE template for table 'get_ip_200_response'
--
DELETE FROM get_ip_200_response WHERE 1=2;

