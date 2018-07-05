package com.yaz.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
//import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="pass")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="tCNoVKNoPassNo")
	private String tCNoVKNoPassNo;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="birth_date")
	private String birthDate;
	
	@Column(name="eklenme_tarihi")
	private String eklenmeTarihi;
	
	@Column(name="guncelleme_tarihi")
	private String guncellemeTarihi;
	
//	@OneToMany(fetch=FetchType.LAZY, mappedBy="customer", cascade= {CascadeType.PERSIST, 
//			CascadeType.MERGE,
//			CascadeType.DETACH,
//			CascadeType.REFRESH})
//	private List<HesapHareketi> hesapHareketleri;
	
	public Customer() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String gettCNoVKNoPassNo() {
		return tCNoVKNoPassNo;
	}

	public void settCNoVKNoPassNo(String tCNoVKNoPassNo) {
		this.tCNoVKNoPassNo = tCNoVKNoPassNo;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getEklenmeTarihi() {
		return eklenmeTarihi;
	}

	public void setEklenmeTarihi(String eklenmeTarihi) {
		this.eklenmeTarihi = eklenmeTarihi;
	}

	public String getGuncellemeTarihi() {
		return guncellemeTarihi;
	}

	public void setGuncellemeTarihi(String guncellemeTarihi) {
		this.guncellemeTarihi = guncellemeTarihi;
	}

//	public List<HesapHareketi> getHesapHareketleri() {
//		return hesapHareketleri;
//	}
//
//	public void setHesapHareketleri(List<HesapHareketi> hesapHareketleri) {
//		this.hesapHareketleri = hesapHareketleri;
//	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", tCNoVKNoPassNo="
				+ tCNoVKNoPassNo + ", phoneNumber=" + phoneNumber + ", birthDate=" + birthDate + "]";
	}
	
//	public void add(HesapHareketi tempHesapHareketi) {
//		if(hesapHareketleri == null) {
//			hesapHareketleri = new ArrayList<>();
//		}
//		
//		hesapHareketleri.add(tempHesapHareketi);
//		
//		tempHesapHareketi.setCustomer(this);
//	}
	
}