/*
 * Created on 18 nov 2016 ( Time 17:08:43 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dto;

import java.io.Serializable;


/**
 * Java bean for 'SipraMtdTFunzione' entity
 * 
 * @author Telosys Tools
 *
 */
public class SipraMtdTFunzione implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    // DB : id_funzione int4 
    private Integer idFunzione;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    // DB : fk_function_type int4 
    private Integer fkTipoFunzione;

    // DB : fk_metadata int4 
    private Integer fkMetadato;

    // DB : request_url varchar 
    private String requestUrl;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setIdFunzione( Integer idFunzione ) {
        this.idFunzione = idFunzione ;
    }

    public Integer getIdFunzione() {
        return this.idFunzione;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    public void setFkTipoFunzione( Integer fkTipoFunzione ) {
        this.fkTipoFunzione = fkTipoFunzione;
    }
    public Integer getFkTipoFunzione() {
        return this.fkTipoFunzione;
    }

    public void setFkMetadato( Integer fkMetadato ) {
        this.fkMetadato = fkMetadato;
    }
    public Integer getFkMetadato() {
        return this.fkMetadato;
    }

    public void setRequestUrl( String requestUrl ) {
        this.requestUrl = requestUrl;
    }
    public String getRequestUrl() {
        return this.requestUrl;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(idFunzione);
        sb.append("|");
        sb.append(fkTipoFunzione);
        sb.append("|");
        sb.append(fkMetadato);
        sb.append("|");
        sb.append(requestUrl);
        return sb.toString(); 
    } 


}
