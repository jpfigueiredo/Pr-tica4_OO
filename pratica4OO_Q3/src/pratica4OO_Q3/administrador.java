package pratica4OO_Q3;

public class administrador extends funcionario{
	
	double salario_fixo;
	double horas_extras;
	double total_salario;
	
	public administrador(String nome, double rg, double salario_fixo, double horas_extras) {
		super(nome, rg);
		this.salario_fixo = salario_fixo;
		this.horas_extras = horas_extras;
	}

	public double getSalario_fixo() {
		return salario_fixo;
	}

	public void setSalario_fixo(double salario_fixo) {
		this.salario_fixo = salario_fixo;
	}

	public double getHoras_extras() {
		return horas_extras;
	}

	public void setHoras_extras(double horas_extras) {
		this.horas_extras = horas_extras;
	}
	
	
	//metodo para acumular o total de vendas do mês
	  public void calcExtra(){
		 
          double horas_extrasCalc = salario_fixo / 100 * horas_extras; 
		  
		  total_salario = horas_extrasCalc + horas_extras;
		  
	  }
	
	
	
	

}
