package com.yaz.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="hesapHareketleri")
public class HesapHareketi {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="tutar")
	private float tutar;
	
	@Column(name="son_tutar")
	private float sonTutar;
	
	@Column(name="tarih")
	private String tarih;
	
	@Column(name="sube_id")
	private int subeId;
	
//	@Column(name="kisi_id")
//	private int kisiId;
	
	@Column(name="sube_adi")
	private String subeAdi;
	
	@Column(name="guncel_bakiye")
	private float guncelBakiye;
	
	@Column(name="musteri_adi")
	private String musteriAdi;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, 
			CascadeType.MERGE,
			CascadeType.DETACH,
			CascadeType.REFRESH})
	@JoinColumn(name="kisi_id")
	private Customer kisi;	
	
	public HesapHareketi() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getTutar() {
		return tutar;
	}

	public void setTutar(float tutar) {
		this.tutar = tutar;
	}

	public float getSonTutar() {
		return sonTutar;
	}

	public void setSonTutar(float sonTutar) {
		this.sonTutar = sonTutar;
	}

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	public int getSubeId() {
		return subeId;
	}

	public void setSubeId(int subeId) {
		this.subeId = subeId;
	}

	public Customer getKisi() {
		return kisi;
	}

	public void setKisi(Customer kisi) {
		this.kisi = kisi;
	}

	public float getGuncelBakiye() {
		return guncelBakiye;
	}

	public void setGuncelBakiye(float guncelBakiye) {
		this.guncelBakiye = guncelBakiye;
	}

	public String getSubeAdi() {
		return subeAdi;
	}

	public void setSubeAdi(String subeAdi) {
		this.subeAdi = subeAdi;
	}

	public String getMusteriAdi() {
		return musteriAdi;
	}

	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}

	public Customer getCustomer() {
		return kisi;
	}

	public void setCustomer(Customer customer) {
		this.kisi = customer;
	}

	@Override
	public String toString() {
		return "HesapHareketi [id=" + id + ", tutar=" + tutar + ", sonTutar=" + sonTutar + ", tarih=" + tarih
				+ ", subeId=" + subeId + ", kisiId=" + kisi + ", subeAdi=" + subeAdi + ", guncelBakiye="
				+ guncelBakiye + ", musteriAdi=" + musteriAdi + "]";
	}


	
	
}
