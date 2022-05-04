package pratica4OO_Q3;

public class vendedor extends funcionario {

	double salario_base;
	double comissao;
	double vendas_mes;
    double salario_total;
	
	
	public vendedor(double salario_base, double comissao, double vendas_mes) {
		super();
		this.salario_base = salario_base;
		this.comissao = comissao;
		this.vendas_mes = vendas_mes;
	}



	public double getSalario_base() {
		return salario_base;
	}



	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}



	public double getComissao() {
		return comissao;
	}



	public void setComissao(double comissao) {
		this.comissao = comissao;
	}



	public double getVendas_mes() {
		return vendas_mes;
	}



	public void setVendas_mes(double vendas_mes) {
		this.vendas_mes = vendas_mes;
	}

//metodo para acumular o total de vendas do mês
  public void vendasMes(double vendas_mesVendedor){
	  salario_base = salario_base + vendas_mesVendedor;
	  
  }

  //metodo para imprimir as vendas do mês
  void imprimirVendasmes() {
	  
	  System.out.println("Vendas do mês: "+ vendas_mes);
  }
  
  //metodo para imprimi o salario total (salario base + comissão)
void imprimirSalario() {
	  
	salario_total = salario_base + comissao;
	
	
	  System.out.println("Salario total: "+ salario_total);
  }
  
  
  
  




	
	
}
