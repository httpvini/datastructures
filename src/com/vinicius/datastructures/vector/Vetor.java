package com.vinicius.datastructures.vector;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamamanho = 0;
    }

    //Forma muito custosa de adição de elementos.
    public void adicionaElementos(String elemento){
        for (int i=0; i<this.elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }

    //Alternativa ao lançamento de Exception

    public boolean adicionaElemento(String elemento){

        if (this.tamamanho < this.elementos.length){
            this.elementos[this.tamamanho] = elemento;
            this.tamamanho++;

            return true;
        } else {
            return false;
        }

    }

    //Validação e Exception para o tamanho do vetor.
    public void adiciona(String elemento) throws Exception{

        if (this.tamamanho < this.elementos.length){
            this.elementos[this.tamamanho] = elemento;
            this.tamamanho++;
        } else {
            throw new Exception("Vetor já está cheio");
        }

    }

    public int getTamamanho() {
        return tamamanho;
    }


    public String toString(){

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i=0; i<this.tamamanho-1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamamanho>0){
            s.append(this.elementos[this.tamamanho-1]);
        }

        s.append("]");

        return s.toString();
    }

}
