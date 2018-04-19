/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamingweb.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author romua
 */
@Entity
@Table(name = "PERSONNE")
@NamedQueries({
    @NamedQuery(name = "Personne.findAll", query = "SELECT p FROM Personne p")})
public class Personne implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NOM")
    private String nom;
    @Column(name = "PRENOM")
    private String prenom;
    @JoinTable(name = "REAL_SERIE", joinColumns = {
        @JoinColumn(name = "REALISATEURS_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "SERIESREALISES_ID", referencedColumnName = "ID")})
    @ManyToMany
    private List<Serie> seriesRealisees;
    @JoinTable(name = "REAL_FILM", joinColumns = {
        @JoinColumn(name = "REALISATEURS_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "FILMSREALISES_ID", referencedColumnName = "ID")})
    @ManyToMany
    private List<Film> filmsRealises;
    @JoinTable(name = "ACTEUR_FILM", joinColumns = {
        @JoinColumn(name = "ACTEURS_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "FILMSJOUES_ID", referencedColumnName = "ID")})
    @ManyToMany
    private List<Film> filmsJoues;
    @JoinTable(name = "ACTEUR_SERIE", joinColumns = {
        @JoinColumn(name = "ACTEURS_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "SERIESJOUES_ID", referencedColumnName = "ID")})
    @ManyToMany
    private List<Serie> seriesJouees;

    public Personne() {
    }

    public Personne(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Serie> getSeriesRealisees() {
        return seriesRealisees;
    }

    public void setSeriesRealisees(List<Serie> seriesRealisees) {
        this.seriesRealisees = seriesRealisees;
    }

    public List<Film> getFilmsRealises() {
        return filmsRealises;
    }

    public void setFilmsRealises(List<Film> filmsRealises) {
        this.filmsRealises = filmsRealises;
    }

    public List<Film> getFilmsJoues() {
        return filmsJoues;
    }

    public void setFilmsJoues(List<Film> filmsJoues) {
        this.filmsJoues = filmsJoues;
    }

    public List<Serie> getSeriesJouees() {
        return seriesJouees;
    }

    public void setSeriesJouees(List<Serie> seriesJouees) {
        this.seriesJouees = seriesJouees;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personne)) {
            return false;
        }
        Personne other = (Personne) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streamingweb.entity.Personne[ id=" + id + " ]";
    }
    
}
