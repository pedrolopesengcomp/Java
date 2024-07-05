/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rede_social;

/**
 *
 * @author ASUSU
 */
public class Comentario {
    private String conteudo;
    private String autor;
    private Postagem postagem;

    public Comentario(String conteudo, String autor, Postagem postagem) {
        this.conteudo = conteudo;
        this.autor = autor;
        this.postagem = postagem;
    }
    
    public Comentario(int id){
        this.conteudo = " ";
        this.autor = " ";
        this.postagem = new Postagem(id);
    }
    
    public Comentario exibirComentario(){
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

    public Postagem getPostagem() {
        return postagem;
    }

    public void setPostagem(Postagem postagem) {
        this.postagem = postagem;
    }
    
    
}
