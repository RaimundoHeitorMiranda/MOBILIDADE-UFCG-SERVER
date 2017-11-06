package com.server.dtos;

public class FormDto {
private Long id;
	
	//dados da viagem
	private String requesterSector;
	private String requestDate;
	private String destination;
	private String purpose;
	
	//dados do passageiro
	private String name;
	private String phone;
	
	//data e hora da viagem
	private String travelDate;
	private String departureHour;
	private String returnDate;
	private String returnHour;
	private String departurePoint;
	
	//passageiros no aeroporto/rodoviaria
	
	private String arrivalTime;
	private String flightNumber;
	private String airCompany;
	private String travelOrigin;
	
	//responsável pela diarias do motorista
	private String driverSectorResponsibility;
	
	public FormDto() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRequesterSector() {
		return requesterSector;
	}

	public void setRequesterSector(String requesterSector) {
		this.requesterSector = requesterSector;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public String getDepartureHour() {
		return departureHour;
	}

	public void setDepartureHour(String departureHour) {
		this.departureHour = departureHour;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getReturnHour() {
		return returnHour;
	}

	public void setReturnHour(String returnHour) {
		this.returnHour = returnHour;
	}

	public String getDeparturePoint() {
		return departurePoint;
	}

	public void setDeparturePoint(String departurePoint) {
		this.departurePoint = departurePoint;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirCompany() {
		return airCompany;
	}

	public void setAirCompany(String airCompany) {
		this.airCompany = airCompany;
	}

	public String getTravelOrigin() {
		return travelOrigin;
	}

	public void setTravelOrigin(String travelOrigin) {
		this.travelOrigin = travelOrigin;
	}

	public String getDriverSectorResponsibility() {
		return driverSectorResponsibility;
	}

	public void setDriverSectorResponsibility(String driverSectorResponsibility) {
		this.driverSectorResponsibility = driverSectorResponsibility;
	}

	
}
