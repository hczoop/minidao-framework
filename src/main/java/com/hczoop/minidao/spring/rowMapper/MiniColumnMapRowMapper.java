package com.hczoop.minidao.spring.rowMapper;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.JdbcUtils;

import com.hczoop.minidao.spring.map.MiniDaoLinkedMap;

/**   
 *  
 * @Description: 使用小写的key 作为map的关键字
 *    
 */
public class MiniColumnMapRowMapper implements RowMapper<Map<String, Object>> {

	public Map<String, Object> mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		Map<String, Object> mapOfColValues = new MiniDaoLinkedMap(columnCount);
		for(int i = 1; i <= columnCount; i++){
			String key = JdbcUtils.lookupColumnName(rsmd, i);
			Object obj = JdbcUtils.getResultSetValue(rs, i);
			mapOfColValues.put(key, obj);
		}
		return mapOfColValues;
	}

}


