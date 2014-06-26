package br.com.clogos.estagio.jsf.facade;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.com.clogos.estagio.jpa.controller.GenericController;
import br.com.clogos.estagio.model.Relatorio;

public class RelatorioAlunoFacade implements Serializable {
	private static final long serialVersionUID = 3016523488152504622L;
	private Relatorio relatorioAluno;
	private GenericController genericController;
	
	public void save() {
		getRelatorioAluno().setRevisao(false);
		getRelatorioAluno().setValidado(false);
		if(getGenericController().save(getRelatorioAluno())) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_INFO, "Relat�rio salvo e encaminhado para avalia��o.", ""));
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
					FacesMessage.SEVERITY_ERROR, "Problemas ao salvar relat�rio, por favor entre em contato com a coordena��o Logos", ""));
		}
		relatorioAluno = null;
	}
	
	public void limpar() {
		relatorioAluno = null;
	}
	
	public void ajustarDataIntervalo() {
		
	}
	
	public Relatorio getRelatorioAluno() {
		return relatorioAluno == null ? relatorioAluno = new Relatorio() : relatorioAluno;
	}
	public void setRelatorioAluno(Relatorio relatorioAluno) {
		this.relatorioAluno = relatorioAluno;
	}
	
	public GenericController getGenericController() {
		return genericController == null ? genericController = new GenericController() : genericController;
	}
}
