package Entidades;

public class CuentaCorriente extends Cuenta {

	public double descubierto;

	public CuentaCorriente(double unDescubierto, double unSaldo) {
		descubierto     = unDescubierto;
		super.setSaldo(unSaldo);
	}
    public void depositar(double cantidad) {
    	double saldo     = super.getSaldo();
        super.setSaldo(saldo + cantidad);
    } // Fin del método depositar

    public boolean retirar(double cantidad) {
    	double saldo     = super.getSaldo();
    	if (saldo + descubierto >= cantidad )
		{ 
    	super.setSaldo(saldo - cantidad);
		return true ; 
		}
	else{
		return false;
		}
    } // Fin del método retirar	
    
	
}
