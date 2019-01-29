package br.edu.ifnmg.clindalvo.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

@ManagedBean
public class PortariaBean {
	private Long id;
	private String dataInicio;
	private String ementa;
	private String descricao;
	private Integer numeroPortaria;
	private String link;
	private Integer cargaHoraria;
	private String dataPdf;
	private String tipoPortaria;
	private Integer demandante;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getNumeroPortaria() {
		return numeroPortaria;
	}
	public void setNumeroPortaria(Integer numeroPortaria) {
		this.numeroPortaria = numeroPortaria;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getDataPdf() {
		return dataPdf;
	}
	public void setDataPdf(String dataPdf) {
		this.dataPdf = dataPdf;
	}
	public String getTipoPortaria() {
		return tipoPortaria;
	}
	public void setTipoPortaria(String tipoPortaria) {
		this.tipoPortaria = tipoPortaria;
	}
	public Integer getDemandante() {
		return demandante;
	}
	public void setDemandante(Integer demandante) {
		this.demandante = demandante;
	}
	
	public void salvar() {
		FacesMessage msg = null;
		boolean salvo = false;
		//Portaria p = new Portaria(dataInicio, ementa, descricao, numeroPortaria, link, cargaHoraria, dataPdf, tipoPortaria, demandante);
		msg = new FacesMessage(FacesMessage.SEVERITY_INFO,"Portaria " + numeroPortaria,"cadastrada" );
		salvo = true;
		FacesContext.getCurrentInstance().addMessage(null, msg);
		PrimeFaces.current().ajax().addCallbackParam("salvo", salvo);
	}
	
	public List<String> autoCompleteDemandante(String query){
		List<String> resultado = new ArrayList<String>();
		for(int i = 0; i < 10; i++) {
            resultado.add(query + i);
        }
		return resultado;
	}

}
