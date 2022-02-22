package complemts;

import java.util.Calendar;
import java.util.TimeZone;

import convertsDate.Conversion;


public class Compls {
	
	Conversion conn = new Conversion();
	//public int preco;
	public Calendar entrada;
	public String veiculo;
	public String placa;
	public Calendar saida;
	
	

	public Compls(Calendar entrada, String veiculo, String placa, Calendar saida) {
		//this.preco = preco;
		this.entrada = entrada;
		this.veiculo = veiculo;
		this.placa = placa;
		this.saida = saida;
		
		
	}
	
  public Calendar getEntrada() {
		return entrada;
	}
	
	
	public void setEntrada(Calendar entrada) {
		this.entrada = entrada;
	}
	
	public String getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public Calendar getSaida() {
		return saida;
	}
	
	
	public void setSaida(Calendar saida) {
		this.saida = saida;
	}
	
	public void somaPreco(int preco) {
		
	}
	
	public void vgasOcupadas(int quant) {
		
	}
	
	public Calendar getDuracao() {
	    TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
	    Calendar duracao = Calendar.getInstance();
	    duracao.setTimeInMillis(saida.getTimeInMillis() - getEntrada().getTimeInMillis());

	    return duracao;
	}

	
	
	public String toString(){
	return "Entrada: "
		   +entrada.getTime()
		   +"\nVeiculo: "
		   +veiculo
		   +"\nplaca: "
		   +placa
		   +"\nSaida: "
		   +saida.getTime();
	}
}



