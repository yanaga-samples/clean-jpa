package br.com.yanaga.cleanjpa.app;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	Integer version;

	private Tipo tipo = Tipo.FISICA;

	Pessoa() {
	}

	public static Pessoa newInstance() {
		return new Pessoa();
	}

	public int getNumeroParcelas() {
		return tipo.getNumeroParcelas();
	}

	public Long getId() {
		return id;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

}