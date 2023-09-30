package com.example.httplearningapi.servlets;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter(filterName = "Content Type Response Filter", urlPatterns = {"/*"})
public class ContentTypeResponseFilter implements Filter {

    private static final String CONTENT_TYPE_APPLICATION_JSON = "application/json";
    @Override
    public void init(FilterConfig filterConfig) {}

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setContentType(CONTENT_TYPE_APPLICATION_JSON);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {}
}
