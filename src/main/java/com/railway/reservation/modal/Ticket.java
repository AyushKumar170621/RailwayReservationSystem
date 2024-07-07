package com.railway.reservation.modal;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long tickedId;
	
	@Column(unique=true,nullable=false)
	private String pnrNumber;
	
	@Column(nullable=false)
	private Date bookingDate;
	
	@Column(nullable=false)
	private Date travelDate;
	
	@Column(nullable=false)
	private String seatNumber;
	
	@Column(nullable=false)
	private String boardingStation;
	
	@Column(nullable=false)
	private String destinationStation;
	
	@Column(nullable=false)
	private double fare;
	
	@Column(nullable=false)
	private String bookingStatus;
	
	@ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;

    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;
    
    @Override
	public String toString() {
		return "Ticket [tickedId=" + tickedId + ", pnrNumber=" + pnrNumber + ", bookingDate=" + bookingDate
				+ ", travelDate=" + travelDate + ", seatNumber=" + seatNumber + ", boardingStation=" + boardingStation
				+ ", destinationStation=" + destinationStation + ", fare=" + fare + ", bookingStatus=" + bookingStatus
				+ ", train=" + train + ", passenger=" + passenger + ", coach=" + coach + ", payment=" + payment + "]";
	}

	public long getTickedId() {
		return tickedId;
	}

	public void setTickedId(long tickedId) {
		this.tickedId = tickedId;
	}

	public String getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public String getBoardingStation() {
		return boardingStation;
	}

	public void setBoardingStation(String boardingStation) {
		this.boardingStation = boardingStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;
    
    @OneToOne(mappedBy = "ticket", cascade = CascadeType.ALL)
    private Payment payment;
	
}
