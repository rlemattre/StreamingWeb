/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import streamingweb.entity.Film;
import streamingweb.service.FilmService;
import streamingweb.service.FilmServiceImpl;

/**
 *
 * @author romua
 */
@WebServlet(name = "ListerFilmsservlet", urlPatterns = {"/lister_films"})
public class ListerFilmsServlet extends HttpServlet {

    private FilmService service = new FilmServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Film> films = service.listerFilms();   // 1. Récup la liste des films grace au filmservice

        req.setAttribute("listeDesFilms", films);   // 2. Envoyer liste des films film comme attribut req

        req.getRequestDispatcher("films.jsp").forward(req, resp);      // 3. forward vers films.jsp
    }
}
