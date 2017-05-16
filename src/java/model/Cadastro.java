/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.UsuarioDAO;
import Session.HibernateSessionFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;

/**
 *
 * @author KaioT
 */
@WebServlet(name = "Cadastro", urlPatterns = {"/Cadastro"})
public class Cadastro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Session session = HibernateSessionFactory.getSession();
        try (PrintWriter out = response.getWriter()) {
        session.beginTransaction();
        if (request.getParameter("receberHospede").equals("S")){
            UsuarioDAO cadastroUsuario = new UsuarioDAO();
            cadastroUsuario.create(request.getParameter("nome"), request.getParameter("sobrenome"), request.getParameter("localMoradia"), request.getParameter("esporteFavorito"), request.getParameter("receberHospede"), request.getParameter("quantidadeHospede"), request.getParameter("login"), request.getParameter("senha"));
//            Usuario usuario = new Usuario(request.getParameter("id"),request.getParameter("nome"), request.getParameter("sobrenome"),request.getParameter("localMoradia"),request.getParameter("esporteFavorito"),request.getParameter("receberHospede"),Integer.parseInt(request.getParameter("quantidadeHospede")));
//            request.setAttribute("usuario", usuario);
//            session.save(usuario);

        }else{
            UsuarioDAO cadastroUsuario = new UsuarioDAO();
            cadastroUsuario.create(request.getParameter("nome"), request.getParameter("sobrenome"), request.getParameter("localMoradia"), request.getParameter("esporteFavorito"), request.getParameter("receberHospede"), request.getParameter("login"), request.getParameter("senha"));
        }
        
        
        session.getTransaction().commit();
        session.close();
        RequestDispatcher view = 
            request.getRequestDispatcher("RetornoCadastro.jsp");
        view.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
