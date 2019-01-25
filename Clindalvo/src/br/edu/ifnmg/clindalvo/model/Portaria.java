package br.edu.ifnmg.clindalvo.model;

public class Portaria {
	private String dataInicio;
	private String ementa;
	private String descricao;
	private Integer numeroPortaria;
	private String link;
	private Integer cargaHoraria;
	private String dataPdf;
	private String tipoPortaria;
	private Integer demandante;
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
	
	
}
