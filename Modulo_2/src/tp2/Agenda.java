package tp2;

public class Agenda {
	
	private Contacto[] contactos;
	
	public Agenda() {
		this.contactos = new Contacto[10];
	}
	
	public Agenda(int tamaño) {
		if (tamaño > 0) {
			this.contactos = new Contacto[tamaño];
		}else {
			this.contactos = new Contacto[10];
		}
		
	}
	
	public int huecosLibres() {
		int contadorLibres = 0;
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				contadorLibres ++;
			}
		}
		return contadorLibres;
	}
	
	public void listarContactos(){
		if (this.huecosLibres() == this.contactos.length) {
			System.out.println("NO hay contactos para mostrar !");
		}else {
			for(int i=0;i<this.contactos.length;i++){
				if (contactos[i] != null) {
					 System.out.println("Contacto "+(i+1)+": "+this.contactos[i].toString());
				}
	        }
		}
    }


}
