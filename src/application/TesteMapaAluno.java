package application;

import entities.Aluno;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TesteMapaAluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Aluno> mapAlunos = new HashMap<>();

        System.out.print("Quantos alunos serão adicionados? ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for(int i = 0; i < num; i++) {
            System.out.println("ALUNO #" + (i+1));
            System.out.print("Matricula: ");
            String matricula = sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("RA: ");
            String ra = sc.nextLine();
            System.out.print("Curso: ");
            String curso = sc.nextLine();
            System.out.println();
            mapAlunos.put(matricula, new Aluno(matricula, nome, ra, curso));
        }

        System.out.print("Insira um número de matrícula: ");
        String matricula = sc.nextLine();

        Aluno aluno = mapAlunos.get(matricula);

        if(aluno!=null){
            System.out.println(aluno);
        } else {
            System.out.println("Aluno não encontrado...");
        }


    }
}
