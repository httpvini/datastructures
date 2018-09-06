package com.vinicius.datastructures.vector;

public class Vetor {

    private String[] elementos;
    private int tamamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamamanho = 0;
    }

    //Forma muito custosa de adição de elementos.
    /*public void adiciona(String elemento){
        for (int i=0; i<this.elementos.length; i++){
            if (this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }*/



    //Alternativa ao lançamento de Exception

    /*public boolean adiciona(String elemento){

        if (this.tamamanho < this.elementos.length){
            this.elementos[this.tamamanho] = elemento;
            this.tamamanho++;

            return true;
        } else {
            return false;
        }

    }*/

    public void adiciona(String elemento) throws Exception{

        if (this.tamamanho < this.elementos.length){
            this.elementos[this.tamamanho] = elemento;
            this.tamamanho++;
        } else {
            throw new Exception("Vetor já está cheio");
        }

    }
}
