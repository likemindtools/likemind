package com.lm.pos.dayclose;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dayclose {

	@Id
	private Integer daycloseid;
	private String budget;
	private String manualsales;
	private String systemsales;
	
	public Dayclose(){
		
	}
	

	
	public Dayclose(Integer daycloseid, String budget, String manualsales, String systemsales) {
		super();
		this.daycloseid = daycloseid;
		this.budget = budget;
		this.manualsales = manualsales;
		this.systemsales = systemsales;
	}



	public int getDaycloseid() {
		return daycloseid;
	}

 

	public void setDaycloseid(Integer daycloseid) {
		this.daycloseid = daycloseid;
	}



	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	public String getManualsales() {
		return manualsales;
	}
	public void setManualsales(String manualsales) {
		this.manualsales = manualsales;
	}
	public String getSystemsales() {
		return systemsales;
	}
	public void setSystemsales(String systemsales) {
		this.systemsales = systemsales;
	}



	@Override
	public String toString() {
		return "Dayclose [daycloseid=" + daycloseid + ", budget=" + budget + ", manualsales=" + manualsales
				+ ", systemsales=" + systemsales + "]";
	}
	
	
	
}
