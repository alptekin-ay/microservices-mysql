package com.yaz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yaz.entity.HesapHareketi;

@Repository
public class HesapHareketiDAOImpl implements HesapHareketiDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	//-----------------------HESAP HAREKETLER�------------------
	
	@Override
	public List<HesapHareketi> getHesapHareketleri() {
	// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query<HesapHareketi> theQuery = 
				currentSession.createQuery("from HesapHareketi",
										HesapHareketi.class);
		
		// execute query and get result list
		List<HesapHareketi> hesapHareketleri = theQuery.getResultList();
				
		// return the results		
		return hesapHareketleri;
	}

	@Override
	public void saveHesapHareketi(HesapHareketi hesapHareketi) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(hesapHareketi);

	}

	@Override
	public HesapHareketi getHesapHareketi(int hesapHareketiId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		HesapHareketi hesapHareketi = currentSession.get(HesapHareketi.class, hesapHareketiId);
				
		return hesapHareketi;
	}

	@Override
	public void deleteHesapHareketi(int hesapHareketiId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from HesapHareketi where id=:hesapHareketiId");
		theQuery.setParameter("hesapHareketiId", hesapHareketiId);
		
		theQuery.executeUpdate();
	}
}







