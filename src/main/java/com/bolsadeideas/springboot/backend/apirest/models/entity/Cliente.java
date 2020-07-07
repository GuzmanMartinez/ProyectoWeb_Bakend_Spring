package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;





@Entity
@Table(name="clientes")
public class Cliente implements Serializable  {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message = "no puede estar vacio.")
	@Size(min=4, max=12, message = "debe tener entre 4 y 12 carcteres.")
	@Column(nullable=false)
	private String nombre;
		
	@NotEmpty(message = "no puede estar vacio.")
	@Size(min=4, max=12, message = "debe tener entre 4 y 12 carcteres.")
	private String apellido;
	@Column(nullable=false)//, unique=true)
		
	@NotEmpty(message = "no puede estar vacio.")
	@Email(message = "debe tener un formato de email valido.")
	private String email;
	
	@NotEmpty(message = "no puede estar vacio.")
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	private String foto;
	
	/*
	//Antes de Crear el usuario se inserta la fecha actual
	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}
	*/
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	

}
