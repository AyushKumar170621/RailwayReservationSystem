package com.railway.reservation.modal;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Payment {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long paymentId;
	
	@Column(nullable=false)
	private Date paymentDate;

	@Column(nullable=false)
	private double paymentAmount;
	
	@Column(nullable=false)
	private String paymentMethod;
	
	@Column(nullable=false)
	private String paymentStatus;
	
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", paymentAmount=" + paymentAmount
				+ ", paymentMethod=" + paymentMethod + ", paymentStatus=" + paymentStatus + ", ticket=" + ticket + "]";
	}

	@OneToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	
	
}
