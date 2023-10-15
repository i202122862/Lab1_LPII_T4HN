package com.cl1.vistas;

import com.cl1.controlador.EmpleadoController;

public class EmpleadoView {
	
	public static void main(String[] args) {
		
		String empleado;

		empleado=new EmpleadoController().createEmpleado("villacorta", "jos",15,"M", 2.3);		
		System.out.println(empleado);

		 
		 		empleado=new EmpleadoController().getEmpleado(1);		
		System.out.println(empleado);

		
		empleado=new EmpleadoController().updateEmpleado(1,"villacorta", "jos",15,"M", 2.3);
		System.out.println(empleado);
		
		empleado=new EmpleadoController().deleteEmpleado(1);

		System.out.println(empleado);
		
	}

}
