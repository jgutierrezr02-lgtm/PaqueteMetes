public class Envio{
	String numero; 
	Float precio;
	//El constructor se llama igual que la clase 
	//Sirve para inicializar los atributos del objeto
    public Envio(String numero, Float precio){
				this.numero = numero;  //this es el objeto que ejecuta el codigo
				this.precio = precio;
		System.out.println("Construyendo objeto Envio...");
	}
	public String verComoString(){
		String texto = this.numero + "\t" + this.precio + "$";
		return texto;
	}
}
