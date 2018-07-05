package com.yaz.dao;

import java.util.List;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.yaz.entity.Kampanya;

@Transactional
@EnableTransactionManagement
public interface KampanyaDAO {

	//----------------Kampanyalar---------------
	
	public List<Kampanya> getKampanyalar();

	public void saveKampanya(Kampanya kampanya);

	public Kampanya getKampanya(int kampanyaId);

	public void deleteKampanya(int kampanyaId);
}
