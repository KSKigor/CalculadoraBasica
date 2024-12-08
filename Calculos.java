/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora.simples;

import java.util.ArrayList;
/**
 *
 * @author igorg
 */
public class Calculos {
    public int Somar(ArrayList<Integer> valores){
        int soma = 0;
        for ( int valor: valores){
            soma += valor;
        
        }
        return soma;
    }
    
    public int Multiplicar(ArrayList<Integer> valores){
        int multiplicacao = 0;
        for (int valor: valores ){
            multiplicacao *= valor;
        }
        return multiplicacao;
    }
    
    public int Subtrair(ArrayList<Integer> valores){
        int subtracao = 0;
        for (int valor: valores){
            subtracao -= valor;
            
        }
        return subtracao;
    }
    
    public int Dividir(int divisor, ArrayList<Integer> valores){
        int soma = 0;
        for (int valor: valores){
            soma += valor;
        }
        if (divisor != 0){
            return soma / divisor;
        }else{
            return 0;
        }
    }
}
