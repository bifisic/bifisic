/*
 * Created on 25 nov 2016 ( Time 10:35:37 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao;

import it.csi.sira.backend.metadata.integration.dto.SipraMtdRCategappCategori;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;




/**
 * SipraMtdRCategappCategori DAO interface
 * 
 * @author Telosys Tools
 */
public interface SipraMtdRCategappCategoriDAO {

	//----------------------------------------------------------------------
	/**
	 * Finds a bean by its primary key 
	 * @param idCategoriaAppl
	 * @param idCategoria
	 * @return the bean found or null if not found 
	 */
	public SipraMtdRCategappCategori findByPK(Integer idCategoriaAppl, Integer idCategoria);

	public List<SipraMtdRCategappCategori> findAll();
	
	public List<SipraMtdRCategappCategori> findByCriteria(java.util.Map<String, Object> params);
	public List<SipraMtdRCategappCategori> findByCriteria(MapSqlParameterSource params);
	
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, Map<String, Object> params);
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, MapSqlParameterSource params);
	public List<SipraMtdRCategappCategori> findByGenericCriteria(String query, MapSqlParameterSource params);
	
	public void insert(SipraMtdRCategappCategori bean);

	public void update(SipraMtdRCategappCategori bean);
	
	public void update(String sql, Map<String, Object> param);

	public int deleteByPK(Integer idCategoriaAppl, Integer idCategoria);
	
	public int delete(String query, Map<String, Object> params);
	public int delete(String query, MapSqlParameterSource params);

	public boolean exist(Map<String, Object> params);

    public RowMapper<SipraMtdRCategappCategori> getRowMapper();
}
