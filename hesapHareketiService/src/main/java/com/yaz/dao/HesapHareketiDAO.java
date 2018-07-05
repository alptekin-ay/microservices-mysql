package com.yaz.dao;

import java.util.List;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.yaz.entity.HesapHareketi;

@Transactional
@EnableTransactionManagement
public interface HesapHareketiDAO {

	
	//-----------------------HESAP HAREKETLER�------------------
	
	public List<HesapHareketi> getHesapHareketleri();

	public void saveHesapHareketi(HesapHareketi hesapHareketi);

	public HesapHareketi getHesapHareketi(int hesapHareketiId);

	public void deleteHesapHareketi(int hesapHareketiId);
	
	
}
