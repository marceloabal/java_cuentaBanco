package Entidades;

public abstract class Cuenta {

	private double saldo;
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
		}
	
	public abstract void depositar(double cantidad);
	public abstract boolean retirar(double cantidad);
		
	public final String transferirA(Cuenta b, double cantidad){
		if (retirar( cantidad)){
			b.depositar(cantidad);
			return "transferencia Exitosa";}
		else
			return "Saldo Insuficiente";
	}	 

}
