/*Faça um programa que leia um número indeterminado de valores, 
correspondentes a notas, encerrando a entrada de dados quando for 
informado um valor igual a -1 (que não deve ser armazenado). 
Após esta entrada de dados, faça:
Mostre a quantidade de valores que foram lidos;
Exiba todos os valores na ordem em que foram informados, um ao lado do 
outro;
Exiba todos os valores na ordem inversa à que foram informados, um abaixo 
do outro;
Calcule e mostre a soma dos valores;
Calcule e mostre a média dos valores;
Calcule e mostre a quantidade de valores acima da média calculada;
Calcule e mostre a quantidade de valores abaixo de sete;
Encerre o programa com uma mensagem */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> valores = new ArrayList<>();
        System.out.println("\nDIGITE AS NOTAS: ");
        System.out.println("DIGITE -1 PARA SAIR.\n");
        System.out.println("Nota:");
        
        while (true) {
            double notas = scanner.nextDouble();
            if (notas == -1) {
                break;
            }
            else{
                System.out.println("\nNota:");
                valores.add(notas);
            }
        }

       System.out.println("\nValores lidos: "+"> " +valores.size()+ " <"+"\n");
       System.out.println("Valor lado a lado:\n ");
       System.out.println(valores);
       
       System.out.println("\nValores inverso:");
      for(int i = valores.size()-1; i>=0; i--){
      System.out.println(valores.get(i));
      }
      double soma =0;
        for(double valor:valores){
            soma += valor;
        }
        System.out.println("\nSoma dos valores:\n "+ soma);

        double media=0;
        for(double valor:valores){
        media += valor;
        }
        System.out.println("\nMédia:\n" + soma/valores.size());
        
        System.out.println("\nValores a cima da média:");
        for(double valor:valores){
            if(valor > media/ valores.size()){
                System.out.println(valor);
            }
        } 
        System.out.println("Valores abaixo de 7:\n");
        for(double valor: valores){
            if(valor < 7){
                System.out.println(valor);
            }
        }
        System.out.println("\n               >>>>>>>>ATÉ QUE ENFIM, ACABOU ESSA DESGRAÇA.<<<<<<<<\n\n");

        scanner.close();

        }
        
    }
            

       

        

        

