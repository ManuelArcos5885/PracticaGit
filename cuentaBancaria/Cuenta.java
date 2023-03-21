package cuentaBancaria;
/**
 * crea un objeto de tipo cuenta
 * @see <a href="http://google.com">GOOGLE</a>
 * @version 1-2023
 * @author diurno
  */

public class Cuenta {
	/**
	 * cadena caracteres
	 */
	public String nombreCuenta = null;
	/**
	 * 
	 */
	public float saldo = 0;
	
	/**crea un objeto de tipo cuenta sin valores añadidos
	 * 
	 * 
	 * 
	 */
	public Cuenta() {
		super();
	}

	/** Metodo constructor creador de objetos cuenta utilizando los valores pasados
	 * 
	 * 
	 * @param nombreCuenta cadena de caracteres que contiene el valor del nombre de la cuenta
	 * @param saldo numero flotante que contiene el valor del saldo de la cuenta
	 */
	public Cuenta(String nombreCuenta, float saldo) {
		super();
		this.nombreCuenta = nombreCuenta;
		this.saldo = saldo;
	}

	
	/**devuelve una cadena de caracteres correspondiente con el nombre del objeto cuenta
	 * 
	 * 
	 * @return devuelve un cadena de caracteres que corresponde con el nombre del objeto cuenta
	 */
	public String getNombreCuenta() {
		return nombreCuenta;
	}

	/**establece como nombre del objeto cuenta una cadena de caracteres
	 * 
	 * 
	 * @param nombreCuenta cadena de caracteres que corresponde con el nombre del objeto cuenta
	 */
	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}

	/**devuelve un numero flotante correspondiente con el saldo del objeto cuenta
	 * 
	 * 
	 * @return devuelve un numero flotante correspondiente con el saldo del objeto cuenta
	 */
	public float getSaldo() {
		return saldo;
	}

	/**establece como saldo del objeto cuenta un numero flotante
	 * 
	 * 
	 * @param saldo numero flotanta que corresponde con el saldo del objeto cuenta
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	/**Imprime en pantalla los atributos del objeto cuenta
	 * 
	 * 
	 */
	public String toString() {
		return "Cuenta [nombreCuenta=" + nombreCuenta + ", saldo=" + saldo + "]";
	}
	
	/**añade el numero entero recibido al saldo del objeto cuentaa
	 * 
	 * 
	 * @param dinero numero entero que corresponde con el dinero a ingresar
	 * @return devuelve el saldo despues de haberle ingresado dinero
	 */
	public float ingresarDinero(int dinero) {
		setSaldo(getSaldo() + dinero);
		return saldo;
		
	}
	
	/**devuelve el saldo despues de restarle en numero entero recibido
	 * 
	 * 
	 * @param dinero numero entero que corresponde con el dinero a extraer
	 * @return devuelve el saldo despues de haberle extraido dinero
	 * @throws QuiebraException excepcion que salta en el caso de que la extraccion deje el saldo en negativo
	 */
	public float extraerDinero(int dinero)throws  QuiebraException {
		if (getSaldo() - dinero < 0) {
			throw new QuiebraException("Saldo negativo QUIEBRA");
			
		}
		setSaldo(getSaldo() - dinero);
		return saldo;
		
	}
	
	/**imprime en pantalla los atributos del objeto cuenta
	 * 
	 * 
	 * @return devuelve un string con los valores de la cuenta
	 */
	public String mostrarCuenta() {
		return toString();
		
	}
	
	/**debuelve true o false en funcion si el atributo saldo es mayor que 100
	 * 
	 * 
	 * @return devuelve true si la cuenta contiene mas de 1000 de saldo, sino devuelve false
	 */
	public boolean masDeMil() {
		if(getSaldo() > 1000) {
			return true;
		}
		else {
			return false;
		}
		
	}
	

}

