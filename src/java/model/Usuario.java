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
    @Column(name = "ESPORTEFAVORITO")
    private String esporteFavorito;
    @Column(name = "LOCALMORADIA")
    private String localMoradia;
    @Column(name = "RECEBERHOSPEDE")
    private String receberHospede;
    @Column(name = "QUANTIDADEHOSPEDE")
    private int quantidadeHospede;
    
    public Usuario(String id, String nome, String sobrenome, String localMoradia, String esporteFavorito, String receberHospede) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.localMoradia = localMoradia;
        this.esporteFavorito = esporteFavorito;
        this.receberHospede = receberHospede;
    }
    
     public Usuario(String id, String nome, String sobrenome, String localMoradia, String esporteFavorito, String receberHospede,int quantidadeHospede) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.localMoradia = localMoradia;
        this.esporteFavorito = esporteFavorito;
        this.receberHospede = receberHospede;
        this.quantidadeHospede = quantidadeHospede;
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

    public String getEsporteFavorito() {
        return esporteFavorito;
    }

    public void setEsporteFavorito(String esporteFavorito) {
        this.esporteFavorito = esporteFavorito;
    }

    public String getReceberHospede() {
        return receberHospede;
    }

    public void setReceberHospede(String receberHospede) {
        this.receberHospede = receberHospede;
    }

    public int getQuantidadeHospede() {
        return quantidadeHospede;
    }

    public void setQuantidadeHospede(int quantidadeHospede) {
        this.quantidadeHospede = quantidadeHospede;
    }
}
