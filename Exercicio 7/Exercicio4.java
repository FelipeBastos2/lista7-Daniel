/*4. Utilize uma lista para resolver o problema a seguir. Uma empresa paga seus 
vendedores com base em comissões. O vendedor recebe $200 por semana 
mais 9 por cento de suas vendas brutas daquela semana. 
Por exemplo, um vendedor que teve vendas brutas de $3000 em uma semana 
recebe $200 mais 9 por cento de $3000, ou seja, um total de $470. 
Escreva um programa (usando um array de contadores) que determine 
quantos vendedores receberam salários nos seguintes intervalos de valores:
$200 - $299
$300 - $399
$400 - $499
$500 - $599
$600 - $699
$700 - $799
$800 - $899
$900 - $999
$1000 em diant */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> vendasBrutas = new ArrayList<>();
        System.out.println("Valor da venda:");
        double saldo = scanner.nextDouble();
        double valorVenda=saldo;
        while (valorVenda >=1) {
                System.out.println("Valor da venda: "+valorVenda+  "\nDigite -1 para fechar");
                valorVenda = scanner.nextDouble();
                }
                if (valorVenda<0 || valorVenda>-2) {
                    System.out.println("Finalizado");
            }
           
                System.out.println("Programa finalizado.");
            /*USEI O CHAT GPT PRA FAZER ESSA. */
        
        vendasBrutas.add(valorVenda); 

        int[] intervalos = new int[9]; 

        for (double vendaBruta : vendasBrutas) {
            double salario = 200 + (0.09 * vendaBruta); 
            if (salario >= 200 && salario <= 299) {
                intervalos[0]++;
            } else if (salario >= 300 && salario <= 399) {
                intervalos[1]++;
            } else if (salario >= 400 && salario <= 499) {
                intervalos[2]++;
            } else if (salario >= 500 && salario <= 599) {
                intervalos[3]++;
            } else if (salario >= 600 && salario <= 699) {
                intervalos[4]++;
            } else if (salario >= 700 && salario <= 799) {
                intervalos[5]++;
            } else if (salario >= 800 && salario <= 899) {
                intervalos[6]++;
            } else if (salario >= 900 && salario <= 999) {
                intervalos[7]++;
            } else if (salario >= 1000) {
                intervalos[8]++;
            }
        }

        for (int i = 0; i < intervalos.length; i++) {
            int inicioIntervalo = 200 + (100 * i);
            int fimIntervalo = inicioIntervalo + 99;
            System.out.printf("$%d - $%d: %d vendedores\n", inicioIntervalo, fimIntervalo, intervalos[i]);
        }
        scanner.close();
    }
}
