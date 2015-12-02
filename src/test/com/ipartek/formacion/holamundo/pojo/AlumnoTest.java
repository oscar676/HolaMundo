package com.ipartek.formacion.holamundo.pojo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AlumnoTest {

	@Test
	public void constructorVacio() {

		Alumno a = new Alumno();

		assertTrue("No coincide nombre", Alumno.NOMBRE_ANONIMO.equals(a.getNombre()));
		assertTrue("No está vacio",  "".equals(a.getApellidos()));
		assertTrue("No de false", a.isBecado()==true);
		assertTrue("No es 0",a.getEdad()==0);
		assertTrue("No coincide sexo",a.getSexo()== Alumno.SEXO_INDEFINIDO );
		
		
	}

	@Ignore
	public void testAlumnoString() {
		Alumno a=new Alumno();
		
		
	}

	@Ignore
	public void testSetNombre() {
		fail("Not yet implemented");
	}

	@Ignore
	public void testIsMayorEdad() {
		fail("Not yet implemented");
	}

}
