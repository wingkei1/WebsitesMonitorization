package com.websitesmonitorization.model;

import java.util.Date;

public class Web {

	String url;
	String nombreWeb;
	Integer idWeb;
	String tipoWeb;
	java.util.Date update;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getNombreWeb() {
		return nombreWeb;
	}
	public void setNombreWeb(String nombreWeb) {
		this.nombreWeb = nombreWeb;
	}
	public Integer getIdWeb() {
		return idWeb;
	}
	public void setIdWeb(Integer idWeb) {
		this.idWeb = idWeb;
	}
	public String getTipoWeb() {
		return tipoWeb;
	}
	public void setTipoWeb(String tipoWeb) {
		this.tipoWeb = tipoWeb;
	}
	public Date getUpdate() {
		return update;
	}
	public void setUpdate(Date update) {
		this.update = update;
	}
	
	
}
