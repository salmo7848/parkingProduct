package complemts;

public class Compls {
	//public int preco;
	public String entrada;
	public String veiculo;
	public String placa;
	public String saida;
	

	public Compls() {
		
	}
	
	public Compls(String entrada, String veiculo, String placa, String saida) {
		//this.preco = preco;
		this.entrada = entrada;
		this.veiculo = veiculo;
		this.placa = placa;
		this.saida = saida;
		
		
	}
	
  public String getEntrada() {
		return entrada;
	}
	
	
	public void setEntrada(String entrada) {
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
	
	public String getSaida() {
		return saida;
	}
	
	
	public void setSaida(String saida) {
		this.saida = saida;
	}
	
	public void somaPreco(int preco) {
		
	}
	
	public void vgasOcupadas(int quant) {
		
	}
	
	public String toString(){
	return "Entrada: "
		   +entrada
		   +"\nVeiculo: "
		   +veiculo
		   +"\nplaca: "
		   +placa
		   +"\nSaida: "
		   +saida;
	}
}



