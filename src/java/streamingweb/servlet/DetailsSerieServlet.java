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
import streamingweb.entity.Serie;
import streamingweb.service.SerieService;
import streamingweb.service.SerieServiceImpl;

/**
 *
 * @author romua
 */
@WebServlet(name = "DetailsSerieServlet", urlPatterns = {"/DetailsSerieServlet"})
public class DetailsSerieServlet extends HttpServlet {

    private SerieService service = new SerieServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String idstring = req.getParameter("idDeLaSerie");
        
        long idSerie = Long.parseLong(idstring);
        
        Serie serie = service.rechercheParId(idSerie);
        
        req.setAttribute("detailsSerie", serie);

        req.getRequestDispatcher("detailsserie.jsp").forward(req, resp);
    }

}
