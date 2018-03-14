/*
 * Created on 25 nov 2016 ( Time 10:35:37 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import it.csi.sira.backend.metadata.integration.dto.SipraMtdDTipoOggetto;
import it.csi.sira.backend.metadata.integration.dao.SipraMtdDTipoOggettoDAO;
import it.csi.sira.backend.metadata.utils.GenericDAO;
import org.springframework.jdbc.core.RowMapper;

/**
 * SipraMtdDTipoOggetto DAO implementation 
 * 
 * @author Telosys Tools
 *
 */
public class SipraMtdDTipoOggettoDAOImpl extends GenericDAO<SipraMtdDTipoOggetto> implements SipraMtdDTipoOggettoDAO {
	//----------------------------------------------------------------------
	/**
	 * DAO constructor
	 */
	public SipraMtdDTipoOggettoDAOImpl() {
		super();
	}

	private final static String QUERY_PRIMARY_KEY = 
		"select * from sipra_mtd_d_tipo_oggetto where id_tipo_oggetto = :id_tipo_oggetto";
	
	private final static String QUERY_INSERT = 
		"insert into sipra_mtd_d_tipo_oggetto(id_tipo_oggetto,des_tipo_oggetto) values(:id_tipo_oggetto,:des_tipo_oggetto)";

	private final static String QUERY_UPDATE = 
		"update sipra_mtd_d_tipo_oggetto set des_tipo_oggetto = :des_tipo_oggetto  where id_tipo_oggetto = :id_tipo_oggetto";

	private final static String QUERY_DELETE = 
		"delete from sipra_mtd_d_tipo_oggetto where  id_tipo_oggetto = :id_tipo_oggetto";

	private final static String SQL_COUNT_ALL = 
		"select count(*) from sipra_mtd_d_tipo_oggetto";
	
	@Override
	public String getPrimaryKeySelect() {
		return QUERY_PRIMARY_KEY;		
	}
	
	@Override
	public String getTableName(){
		return "sipra_mtd_d_tipo_oggetto";
	}

	@Override
	public String getSqlSelect() {
		return "select * from sipra_mtd_d_tipo_oggetto";
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

	public SipraMtdDTipoOggetto findByPK(Integer idTipoOggetto) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_tipo_oggetto", idTipoOggetto);
		return super.findByPK(map);		
	}

	public int deleteByPK(Integer idTipoOggetto) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_tipo_oggetto", idTipoOggetto);
		return super.delete(getSqlDelete(), map);		
	}

	@Override
	public java.util.Map<String, Object> getValuesForInsert(SipraMtdDTipoOggetto sipraMtdDTipoOggetto) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_tipo_oggetto", sipraMtdDTipoOggetto.getIdTipoOggetto());
		map.put("des_tipo_oggetto", sipraMtdDTipoOggetto.getDesTipoOggetto());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForUpdate(SipraMtdDTipoOggetto sipraMtdDTipoOggetto) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("des_tipo_oggetto", sipraMtdDTipoOggetto.getDesTipoOggetto());
		map.put("id_tipo_oggetto", sipraMtdDTipoOggetto.getIdTipoOggetto());
		return map;
	}

	public java.util.Map<String, Object> getValuesForPrimaryKey(SipraMtdDTipoOggetto sipraMtdDTipoOggetto) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_tipo_oggetto", sipraMtdDTipoOggetto.getIdTipoOggetto());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForDelete(SipraMtdDTipoOggetto sipraMtdDTipoOggetto) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_tipo_oggetto", sipraMtdDTipoOggetto.getIdTipoOggetto());
		return map;
	}

	@Override
	public RowMapper<SipraMtdDTipoOggetto> getRowMapper()  {
		//--- RowMapper to populate a new bean instance
		//return new SipraMtdDTipoOggettoRowMapper( new SipraMtdDTipoOggetto() ) ;

       return new SipraMtdDTipoOggettoRowMapper() ;
	}

	//----------------------------------------------------------------------
	/**
	 * Populates the given bean with the data retrieved from the given ResultSet
	 * @param rs
	 * @param sipraMtdDTipoOggetto
	 * @throws SQLException
	 */
	private static void populateBean(ResultSet rs, SipraMtdDTipoOggetto sipraMtdDTipoOggetto) throws SQLException {

		//--- Set data from ResultSet to Bean attributes
		sipraMtdDTipoOggetto.setIdTipoOggetto(rs.getInt("id_tipo_oggetto")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdDTipoOggetto.setIdTipoOggetto(null); }; // not primitive number => keep null value if any
		sipraMtdDTipoOggetto.setDesTipoOggetto(rs.getString("des_tipo_oggetto")); // java.lang.String
	}


	/**
	 * Specific inner class for 'RowMapper' implementation
	 */
	public static class SipraMtdDTipoOggettoRowMapper implements RowMapper<SipraMtdDTipoOggetto> {
	
		public SipraMtdDTipoOggettoRowMapper() {
			
		}
		
		public SipraMtdDTipoOggetto mapRow(ResultSet rs, int rowNum) throws SQLException {
			SipraMtdDTipoOggetto bean = new SipraMtdDTipoOggetto();
			populateBean(rs, bean);
			return bean;
		}
	}
}
