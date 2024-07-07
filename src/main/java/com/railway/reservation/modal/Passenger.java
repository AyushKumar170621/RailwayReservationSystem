package com.railway.reservation.modal;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.processing.Pattern;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Passenger {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int passengerId;
	
	@Column(nullable=false)
	private String fullname;
	
	@Column(nullable=false)
	private String gender;
	
	@Column(nullable=false)
	private Date dateOfBirth;
	
	@Column(nullable=false)
	private String contactNumber;
	
	@Column(nullable=false)
//	@Pattern(regexp = "^[\\w!#$%&'*+/=?^`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?$", message = "Invalid email address")
	private String email;
	
	@Column(nullable=false)
	private String address;
	
	@Column(nullable=false)
	private String idProofType;
	
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", fullname=" + fullname + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", contactNumber=" + contactNumber + ", email=" + email
				+ ", address=" + address + ", idProofType=" + idProofType + ", idProofNumber=" + idProofNumber
				+ ", nationality=" + nationality + ", tickets=" + tickets + "]";
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdProofType() {
		return idProofType;
	}

	public void setIdProofType(String idProofType) {
		this.idProofType = idProofType;
	}

	public String getIdProofNumber() {
		return idProofNumber;
	}

	public void setIdProofNumber(String idProofNumber) {
		this.idProofNumber = idProofNumber;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	@Column(nullable=false)
	private String idProofNumber;
	
	@Column(nullable=false)
	private String nationality;
	
	@OneToMany(mappedBy = "passenger", cascade = CascadeType.ALL)
    private List<Ticket> tickets;
	
}
