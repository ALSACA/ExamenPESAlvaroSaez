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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((bloqueada == null) ? 0 : bloqueada.hashCode());
		result = prime * result
				+ ((contrasenha == null) ? 0 : contrasenha.hashCode());
		result = prime * result
				+ ((cupoDisponible == null) ? 0 : cupoDisponible.hashCode());
		result = prime * result
				+ ((cupoMaximo == null) ? 0 : cupoMaximo.hashCode());
		result = prime * result + id;
		result = prime * result + numero;
		result = prime
				* result
				+ ((numeroComprobacion == null) ? 0 : numeroComprobacion
						.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Numero other = (Numero) obj;
		if (bloqueada == null) {
			if (other.bloqueada != null)
				return false;
		} else if (!bloqueada.equals(other.bloqueada))
			return false;
		if (contrasenha == null) {
			if (other.contrasenha != null)
				return false;
		} else if (!contrasenha.equals(other.contrasenha))
			return false;
		if (cupoDisponible == null) {
			if (other.cupoDisponible != null)
				return false;
		} else if (!cupoDisponible.equals(other.cupoDisponible))
			return false;
		if (cupoMaximo == null) {
			if (other.cupoMaximo != null)
				return false;
		} else if (!cupoMaximo.equals(other.cupoMaximo))
			return false;
		if (id != other.id)
			return false;
		if (numero != other.numero)
			return false;
		if (numeroComprobacion == null) {
			if (other.numeroComprobacion != null)
				return false;
		} else if (!numeroComprobacion.equals(other.numeroComprobacion))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
	
	
	
}

