package com.yaz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yaz.entity.Kampanya;
//import com.yaz.entity.HesapHareketi;
//import com.yaz.entity.Kampanya;

@Repository
public class KampanyaDAOImpl implements KampanyaDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

//----------------------KAMPANYALAR--------------------
	
	@Override
	public List<Kampanya> getKampanyalar() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<Kampanya> theQuery = 
				currentSession.createQuery("from Kampanya order by kampanya_adi",
											Kampanya.class);
		
		// execute query and get result list
		List<Kampanya> kampanyalar = theQuery.getResultList();
				
		// return the results		
		return kampanyalar;
	}

	@Override
	public void saveKampanya(Kampanya kampanya) {
		
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(kampanya);
		
	}

	@Override
	public Kampanya getKampanya(int kampanyaId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Kampanya kampanya = currentSession.get(Kampanya.class, kampanyaId);
				
		return kampanya;
	}

	@Override
	public void deleteKampanya(int kampanyaId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Kampanya where id=:kampanyaId");
		theQuery.setParameter("kampanyaId", kampanyaId);
		
		theQuery.executeUpdate();
		
	}	
}