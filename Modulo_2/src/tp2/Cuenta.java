package tp2;
public class Cuenta {
	private String nombreDelCliente;
	private String numDeCuenta;
	private double tipoDeInteres;
	private double saldo;

//constructor por defecto
	public Cuenta() {

	}

//constructor completo
	public Cuenta(String nombre, String Num, double tipo, double saldo) {
		this.nombreDelCliente = nombre;
		this.numDeCuenta = Num;
		this.tipoDeInteres = tipo;
		this.saldo = saldo;
	}

//constructor copia
	public Cuenta(Cuenta cuenta1) {
		this.nombreDelCliente = cuenta1.nombreDelCliente;
		this.numDeCuenta = cuenta1.numDeCuenta;
		this.tipoDeInteres = cuenta1.tipoDeInteres;
		this.saldo = cuenta1.saldo;
	}

//METODOS SETTERS Y GETTERS

	// Nombre del cliente
	public String getNombre() {
		return nombreDelCliente;
	}

	public void setNombre(String nombre) {
		this.nombreDelCliente = nombre;
	}

	// Numero de cuenta
	public String getNum() {
		return numDeCuenta;
	}

	public void setNum(String num) {
		this.numDeCuenta = num;
	}

	// Tipo de interes
	public double getTipo() {
		return tipoDeInteres;
	}

	public void setTipo(double tipo) {
		this.tipoDeInteres = tipo;
	}

	// saldo
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// METODOS GRALES
	public void ingreso(double importe) {
		if (importe > 0) {
			this.saldo += importe;
		} else {
			System.out.println("No se puede hacer el ingreso. Importe negativo o cero.");
		}
	}

	public void reintegro(double importe) {
		if (importe > 0) {
			if (this.saldo >= importe) {
				this.saldo -= importe;
			} else {
				System.out.println("No se puede hacer el retiro. El saldo de la cuenta es menor que el importe.");
			}

		} else {
			System.out.println("No se puede hacer el retiro. Importe negativo o cero.");
		}
	}

	public boolean transferencia(Cuenta destino, double importe) {
		boolean resp = true;
		if (importe > 0) {
		if (this.saldo >= importe) {
			this.saldo -= importe;
			destino.ingreso(importe);
		} else {
			resp = false;
			System.out.println("No se puede realizar la transferencia. Saldo insuficiente en cuenta de origen.");
		}
		}else {
			System.out.println("No se puede hacer la transferencia. Importe negativo o cero.");
		}
		return resp;
	}
	
	
	public static void main(String args[]) {
		Cuenta cuentaPrincipal = new Cuenta("Enzo", "12345678", 1.2, 100);
		System.out.println(cuentaPrincipal.getSaldo());
		cuentaPrincipal.ingreso(500);
		System.out.println(cuentaPrincipal.getSaldo());
		cuentaPrincipal.reintegro(200);
		System.out.println(cuentaPrincipal.getSaldo());
	}
}