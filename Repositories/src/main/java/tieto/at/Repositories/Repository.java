package tieto.at.Repositories;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.*;
import org.hibernate.cfg.Configuration;

import tieto.at.DomainEntities.*;

public  abstract class Repository<E extends ATEntity> implements IReadOnlyRepository<E>{
	
	private static SessionFactory sessionFactory; 
	private Session session;
	protected String EntityClassName;
	
	private static void SetupSessionFactory()
	{
		if(sessionFactory==null)
		{
			
			Configuration config = new Configuration();
			
			config.configure("hibernate.cfg.xml");
			
			
				final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
					.applySettings(config.getProperties())
					.build();
			try {
				
				MetadataSources metaResources =  new MetadataSources( registry );
				metaResources.addResource("SLLApplication.hbm.xml");
				metaResources.addResource("SLLArea.hbm.xml");
				metaResources.addResource("SLLIntegration.hbm.xml");
				metaResources.addResource("SLLUser.hbm.xml");
				sessionFactory = metaResources.buildMetadata().buildSessionFactory();
				
			}
			catch (Exception e) {
				// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
				// so destroy it manually.
				StandardServiceRegistryBuilder.destroy( registry );
				System.out.println("HERE IS THE EXCPETION FROM SESSION CREATE"+   e.getMessage() );
			}
			
			
		}
		
	}
	
	public Session GetSession()
	{
		if(sessionFactory==null)
		{
			SetupSessionFactory();
			
		}
		if(session==null)
		{
			session = sessionFactory.openSession();
			
		}
		return session;
	}
	public void CloseSession()
	{
		if(session!=null)
		{
			session.close();
			
		}
		
	}

	public List<E> All() {
		List<E> results;
		
		try{
			
			
			Session session  =  GetSession();
			Transaction tx = session.beginTransaction();
	
			//List<SllApplication> results = session.createQuery("FROM " + ).getResultList();
			//TypeVariable typeParam = Repository.class.getTypeParameters()[0];
			 results = session.createQuery("FROM " + EntityClassName).getResultList();
	        tx.commit();
        
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
				
		}
		return results;
	}

	public List<E> FilterBy(String expression) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<E> GetByField(String fieldName, Object fieldValue, int maxResults) {
		List<E> results = null;
		try{
			
			
			Session session  =  GetSession();
			Transaction tx = session.beginTransaction();
	
			//List<SllApplication> results = session.createQuery("FROM " + ).getResultList();
			//TypeVariable typeParam = Repository.class.getTypeParameters()[0];
			 results = session.createQuery("FROM "+ EntityClassName +" WHERE " + fieldName + " = '"+fieldValue+"'").getResultList();
			//session.createCriteria(EntityClassName)
	        tx.commit();
        
		}
		catch (Exception e)
		{
			System.out.println("PRINTING EXCEPTION IN REPOSITORY ------>" + e);
			
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return results;
		
	}

	public E GetById(String fieldName, long fieldValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
