package tp2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado mi_empleado = new Empleado("Enzo", "Juarez", 21, "12345678", 200);
		
		mi_empleado.verEmpleado();
		
		double sueldo_total = mi_empleado.calculaSueldo(3);
		System.out.println();
		System.out.println("El empleado tiene un sueldo de " + sueldo_total + " en 3 horas de trabajo");
	
		if (sueldo_total < 1000) {
			mi_empleado.setSueldo_basico(mi_empleado.getSueldo_basico() * 2);
		}
		System.out.println();
		mi_empleado.verEmpleado();
	}

}
