package tp3;

class TCredito{
 private String numero;
 private String nombre;
 private String banco;
 private double balance;
 private double limite;

 TCredito(String vnumero, String vnombre, String vbanco, double
vbalance, double vlimite){
 numero=vnumero;
 nombre=vnombre;
 banco=vbanco;
 balance=vbalance;
 limite=vlimite;
 }
 public String getNumero(){return numero;}
 public String getNombre(){return nombre;}
 public String getBanco(){return banco;}
 public double getBalance(){return balance;}
 
 public double getLimite(){return limite;}
 
  public boolean puedoComprar(double vprecio){
  if (vprecio+balance > limite){
  return false;
  	}
  else{
	  this.balance+=vprecio;
  return true;
  	}
  }
  public void pagarTarjeta(double vmonto){
	  this.balance -= vmonto;
  }
 public void muestraDatos(){
  System.out.println("numero: "+ this.getNumero());
  System.out.println("nombre: "+ this.getNombre());
  System.out.println("banco: " + this.getBanco());
  System.out.println("balance: " + this.getBalance());
  }
 
 public void aumentarLimite(double aumento) {
	 this.limite += aumento;
 }
}

 