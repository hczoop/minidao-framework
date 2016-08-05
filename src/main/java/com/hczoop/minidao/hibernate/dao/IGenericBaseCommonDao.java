package com.hczoop.minidao.hibernate.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

/**   
 *  
 * @Description: DAO层泛型基类接口
 *    
 */
public interface IGenericBaseCommonDao {
	
	public <T> void save(T entity);
	public <T> void saveOrUpate(T entity);
	public <T> void delete(T entity);
	public <T> T get(T entity);
	public <T> List<T> loadAll(T entiy);
	public <T> T get(Class<T> entityClass, final Serializable id);
	
	public <T> T findUniqueByProperty(Class<T> entityClass, String propertyName, Object value);
	public Session getSession();
	
	public <T> void deleteEntityById(Class<T> entity, Serializable id);
	
}


