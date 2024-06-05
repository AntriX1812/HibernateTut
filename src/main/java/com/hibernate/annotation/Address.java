package com.hibernate.annotation;




import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity	
@Table(name="Student_Address")
public class Address {
    @Id// Provided that the column this is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// This will create a sequence
    @Column(name="addr_id",length=50)//Specifying that this will be the column name in DB
	private int address_id;
    
    @Column(name="student_city",length=50)
    private String city;
    
    @Temporal(value = TemporalType.DATE)  // Setting the Temporal of Date
    @Column(name="created_date")
    private Date date;   
    
    @Transient  // This value will not be saved in DB as the annotation is Transient
    private int y;
    
    @Lob  // For saving image in Database
    @Column(columnDefinition = "longblob")
    private byte[] img;

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}
   
    
    
	
}
