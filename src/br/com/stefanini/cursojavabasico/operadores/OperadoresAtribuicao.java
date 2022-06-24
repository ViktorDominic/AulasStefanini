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
public class OperadoresAtribuicao {

    public static void main(String[] args) {
        int a = 11; //operador de atribuicao 
        int b = 5;

        b += a; // aditivo 
        b -= a; // subtrativo 
        b *= a; //multiplicativo 
        b /= a; // divisor 
        b %= a; //modular 

        System.out.println(a % b);

    }

}
