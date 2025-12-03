import java.util.Scanner;
public class miau{
	static Scanner teclado = new Scanner(System.in);
	static Envio[] envios = new Envio[50];
	static Integer iEnvios = 0;
	
	public static void main(String []args){
		Boolean repetirMenu = true;
		do{
		switch(verMenu()){
			case "1":
			RegistrarEnvio();
			break;
			case "2":
			for(int i = 0; i<envios.length;i++){
				System.out.println(envios[i]);
			}
			break;
			case "X":
			case "x":
			repetirMenu = false;
			break;
			default:
		System.out.println("¡Opción desconocida!");
	    } 
		}while(repetirMenu);
	teclado.close();
	System.out.println("Fin del programa ¡Hasta luego!");
		
	
	}
	public static String verMenu(){
	
		System.out.println("*APLICACIÓN PaqueteMetes v1.0*");
		System.out.println("\t1. Registrar Envío");
		System.out.println("\t2. Ver informe de envíos");
		System.out.println("\tX. Salir");
		System.out.print("\tOpción: ");
		return teclado.nextLine();
	}
	public static void RegistrarEnvio(){
		while(true){
		    try{
		System.out.println("Registro de Envio-->");
		System.out.print("\tNúmero: ");
		String numero = teclado.nextLine(); 
		System.out.print("\tPrecio: ");
		Float precio = Float.valueOf(teclado.nextLine());
		
		Envio envio = new Envio();
		envio.numero = numero;
		envio.precio = precio;
		envios[iEnvios++] = envio;
		System.out.println("\t-----------");
		System.out.println("\tRegistro OK");
		System.out.println("\t-----------");
		}
		catch(Exception ex){
		System.out.println("\t***********");
		System.out.println("\tRegistro KO");
		System.out.println("\t***********");
		}
	}
  }
}