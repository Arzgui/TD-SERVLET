package com.example.tdservlet.filters;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(value = "/hello-servlet",
        initParams = @WebInitParam(name = "configFiltre2", value =
                "myConfigParameterFiltre2") )
public class filtreApplication implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filtre");
        filterChain.doFilter(servletRequest, servletResponse);

    }


}
