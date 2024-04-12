/*/*Faça um programa que receba a temperatura média de cada mês do ano e
armazene-as em uma lista. Após isto, calcule a média anual das temperaturas e
mostre todas as temperaturas acima da média anual, e em que mês elas
ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).

 */ 

import java.util.ArrayList;
import java.util.Scanner;


public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");
        meses.add("Julho");
        meses.add("Agosto");
        meses.add("Setembro");
        meses.add("Outubro");
        meses.add("Novembro");
        meses.add("Dezembro");

        double [] temperatura =new double[12];
        
        for(int i= 0; i< meses.size(); i++){
            System.out.println("Digite a temperatura do mes de "+meses.get(i)+":");
        temperatura [i]= scanner.nextDouble();
        }

        double soma=0;
        for(double temp : temperatura){
            soma +=temp;

        }
        double media = soma /12;
        System.out.println("Média anual: "+media);
        System.out.println("Meses com a temperatura acima da média: ");
        for (int i = 0; i < 12; i++) {
            if (temperatura[i] > media) {
                System.out.println(meses.get(i) + ": " + temperatura[i] + "°C");
            }
        }
        scanner.close();
    }
}
