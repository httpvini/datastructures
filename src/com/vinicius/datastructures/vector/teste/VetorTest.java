package com.vinicius.datastructures.vector.teste;
import java.util.*;

import com.vinicius.datastructures.vector.Vetor;

public class VetorTest {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        //Ao chamar o método adiciona, é necessário circudá-lo com try-catch
        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //chamado de método com mesma implementação acima, porém com retorno booleano
        vetor.adicionaElemento("elemento 3");
        vetor.adicionaElemento(("elemento 4"));

        //adicao de elemento em qualquer posicao do vetor
        vetor.adiciona(0, "novo elemento");

        System.out.println(vetor.getTamamanho());
        System.out.println(vetor.busca(3));
        System.out.println(vetor.busca("elemento 2"));
        System.out.println(vetor);

    }



}
