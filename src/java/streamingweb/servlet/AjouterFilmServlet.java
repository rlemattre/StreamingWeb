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
import streamingweb.entity.Genre;
import streamingweb.entity.Pays;
import streamingweb.entity.Personne;
import streamingweb.service.FilmService;
import streamingweb.service.FilmServiceImpl;
import streamingweb.service.GenreService;
import streamingweb.service.GenreServiceImpl;
import streamingweb.service.PaysService;
import streamingweb.service.PaysServiceImpl;
import streamingweb.service.PersonneService;
import streamingweb.service.PersonneServiceImpl;

/**
 *
 * @author romua
 */
@WebServlet(name = "AjouterFilmServlet", urlPatterns = {"/ajouter_film"})
public class AjouterFilmServlet extends HttpServlet {

    private GenreService genreService = new GenreServiceImpl();
    private PaysService paysService = new PaysServiceImpl();
    private PersonneService personneService = new PersonneServiceImpl();
    private FilmService filmservice = new FilmServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Genre> genres = genreService.listerGenres();
        List<Pays> pays = paysService.listerPays();
        List<Personne> personnes = personneService.listerPersonnes();
        
        req.setAttribute("listeDesGenres", genres);
        req.setAttribute("listeDesPays", pays);
        req.setAttribute("listeDesPersonnes", personnes);
        
        req.getRequestDispatcher("ajouterFilm.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // crétaion du film à enregistrer
        Film film = new Film();

        film.setTitre( req.getParameter("titre") );
        
        int annee = Integer.parseInt(req.getParameter("anneeProduction"));
        film.setAnnee(annee);
        
        int duree = Integer.parseInt(req.getParameter("duree"));
        film.setDuree(duree);
        
        film.setSynopsis( req.getParameter("synopsis") );
        
        long genre = Long.parseLong(req.getParameter("genre"));
        
        Genre g = new Genre();
        g.setId(genre);
        
        g.getFilmList().add(film);
        film.setGenre(g);
        
        // envoi du film au filmService
        filmservice.ajouter(film);
        
        // renvoi vers la liste des films utilisation de la redirection et pas du forward !
        resp.sendRedirect("lister_films");
    }

}
