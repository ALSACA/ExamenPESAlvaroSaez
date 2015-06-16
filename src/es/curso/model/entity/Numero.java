package es.curso.model.entity;

public class Numero {
	private int id;
	private int numero;
	private String cupoMaximo;
	private String cupoDisponible;
	private String tipo;
	private String numeroComprobacion;
	private String contrasenha;
	private Boolean bloqueada;
	
	public Numero() {
		super();
	}

	public Numero(int id, int numero, String cupoMaximo, String cupoDisponible,
			String tipo, String numeroComprobacion, String contrasenha,
			Boolean bloqueada) {
		super();
		this.id = id;
		this.numero = numero;
		this.cupoMaximo = cupoMaximo;
		this.cupoDisponible = cupoDisponible;
		this.tipo = tipo;
		this.numeroComprobacion = numeroComprobacion;
		this.contrasenha = contrasenha;
		this.bloqueada = bloqueada;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCupoMaximo() {
		return cupoMaximo;
	}
	public void setCupoMaximo(String cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}
	public String getCupoDisponible() {
		return cupoDisponible;
	}
	public void setCupoDisponible(String cupoDisponible) {
		this.cupoDisponible = cupoDisponible;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumeroComprobacion() {
		return numeroComprobacion;
	}
	public void setNumeroComprobacion(String numeroComprobacion) {
		this.numeroComprobacion = numeroComprobacion;
	}
	public String getContrasenha() {
		return contrasenha;
	}
	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}
	public Boolean getBloqueada() {
		return bloqueada;
	}
	public void setBloqueada(Boolean bloqueada) {
		this.bloqueada = bloqueada;
	}
	@Override
	public String toString() {
		return "Numero [id=" + id + ", numero=" + numero + ", cupoMaximo="
				+ cupoMaximo + ", cupoDisponible=" + cupoDisponible + ", tipo="
				+ tipo + ", numeroComprobacion=" + numeroComprobacion
				+ ", contrasenha=" + contrasenha + ", bloqueada=" + bloqueada
				+ "]";
	}

	
	
}

