/*
 * Created on 25 nov 2016 ( Time 10:35:37 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dto;

import java.io.Serializable;


/**
 * Java bean for 'SipraMtdTCategoriaAppl' entity
 * 
 * @author Telosys Tools
 *
 */
public class SipraMtdTCategoriaAppl implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : id_category_appl int4 
    private Integer idCategoriaAppl;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : fk_parent int4 
    private Integer fkPadre;

    // DB : livello int4 
    private Integer livello;

    // DB : des_categoria varchar 
    private String desCategoria;

    // DB : url_icona varchar 
    private String urlIcona;

    // DB : object_number int4 
    private Integer objectNumber;

    // DB : view_number int4 
    private Integer viewNumber;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdCategoriaAppl( Integer idCategoriaAppl ) {
        this.idCategoriaAppl = idCategoriaAppl ;
    }

    public Integer getIdCategoriaAppl() {
        return this.idCategoriaAppl;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setFkPadre( Integer fkPadre ) {
        this.fkPadre = fkPadre;
    }
    public Integer getFkPadre() {
        return this.fkPadre;
    }

    public void setLivello( Integer livello ) {
        this.livello = livello;
    }
    public Integer getLivello() {
        return this.livello;
    }

    public void setDesCategoria( String desCategoria ) {
        this.desCategoria = desCategoria;
    }
    public String getDesCategoria() {
        return this.desCategoria;
    }

    public void setUrlIcona( String urlIcona ) {
        this.urlIcona = urlIcona;
    }
    public String getUrlIcona() {
        return this.urlIcona;
    }

    public void setObjectNumber( Integer objectNumber ) {
        this.objectNumber = objectNumber;
    }
    public Integer getObjectNumber() {
        return this.objectNumber;
    }

    public void setViewNumber( Integer viewNumber ) {
        this.viewNumber = viewNumber;
    }
    public Integer getViewNumber() {
        return this.viewNumber;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idCategoriaAppl);
        sb.append("|");
        sb.append(fkPadre);
        sb.append("|");
        sb.append(livello);
        sb.append("|");
        sb.append(desCategoria);
        sb.append("|");
        sb.append(urlIcona);
        sb.append("|");
        sb.append(objectNumber);
        sb.append("|");
        sb.append(viewNumber);
        return sb.toString(); 
    } 


}
