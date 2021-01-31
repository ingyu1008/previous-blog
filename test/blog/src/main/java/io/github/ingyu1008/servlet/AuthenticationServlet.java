package io.github.ingyu1008.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/blog/auth")
public class AuthenticationServlet extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        String pw = request.getParameter("pw");
        if(pw == "2020011776"){
            response.sendRedirect("/private");
        } else {
            response.sendRedirect("/");
        }
    }

}