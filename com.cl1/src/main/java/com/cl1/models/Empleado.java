package com.cl1.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {

	
	@Id
	@Column(name="IdEmpleado")
	private int idEmpleado;
	
	@Column(name="Apellidos")
	private String apellidos;
	
	@Column(name="Nombres")
	private String nombres;
	
	@Column(name="Edad")
	private Integer edad ;
	
	@Column(name="Sexo")
	private String sexo ;

	
	@Column(name="Salario")
	private Double salario ;

	public Empleado() {
	}
	
	
	public Empleado(String apellidos, String nombres, Integer edad, String sexo, Double salario) {
		super();
		this.apellidos = apellidos;
		this.nombres = nombres;
		this.edad = edad;
		this.sexo = sexo;
		this.salario = salario;
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", apellidos=" + apellidos + ", nombres=" + nombres + ", edad="
				+ edad + ", sexo=" + sexo + ", salario=" + salario + "]";
	}
	



}
