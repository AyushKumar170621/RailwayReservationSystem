package com.railway.reservation.modal;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Station {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stationId;
	
	@Column(nullable=false)
	private String stationName;
	
	@Column(nullable=false)
	private String city;
	
	@Override
	public String toString() {
		return "Station [stationId=" + stationId + ", stationName=" + stationName + ", city=" + city + ", state="
				+ state + ", stationCode=" + stationCode + "]";
	}

	public int getStationId() {
		return stationId;
	}

	public void setStationId(int stationId) {
		this.stationId = stationId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	@Column(nullable=false)
	private String state;
	
	@Column(unique=true,nullable=false)
	private String stationCode;
	
}
