package com.server.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;


import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.server.entities.enums.TravelStatus;



@Entity
public class Travel implements Serializable{

	@Transient
	private static final long serialVersionUID = 1L;
 
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	@Column(name = "travel_id")
	private Long id;
	
	@OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)//mappedBy = "travel"
	private List<Form> form = new ArrayList<Form>();
	
	@OneToOne
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicle;
	
	@OneToOne
	@JoinColumn(name="driver_id")
	private Driver driver;	
	
	@Column(name = "request_id")
	private Long  register;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
	private Date travelDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
	private Date returnDate;
	
	@Enumerated(EnumType.STRING)
	private TravelStatus status;
	
	public Travel() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Form> getForm() {
		return form;
	}

	public void setForm(List<Form> form) {
		this.form = form;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Long getRegister() {
		return register;
	}

	public void setRegister(Long n_request) {
		this.register = n_request;
	}

	
	
	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public TravelStatus getStatus() {
		return status;
	}

	public void setStatus(TravelStatus status) {
		this.status = status;
	}

	public void addform(Form form) {
        addForm(form, true);
    }
 
    void addForm(Form form, boolean set) {
        if (form != null) {
            getForm().add(form);
            if (set) {
                form.setTravel(this, false);
            }
        }
    }
     
    public void removeForm(Form form) {
        getForm().remove(form);
        form.setTravel(null);
    }    
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Travel other = (Travel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Travel [id=" + id + ", form=" + form + ", vehicle=" + vehicle + ", driver=" + driver + ", request="
				+ register + ", travelDate=" + travelDate + ", returnDate=" + returnDate + ", status=" + status + "]";
	}
	
	
}
