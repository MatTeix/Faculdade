package entities;

import java.util.Scanner;

public final class Studant extends PersonAbstract {

	Scanner scanner = new Scanner(System.in);	
	private String course;
	private Float primaryNote;
	private Float secundaryNote;
	
	

	public Studant() {
		super();
	}

	public Studant(String name, String address, Double phone, Double cpf, Double cell, String course, Float primaryNote, Float secundaryNote) {
		super.setName(name);
		super.setAddress(address);
		super.setPhone(phone);
		super.setCpf(cpf);
		super.setCell(cell);
		this.course = course;
		this.primaryNote = primaryNote;
		this.secundaryNote = secundaryNote;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Float getPrimaryNote() {
		return primaryNote;
	}

	public void setPrimaryNote(Float primaryNote) {
		this.primaryNote = primaryNote;
	}

	public Float getSecundaryNote() {
		return secundaryNote;
	}

	public void setSecundaryNote(Float secundaryNote) {
		this.secundaryNote = secundaryNote;
	}

	public Float average(Float PrimaryNote, Float SecundaryNote) {
		return (PrimaryNote + SecundaryNote) / 2;

	}

	public Boolean approved(Float average) {
		return (average >= 6) ? "Aluno Aprovado!" : "Aluno Reprovado!";
	}

	@Override
	public String toString() {
		return "Alunos [ Nome: " + getName() + ", Curso: " + getCourse() + ", Primeira nota: " + getPrimaryNote()
				+ ",  Segunda nota: " + getSecundaryNote();
	}

	
	
	public Studant registerStudants() {
			
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
		
		System.out.print("Primeira nota: ");
		Float primaryNote = scanner.nextFloat();			
		
		System.out.print("Segunda nota: ");
		Float secundaryNote = scanner.nextFloat();
		
		
		
		Studant studant = new Studant(name, address, phone, cpf, cell, 
				course, primaryNote, secundaryNote);
		
		
		
		return studant; 
	}
	
}
