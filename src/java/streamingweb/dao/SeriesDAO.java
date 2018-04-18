/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.dao;

import java.util.List;
import streamingweb.entity.Serie;

/**
 *
 * @author romua
 */
public interface SeriesDAO {

    public List<Serie> lister ();
    
    public Serie rechercher (long id);
}
