package entities;

import java.util.Scanner;

public class Teacher extends PersonAbstract{
	
	Scanner scanner = new Scanner(System.in);
	private String nameCourse;
	private Double salary;
	
	public Teacher() {
		super();
	}
	
	public Teacher(String name, String address, Double phone, Double cpf, Double cell, String nameCourse, Double salary) {
		super.setName(name);
		super.setAddress(address);
		super.setPhone(phone);
		super.setCpf(cpf);
		super.setCell(cell);
		this.nameCourse = nameCourse;
		this.salary = salary;
	}


	public String getNameCourse() {
		return nameCourse;
	}


	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}


	public Double getSalary() {
		return salary;
	}


	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Professor [ Nome: " + getName() + "Nome do curso: " + getNameCourse() + ", Salário: " + getSalary();
	} 
	
	public Teacher registerTeacher() {
		
		System.out.print("Nome: ");
		String name = scanner.nextLine();
		
		System.out.print("Endreço: ");
		String address = scanner.nextLine();
		
		System.out.print("Telefone: ");
		Double phone = scanner.nextDouble();
		
		System.out.print("CPF: ");
		Double cpf = scanner.nextDouble();
		
		System.out.print("Celular: ");
		Double cell = scanner.nextDouble();
		
		scanner.nextLine();
		System.out.print("Curso: ");
		String course = scanner.nextLine();
		
		System.out.print("Salario: ");
		Double salary = scanner.nextDouble();
	
		
		
		Teacher teacher = new Teacher(name, address, phone, cpf, cell, course, salary); 
		
		return teacher;

	}
	
	

}
