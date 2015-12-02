package com.ipartek.formacion.holamundo.pruebas;

import java.util.Random;

/**
 * Clase Java para simular un dado y sacar un alumno de modo aleatorio
 * @author Curso
 *
 */
public class Dado {
    /**
     * Variable para representar el número de alumnos
     * static: Solo se reserva en memoria una vez
     * final: No es modificable
     * int:Tipo integer, número entero
     */
	public static final int NUMERO_ALUMNOS=15;
	public static final String NOMBRE_ALUMNOS[]={"David Ibarzabal",
			                                      "Oscar",
			                                      "Gorka",
			                                      "Ariane",
			                                      "Gontzal",
			                                      "Aitor",
			                                      "Santi",
			                                      "Raul",
			                                      "David Ortiz",
			                                      "Sergio",
			                                      "David Barbudo",
			                                      "Edorta",
			                                      "Asier",
			                                      "Alberto",
			                                      "Iñigo"
			                                      };
	
	/**
	 * Muestra por consola todos alumnos del array <code>NOMBRE_ALUMNOS</code><br>
	 * ejemplo:
	 * <ul>
	 * <li>[0] David Ibarzabal</li>
	 * <li>[1] Oscar</li>
	 * <li>[x] ...</li>
	 * <li>[x] ...</li>
	 * <li>[14] Iñigo</li>
	 * </ul>
	 */
	 public static void mostrarAlumnos(){
		//TODO implementar metodo
		 for (String s : NOMBRE_ALUMNOS) {
			 System.out.println(s);
			}
		 for (int i = 0; i < NOMBRE_ALUMNOS.length; i++) {
			System.out.println(i+ " "+NOMBRE_ALUMNOS[i]);
		}
	}
	 /**
	  * Genera número aleatorio entre 0 y  <code>NOMBRE_ALUMNOS</code>
	  * @retur número entero, si falla -1
	  */
	 public static int generarNumero(){
		 int resul=-1;
		//TODO implementar metodo
		 //resul=(int)(Math.random()*NUMERO_ALUMNOS)
		 Random r=new Random();
		resul=r.nextInt(15);
		 
		 return resul;
	 }
	public static void main(String[] args) {
		
		mostrarAlumnos();
		
		System.out.println("El afortunado en leer es: ");
		//TODO obtener número aleatorio
		int alumnoAfortunado=generarNumero();
		
		System.out.println(NOMBRE_ALUMNOS[alumnoAfortunado]);
		Dado.mostrarAfortunado();
		
	}
	/**
	 * Obtenemos un afortunado o voluntario para leer 
	 */
	public static String mostrarAfortunado() {

        String	resul=	NOMBRE_ALUMNOS[Dado.generarNumero()];
	    return resul;
	}
	/**
	 * Obtenemos un afortunado o voluntario para leer de forma aleatorio 
	 * @param numeroAleatorio <code>int</code> número aleatorio que le pasamos
	 */
	public static String mostrarAfortunado(int numeroAleatorio) {

	      String resul="No hay afortunado";
	      resul=NOMBRE_ALUMNOS[numeroAleatorio];
			return resul;
		}
		
}
