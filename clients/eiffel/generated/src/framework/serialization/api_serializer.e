note
 description:"[
		openapi-ipify
 		OpenAPI client for ipify, a simple public IP address API
  		The version of the OpenAPI document: 1.0.0-pre.0
 	    Contact: blah@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	API_SERIALIZER


feature -- Access

	serializer (f: FUNCTION [TUPLE [content_type:READABLE_STRING_8; type:ANY],READABLE_STRING_8]; a_content_type: READABLE_STRING_8; a_type: ANY): STRING_8
			-- Serialize an object of type `a_type' using the content type `a_content_type'.
		do
				-- TODO check if this conversion it's ok.
			Result := f.item ([a_content_type, a_type]).to_string_8
		end
end
