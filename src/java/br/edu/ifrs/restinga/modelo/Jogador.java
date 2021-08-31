/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrs.restinga.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Adriano
 */
public class Jogador {
    private String nome;
    private String nomeTime;
    private float altura;
    private float peso;
    private int idade;
    private float imc;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nomeTime
     */
    public String getNomeTime() {
        return nomeTime;
    }

    /**
     * @param nomeTime the nomeTime to set
     */
    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the imc
     */
    public float getImc() {
        imc = (this.getPeso()/(this.getAltura()*2));
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(float imc) {
        this.imc = imc;
    }
    
    public void inserir(){
        Connection con = null;
        PreparedStatement p = null;
        
        try {
            /* Abrir uma conexão com o banco de dados */
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/brasileirao", "root", "Comp050991");    
            
            /* Preparar uma sentença SQL */
            p = con.prepareStatement("insert into jogadores (nome, nome_time, altura, peso, idade, imc) values (?, ?, ?, ?, ?, ?)");
            p.setString(1, this.getNome());
            p.setString(2, this.getNomeTime());
            p.setFloat(3, this.getAltura());
            p.setFloat(4, this.getPeso());
            p.setInt (5, this.getIdade());
            p.setFloat(6, this.getImc());
            
            /* Executar a setença SQL */
            p.execute();
            
            /* Fecha conexão */
            p.close();
            con.close();
           
        } catch (Exception e) {
            
        }
 
    }
}
