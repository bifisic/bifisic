/*
 * Created on 8 nov 2016 ( Time 16:16:34 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import it.csi.sira.backend.metadata.integration.dto.SipraMtdTSottocategoria;
import it.csi.sira.backend.metadata.integration.dao.SipraMtdTSottocategoriaDAO;
import it.csi.sira.backend.metadata.utils.GenericDAO;
import org.springframework.jdbc.core.RowMapper;

/**
 * SipraMtdTSottocategoria DAO implementation 
 * 
 * @author Telosys Tools
 *
 */
public class SipraMtdTSottocategoriaDAOImpl extends GenericDAO<SipraMtdTSottocategoria> implements SipraMtdTSottocategoriaDAO {
	//----------------------------------------------------------------------
	/**
	 * DAO constructor
	 */
	public SipraMtdTSottocategoriaDAOImpl() {
		super();
	}

	private final static String QUERY_PRIMARY_KEY = 
		"select * from sipra_mtd_t_sottocategoria where id_sottocategoria = :id_sottocategoria";
	
	private final static String QUERY_INSERT = 
		"insert into sipra_mtd_t_sottocategoria(id_sottocategoria,fk_padre,des_sottocategoria,livello) values(:id_sottocategoria,:fk_padre,:des_sottocategoria,:livello)";

	private final static String QUERY_UPDATE = 
		"update sipra_mtd_t_sottocategoria set fk_padre = :fk_padre, des_sottocategoria = :des_sottocategoria, livello = :livello  where id_sottocategoria = :id_sottocategoria";

	private final static String QUERY_DELETE = 
		"delete from sipra_mtd_t_sottocategoria where  id_sottocategoria = :id_sottocategoria";

	private final static String SQL_COUNT_ALL = 
		"select count(*) from sipra_mtd_t_sottocategoria";
	
	@Override
	public String getPrimaryKeySelect() {
		return QUERY_PRIMARY_KEY;		
	}
	
	@Override
	public String getTableName(){
		return "sipra_mtd_t_sottocategoria";
	}

	@Override
	public String getSqlSelect() {
		return "select * from sipra_mtd_t_sottocategoria";
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

	public SipraMtdTSottocategoria findByPK(Integer idSottocategoria) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_sottocategoria", idSottocategoria);
		return super.findByPK(map);		
	}

	public int deleteByPK(Integer idSottocategoria) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_sottocategoria", idSottocategoria);
		return super.delete(getSqlDelete(), map);		
	}

	@Override
	public java.util.Map<String, Object> getValuesForInsert(SipraMtdTSottocategoria sipraMtdTSottocategoria) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_sottocategoria", sipraMtdTSottocategoria.getIdSottocategoria());
		map.put("fk_padre", sipraMtdTSottocategoria.getFkPadre());
		map.put("des_sottocategoria", sipraMtdTSottocategoria.getDesSottocategoria());
		map.put("livello", sipraMtdTSottocategoria.getLivello());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForUpdate(SipraMtdTSottocategoria sipraMtdTSottocategoria) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("fk_padre", sipraMtdTSottocategoria.getFkPadre());
		map.put("des_sottocategoria", sipraMtdTSottocategoria.getDesSottocategoria());
		map.put("livello", sipraMtdTSottocategoria.getLivello());
		map.put("id_sottocategoria", sipraMtdTSottocategoria.getIdSottocategoria());
		return map;
	}

	public java.util.Map<String, Object> getValuesForPrimaryKey(SipraMtdTSottocategoria sipraMtdTSottocategoria) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_sottocategoria", sipraMtdTSottocategoria.getIdSottocategoria());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForDelete(SipraMtdTSottocategoria sipraMtdTSottocategoria) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_sottocategoria", sipraMtdTSottocategoria.getIdSottocategoria());
		return map;
	}

	@Override
	public RowMapper<SipraMtdTSottocategoria> getRowMapper()  {
		//--- RowMapper to populate a new bean instance
		//return new SipraMtdTSottocategoriaRowMapper( new SipraMtdTSottocategoria() ) ;

       return new SipraMtdTSottocategoriaRowMapper() ;
	}

	//----------------------------------------------------------------------
	/**
	 * Populates the given bean with the data retrieved from the given ResultSet
	 * @param rs
	 * @param sipraMtdTSottocategoria
	 * @throws SQLException
	 */
	private static void populateBean(ResultSet rs, SipraMtdTSottocategoria sipraMtdTSottocategoria) throws SQLException {

		//--- Set data from ResultSet to Bean attributes
		sipraMtdTSottocategoria.setIdSottocategoria(rs.getInt("id_sottocategoria")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdTSottocategoria.setIdSottocategoria(null); }; // not primitive number => keep null value if any
		sipraMtdTSottocategoria.setFkPadre(rs.getInt("fk_padre")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdTSottocategoria.setFkPadre(null); }; // not primitive number => keep null value if any
		sipraMtdTSottocategoria.setDesSottocategoria(rs.getString("des_sottocategoria")); // java.lang.String
		sipraMtdTSottocategoria.setLivello(rs.getInt("livello")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdTSottocategoria.setLivello(null); }; // not primitive number => keep null value if any
	}


	/**
	 * Specific inner class for 'RowMapper' implementation
	 */
	public static class SipraMtdTSottocategoriaRowMapper implements RowMapper<SipraMtdTSottocategoria> {
	
		public SipraMtdTSottocategoriaRowMapper() {
			
		}
		
		public SipraMtdTSottocategoria mapRow(ResultSet rs, int rowNum) throws SQLException {
			SipraMtdTSottocategoria bean = new SipraMtdTSottocategoria();
			populateBean(rs, bean);
			return bean;
		}
	}
}
