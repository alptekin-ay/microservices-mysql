package com.yaz.ows;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.yaz.dao.HesapHareketiDAO;
import com.yaz.entity.HesapHareketi;

@Service
public class HesapHareketleriServiceImpl implements HesapHareketleriService {

	@Autowired
	private HesapHareketiDAO hesapHareketiDAO;

	
//-----------------------HESAP HAREKETLER�------------------
	@Override
	public List<HesapHareketi> getHesapHareketleri() {
		return hesapHareketiDAO.getHesapHareketleri();
	}

	@Override
	public void saveHesapHareketi(HesapHareketi hesapHareketi) {
		hesapHareketiDAO.saveHesapHareketi(hesapHareketi);
	}

	@Override
	public HesapHareketi getHesapHareketi(int hesapHareketiId) {
		return hesapHareketiDAO.getHesapHareketi(hesapHareketiId);
	}

	@Override
	public void deleteHesapHareketi(int hesapHareketiId) {
		hesapHareketiDAO.deleteHesapHareketi(hesapHareketiId);
	}
}





