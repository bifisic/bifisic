/*
 * Created on 18 nov 2016 ( Time 17:08:43 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dto;

import java.io.Serializable;


/**
 * Java bean for 'SipraMtdRCategoriaMtd' entity
 * 
 * @author Telosys Tools
 *
 */
public class SipraMtdRCategoriaMtd implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : id_category int4 
    private Integer idCategoria;
    // DB : id_metadata int4 
    private Integer idMetadato;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    


    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdCategoria( Integer idCategoria ) {
        this.idCategoria = idCategoria ;
    }

    public Integer getIdCategoria() {
        return this.idCategoria;
    }

    public void setIdMetadato( Integer idMetadato ) {
        this.idMetadato = idMetadato ;
    }

    public Integer getIdMetadato() {
        return this.idMetadato;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idCategoria);
        sb.append("|");
        sb.append(idMetadato);
        return sb.toString(); 
    } 


}
