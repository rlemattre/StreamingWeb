/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.dao.FilmsDAO;
import streamingweb.dao.FilmsDAOJpaImpl;
import streamingweb.entity.Film;

/**
 *
 * @author romua
 */
public class FilmServiceImpl implements FilmService {

    private FilmsDAO dao = new FilmsDAOJpaImpl ();
    
    @Override
    public List<Film> listerFilms() {

        return dao.lister();
    }

    @Override
    public Film rechercheParId(long id) {

        return dao.rechercher(id);
    }

    @Override
    public void ajouter(Film film) {

        dao.ajouter(film);
    }

    
}
