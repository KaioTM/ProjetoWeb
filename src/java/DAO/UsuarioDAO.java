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

    public EntityManager getEm() {
        return Em;
    }

    public void setEm(EntityManager Em) {
        this.Em = Em;
    }
        
        
    }
