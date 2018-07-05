package com.yaz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kampanyalar")
public class Kampanya {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="kampanya_adi")
	private String kampanyaAdi;
	
	@Column(name="kampanya_logo")
	private String kampanyaLogo;
	
	@Column(name="kampanya_aciklama")
	private String kampanyaAciklama;
	
	@Column(name="kampanya_baslangic_tarihi")
	private String kampanyaBaslangicTarihi;
	
	@Column(name="kampanya_bitis_tarihi")
	private String kampanyaBitisTarihi;
	
	@Column(name="pasif")
	private String pasif;
	
	public Kampanya() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKampanyaAdi() {
		return kampanyaAdi;
	}

	public void setKampanyaAdi(String kampanyaAdi) {
		this.kampanyaAdi = kampanyaAdi;
	}

	public String getKampanyaLogo() {
		return kampanyaLogo;
	}

	public void setKampanyaLogo(String kampanyaLogo) {
		this.kampanyaLogo = kampanyaLogo;
	}

	public String getKampanyaAciklama() {
		return kampanyaAciklama;
	}

	public void setKampanyaAciklama(String kampanyaAciklama) {
		this.kampanyaAciklama = kampanyaAciklama;
	}

	public String getKampanyaBaslangicTarihi() {
		return kampanyaBaslangicTarihi;
	}

	public void setKampanyaBaslangicTarihi(String kampanyaBaslangicTarihi) {
		this.kampanyaBaslangicTarihi = kampanyaBaslangicTarihi;
	}

	public String getKampanyaBitisTarihi() {
		return kampanyaBitisTarihi;
	}

	public void setKampanyaBitisTarihi(String kampanyaBitisTarihi) {
		this.kampanyaBitisTarihi = kampanyaBitisTarihi;
	}

	public String getPasif() {
		return pasif;
	}

	public void setPasif(String pasif) {
		this.pasif = pasif;
	}

	@Override
	public String toString() {
		return "Kampanya [id=" + id + ", kampanyaAdi=" + kampanyaAdi + ", kampanyaLogo=" + kampanyaLogo
				+ ", kampanyaAciklama=" + kampanyaAciklama + ", kampanyaBaslangicTarihi=" + kampanyaBaslangicTarihi
				+ ", kampanyaBitisTarihi=" + kampanyaBitisTarihi + ", pasif=" + pasif + "]";
	}
	
	
}
