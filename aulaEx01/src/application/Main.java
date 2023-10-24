package application;

import java.util.Scanner;

import entities.Studant;
import entities.Teacher;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados abaixo:");
		
		Studant[] studant = new Studant[2];
		Teacher[] teacher = new Teacher[2];

		// Cadastrar Estudantes. 
		for(int i = 0; i < studant.length; i++) {
			System.out.println("\n" + (i+1) + "* Aluno");
			Studant aluno = new Studant();
			aluno = aluno.registerStudants();
			studant[i] = new Studant(aluno.getName(), aluno.getAddress(),
					aluno.getPhone(), aluno.getCpf(), aluno.getCell(),
					aluno.getCourse(), aluno.getPrimaryNote(),
					aluno.getSecundaryNote());
			}
		
		
		// Cadastrar Professor.
		for(int i = 0; i < teacher.length; i++) {
			System.out.println("\n" + (i+1) + "* Professor");
			Teacher professor = new Teacher();
			professor = professor.registerTeacher();
			teacher[i] = new Teacher(professor.getName(), professor.getAddress(),
					professor.getPhone(), professor.getCpf(), professor.getCell(),
					professor.getNameCourse(), professor.getSalary());
			}
		
		// Informar a nota do aluno e status da aprovação
		for(int i = 0; i < studant.length; i++) {
			Float average = studant[i].average(studant[i].getPrimaryNote(), studant[i].getSecundaryNote()); 
			System.out.println("\nNota " + (i+1) + ("* Aluno" + average));
			Boolean approved = studant[i].approved(average);
			System.out.println("Aluno aprovado? " + approved);
		}
		
		// toString
		for(int i = 0; i < studant.length; i++) {
			System.out.println("\n" + studant[i]);
		}
		
		for(int i = 0; i < teacher.length; i++) {
			System.out.println("\n" + teacher[i]);
		}
		
		
		sc.close();
	}

}
