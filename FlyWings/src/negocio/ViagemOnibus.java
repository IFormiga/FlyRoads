package negocio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class ViagemOnibus {
	private String linha;
	private String codigo;
	private String assento[] = {"1A","2A","3A","2B","3B"};
	private String origem;
	private String destino;
	private LocalTime saida;
	private LocalTime chegada;
	private LocalDate data_origem;
	private LocalDate data_chegada;
	public ViagemOnibus(String linha, String codigo, String assento[], String origem, String destino, LocalTime saida,
			LocalTime chegada, LocalDate data_origem, LocalDate data_chegada) {
		super();
		this.setLinha(linha);
		this.setCodigo(codigo);
		this.setAssento(assento);
		this.setOrigem(origem);
		this.setDestino(destino);
		this.setSaida(saida);
		this.setChegada(chegada);
		this.setData_origem(data_origem);
		this.setData_chegada(data_chegada);

	}
	public String getLinha() {
		return linha;
	}
	public void setLinha(String linha) {
		if(linha != null)
		 this.linha = linha;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		if(codigo != null)
		 this.codigo = codigo;
	}
	public String[] getAssento() {
		return assento;
	}
	public void setAssento(String[] assento) {
		if(assento != null)
		this.assento = assento;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		if(origem != null)
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		if(destino != null)
		this.destino = destino;
	}
	public LocalTime getSaida() {
		return saida;
	}
	public void setSaida(LocalTime saida) {
		if(saida != null)
		this.saida = saida;
	}
	public LocalTime getChegada() {
		return chegada;
	}
	public void setChegada(LocalTime chegada) {
		if(chegada != null)
		this.chegada = chegada;
	}
	public LocalDate getData_origem() {
		return data_origem;
	}
	public void setData_origem(LocalDate data_origem) {
		if(data_origem != null)
		this.data_origem = data_origem;
	}
	public LocalDate getData_chegada() {
		return data_chegada;
	}
	public void setData_chegada(LocalDate data_chegada) {
		if(data_chegada != null)
		this.data_chegada = data_chegada;
	}
	@Override
	public String toString() {
		return "ViagemOnibus [linha=" + linha + ", codigo=" + codigo + ", assento=" + Arrays.toString(assento)
				+ ", origem=" + origem + ", destino=" + destino + ", saida=" + saida + ", chegada=" + chegada
				+ ", data_origem=" + data_origem + ", data_chegada=" + data_chegada + "]";
	}

   @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ViagemOnibus other = (ViagemOnibus) obj;
		if (!Arrays.equals(assento, other.assento))
			return false;
		if (chegada == null) {
			if (other.chegada != null)
				return false;
		} else if (!chegada.equals(other.chegada))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (data_chegada == null) {
			if (other.data_chegada != null)
				return false;
		} else if (!data_chegada.equals(other.data_chegada))
			return false;
		if (data_origem == null) {
			if (other.data_origem != null)
				return false;
		} else if (!data_origem.equals(other.data_origem))
			return false;
		if (destino == null) {
			if (other.destino != null)
				return false;
		} else if (!destino.equals(other.destino))
			return false;
		if (linha == null) {
			if (other.linha != null)
				return false;
		} else if (!linha.equals(other.linha))
			return false;
		if (origem == null) {
			if (other.origem != null)
				return false;
		} else if (!origem.equals(other.origem))
			return false;
		if (saida == null) {
			if (other.saida != null)
				return false;
		} else if (!saida.equals(other.saida))
			return false;
		return true;
	}


}
