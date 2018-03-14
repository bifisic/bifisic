/*
 * Created on 25 nov 2016 ( Time 10:35:36 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import it.csi.sira.backend.metadata.integration.dto.SipraMtdDFontedati;
import it.csi.sira.backend.metadata.integration.dao.SipraMtdDFontedatiDAO;
import it.csi.sira.backend.metadata.utils.GenericDAO;
import org.springframework.jdbc.core.RowMapper;

/**
 * SipraMtdDFontedati DAO implementation 
 * 
 * @author Telosys Tools
 *
 */
public class SipraMtdDFontedatiDAOImpl extends GenericDAO<SipraMtdDFontedati> implements SipraMtdDFontedatiDAO {
	//----------------------------------------------------------------------
	/**
	 * DAO constructor
	 */
	public SipraMtdDFontedatiDAOImpl() {
		super();
	}

	private final static String QUERY_PRIMARY_KEY = 
		"select * from sipra_mtd_d_fontedati where id_fontedati = :id_fontedati";
	
	private final static String QUERY_INSERT = 
		"insert into sipra_mtd_d_fontedati(id_fontedati,fk_standard_espos,des_fontedati,url_prefisso_metadato,url_servizio,fl_attiva,prefisso_fontedati) values(:id_fontedati,:fk_standard_espos,:des_fontedati,:url_prefisso_metadato,:url_servizio,:fl_attiva,:prefisso_fontedati)";

	private final static String QUERY_UPDATE = 
		"update sipra_mtd_d_fontedati set fk_standard_espos = :fk_standard_espos, des_fontedati = :des_fontedati, url_prefisso_metadato = :url_prefisso_metadato, url_servizio = :url_servizio, fl_attiva = :fl_attiva, prefisso_fontedati = :prefisso_fontedati  where id_fontedati = :id_fontedati";

	private final static String QUERY_DELETE = 
		"delete from sipra_mtd_d_fontedati where  id_fontedati = :id_fontedati";

	private final static String SQL_COUNT_ALL = 
		"select count(*) from sipra_mtd_d_fontedati";
	
	@Override
	public String getPrimaryKeySelect() {
		return QUERY_PRIMARY_KEY;		
	}
	
	@Override
	public String getTableName(){
		return "sipra_mtd_d_fontedati";
	}

	@Override
	public String getSqlSelect() {
		return "select * from sipra_mtd_d_fontedati";
	}

	@Override
	public String getSqlInsert() {
		return QUERY_INSERT;
	}

	@Override
	public String getSqlUpdate() {
		return QUERY_UPDATE;
	}

	@Override
	public String getSqlDelete() {
		return QUERY_DELETE;
	}

	@Override
	public String getSqlCount() {
		return SQL_COUNT_ALL;
	}

	public SipraMtdDFontedati findByPK(Integer idFontedati) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_fontedati", idFontedati);
		return super.findByPK(map);		
	}

	public int deleteByPK(Integer idFontedati) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_fontedati", idFontedati);
		return super.delete(getSqlDelete(), map);		
	}

	@Override
	public java.util.Map<String, Object> getValuesForInsert(SipraMtdDFontedati sipraMtdDFontedati) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_fontedati", sipraMtdDFontedati.getIdFontedati());
		map.put("fk_standard_espos", sipraMtdDFontedati.getFkStandardEspos());
		map.put("des_fontedati", sipraMtdDFontedati.getDesFontedati());
		map.put("url_prefisso_metadato", sipraMtdDFontedati.getUrlPrefissoMetadato());
		map.put("url_servizio", sipraMtdDFontedati.getUrlServizio());
		map.put("fl_attiva", sipraMtdDFontedati.getFlAttiva());
		map.put("prefisso_fontedati", sipraMtdDFontedati.getPrefissoFontedati());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForUpdate(SipraMtdDFontedati sipraMtdDFontedati) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("fk_standard_espos", sipraMtdDFontedati.getFkStandardEspos());
		map.put("des_fontedati", sipraMtdDFontedati.getDesFontedati());
		map.put("url_prefisso_metadato", sipraMtdDFontedati.getUrlPrefissoMetadato());
		map.put("url_servizio", sipraMtdDFontedati.getUrlServizio());
		map.put("fl_attiva", sipraMtdDFontedati.getFlAttiva());
		map.put("prefisso_fontedati", sipraMtdDFontedati.getPrefissoFontedati());
		map.put("id_fontedati", sipraMtdDFontedati.getIdFontedati());
		return map;
	}

	public java.util.Map<String, Object> getValuesForPrimaryKey(SipraMtdDFontedati sipraMtdDFontedati) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_fontedati", sipraMtdDFontedati.getIdFontedati());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForDelete(SipraMtdDFontedati sipraMtdDFontedati) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_fontedati", sipraMtdDFontedati.getIdFontedati());
		return map;
	}

	@Override
	public RowMapper<SipraMtdDFontedati> getRowMapper()  {
		//--- RowMapper to populate a new bean instance
		//return new SipraMtdDFontedatiRowMapper( new SipraMtdDFontedati() ) ;

       return new SipraMtdDFontedatiRowMapper() ;
	}

	//----------------------------------------------------------------------
	/**
	 * Populates the given bean with the data retrieved from the given ResultSet
	 * @param rs
	 * @param sipraMtdDFontedati
	 * @throws SQLException
	 */
	private static void populateBean(ResultSet rs, SipraMtdDFontedati sipraMtdDFontedati) throws SQLException {

		//--- Set data from ResultSet to Bean attributes
		sipraMtdDFontedati.setIdFontedati(rs.getInt("id_fontedati")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdDFontedati.setIdFontedati(null); }; // not primitive number => keep null value if any
		sipraMtdDFontedati.setFkStandardEspos(rs.getInt("fk_standard_espos")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdDFontedati.setFkStandardEspos(null); }; // not primitive number => keep null value if any
		sipraMtdDFontedati.setDesFontedati(rs.getString("des_fontedati")); // java.lang.String
		sipraMtdDFontedati.setUrlPrefissoMetadato(rs.getString("url_prefisso_metadato")); // java.lang.String
		sipraMtdDFontedati.setUrlServizio(rs.getString("url_servizio")); // java.lang.String
		sipraMtdDFontedati.setFlAttiva(rs.getString("fl_attiva")); // java.lang.String
		sipraMtdDFontedati.setPrefissoFontedati(rs.getString("prefisso_fontedati")); // java.lang.String
	}


	/**
	 * Specific inner class for 'RowMapper' implementation
	 */
	public static class SipraMtdDFontedatiRowMapper implements RowMapper<SipraMtdDFontedati> {
	
		public SipraMtdDFontedatiRowMapper() {
			
		}
		
		public SipraMtdDFontedati mapRow(ResultSet rs, int rowNum) throws SQLException {
			SipraMtdDFontedati bean = new SipraMtdDFontedati();
			populateBean(rs, bean);
			return bean;
		}
	}
}