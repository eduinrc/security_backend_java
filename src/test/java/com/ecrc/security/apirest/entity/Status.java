package com.ecrc.security.apirest.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "estados")
public class Status {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "usuario_insercion", nullable = false)
	private String usuario_insercion;

	@Column(name = "fecha_insercion", nullable = false)
	@CreationTimestamp
	private Calendar fecha_insercion;

	@Column(name = "usuario_modificacion", nullable = false)
	private String usuario_modificacion;

	@Column(name = "fecha_modificacion")
	@UpdateTimestamp
	private Calendar fecha_modificacion;

	public Status(long id, String nombre, String usuario_insercion, Calendar fecha_insercion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.usuario_insercion = usuario_insercion;
		this.fecha_insercion = fecha_insercion;
	}

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

	public String getUsuario_insercion() {
		return usuario_insercion;
	}

	public void setUsuario_insercion(String usuario_insercion) {
		this.usuario_insercion = usuario_insercion;
	}

	public Calendar getFecha_insercion() {
		return fecha_insercion;
	}

	public void setFecha_insercion(Calendar fecha_insercion) {
		this.fecha_insercion = fecha_insercion;
	}

	public String getUsuario_modificacion() {
		return usuario_modificacion;
	}

	public void setUsuario_modificacion(String usuario_modificacion) {
		this.usuario_modificacion = usuario_modificacion;
	}

	public Calendar getFecha_modificacion() {
		return fecha_modificacion;
	}

	public void setFecha_modificacion(Calendar fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}

	@Override
	public String toString() {
		return "Status [id=" + id + ", nombre=" + nombre + ", usuario_insercion=" + usuario_insercion
				+ ", fecha_insercion=" + fecha_insercion + ", usuario_modificacion=" + usuario_modificacion
				+ ", fecha_modificacion=" + fecha_modificacion + "]";
	}

}
