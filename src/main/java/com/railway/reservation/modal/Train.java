package com.railway.reservation.modal;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Train {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int trainId;
	
	@Column(unique=true,nullable=false)
	private String trainName;
	
	@Column(unique=true,nullable=false)
	private String trainNumber;
	
	@Column(nullable=false)
	private String trainType;
	
	@Column(nullable=false)
	private int totalSeats;
	
	@OneToMany(mappedBy = "train", cascade = CascadeType.ALL)
	private List<TrainSchedule> trainSchedure;
	
	@OneToMany(mappedBy ="train", cascade =CascadeType.ALL)
	private List<Coach> coaches;

	public List<TrainSchedule> getTrainSchedure() {
		return trainSchedure;
	}

	public void setTrainSchedure(List<TrainSchedule> trainSchedure) {
		this.trainSchedure = trainSchedure;
	}

	public List<Coach> getCoaches() {
		return coaches;
	}

	public void setCoaches(List<Coach> coaches) {
		this.coaches = coaches;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainType() {
		return trainType;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	@Override
	public String toString() {
		return "Train [trainId=" + trainId + ", trainName=" + trainName + ", trainNumber=" + trainNumber
				+ ", trainType=" + trainType + ", totalSeats=" + totalSeats + ", trainSchedure=" + trainSchedure
				+ ", coaches=" + coaches + "]";
	}
	

}
