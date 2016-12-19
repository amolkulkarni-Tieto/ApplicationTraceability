package tieto.at.Repositories;

import java.util.List;

import tieto.at.DomainEntities.*;

public interface IReadOnlyRepository<E extends ATEntity> {
	
	
	public List<E> All();
    
      
	public List<E> FilterBy(String expression);
    
   
	public List<E> GetByField(String fieldName, Object fieldValue, int maxResults);

	public E GetById(String fieldName, long fieldValue);

}
