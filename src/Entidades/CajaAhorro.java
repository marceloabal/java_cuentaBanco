package Entidades;

public class CajaAhorro extends Cuenta{
	
	public double interes;
	
	public void setInteres(double interes) {
		this.interes = interes;
	}

	public CajaAhorro(double unInteres, double unSaldo) {
		interes     = unInteres;
		super.setSaldo(unSaldo);
	}

    public void depositar(double cantidad) {
    	double intereses = calcularInteres(cantidad);
    	double saldo     = super.getSaldo();
    	super.setSaldo( saldo + cantidad + intereses ) ;
    } // Fin del método depositar

    public boolean retirar(double cantidad) {
    	double saldo = super.getSaldo();
    	if (saldo >= cantidad )
    		{ 
    		super.setSaldo(saldo - cantidad);
    		return true ; 
    		}
    	else{
    		return false;
    		}
    } // Fin del método retirar	
    

	public double calcularInteres(double cantidad){ 

        return cantidad * (interes / 100); 

    }
	
	

  
}
