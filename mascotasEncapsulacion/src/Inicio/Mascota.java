package Inicio;

import javax.swing.JOptionPane;

public class Mascota {

	

	modeloDatos midta;

	public String getIdentidad() {
		return identidad;
	}

	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}


	String identidad;
	String nombre;
	int edad;
	String especie;
	
	
	
	public Mascota() {
	
		midta=new modeloDatos();
		
	}
	
	public void iniciar() {
		
		String resp="";
		
		
		do {
			midta.ingresoDatos();
			
			//System.out.println("repet");
			resp = JOptionPane.showInputDialog("Desea seguir ingresando Ingrese si o no");
			
		} while (resp.equalsIgnoreCase("si"));
		
		midta.MostrarDatos();
		
	
		int opc;
			do {
				opc=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion  \n"
						+"1. Registrar Mascota \n"
						+"2. Mostrar Sonido \n"
						+"3. Consultar mascotas \n "
						+"4. Movimientos \n"
						+"5 Comida que consume\n "
						+"6 Modificar Mascota \n"
						+ "7. Salir"));
				
				switch (opc) {
				case 1:
					midta.ingresoDatos();
					midta.MostrarDatos();
					break;	
				case 2:
					mostrarSonidos();
					break;	
				case 3:
					String con=JOptionPane.showInputDialog("ingrerse la identidad para consultar");
					midta.consulta(con);
					break;	
				case 4:
					movimientos();
					break;	
				case 5:
					comida();
					break;
				case 6:
					String idIdentidad=JOptionPane.showInputDialog("ingrerse la identidad para consultar");
					midta.modificar(idIdentidad);
					
					break;

				default: 
					break;
				}
			} while (opc!=7);
			
		
	}
	
	
	
	private void comida() {
		especie=JOptionPane.showInputDialog("Ingrese la especie de la mascota");
		if (especie.equalsIgnoreCase("Perro")) {
			JOptionPane.showMessageDialog(null, "1. Dog chow  \n"
					+"2. Pedigree \n"
					+"3. Master Dog \n"
					+"4. Petizoo \n");
		}else if(especie.equalsIgnoreCase("Gato")) {
			JOptionPane.showMessageDialog(null, "1. Whiskas \n"
					+"2. NutreCan \n"
					+"3. Royal Canin \n"
					+"4. VitalCan");
		}else if(especie.equalsIgnoreCase("Gallo")) {
			JOptionPane.showMessageDialog(null, "1. Purina \n"
					+"2. Red Force \n"
					+"3. Tornel \n"
					+"4. Bimap");
		}else {
			System.out.println("Pregunte a su Vetereniario mas cercano!");
		}
	}
		
	

	private void movimientos() {
		 especie=JOptionPane.showInputDialog("Ingrese la especie de la mascota");
			if (especie.equalsIgnoreCase("Perro")) {
				JOptionPane.showMessageDialog(null, " flexi�n, extensi�n, abducci�n, aducci�n, rotaci�n interna, rotaci�n externa y circunducci�n.");
			}else if(especie.equalsIgnoreCase("Gato")) {
				JOptionPane.showMessageDialog(null, "mueve la cola r�pidamente es un signo de agresividad, se est� preparando para un salto o un ataque.\n Movimientos lentos y suaves: \n cuando tu gato realiza estos movimientos es porque se encuentra tranquilo \n o puede estar concentrado en algo que est� llamando su atenci�n");
			}else if(especie.equalsIgnoreCase("Gallo")) {
				JOptionPane.showMessageDialog(null, "El aleteo r�pido de las alas con la cabeza erguida, el pecho abombado hacia afuera y las plumas erizadas");
			}else {
				System.out.println("No tiene movimientos conocidos");
			}
		}
		
		
	private void mostrarSonidos() {
		 especie=JOptionPane.showInputDialog("Ingrese la especie de la mascota");
		if (especie.equalsIgnoreCase("Perro")) {
			JOptionPane.showMessageDialog(null, "�Guau guau!");
		}else if(especie.equalsIgnoreCase("Gato")) {
			JOptionPane.showMessageDialog(null, "�Miau miau!");
		}else if(especie.equalsIgnoreCase("Gallo")) {
			JOptionPane.showMessageDialog(null, "�Kikiriki!!");
		}else {
			System.out.println("No tiene sonidos conocidos");
		}
	}
	
	

	}
			