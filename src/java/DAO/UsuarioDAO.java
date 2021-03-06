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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import model.Usuario;

/**
 *
 * @author KaioT
 */
public class UsuarioDAO {
    private EntityManager Em;
    
    public EntityManager getEm() {
        return Em;
    }

    public void setEm(EntityManager Em) {
        this.Em = Em;
    }
        
    
    public void create(String nome,String sobreNome,String localMoradia,String esporteFavorito,String receberHospede,String quantidadeHospede,String login,String senha){
        
        PreparedStatement sql;
        try {
            sql = ConnectionFactory.getConnection().prepareStatement(
                    "INSERT INTO USUARIO (NOME,SOBRENOME,LOCALMORADIA,ESPORTEFAVORITO,RECEBERHOSPEDE,QUANTIDADEHOSPEDE,LOGIN,SENHA) values(?,?,?,?,?,?,?,?)");
            sql.setString(1, nome);
            sql.setString(2, sobreNome);
            sql.setString(3, localMoradia);
            sql.setString(4, esporteFavorito);
            sql.setString(5, receberHospede);
            sql.setString(6, quantidadeHospede);
            sql.setString(7, login);
            sql.setString(8, senha);
            
            sql.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void create(String nome,String sobreNome,String localMoradia,String esporteFavorito,String receberHospede,String login,String senha){
        
        PreparedStatement sql;
        try {
            sql = ConnectionFactory.getConnection().prepareStatement(
                    "INSERT INTO USUARIO (NOME,SOBRENOME,LOCALMORADIA,ESPORTEFAVORITO,RECEBERHOSPEDE,LOGIN,SENHA) values(?,?,?,?,?,?,?)");
            sql.setString(1, nome);
            sql.setString(2, sobreNome);
            sql.setString(3, localMoradia);
            sql.setString(4, esporteFavorito);
            sql.setString(5, receberHospede);
            sql.setString(6, login);
            sql.setString(7, senha);
            sql.execute();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public Usuario autenticacao (String login, String senha){
        Usuario usuarioRetorno = null;
        PreparedStatement sql;
        try {
            sql = ConnectionFactory.getConnection().prepareStatement(
                    "SELECT * FROM USUARIO WHERE LOGIN=? and SENHA=?");
            sql.setString(1, login);
            sql.setString(2, senha);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()){
                usuarioRetorno = new Usuario(resultado.getInt(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6),resultado.getInt(7),resultado.getString(8),resultado.getString(9));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarioRetorno;
    }

     public List<Usuario> consultarTodos() throws SQLException {
        EntityManager em = getEm();
        List<Usuario> usuarios; 
        
        try{
        Query q = em.createNamedQuery("Usuario.findAll");
        usuarios = q.getResultList();
        } catch (Exception e){
            usuarios = new ArrayList();
        } finally {
            em.close();
        }
        return usuarios;
    }
     
    public Usuario consultarUserid(int usuarioId) throws SQLException {
        Usuario usuarioRetorno = null;
        PreparedStatement sql;
        try {
            sql = ConnectionFactory.getConnection().prepareStatement(
                    "SELECT * FROM USUARIO WHERE USUARIOID=?");
            sql.setInt(1, usuarioId);
            ResultSet resultado = sql.executeQuery();
            if(resultado.next()){
                usuarioRetorno = new Usuario(resultado.getInt(1),resultado.getString(2),resultado.getString(3),resultado.getString(4),resultado.getString(5),resultado.getString(6),resultado.getInt(7),resultado.getString(8),resultado.getString(9));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarioRetorno;
    }

}