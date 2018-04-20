/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import streamingweb.entity.Genre;

/**
 *
 * @author romua
 */
public class GenreDAOJpaImpl implements GenreDAO {

    @Override
    public List<Genre> lister() {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT g FROM Genre g ORDER BY g.nom ASC");
        
        List<Genre> genres = query.getResultList();
        
        return genres;
    }
    
    
}
