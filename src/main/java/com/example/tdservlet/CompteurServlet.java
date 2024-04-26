package com.example.tdservlet;

import com.example.tdservlet.beans.Compteur;
import com.example.tdservlet.beans.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet(name = "CompteurServlet", value = "/Compteur-Servlet")
    public class CompteurServlet extends HttpServlet {
    Compteur CompteurField = new Compteur();






    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           CompteurField.increment();
           //resp.getWriter().println("Le compteur est a:" + CompteurField.getCpt());


        Compteur cs = (Compteur) req.getSession().getAttribute("compteurSession");
        if(cs == null){
            cs = new Compteur();
            cs.increment();
            req.getSession().setAttribute("compteurSession",cs);
        } else{
            cs.increment();
        }


        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req,resp);

        User user = new User();
        user.name = "Toto";



    }
}
