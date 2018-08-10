cmake_minimum_required (VERSION 3.2)

project(server)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11 -pg -g3" )

include(ExternalProject)

set(EXTERNAL_INSTALL_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/external)

ExternalProject_Add(PISTACHE
    GIT_REPOSITORY https://github.com/oktal/pistache.git
    CMAKE_ARGS -DCMAKE_INSTALL_PREFIX=${EXTERNAL_INSTALL_LOCATION}
)

ExternalProject_Add(NLOHMANN
    GIT_REPOSITORY https://github.com/nlohmann/json.git
    CMAKE_ARGS -DCMAKE_INSTALL_PREFIX=${EXTERNAL_INSTALL_LOCATION}

)
include_directories(${EXTERNAL_INSTALL_LOCATION}/include)
include_directories(${EXTERNAL_INSTALL_LOCATION}/include/nlohmann)
link_directories(${EXTERNAL_INSTALL_LOCATION}/lib)

link_directories(/usr/local/lib/)

aux_source_directory(model MODEL_SOURCES)
file(GLOB DEFAULT_API_SOURCES
"api/DefaultApi.h"
"api/DefaultApi.cpp"
"impl/DefaultApiImpl.h"
"impl/DefaultApiImpl.cpp"
)

include_directories(model)
include_directories(api)
include_directories(impl)

set(DEFAULT_API_SERVER_SOURCES
DefaultApiMainServer.cpp
    ${MODEL_SOURCES}
    ${DEFAULT_API_SOURCES})

add_executable(default_api_server
${DEFAULT_API_SERVER_SOURCES})

target_link_libraries(default_api_server pistache pthread)

