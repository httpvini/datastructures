package com.vinicius.datastructures.vector.teste;

import com.vinicius.datastructures.vector.Vetor;

public class VetorTest {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(5);
        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
        } catch (Exception e) {
            e.printStackTrace();
        }



    }



}
