/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unicesumar.exercicios.jogodaforca;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class JogoDaForca {

    public static void main(String[] args) {

        String x = "";              //armazena as letras informadas
        String palavraSecreta;      //palavra secreta
        String z;                   //recebe as letras informadas
        int b;                      //define valor máximo de tentativas

        System.out.println("JOGO DA FORCA");
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a palavra secreta: ");
        palavraSecreta = scan.nextLine();
        b = palavraSecreta.length();

        do {

            System.out.println("Escolha uma letra de A-Z: ");
            z = scan.nextLine();

            if (palavraSecreta.contains(z)) {
                System.out.println("Acertouuuu!");

                if (palavraSecreta.lastIndexOf(z) != palavraSecreta.indexOf(z)) {
                    System.out.println("Possui " + "'" + z + "'" + " na posição " + (palavraSecreta.indexOf(z) + 1) + " e " 
                            + (palavraSecreta.lastIndexOf(z) + 1) + " de " + palavraSecreta.length() + " posições");
                } //informa quando há letras repetidas 
                
                else {
                    System.out.println("Possui " + "'" + z + "'" + " na posição " + (palavraSecreta.indexOf(z) + 1) + " de " + palavraSecreta.length() + " posições");
                } //informa quando há apenas uma letra

                
                 x += z;
                System.out.println("");

            } else {

                System.out.println("Errouuu!");
                System.out.println("tentativas restantes: " + (b)); //Quantidade restante de palpites
                System.out.println("");
                --b;
                System.out.println("Mais sorte na próxima!!!");
            }
            if (x.contains(palavraSecreta)){               //Descobrir como verificar se os palpites correspondem à palavra secreta
             
                System.out.println("Palavra secreta é: " + x);
                System.out.println("Acertou Miseravi!");
                System.out.println("PARABÉNS!!!");

                break;
            }

        } while (b >= 0 || x.contains(palavraSecreta));

    }

}

/*
1- Não considera formas aleatoria

 /*
getChar -> Copia caracteres de uma string para uma matriz de caracteres
para fazer a varredura palavra a palavra, comparar, contar, etc.




 */
