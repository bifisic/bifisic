package it.csi.sira.backend.metadata.integration.custom.dao.impl;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

import it.csi.sira.backend.metadata.integration.custom.dao.InfoBoxDAO;
import it.csi.sira.backend.metadata.integration.custom.dto.InfoBoxDTO;

import it.csi.sira.backend.metadata.utils.GenericDAO;

public class InfoBoxDAOImpl extends GenericDAO<InfoBoxDTO> implements InfoBoxDAO {

  @Override
  public String getPrimaryKeySelect() {
	// TODO Auto-generated method stub
	return null;
  }

  @Override
  public String getSqlSelect() {
	// TODO Auto-generated method stub
	return null;
  }

  @Override
  public String getSqlInsert() {
	// TODO Auto-generated method stub
	return null;
  }

  @Override
  public String getSqlUpdate() {
	// TODO Auto-generated method stub
	return null;
  }

  @Override
  public String getSqlDelete() {
	// TODO Auto-generated method stub
	return null;
  }

  @Override
  public Map<String, Object> getValuesForDelete(InfoBoxDTO bean) {
	// TODO Auto-generated method stub
	return null;
  }

  @Override
  public String getSqlCount() {
	// TODO Auto-generated method stub
	return null;
  }

  @Override
  public Map<String, Object> getValuesForInsert(InfoBoxDTO bean) {
	// TODO Auto-generated method stub
	return null;
  }

  @Override
  public Map<String, Object> getValuesForUpdate(InfoBoxDTO bean) {
	// TODO Auto-generated method stub
	return null;
  }

  @Override
  public RowMapper<InfoBoxDTO> getRowMapper() {

	return new InfoBoxDTORowMapper();
  }

  public static class InfoBoxDTORowMapper implements RowMapper<InfoBoxDTO> {

	public InfoBoxDTORowMapper() {

	}

	public InfoBoxDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
	  InfoBoxDTO bean = new InfoBoxDTO();
	  populateBean(rs, bean);
	  return bean;
	}
  }

  private static void populateBean(ResultSet rs, InfoBoxDTO infoBoxDTO) throws SQLException {

	infoBoxDTO.setTitolo(rs.getString("title")); // java.lang.String
	infoBoxDTO.setTestoAbstract(rs.getString("text_abstract")); // java.lang.String
	infoBoxDTO.setDesFontedati(rs.getString("des_datasource")); // java.lang.String
	infoBoxDTO.setDataUltAgg(rs.getDate("last_upd_date")); // java.util.Date
	infoBoxDTO.setNrOggettiDatasetCalc(rs.getInt("object_num_dataset_calc")); // java.lang.Integer
	infoBoxDTO.setUrlMetadatoCalc(rs.getString("metadata_calc_url")); // java.lang.String		
  }

  @Override
  public String getTableName() {
	// TODO Auto-generated method stub
	return null;
  }

}
