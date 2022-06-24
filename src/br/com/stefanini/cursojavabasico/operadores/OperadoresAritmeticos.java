/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.stefanini.cursojavabasico.operadores;

/**
 *
 * @author vdramos
 */
public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int soma = 10 + 5; //infix 
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 5;
        int divisao = 10 / 5;
        int modulo = 10 % 5;

        int a = 10;

        // aa++; //postfix 
        //++a; // prefix 
        System.out.println(++a == 11);
    }

}
