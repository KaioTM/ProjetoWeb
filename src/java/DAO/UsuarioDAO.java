/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KaioT
 */
public class UsuarioDAO {
 
    
    public void create(String nome,String sobreNome,String localMoradia,String esporteFavorito,String receberHospede,String quantidadeHospede){
        
        PreparedStatement sql;
        try {
            sql = ConnectionFactory.getConnection().prepareStatement(
                    "INSERT INTO USUARIO (NOME,SOBRENOME,LOCALMORADIA,ESPORTEFAVORITO,RECEBERHOSPEDE,QUANTIDADEHOSPEDE) values(?,?,?,?,?,?)");
            sql.setString(1, nome);
            sql.setString(2, sobreNome);
            sql.setString(3, localMoradia);
            sql.setString(4, esporteFavorito);
            sql.setString(5, receberHospede);
            sql.setString(6, quantidadeHospede);
            
            sql.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void create(String nome,String sobreNome,String localMoradia,String esporteFavorito,String receberHospede){
        
        PreparedStatement sql;
        try {
            sql = ConnectionFactory.getConnection().prepareStatement(
                    "INSERT INTO USUARIO (NOME,SOBRENOME,LOCALMORADIA,ESPORTEFAVORITO,RECEBERHOSPEDE) values(?,?,?,?,?)");
            sql.setString(1, nome);
            sql.setString(2, sobreNome);
            sql.setString(3, localMoradia);
            sql.setString(4, esporteFavorito);
            sql.setString(5, receberHospede);
            
            sql.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    static public Usuario getUsuario(String usuario, String senha) throws SQLException {
//        Usuario u = null;
//        PreparedStatement sql = ConnectionFactory.getConnection().prepareStatement(
//                "SELECT USUARIO, SENHA, NOME "
//                        + "FROM USUARIOS "
//                        + "WHERE USUARIO=? AND SENHA=?");
//        sql.setString(1, usuario);
//        sql.setString(2, senha);
//        ResultSet rs = sql.executeQuery();
//        if (rs.next()) {
//            u = new Usuario(
//                    rs.getString("USUARIO"),
//                    rs.getString("SENHA"),
//                    rs.getString("NOME"));
//        }
//        return u;
//    }
        
        
    }
