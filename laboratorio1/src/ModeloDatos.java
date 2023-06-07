import java.util.HashMap;

import javax.swing.JOptionPane;

import logica.Perro;

public class ModeloDatos {
	
	HashMap<String, Perro>mapaPerro;
	
	
public ModeloDatos() {
		mapaPerro=new HashMap<>();
	}

public void crearPerro(Perro perro) {
	mapaPerro.put(perro.getIdentidad(),perro);
	
}


	
public void mostrar() {
	
	mapaPerro.forEach((identidad,perro)->{
		System.out.println("Nombre: "+perro.getNombre()+ "\n" + 
				"Edad: "+ perro.getEdad() + "\n" +
				"Color: "+perro.getColor() + "\n" +
				"Identidad: " + perro.getIdentidad()+ "\n" +
				"Genero: "+perro.getGenero() + "\n" + 
				"Raza: "+perro.getEspecie());
	});
}

public void Consultar(String identidad) {
	if(mapaPerro.containsKey(identidad)) {

		Perro tempPerro = mapaPerro.get(identidad);
		
		System.out.println("Nombre: "+tempPerro.getNombre() + "\n" +
		"Genero: "+ tempPerro.getGenero() + "\n" + 
				"Raza: " + tempPerro.getEspecie());
	}else {
		JOptionPane.showMessageDialog(null, "NO EXISTE","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
	}
	
}
public void ladrar() {
	JOptionPane.showMessageDialog(null, "Guau Guau guau");
}

public void movimientos() {
	
	JOptionPane.showMessageDialog(null, "Correr "+ "Sentarse" + "Acostarse " + "Caminar");
}

}

