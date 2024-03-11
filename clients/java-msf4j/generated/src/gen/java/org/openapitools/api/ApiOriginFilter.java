package org.openapitools.api;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-11T07:46:13.516127332Z[Etc/UTC]")
public class ApiOriginFilter implements javax.servlet.Filter {
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response;
        res.addHeader("Access-Control-Allow-Origin", "*");
        res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
        res.addHeader("Access-Control-Allow-Headers", "Content-Type");
        chain.doFilter(request, response);
    }

    public void destroy() {}

    public void init(FilterConfig filterConfig) throws ServletException {}
}