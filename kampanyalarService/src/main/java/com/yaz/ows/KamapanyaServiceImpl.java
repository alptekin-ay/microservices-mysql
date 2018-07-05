package com.yaz.ows;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yaz.dao.KampanyaDAO;
import com.yaz.entity.Kampanya;

@Service
public class KamapanyaServiceImpl implements KampanyaService {

	@Autowired
	private KampanyaDAO kampanyaDAO;
	
//-----------------------KAMPANYALAR------------------------
	@Override
	public List<Kampanya> getKampanyalar() {
		return kampanyaDAO.getKampanyalar();
	}

	@Override
	public void saveKampanya(Kampanya kampanya) {
		kampanyaDAO.saveKampanya(kampanya);
		
	}

	@Override
	public Kampanya getKampanya(int kampanyaId) {
		return kampanyaDAO.getKampanya(kampanyaId);
	}

	@Override
	public void deleteKampanya(int kampanyaId) {
		kampanyaDAO.deleteKampanya(kampanyaId);
	}
}





