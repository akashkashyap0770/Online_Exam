package student;

import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StuRegConf extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
          String email=request.getParameter("email");
          String sname=request.getParameter("sname");
          String squa=request.getParameter("squa");
          String sdob=request.getParameter("sdob");
          String sgender=request.getParameter("sgender");
          String sadd=request.getParameter("sadd");
          String scity=request.getParameter("scity");
          String state=request.getParameter("state");
          String pin=request.getParameter("pin");
          String scont=request.getParameter("scont");
          String pswd=request.getParameter("pswd");
          String cpswd=request.getParameter("cpswd");
          DBCon db=new DBCon();
          if(pswd.equals(cpswd))
          {
            db.pstmt=db.con.prepareStatement("INSERT  INTO stu_info(email,sname,squa,sdob,sgender,sadd,scity,state,pin,scont) values(?,?,?,?,?,?,?,?,?,?)");
            db.pstmt.setString(1, email);
            db.pstmt.setString(2, sname);
            db.pstmt.setString(3, squa);
            db.pstmt.setString(4, sdob);
            db.pstmt.setString(5, sgender);
            db.pstmt.setString(6, sadd);
            db.pstmt.setString(7, scity);
            db.pstmt.setString(8, state);
            db.pstmt.setString(9, pin);
            db.pstmt.setString(10, scont);
            int i1=db.pstmt.executeUpdate();
            db.pstmt=db.con.prepareStatement("INSERT INTO login(email,password,usertype)values(?,?,'Student')");
            db.pstmt.setString(1, email);
            db.pstmt.setString(2, pswd);
            int i2=db.pstmt.executeUpdate();
            if(i1>0 && i2>0)
                 response.sendRedirect("index.html?msg=User Registeration Successfully");
            else
                 out.println("Error in Registeration");
          }
          else
          {
              response.sendRedirect("Registration.html?msg=Password and COnfirm Password does not Match");
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
