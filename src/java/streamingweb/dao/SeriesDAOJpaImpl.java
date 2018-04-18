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
import streamingweb.entity.Serie;

/**
 *
 * @author romua
 */
public class SeriesDAOJpaImpl implements SeriesDAO {

    @Override
    public List<Serie> lister() {
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("SELECT s FROM Serie s");
        
        List<Serie> series = query.getResultList();
        
        return series;
    }

    @Override
    public Serie rechercher(long id) {

        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.find(Serie.class, id);    
    }
    
    
}
