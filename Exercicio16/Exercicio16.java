package Exercicio16;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pedir o tamanho em metros quadrados da área a ser pintada
        System.out.println("Entre com o tamanho da área a ser pintada em metros quadrados: ");
        int areaPintar = sc.nextInt();
        sc.close();
        //calcular a quantidade de tinta
        double qtdTinta = areaPintar / 3;
        //calcular a quantidade de latas
        double qtdLatas =  Math.round((qtdTinta/ 18 )+ 0.5);
        //calular o valor gasto
        double valorGasto = qtdLatas * 80;
        System.out.println("A quantidade de tinta: " + qtdTinta);
        System.out.println("A quantidade de latas: " + qtdLatas);
        System.out.println("O Valor gasto será de: " + valorGasto);
   }
}