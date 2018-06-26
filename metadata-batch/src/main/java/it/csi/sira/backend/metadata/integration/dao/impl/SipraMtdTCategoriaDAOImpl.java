/*
 * Created on 18 nov 2016 ( Time 17:08:43 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import it.csi.sira.backend.metadata.integration.dto.SipraMtdTCategoria;
import it.csi.sira.backend.metadata.integration.dao.SipraMtdTCategoriaDAO;
import it.csi.sira.backend.metadata.utils.GenericDAO;
import org.springframework.jdbc.core.RowMapper;

/**
 * SipraMtdTCategoria DAO implementation 
 * 
 * @author Telosys Tools
 *
 */
public class SipraMtdTCategoriaDAOImpl extends GenericDAO<SipraMtdTCategoria> implements SipraMtdTCategoriaDAO {
	//----------------------------------------------------------------------
	/**
	 * DAO constructor
	 */
	public SipraMtdTCategoriaDAOImpl() {
		super();
	}

	private final static String QUERY_PRIMARY_KEY = 
		"select * from bifisic_mtd_t_category where id_category = :id_category";
	
	private final static String QUERY_INSERT = 
		"insert into bifisic_mtd_t_category(id_category,fk_category_type) values(:id_category,:fk_category_type)";

	private final static String QUERY_UPDATE = 
		"update bifisic_mtd_t_category set fk_category_type = :fk_category_type  where id_category = :id_category";

	private final static String QUERY_DELETE = 
		"delete from bifisic_mtd_t_category where  id_category = :id_category";

	private final static String SQL_COUNT_ALL = 
		"select count(*) from bifisic_mtd_t_category";
	
	@Override
	public String getPrimaryKeySelect() {
		return QUERY_PRIMARY_KEY;		
	}
	
	@Override
	public String getTableName(){
		return "bifisic_mtd_t_category";
	}

	@Override
	public String getSqlSelect() {
		return "select * from bifisic_mtd_t_category";
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

	public SipraMtdTCategoria findByPK(Integer idCategoria) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category", idCategoria);
		return super.findByPK(map);		
	}

	public int deleteByPK(Integer idCategoria) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category", idCategoria);
		return super.delete(getSqlDelete(), map);		
	}

	@Override
	public java.util.Map<String, Object> getValuesForInsert(SipraMtdTCategoria sipraMtdTCategoria) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category", sipraMtdTCategoria.getIdCategoria());
		map.put("fk_category_type", sipraMtdTCategoria.getFkTipoCategoria());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForUpdate(SipraMtdTCategoria sipraMtdTCategoria) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("fk_category_type", sipraMtdTCategoria.getFkTipoCategoria());
		map.put("id_category", sipraMtdTCategoria.getIdCategoria());
		return map;
	}

	public java.util.Map<String, Object> getValuesForPrimaryKey(SipraMtdTCategoria sipraMtdTCategoria) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category", sipraMtdTCategoria.getIdCategoria());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForDelete(SipraMtdTCategoria sipraMtdTCategoria) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category", sipraMtdTCategoria.getIdCategoria());
		return map;
	}

	@Override
	public RowMapper<SipraMtdTCategoria> getRowMapper()  {
		//--- RowMapper to populate a new bean instance
		//return new SipraMtdTCategoriaRowMapper( new SipraMtdTCategoria() ) ;

       return new SipraMtdTCategoriaRowMapper() ;
	}

	//----------------------------------------------------------------------
	/**
	 * Populates the given bean with the data retrieved from the given ResultSet
	 * @param rs
	 * @param sipraMtdTCategoria
	 * @throws SQLException
	 */
	private static void populateBean(ResultSet rs, SipraMtdTCategoria sipraMtdTCategoria) throws SQLException {

		//--- Set data from ResultSet to Bean attributes
		sipraMtdTCategoria.setIdCategoria(rs.getInt("id_category")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdTCategoria.setIdCategoria(null); }; // not primitive number => keep null value if any
		sipraMtdTCategoria.setFkTipoCategoria(rs.getInt("fk_category_type")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdTCategoria.setFkTipoCategoria(null); }; // not primitive number => keep null value if any
	}


	/**
	 * Specific inner class for 'RowMapper' implementation
	 */
	public static class SipraMtdTCategoriaRowMapper implements RowMapper<SipraMtdTCategoria> {
	
		public SipraMtdTCategoriaRowMapper() {
			
		}
		
		public SipraMtdTCategoria mapRow(ResultSet rs, int rowNum) throws SQLException {
			SipraMtdTCategoria bean = new SipraMtdTCategoria();
			populateBean(rs, bean);
			return bean;
		}
	}
}
