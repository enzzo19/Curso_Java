package tp2;

public class Contador {
	//Atributos
	private int valor;
	//Constructores
	public Contador() {
		
	}
	
	public Contador(int val) {
		if (val < 0 ) {
			this.valor = 0;
		}else {
			this.valor = val;
		}
	}

	// Metodo setter y getter
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	// Metodos incremenetra y decrementar
	
	public void incremento() {
		int valornuevo = this.valor + 1;
		this.setValor(valornuevo); 
	}
	
		public void decrementar(){
	        if(this.valor > 0){
	            this.valor--;
	        }
	        else {
	            this.valor = 0;
	        }
	    }

		 
	
	public static void main(String args[]) {
		Contador cont = new Contador(5);
		System.out.println(cont.getValor());
		cont.decrementar();
		System.out.println(cont.getValor());
		cont.decrementar();
		System.out.println(cont.getValor());
		cont.incremento();
		System.out.println(cont.getValor());
		cont.incremento();
		System.out.println(cont.getValor());
		cont.incremento();
		System.out.println(cont.getValor());
		
	}
	
	
}
