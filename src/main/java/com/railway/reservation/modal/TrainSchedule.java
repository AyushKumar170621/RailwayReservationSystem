package com.railway.reservation.modal;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class TrainSchedule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int scheduleId;
	
	@ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;

	
	@Override
	public String toString() {
		return "TrainSchedule [scheduleId=" + scheduleId + ", train=" + train + ", sourceStation=" + sourceStation
				+ ", destinationStation=" + destinationStation + ", departureTime=" + departureTime + ", arrivalTime="
				+ arrivalTime + ", duration=" + duration + ", daysOfOperation=" + daysOfOperation + "]";
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDaysOfOperation() {
		return daysOfOperation;
	}

	public void setDaysOfOperation(String daysOfOperation) {
		this.daysOfOperation = daysOfOperation;
	}

	@Column(nullable=false)
	private String sourceStation;
	
	@Column(nullable=false)
	private String destinationStation;
	
	@Column(nullable = false)
	private LocalTime departureTime;
	
	@Column(nullable = false)
	private LocalTime arrivalTime;
	
	@Column(nullable = false)
	private int duration;
	
	@Column(nullable = false)
	private String daysOfOperation;
	
	

}
