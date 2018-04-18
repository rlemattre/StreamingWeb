/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.servlet;

import java.io.IOException;
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
@WebServlet(name = "DetailsFilmServlet", urlPatterns = {"/detailsFilm"})
public class DetailsFilmServlet extends HttpServlet {
    
    private FilmService service = new FilmServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idstring = req.getParameter("idDuFilm");
        
        long idFilm = Long.parseLong(idstring);
        
        Film film = service.rechercheParId(idFilm);
        
        req.setAttribute("detailsFilm", film);

        req.getRequestDispatcher("detailsfilm.jsp").forward(req, resp);
    }

    
    
}
