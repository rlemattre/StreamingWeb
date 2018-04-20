/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.entity.Film;

/**
 *
 * @author romua
 */
public interface FilmService {
    
    public List<Film> listerFilms();
    
    public Film rechercheParId(long id);
    
    public void ajouter(Film film);
    
}
