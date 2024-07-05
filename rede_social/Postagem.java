/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rede_social;

/**
 *
 * @author ASUSU
 */
public class Postagem {
    private String conteudo;
    private String autor;
    private String data;
    private int id;

    public Postagem(String conteudo, String autor, String data, int id) {
        this.conteudo = conteudo;
        this.autor = autor;
        this.data = data;
        this.id = id;
    }
    
    public Postagem(int id){
        this.conteudo = " ";
        this.autor = " ";
        this.data = " ";
        this.id = id;
    }
    
    public Postagem exibirPostagem(){
        return this;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }
    
    
    
}
