package com.railway.reservation.modal;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Coach {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int coachId;
	
	@Column(nullable=false)
	private String coachType;
	
	@Column(nullable=false)
	private int totalSeats;
	
	@Override
	public String toString() {
		return "Coach [coachId=" + coachId + ", coachType=" + coachType + ", totalSeats=" + totalSeats + ", tickets="
				+ tickets + "]";
	}

	@OneToMany(mappedBy = "coach", cascade = CascadeType.ALL)
    private List<Ticket> tickets;

	public int getCoachId() {
		return coachId;
	}

	public void setCoachId(int coachId) {
		this.coachId = coachId;
	}

	public String getCoachType() {
		return coachType;
	}

	public void setCoachType(String coachType) {
		this.coachType = coachType;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
}
