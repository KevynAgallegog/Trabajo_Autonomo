package principal;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String arg[]) {
		
		
		double ladoA;
		double ladoB;
		
		ladoA=ingresarDatos("Ingrese la longitud del lado A:");
		ladoB= ingresarDatos("Ingrese la longitud del lado B: ");
		
		calcularArea (ladoA,ladoB);
	
	}
	
	public static double ingresarDatos(String mensaje) {
		String cadena;
		double valor;
		
		cadena=JOptionPane.showInputDialog(mensaje);
		valor =Double.parseDouble(cadena);
		
		return valor;
	}
	
	public static void calcularArea(double a, double b) {
		double resultado;
		
		resultado=a*b;
		
		JOptionPane.showMessageDialog(null, "el resultado es: "+ resultado);
	}
}
