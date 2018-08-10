package = "openapi-client"
version = "1.0.0-1"
source = {
	url = "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
}

description = {
	summary = "API client genreated by OpenAPI Generator",
	detailed = [[
OpenAPI client for ipify, a simple public IP address API]],
	homepage = "https://openapi-generator.tech",
	license = "Unlicense",
	maintainer = "OpenAPI Generator contributors",
}

dependencies = {
	"lua >= 5.2",
	"http",
	"dkjson",
	"basexx"
}

build = {
	type = "builtin",
	modules = {
		["openapi-client.api.default_api"] = "openapi-client/api/default_api.lua";
		["openapi-client.model.ip"] = "openapi-client/model/ip.lua";
	}
}
