package com.example.demo.model.entidades;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Id;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long rut;
	
	private String email;
	
	private String telefono;
	
	@Column(name="Fecha_Inicio")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	public Cliente(Long rut, String email, String telefono, Date createAt) {
		this.rut = rut;
		this.email = email;
		this.telefono = telefono;
		this.createAt = createAt;
	}

	public Cliente() {
		super();
	}

	public Long getRut() {
		return rut;
	}

	public void setRut(Long rut) {
		this.rut = rut;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut
				+ ", email=" + email 
				+ ", telefono=" + telefono 
				+ ", createAt=" + createAt + "]";
	}
	
	
	
	

}
