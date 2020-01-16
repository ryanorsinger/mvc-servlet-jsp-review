package com.codeup.reviewlister.controllers;

import com.codeup.reviewlister.Config;
import com.codeup.reviewlister.Quote;
import com.codeup.reviewlister.QuotesDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="RandomQuoteServlet", urlPatterns = "/quotes/random")
public class RandomQuoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Config config = new Config();

        // Instantiate a new QuotesDao object
        QuotesDao quotesDao = new QuotesDao(config);

        // get all the quotes
        Quote quote = quotesDao.random();

        // Bind the quotes to the request object
        request.setAttribute("quote", quote);

        // send the response along w/ the data
        request.getRequestDispatcher("/WEB-INF/quotes/show.jsp").forward(request, response);

    }
}
