/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.dao.SeriesDAO;
import streamingweb.dao.SeriesDAOJpaImpl;
import streamingweb.entity.Serie;
import static streamingweb.entity.Serie_.id;

/**
 *
 * @author romua
 */
public class SerieServiceImpl implements SerieService {

    private SeriesDAO dao = new SeriesDAOJpaImpl();
    
    @Override
    public List<Serie> listerSeries() {
    
        return dao.lister();
    }

    @Override
    public Serie rechercheParId(long id) {

        return dao.rechercher(id);
    }

    

    

    

    

    
    
}
