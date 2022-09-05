package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int eId;
	private String eName;
	private String eTech;
	
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteTech() {
		return eTech;
	}
	public void seteTech(String eTech) {
		this.eTech = eTech;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eTech=" + eTech + "]";
	}
	
	
	

}
