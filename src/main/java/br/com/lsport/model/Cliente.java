package br.com.lsport.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cliente")

public class Cliente {

	    private String _id;
        private String nome;
        private String modelo;
        private String tamanho;
        private String nomeC;
        private int numero;
        private int cep;
        private String rua;
        private int apt;
        private int compl;
        private int telefone;
        private String email;
        
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getTamanho() {
			return tamanho;
		}
		public void setTamanho(String tamanho) {
			this.tamanho = tamanho;
		}
		public String getNomeC() {
			return nomeC;
		}
		public void setNomeC(String nomeC) {
			this.nomeC = nomeC;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		public int getCep() {
			return cep;
		}
		public void setCep(int cep) {
			this.cep = cep;
		}
		public String getRua() {
			return rua;
		}
		public void setRua(String rua) {
			this.rua = rua;
		}
		public int getApt() {
			return apt;
		}
		public void setApt(int apt) {
			this.apt = apt;
		}
		public int getCompl() {
			return compl;
		}
		public void setCompl(int compl) {
			this.compl = compl;
		}
		public int getTelefone() {
			return telefone;
		}
		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

	public String getId() {
		return _id;
	}

	public void setId(String _id) {
		this._id = _id;
	}
	// standard constructors / setters / getters / toString

}
