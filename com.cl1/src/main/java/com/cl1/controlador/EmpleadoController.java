package com.cl1.controlador;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cl1.models.Empleado;

public class EmpleadoController {

	
	public String createEmpleado(String apellidos, String nombres, int edad, String sexo, Double salario) {
		
		SessionFactory sessionFactory;
		sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session=sessionFactory.openSession();
		
		try {
			Empleado empleado;
			empleado=new Empleado(apellidos,nombres,edad, sexo,salario);
			session.beginTransaction();
			session.save(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "empleado creado";
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		return "Error al crear usuario";		
		
	}
	
	
	
	public String deleteEmpleado(int idEmpleado) {
		
		SessionFactory sessionFactory;
		sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session=sessionFactory.openSession();
		
		try {

			session.beginTransaction();
			
			Empleado empleado=session.get(Empleado.class,idEmpleado);
			session.delete(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "empleado eliminado";
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "Error al eliminar empleado";		
		
	}
	
	
	public String updateEmpleado(int idEmpleado,String apellidos, String nombres, int edad, String sexo, Double salario) {
		
		SessionFactory sessionFactory;
		sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session=sessionFactory.openSession();
		
		try {

			session.beginTransaction();
			
			Empleado empleado=session.get(Empleado.class,idEmpleado);
			empleado.setNombres(nombres);
			empleado.setApellidos(apellidos);
			empleado.setEdad(edad);
			empleado.setSexo(sexo);
			empleado.setSalario(salario);
			session.update(empleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return "empleado eliminado";
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "Error al actualizar empleado";		
		
	}
	
	
	
	public String getEmpleado(int idEmpleado) {
		
		SessionFactory sessionFactory;
		sessionFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleado.class).buildSessionFactory();
		
		Session session;
		session=sessionFactory.openSession();
		
		try {

			session.beginTransaction();
			
			Empleado empleado=session.get(Empleado.class,idEmpleado);
			session.getTransaction().commit();
			
			sessionFactory.close();
			
			return empleado.toString();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return "Empleado no eixste";		
		
	}
}
