package student;

import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StartExam extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet StartExam</title>");            
            out.println("</head>");
            out.println("<body><center>");
            out.println("<h1>Question papaer</h1><form action=SubmitAnswer>");
            out.println("<table width=600 border=1 cellspacing=0 cellpadding=10 bgcolor=lightgrey>");
            DBCon db=new DBCon();
            db.pstmt=db.con.prepareStatement("select*from ques_mstr");
            db.rst=db.pstmt.executeQuery();
            int count=1;
            while(db.rst.next())
            {
                out.println("<tr bgcolor=yellow><td colspan=2><b><span style='color:red;'>Ques"+count+":</span>"+db.rst.getString(2)+"</b></td></tr>");
            out.println("<tr><td><input type=radio name=ans"+count+" value='"+db.rst.getString(3)+"'>"+db.rst.getString(3)+"</td><td><input type=radio name=ans"+count+" value='"+db.rst.getString(4)+"'>"+db.rst.getString(4)+"</td></tr>");
            out.println("<tr><td><input type=radio name=ans"+count+" value='"+db.rst.getString(5)+"'>"+db.rst.getString(5)+"</td><td><input type=radio name=ans"+count+" value='"+db.rst.getString(6)+"'>"+db.rst.getString(6)+"</td</tr>");
            out.println("<input type=hidden name=qid"+count+" value="+db.rst.getString(1)+">");
            count++;
            if(count>20)
            break;
            }
            out.println("<tr bgcolor=red><th colspan=2><input type=submit value=Submit Answer></th></tr>");
            out.println("</table></form></center></body>");
            out.println("</html>");
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
