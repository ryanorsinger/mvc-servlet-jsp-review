package com.codeup.spacelister.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "controllers.RequestInspectorServlet", urlPatterns = "/request-inspector")
public class RequestInspectorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // method type
        String method = request.getMethod();

        // query string
        String queryString = request.getQueryString();

        // Key-Value Pairs from the Query String
        Map<String, String[]> requestParams = request.getParameterMap();


        response.getWriter().println(requestParams);
    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>Hello, World!</h1>");
    }
}
