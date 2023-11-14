package admin;

import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.jboss.weld.context.http.Http;

public class AdminChangePassword extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
            HttpSession session=request.getSession();
            String usertype=session.getAttribute("email").toString();
            String opswd=request.getParameter("opswd");
             String npswd=request.getParameter("npswd");
              String cpswd=request.getParameter("cpswd");
              DBCon db=new DBCon();
              db.pstmt=db.con.prepareStatement("select*from login where email=? and password=?");
              db.pstmt.setString(1, usertype);
              db.pstmt.setString(2, opswd);
              db.rst=db.pstmt.executeQuery();
              if(db.rst.next())
              {
                if(npswd.equals(cpswd))
                {
                    db.pstmt=db.con.prepareStatement("Update login set password=? where email=?");
                    db.pstmt.setString(1,npswd);
                    db.pstmt.setString(2,usertype);
                    int i=db.pstmt.executeUpdate();
                    if(i>0)
                    {
                        out.println("<h2>Password Udpated</h2>");
                        out.println("<a href='AdminHome.html'>Back</a>");
                    }
                }
                else
                {
                    out.println("<h2>New and Confirm Oassword does not Match</h2>");
                }
              }
              else
              {
                  out.println("<h2>Old Password does not Match</h2>");
              }
        }
        catch(Exception e)
        {
            e.printStackTrace();
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
