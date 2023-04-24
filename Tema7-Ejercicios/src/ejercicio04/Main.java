package ejercicio04;

public class Main {

	public static void main(String[] args) {
		
		Articulo art = new Articulo("Caña de pescar", 150, 10);
		
		System.out.println(art);
		System.out.println(art.getPVP());
		System.out.println(art.getPVPDescuento(0.30));
		art.almacenar(10);
		art.vender(20);
		
		System.out.println("Cantidad: " + art.getCantidad());
		System.out.println(art);
		
	}

}
