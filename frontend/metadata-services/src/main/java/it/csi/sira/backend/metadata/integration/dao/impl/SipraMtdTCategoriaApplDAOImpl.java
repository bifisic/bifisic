/*
 * Created on 25 nov 2016 ( Time 10:35:37 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import it.csi.sira.backend.metadata.integration.dto.SipraMtdTCategoriaAppl;
import it.csi.sira.backend.metadata.integration.dao.SipraMtdTCategoriaApplDAO;
import it.csi.sira.backend.metadata.utils.GenericDAO;
import org.springframework.jdbc.core.RowMapper;

/**
 * SipraMtdTCategoriaAppl DAO implementation
 *
 * @author Telosys Tools
 *
 */
public class SipraMtdTCategoriaApplDAOImpl extends GenericDAO<SipraMtdTCategoriaAppl> implements SipraMtdTCategoriaApplDAO {
	//----------------------------------------------------------------------
	/**
	 * DAO constructor
	 */
	public SipraMtdTCategoriaApplDAOImpl() {
		super();
	}

	private final static String QUERY_PRIMARY_KEY =
		"select * from bifisic_mtd_t_category_appl where id_category_appl = :id_category_appl";

	private final static String QUERY_INSERT =
		"insert into bifisic_mtd_t_category_appl(id_category_appl,fk_parent,level,des_category,url_icon,object_number,view_number) values(:id_category_appl,:fk_parent,:level,:des_category,:url_icon,:object_number,:view_number)";

	private final static String QUERY_UPDATE =
		"update bifisic_mtd_t_category_appl set fk_parent = :fk_parent, level = :level, des_category = :des_category, url_icon = :url_icon, object_number = :object_number, view_number = :view_number  where id_category_appl = :id_category_appl";

	private final static String QUERY_DELETE =
		"delete from bifisic_mtd_t_category_appl where  id_category_appl = :id_category_appl";

	private final static String SQL_COUNT_ALL =
		"select count(*) from bifisic_mtd_t_category_appl";

	@Override
	public String getPrimaryKeySelect() {
		return QUERY_PRIMARY_KEY;
	}

	@Override
	public String getTableName(){
		return "bifisic_mtd_t_category_appl";
	}

	@Override
	public String getSqlSelect() {
		return "select * from bifisic_mtd_t_category_appl order by id_category_appl";
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

	public SipraMtdTCategoriaAppl findByPK(Integer idCategoriaAppl) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category_appl", idCategoriaAppl);
		return super.findByPK(map);
	}

	public int deleteByPK(Integer idCategoriaAppl) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category_appl", idCategoriaAppl);
		return super.delete(getSqlDelete(), map);
	}

	@Override
	public java.util.Map<String, Object> getValuesForInsert(SipraMtdTCategoriaAppl sipraMtdTCategoriaAppl) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category_appl", sipraMtdTCategoriaAppl.getIdCategoriaAppl());
		map.put("fk_parent", sipraMtdTCategoriaAppl.getFkPadre());
		map.put("level", sipraMtdTCategoriaAppl.getLivello());
		map.put("des_category", sipraMtdTCategoriaAppl.getDesCategoria());
		map.put("url_icon", sipraMtdTCategoriaAppl.getUrlIcona());
		map.put("object_number", sipraMtdTCategoriaAppl.getObjectNumber());
		map.put("view_number", sipraMtdTCategoriaAppl.getViewNumber());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForUpdate(SipraMtdTCategoriaAppl sipraMtdTCategoriaAppl) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("fk_parent", sipraMtdTCategoriaAppl.getFkPadre());
		map.put("level", sipraMtdTCategoriaAppl.getLivello());
		map.put("des_category", sipraMtdTCategoriaAppl.getDesCategoria());
		map.put("url_icon", sipraMtdTCategoriaAppl.getUrlIcona());
		map.put("object_number", sipraMtdTCategoriaAppl.getObjectNumber());
		map.put("view_number", sipraMtdTCategoriaAppl.getViewNumber());
		map.put("id_category_appl", sipraMtdTCategoriaAppl.getIdCategoriaAppl());
		return map;
	}

	public java.util.Map<String, Object> getValuesForPrimaryKey(SipraMtdTCategoriaAppl sipraMtdTCategoriaAppl) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category_appl", sipraMtdTCategoriaAppl.getIdCategoriaAppl());
		return map;
	}

	@Override
	public java.util.Map<String, Object> getValuesForDelete(SipraMtdTCategoriaAppl sipraMtdTCategoriaAppl) {
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
		map.put("id_category_appl", sipraMtdTCategoriaAppl.getIdCategoriaAppl());
		return map;
	}

	@Override
	public RowMapper<SipraMtdTCategoriaAppl> getRowMapper()  {
		//--- RowMapper to populate a new bean instance
		//return new SipraMtdTCategoriaApplRowMapper( new SipraMtdTCategoriaAppl() ) ;

       return new SipraMtdTCategoriaApplRowMapper() ;
	}

	//----------------------------------------------------------------------
	/**
	 * Populates the given bean with the data retrieved from the given ResultSet
	 * @param rs
	 * @param sipraMtdTCategoriaAppl
	 * @throws SQLException
	 */
	private static void populateBean(ResultSet rs, SipraMtdTCategoriaAppl sipraMtdTCategoriaAppl) throws SQLException {

		//--- Set data from ResultSet to Bean attributes
		sipraMtdTCategoriaAppl.setIdCategoriaAppl(rs.getInt("id_category_appl")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdTCategoriaAppl.setIdCategoriaAppl(null); }; // not primitive number => keep null value if any
		sipraMtdTCategoriaAppl.setFkPadre(rs.getInt("fk_parent")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdTCategoriaAppl.setFkPadre(null); }; // not primitive number => keep null value if any
		sipraMtdTCategoriaAppl.setLivello(rs.getInt("level")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdTCategoriaAppl.setLivello(null); }; // not primitive number => keep null value if any
		sipraMtdTCategoriaAppl.setDesCategoria(rs.getString("des_category")); // java.lang.String
		sipraMtdTCategoriaAppl.setUrlIcona(rs.getString("url_icon")); // java.lang.String
		sipraMtdTCategoriaAppl.setObjectNumber(rs.getInt("object_number")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdTCategoriaAppl.setObjectNumber(null); }; // not primitive number => keep null value if any
		sipraMtdTCategoriaAppl.setViewNumber(rs.getInt("view_number")); // java.lang.Integer
		if ( rs.wasNull() ) { sipraMtdTCategoriaAppl.setViewNumber(null); }; // not primitive number => keep null value if any
	}


	/**
	 * Specific inner class for 'RowMapper' implementation
	 */
	public static class SipraMtdTCategoriaApplRowMapper implements RowMapper<SipraMtdTCategoriaAppl> {

		public SipraMtdTCategoriaApplRowMapper() {

		}

		public SipraMtdTCategoriaAppl mapRow(ResultSet rs, int rowNum) throws SQLException {
			SipraMtdTCategoriaAppl bean = new SipraMtdTCategoriaAppl();
			populateBean(rs, bean);
			return bean;
		}
	}
}
