/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author KaioT
 */
public class Usuario {
    private int id;
    private String nome;
    private String sobrenome;
    private String localMoradia;
    private String esporteFavorito;
    private String dispostoReceberHospede;
    private int quantHospede;
    private int funcao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
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

    public String getDispostoReceberHospede() {
        return dispostoReceberHospede;
    }

    public void setDispostoReceberHospede(String dispostoReceberHospede) {
        this.dispostoReceberHospede = dispostoReceberHospede;
    }

    public int getQuantHospede() {
        return quantHospede;
    }

    public void setQuantHospede(int quantHospede) {
        this.quantHospede = quantHospede;
    }
   
    
    
}
