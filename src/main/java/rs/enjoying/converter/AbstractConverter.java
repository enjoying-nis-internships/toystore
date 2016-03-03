package rs.enjoying.converter;

import org.springframework.beans.BeanUtils;

public abstract class AbstractConverter<T, V> {

	public void copyFromEntityToData(T entity, V data) {
		BeanUtils.copyProperties(entity, data);
	}

	public void copyFromEntityToData(T entity, V data, String... ignoreProperties) {
		BeanUtils.copyProperties(entity, data, ignoreProperties);
	}
	
	public void copyFromDataToEntity(V data, T entity) {
		BeanUtils.copyProperties(data, entity);
	}
	
	public void copyFromDataToEntity(V data, T entity, String... ignoreProperties) {
		BeanUtils.copyProperties(data, entity, ignoreProperties);
	}

}
