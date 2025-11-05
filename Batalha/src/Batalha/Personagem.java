package Batalha;

public class Personagem {

    //Declarando variaveis
    private String nome;
    private int vida = 100;
    private String tipo;

    //Metodos acessores e modificadores (getters e setters)


    //Construtor
    public Personagem(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    //Metodos
    public int receberDano(int dano){
        return this.vida =- dano;

    }
    public void estarVivo(){

    }

}
