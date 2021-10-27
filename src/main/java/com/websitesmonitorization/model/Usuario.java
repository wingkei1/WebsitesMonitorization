package com.websitesmonitorization.model;

public class Usuario {

	String nombreUsuario;
	Integer idUsuario;
	String apellidos;
	String correo;
	String tipoUsuario;
		
	public String getNombreUsuario() {
	    return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
	    this.nombreUsuario = nombreUsuario;
	}
	
	public Integer getIdUsuario() {
	    return idUsuario;
	}
	
	public void setIdUsuario(Integer idUsuario) {
	    this.idUsuario = idUsuario;
	}
		
	public String getApellidosUsuario() {
	    return apellidos;
	}
	
	public void setApellidosUsuario(String apellidos) {
	    this.apellidos = apellidos;
	}
	
	public String getCorreoUsuario() {
	    return apellidos;
	}
	
	public void setCorreoUsuario(String correo) {
	    this.correo = correo;
	}
	
	public String getTipoUsuario() {
	    return tipoUsuario;
	}
	
	public void setTipoUsuario(String tipoUsuario) {
	    this.tipoUsuario = tipoUsuario;
	}
	

}
