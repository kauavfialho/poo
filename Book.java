package com.mycompany.livro;

public class Book {
//Classe
    public static class Livro {
        //Atributos
    private String Titulo;
    private String Autor;
    private int AnoPublicacao;
    private boolean Emprestado;
        //Construtor
    public Livro (String Ttl, String Aut, int Anop) {
        this.Titulo = Ttl;
        this.Autor = Aut;
        this.setAnoPublicacao = Anop;
        this.Emprestado();
    }
        //Métodos
    public String getTitulo(){
     return this .Titulo;
    }

    public void setTitulo(String Ttl){
        this.Titulo = Ttl;
    }

    public String getAutor(){
     return this .Autor;
    }

    public void setAutor(String Aut){
        this.Autor = Aut;
    }

    public int getAnoPublicacao(){
        return this .AnoPublicacao;
    }

    public void setAnoPublicacao(int Anop) {
        this.AnoPublicacao = Anop;
    }

    public void Emprestado() {
        this .Emprestado = true;
    }

    public void Devolver(){
        this .Emprestado = false;
    }

    public void ExibirInformacoes(){
        System.out.println("Sobre o livro:");
        System.out.println("Titulo: " + this .getTitulo());
        System.out.println("Autor: " + this .getAutor());
        System.out.println("Ano de publicacao: " + this .getAnoPublicacao());
        System.out.println("Foi emprestado? " + this.Emprestado);
    }

}

    public static void main(String[] args) {
     Livro sla = new Livro("Anedota de um assa sino", "Morgano homem livre", 2024);
          sla.ExibirInformacoes();
    }
}