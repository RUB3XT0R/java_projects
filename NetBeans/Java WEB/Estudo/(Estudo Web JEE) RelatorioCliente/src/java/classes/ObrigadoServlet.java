package classes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lucas Biason
 */
public class ObrigadoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");

        PrintWriter out = response.getWriter();
        out.print(
                "<html>"
                + "<head><link href='styles/estilo.css' rel='stylesheet' type='text/css' /></head>"
                + " <body>"
                + "     <table border='0' align='center'>"
                + "         <caption>" + nome + ", obrigado pelo pedido:</caption>"
                + "         <tr class='trImpar'>"
                + "             <th>Item</th>"
                + "             <th>Nome</th>"
                + "             <th>Preço</th>"
                + "             <th>Quantidade</th>"
                + "             <th>Valor</th>"
                + "         </tr>");

        float sub = 0;
        String item = request.getParameter("item1");

        out.print("<tr><td colspan='5'><hr></td></tr>");

        if (item != null && item.equals("on")) {

            Float qtde = Float.parseFloat(request.getParameter("qtde1"));
            out.print(" <tr class='trPar'>"
                    + "             <td>101</td>"
                    + "             <td>Caneta</td>"
                    + "             <td>2,00</td>"
                    + "             <td>" + qtde + "</td>"
                    + "             <td>" + (qtde * 2) + "</td>"
                    + "     </tr>");
            sub = sub + qtde * 2;
        }

        item = request.getParameter("item2");
        if (item != null && item.equals("on")) {

            Float qtde = Float.parseFloat(request.getParameter("qtde2"));
            out.print(" <tr  class='trImpar'>"
                    + "             <td>102</td>"
                    + "             <td>Lápis</td>"
                    + "             <td>1,00</td>"
                    + "             <td>" + qtde + "</td>"
                    + "             <td>" + qtde + "</td>"
                    + "     </tr>");
            sub = sub + qtde;
        }
        item = request.getParameter("item3");
        if (item != null && item.equals("on")) {

            Float qtde = Float.parseFloat(request.getParameter("qtde3"));
            out.print(" <tr class='trPar'>"
                    + "             <td>103</td>"
                    + "             <td>Borracha</td>"
                    + "             <td>0,50</td>"
                    + "             <td>" + qtde + "</td>"
                    + "             <td>" + (qtde * 0.5f) + "</td>"
                    + "     </tr>");
            sub = sub + qtde * 0.5f;
        }

        out.print("<tr><td colspan='5'><hr></td></tr>");
        out.print("         <tr  class='trImpar'>"
                + "             <td colspan='4'>Total:</td>"
                + "             <th>" + sub + "</th>"
                + "         </tr>"
                + "     </table>"
                + " </body>"
                + "</html>");

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
