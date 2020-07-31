package Test;

import Entidades.*;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(" 1) Caja de ahorro Y Deposito 100 10% ");
		CajaAhorro y = new CajaAhorro(10, 100);
		System.out.print("  Saldo ");	
		System.out.print(y.getSaldo());	
		
		System.out.print(" 2) Cuenta corriente X  deposito 150 descubiero 10");
		CuentaCorriente x = new CuentaCorriente(10,150);		
		System.out.print(" Saldo ");
		System.out.print(x.getSaldo());


		System.out.print(" 3) Retirar de X 160 ");		
		System.out.print(x.retirar(180));
		
		System.out.print(" 4) Saldo X ");
		System.out.print(x.getSaldo());
		
		System.out.print(" 5) Transferir de Y A X 1000 ");			
		System.out.print(y.transferirA(x, 1000));
		
		System.out.println(" 6) Saldo Final Y ");	
		System.out.print(y.getSaldo());	
		
		System.out.print(" 7) Saldo Final X ");
		System.out.print(x.getSaldo());		
	}

}
