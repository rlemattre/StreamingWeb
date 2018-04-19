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
import streamingweb.entity.Genre;
import streamingweb.service.GenreService;
import streamingweb.service.GenreServiceImpl;

/**
 *
 * @author romua
 */
@WebServlet(name = "AjouterFilmServlet", urlPatterns = {"/ajouter_film"})
public class AjouterFilmServlet extends HttpServlet {

    private GenreService service = new GenreServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Genre> genres = service.listerGenres();
        
        req.setAttribute("listeDesGenres", genres);
        
        req.getRequestDispatcher("ajouterFilm.jsp").forward(req, resp);
    }
    
    

    
}
