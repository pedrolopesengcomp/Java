/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rede_social;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author ASUSU
 */
public class Rede_social {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        int idade;
        String email;
        String textoPostagem;
        String textoComentario;
        String data;
        Integer ano, mes, dia;
        
        Calendar calendar = Calendar.getInstance();
        
        int opc = 0, id = 0, idSelecionado;
        
        Usuario usuario = new Usuario();
        ArrayList<Postagem> postagens = new ArrayList<Postagem>();
        ArrayList<Comentario> comentarios = new ArrayList<Comentario>();
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Login \n"
                + "Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Digite seu e-mail");
        email = teclado.nextLine();
        System.out.println("Digite sua idade");
        idade = teclado.nextInt();
        
        usuario.setEmail(email);
        usuario.setIdade(idade);
        usuario.setNome(nome);
        
        ano = calendar.get(Calendar.YEAR);
        mes = calendar.get(Calendar.MONTH);
        dia = calendar.get(Calendar.DAY_OF_MONTH);
        
        data = dia.toString() + "/" + mes.toString() + "/" + ano.toString();
        
        do{
            System.out.println("O que deseja fazer? \n"
                    + "1 - Postar\n"
                    + "2 - Listar postagens\n"
                    + "3 - Comentar\n"
                    + "4 - Sair");
            
            opc = teclado.nextInt();
            teclado.nextLine();
            
            switch(opc){
                case 1: 
                    System.out.println("Digite o conteudo da postagem");
                    textoPostagem = teclado.nextLine();
                    postagens.add(new Postagem(textoPostagem, usuario.getNome(),data,id));
                    id++;
                    break;
                case 2:
                    for(int i = 0; i<postagens.size(); i++){
                        System.out.println("Autor:" + postagens.get(i).getAutor());
                        System.out.println("Data: " + postagens.get(i).getData());
                        System.out.println("ID: " + postagens.get(i).getId());
                        System.out.println("\n" + postagens.get(i).getConteudo() + "\n");
                    }
                    break;
                case 3:
                    System.out.println("Qual o ID da postagem que quer comentar?");
                    idSelecionado = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Digite o conteudo do comentario");
                    textoComentario = teclado.nextLine();
                    comentarios.add(new Comentario(textoComentario, usuario.getNome(), postagens.get(idSelecionado)));
                    break;
                
            }
        } while(opc != 4);
    }
    
}
