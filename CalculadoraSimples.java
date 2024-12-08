/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora.simples;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author igorg
 */
public class CalculadoraSimples {

    public static void main(String[] args) {
        Calculos calculo = new Calculos();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> valores = new ArrayList<>();
        
        System.out.println("informe a operação: (somar, dividir, multiplicar, subtrair)");
        String operacao = sc.next();
        int resultado = 0;
        switch(operacao){
            case "somar":
               System.out.println("informe a quantidade de opercao:");
               int quantidadeDeOperacao = sc.nextInt();
               for (int i = 0; i < quantidadeDeOperacao; i++) {
                   System.out.printf("informe o numero: %d", i + 1);
                   int numero = sc.nextInt();
                   valores.add(numero);
                   
                   
               }
               resultado = calculo.Somar(valores);
               System.out.println(resultado);
               valores.clear();
               break;
            case "dividir":
                System.out.println("informe a quantidade de numeros:");
                int quantidade = sc.nextInt();
                for (int i = 0; i< quantidade; i++) {
                    System.out.printf("informe o numero: %d", i + 1);
                    int numero = sc.nextInt();
                    
                    valores.add(numero);
                }
                System.out.println("informe o divisor");
                int divisor = sc.nextInt();
                resultado = calculo.Dividir(divisor, valores);
                valores.clear();
                System.out.println(resultado);
                break;
            case "multiplicar":
                System.out.println("informe a quantidade de numeros:");
                quantidade = sc.nextInt();
                for (int i = 0; i < quantidade; i++) {
                    System.out.printf("informe o numero: %d", i + 1);
                    int numero = sc.nextInt();
                    valores.add(numero);
                }
                resultado = calculo.Multiplicar(valores);
                valores.clear();
                System.out.println(resultado);
                break;
            case "subtrair":
                System.out.println("Informe a quantidade de numeros:");
                quantidade = sc.nextInt();
                for (int i = 0; i < quantidade; i++) {
                    System.out.printf("informe o numero: %d", i + 1);
                    int numero = sc.nextInt();
                    valores.add(numero);
                }
                resultado = calculo.Subtrair(valores);
                valores.clear();
                System.out.println(resultado);
                
                break;
        }
        
    }
}
