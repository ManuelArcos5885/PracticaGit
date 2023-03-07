package cuentaBancaria;

public class Cuenta {
	public String nombreCuenta = null;
	public float saldo = 0;
	
	
	public Cuenta() {
		super();
	}

	public Cuenta(String nombreCuenta, float saldo) {
		super();
		this.nombreCuenta = nombreCuenta;
		this.saldo = saldo;
	}

	public String getNombreCuenta() {
		return nombreCuenta;
	}

	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [nombreCuenta=" + nombreCuenta + ", saldo=" + saldo + "]";
	}
	
	
	public float ingresarDinero(int dinero) {
		setSaldo(getSaldo() + dinero);
		return saldo;
		
	}
	
	public float extraerDinero(int dinero) {
		setSaldo(getSaldo() - dinero);
		return dinero;
		
	}
	
	public String mostrarCuenta() {
		return toString();
		
	}
	

}

