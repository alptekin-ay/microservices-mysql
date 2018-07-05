package com.yaz.ows;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yaz.entity.Kampanya;

@Service
public interface KampanyaService {

	
//----------------------------KAMPANYALAR------------------------------

	public List<Kampanya> getKampanyalar();

	public void saveKampanya(Kampanya kampanya);

	public Kampanya getKampanya(int kampanyaId);

	public void deleteKampanya(int kampanyaId);
}
