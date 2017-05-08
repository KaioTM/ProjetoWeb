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

public class Hospedagem{
       
   
   private String idHospedagem;
   private String idAnfitriao;
   private String idHospede;
   private String idNota;

    public Hospedagem(String idHospedagem, String idAnfitriao, String idHospede, String idNota) {
        this.idHospedagem = idHospedagem;
        this.idAnfitriao = idAnfitriao;
        this.idHospede = idHospede;
        this.idNota = idNota;
    }

   
    public String getIdHospedagem() {
        return idHospedagem;
    }


    public void setIdHospedagem(String idHospedagem) {
        this.idHospedagem = idHospedagem;
    }

    public String getIdAnfitriao() {
        return idAnfitriao;
    }

    public void setIdAnfitriao(String idAnfitriao) {
        this.idAnfitriao = idAnfitriao;
    }

    public String getIdHospede() {
        return idHospede;
    }

    public void setIdHospede(String idHospede) {
        this.idHospede = idHospede;
    }

    public String getIdNota() {
        return idNota;
    }

    public void setIdNota(String idNota) {
        this.idNota = idNota;
    }
   
}
