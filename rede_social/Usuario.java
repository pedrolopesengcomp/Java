/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rede_social;

/**
 *
 * @author ASUSU
 */
public class Usuario {
    private String nome;
    private String email;
    private int idade;
    
    public Usuario(){
        this.nome = " ";
        this.email = " ";
        this.idade = 0;
    }
    
    public Usuario(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
    
    public Usuario exibirPerfil(){
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
