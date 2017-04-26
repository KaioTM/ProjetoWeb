/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author KaioT
 */
   @Entity
   @Table( name="USUARIO")
   public class Usuario implements Serializable {
       
    @Id
    @Column (name= "USUARIOID")
    private String id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "SOBRENOME")
    private String sobrenome;
    @Column(name = "LOCALMORADIA")
    private String localMoradia;
    
    public Usuario(String id, String nome, String sobrenome, String localMoradia) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.localMoradia = localMoradia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getLocalMoradia() {
        return localMoradia;
    }

    public void setLocalMoradia(String localMoradia) {
        this.localMoradia = localMoradia;
    }  
}
