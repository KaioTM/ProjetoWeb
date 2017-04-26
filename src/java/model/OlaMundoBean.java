/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author KaioT
 */
//@ManagedBean(name = "OlaMundoBean")
@ManagedBean
public class OlaMundoBean {
     private String mensagem = "Quem é você?";
     private String nome;
  
  public String getMensagem() {
    return mensagem;
    
  }
    public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void nomeFoiDigitado() {
    System.out.println("\nChamou o botão");
  }
}
