package com.yaz.ows;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yaz.entity.HesapHareketi;

@Service
public interface HesapHareketleriService {

	
	
//----------------------------HesapHareketleri------------------------------
	public List<HesapHareketi> getHesapHareketleri();

	public void saveHesapHareketi(HesapHareketi hesapHareketi);

	public HesapHareketi getHesapHareketi(int hesapHareketiId);

	public void deleteHesapHareketi(int hesapHareketiId);
	
}
