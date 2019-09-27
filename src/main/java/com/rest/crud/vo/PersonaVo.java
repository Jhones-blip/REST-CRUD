package com.rest.crud.vo;
public class PersonaVo {	
	private int id;
	private int cedula; 
	private String nombres;
	private String apellido;
	
	
	public PersonaVo(int id, String nombres, String apellido, int cedula) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.nombres = nombres;
		this.apellido = apellido;
		
	}	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	
}
