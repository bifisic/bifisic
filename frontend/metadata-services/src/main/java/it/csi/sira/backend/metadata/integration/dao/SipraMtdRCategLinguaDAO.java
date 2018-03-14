/*
 * Created on 25 nov 2016 ( Time 10:35:37 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao;

import it.csi.sira.backend.metadata.integration.dto.SipraMtdRCategLingua;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;




/**
 * SipraMtdRCategLingua DAO interface
 * 
 * @author Telosys Tools
 */
public interface SipraMtdRCategLinguaDAO {

	//----------------------------------------------------------------------
	/**
	 * Finds a bean by its primary key 
	 * @param idCategoria
	 * @param idLingua
	 * @return the bean found or null if not found 
	 */
	public SipraMtdRCategLingua findByPK(Integer idCategoria, Integer idLingua);

	public List<SipraMtdRCategLingua> findAll();
	
	public List<SipraMtdRCategLingua> findByCriteria(java.util.Map<String, Object> params);
	public List<SipraMtdRCategLingua> findByCriteria(MapSqlParameterSource params);
	
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, Map<String, Object> params);
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, MapSqlParameterSource params);
	public List<SipraMtdRCategLingua> findByGenericCriteria(String query, MapSqlParameterSource params);
	
	public void insert(SipraMtdRCategLingua bean);

	public void update(SipraMtdRCategLingua bean);
	
	public void update(String sql, Map<String, Object> param);

	public int deleteByPK(Integer idCategoria, Integer idLingua);
	
	public int delete(String query, Map<String, Object> params);
	public int delete(String query, MapSqlParameterSource params);

	public boolean exist(Map<String, Object> params);

    public RowMapper<SipraMtdRCategLingua> getRowMapper();
}
