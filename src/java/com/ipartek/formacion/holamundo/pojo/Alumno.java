package com.ipartek.formacion.holamundo.pojo;

/**
 * Clase instanciable de tipo POJO o BEAN para representar a un
 * <code>Alumno</code> de un curso.
 * 
 * @author Curso
 *
 */
public class Alumno {
	public static final String NOMBRE_ANONIMO="Anonimo";
    public static final String NOMBRE_SIN_DEFINIR="Sin Definir";	
    public static final char SEXO_HOMBRE ='H';
    public static final char SEXO_MUJER ='M';
    public static final char SEXO_INDEFINIDO ='I';
	/*
	 * atributos
	 ********************************* 
	 */
	private String nombre;
	private String apellidos;
	private boolean becado;
	private int edad;
	private char sexo;// H hombre M Mujer I Indefinido

	/*
	 * constructores
	 **********************************
	 */
	
	/**
	 *Un <code>Alumno</code> recien instanciado tendrá los siguientes valores:
	 *<ul>
	 *<li><code>nombre</code>: NOMBRE_ANONIMO</li>
	 *<li><code>apellidos</code>: ""</li>
	 *<li><code>becado</code>: false</li>
	 *<li><code>edad</code>: 0</li>
	 *<li><code>sexo</code>: SEXO_INDEFINIDO</li>
	 *</ul>   
	 */
	public Alumno() {
		super();
		this.nombre = NOMBRE_ANONIMO;
		this.apellidos = "";
	}

	public Alumno(String nombre) {
		super();
		this.nombre = nombre;
	}
	// getters y setters

	public String getNombre() {
		return nombre;
	}

	/**
	 * Guardamos el nombre con la primera inicial en mayusculas.<br>
	 * Si el nombre es null o cadena vacia guardar "Sin definir"
	 * 
	 * @param nombre
	 *            <String> nombre de la persona a guardar
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public boolean isBecado() {
		return becado;
	}

	public void setBecado(boolean becado) {
		this.becado = becado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	// Funciones

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", becado=" + becado + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
	}

	/**
	 * Comprueba si es mayor de edad
	 * 
	 * @return true <code>this.edad</code> > 18 , false en caso contrario
	 */
	public boolean isMayorEdad() {
		if (this.edad >= 18) {

		}

		return false;

	}

}
