package br.com.fecafMediaFaculdade;

import java.util.Scanner;

public class MediaFaculdade {
	
			//Determinando as Variaveis.
	
	public static void main(String[] args) {
		
		Scanner formulario = new Scanner (System.in);
		
			String aprovado_reprovado, aluno_nome, professor_nome, aluno_sexo, professor_sexo, curso_nome, disciplina_nome, aluno_aluna, professor_professora;
			int nota1, nota2, nota3, nota4, media_aluno, nota_exame, media_exame;
			nota_exame = 0;
			aluno_aluna = null;
			professor_professora = null;
			aprovado_reprovado = null;
			media_exame = 0;
			
		System.out.println("Seja Bem-vindo, Preencha o Formulario a seguir: ");
		
		System.out.println("Nome do Aluno(a): ");
			
			//Formulario
		
			aluno_nome = formulario.next();
		    System.out.println("Nome do Professor(a): ");
		    professor_nome = formulario.next();
		    System.out.println("Sexo do Aluno(a): ");
		    aluno_sexo = formulario.next().toUpperCase();
		    System.out.println("Sexo do Professor(a): ");
		    professor_sexo = formulario.next().toUpperCase();
		    System.out.println("Nome do Curso: ");
		    curso_nome = formulario.next().toUpperCase();
		    System.out.println("Nome da Disciplina: ");
		    disciplina_nome = formulario.next().toUpperCase();
		    
		    //preenchimento de notas.
		    
		    System.out.println("\n Agora, preencha este campo referente as notas: \n");
		    System.out.println("Nota 1: ");
		    nota1 = formulario.nextInt();
		    System.out.println("Nota 2: ");
		    nota2 = formulario.nextInt();
		    System.out.println("Nota 3: ");
		    nota3 = formulario.nextInt();
		    System.out.println("Nota 4: ");
		    nota4 = formulario.nextInt();
		    
		    //Notas IF
		    
			    if (nota1 < 0 || nota1 > 100) {
					System.out.println("Preencha a nota 1 com um valor de 0 a 100!");
				}
				if (nota2 < 0 || nota2 > 100) {
					System.out.println("Preencha a nota 2 com um valor de 0 a 100!");
				}
				if (nota3 < 0 || nota3 > 100) {
					System.out.println("Preencha a nota 3 com um valor de 0 a 100!");
				}
				if (nota4 < 0 || nota4 > 100) {
					System.out.println("Preencha a nota 4 com um valor de 0 a 100!");
				}
				
			//Nomes IF
				
				if (aluno_nome == null) {
					System.out.println("!Preencha o campo Nome do Aluno!");
				}
				if (professor_nome == null) {
						System.out.println("!Preencha o campo Nome do Professor!");
				}
				if (aluno_sexo == null) {
					System.out.println("!Preencha o campo Sexo do Aluno!");
				}
			    if (professor_sexo == null) {
					System.out.println("!Preencha o campo Sexo do Professor!");
				}
			    if (curso_nome == null) {
					System.out.println("!Preencha o campo Nome do Curso!");
				}
			    if (disciplina_nome == null) {
					System.out.println("!Preencha o campo Nome da Disciplina!");
			    }
			    
			    //Calculo da Media.
			    media_aluno = (nota1 + nota2 + nota3 + nota4) / 4;
			    
			    if (media_aluno > 70) {
				    System.out.println("\n Parabéns! Você esta aprovado :).\n");
				    aprovado_reprovado = "aprovado";
				    } else if (media_aluno < 50) {
				    System.out.println("\n Infelizmente, você foi reprovado :(.\n");
				    aprovado_reprovado = "reprovado";
				    } else if (media_aluno > 50 && media_aluno < 69) {
				    System.out.println("\n Você ficou de exame :/ .");
				    System.out.println("\n Qual foi sua nota no exame? ");
				    nota_exame = formulario.nextInt();
				    
			media_exame = (nota1 + nota2 + nota3 + nota4 + nota_exame) / 5;
			
			if (nota_exame > 60 && nota_exame + media_aluno > 60) {
			    System.out.println("\n Parabéns! Você foi aprovado no exame. :)");
			    aprovado_reprovado = "Aprovado!";
			    }
			    
			    else {
			    System.out.println("\n Infelizmente, você foi reprovado no exame. :(");
			    aprovado_reprovado = "Reprovado!";
			    }
			
			//Pronomes
			
			if (aluno_sexo.equals("MASCULINO") || aluno_sexo.equals("M"))  { 
		    	aluno_aluna = "Aluno";
		    	}
		    else if (aluno_sexo.equals("FEMININO") || aluno_sexo.equals("M")) { 
		    	aluno_aluna = "Aluna";
		    	}
		    if (professor_sexo.equals("MASCULINO") || professor_sexo.equals("M")) { 
		    	professor_professora = "Professor";
		    	}
		    else if (professor_sexo.equals("FEMININO") || professor_sexo.equals("F")) { 
		    	professor_professora = "Professora";
		    	}
		    
		    System.out.println("\nO " + aluno_aluna + " " + aluno_nome + " " + aprovado_reprovado + " na disciplina " + disciplina_nome + " - Curso: " + curso_nome + 
					"\n" + professor_professora + ": " + professor_nome +
					"\n Notas do aluno: "+ nota1 + "," + nota2 + "," + nota3 + "," + nota4 + " - Nota do Exame: " + nota_exame +
					"\n Média Final: "+ media_aluno+
					"\n Média final do Exame: "+ media_exame);
				    }
	}
}
			    
	


