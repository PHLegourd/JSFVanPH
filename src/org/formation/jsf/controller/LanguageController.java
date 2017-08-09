package org.formation.jsf.controller;

import java.util.Locale;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class LanguageController {
	private Locale locale;

	public Locale getLocale() {
		return locale;
	}
	
	public String getLanguage() {
		return locale.getLanguage();
	}
 public String changeLanguage(String language) {
	 locale = new Locale(language);
	 FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
	 return "";
 }
}
