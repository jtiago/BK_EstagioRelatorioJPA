package br.com.clogos.estagio.jpa.controller;

import java.io.Serializable;
import java.util.List;

import br.com.clogos.estagio.jpa.dao.GenericDAO;
import br.com.clogos.estagio.jpa.dao.impl.GenericDAOImpl;

public class GenericController implements Serializable {
	private static final long serialVersionUID = 1L;
	private GenericDAO genericDAO;
	
	public void save(Object oT) {
		getGenericDAO().save(oT);
	}
	
	public void remove(Object oT) {
		getGenericDAO().delete(oT);
	}
	
	public void update(Object oT) {
		getGenericDAO().update(oT);
	}
	
	public Boolean saveList(List<?> list) {
		return getGenericDAO().saveList(list);
	}
	
	public List<?> findAll(Class<?> clazz, String coluna, String order) {
		return getGenericDAO().findAll(clazz, coluna, order);
	}
	
	@SuppressWarnings("rawtypes")
	public GenericDAO getGenericDAO() {
		if(genericDAO == null) {
			genericDAO = new GenericDAOImpl();
		}
		return genericDAO;
	}
}