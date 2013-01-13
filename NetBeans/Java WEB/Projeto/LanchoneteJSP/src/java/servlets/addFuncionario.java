/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import control.FuncionariosDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Funcionario;

/**
 *
 * @author Lucas Biason
 */
public class addFuncionario extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=iso-8859-1");
        PrintWriter out = response.getWriter();
        try {
            //captura de parametros
            String cpf = request.getParameter("cpf");
            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            String telefone = request.getParameter("telefone");
            Float salario = Float.parseFloat(request.getParameter("salario"));
            String cargo = request.getParameter("cargo");
            String cidade = request.getParameter("cidade");
            String uf = request.getParameter("uf");
            String endereco = request.getParameter("endereco");
            
            String login=request.getParameter("login");
            String senha=request.getParameter("senha");
            String loginADMIN=request.getParameter("loginADMIN");
            String senhaADMIN=request.getParameter("senhaADMIN");
           
            //construção do link de retorno
            String goPage = "/LanchoneteJSP/funcionarios.jsp?";
            
            //operações
            FuncionariosDao dao = new FuncionariosDao();
            
            if(dao.containFuncionario(cpf)){
                //caso o nome do produto já exista
                goPage+= "msg=faill";
            }else{
                //caso não exista, cadastrata
                Funcionario f = new Funcionario();
                
                if(!login.equals(""))
                   if(dao.getAdminPermission(loginADMIN, senhaADMIN)){
                    f.setLogin(login);
                    f.setSenha(senha);
                }
                
                f.setCpf(cpf);
                f.setCargo(cargo);
                f.setCidade(cidade);
                f.setEmail(email);
                f.setEndereco(endereco);
                f.setEstado(cidade);
                f.setNome(nome);
                f.setSalario(salario);
                f.setTelefone(telefone);
                goPage+= dao.addFuncionario(f)? "msg=ok" : "msg=not" ;
            }
            response.sendRedirect(goPage);
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
