package ejemplos_teoria;

public class exceptions {
	public static void main(String args []) {
		
		
		
		try {
			int a = 10 / 0;
			System.out.println(a);
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			int a = 10/1;
			System.out.println(a);
		}finally {
			System.out.println("Estoy en el finally");
		}
		
	}

}
