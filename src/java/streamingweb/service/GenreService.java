/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.entity.Genre;

/**
 *
 * @author romua
 */
public interface GenreService {
    
    public List<Genre> listerGenres();
    
}
