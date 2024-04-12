/*Utilizando listas faça um programa que faça 5 perguntas para uma pessoa
sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da
pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve
ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassino". Caso contrário, ele será classificado como "Inocente". */
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> perguntas= new ArrayList<>();
        perguntas.add("Telefonou para a vitima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vitima?");
        perguntas.add("Devia para a vitima?");
        perguntas.add("Ja trabalhou com a vitima?");

        System.out.println("Você está em um interrogatória. Iremos te fazer algumas perguntas.");
       
        ArrayList<String> respostas = new ArrayList<>();
        respostas.add("Sim");
        respostas.add("Nao");

        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = scanner.nextLine().toLowerCase(); 
            respostas.add(resposta);
        }

        int respostasPositivas = 0;
        for (String resposta : respostas) {
            if (resposta.equals("sim") || resposta.equals("s")) {
                respostasPositivas++;
            }
        }
        if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
        scanner.close();
    }
}
