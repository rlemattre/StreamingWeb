/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.service;

import java.util.List;
import streamingweb.dao.PaysDAO;
import streamingweb.dao.PaysDAOJpaImpl;
import streamingweb.entity.Pays;

/**
 *
 * @author romua
 */
public class PaysServiceImpl implements PaysService {

    private PaysDAO dao = new PaysDAOJpaImpl();
    
    @Override
    public List<Pays> listerPays() {

       return dao.lister();
        
    }
   
}
