package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");

    if(request.getParameter("submit")!=null)
    {
        String id = request.getParameter("id");
        String name = request.getParameter("sname");
        String course = request.getParameter("course");
        String fee = request.getParameter("fee");
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
       Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");
        pst = con.prepareStatement("update record set id=?, course =?,fee= ? where id = ?");
        pst.setString(3,id);
         pst.setString(1,id);
        //pst.setString(1,name);
        pst.setString(2,course);
         pst.setString(3,fee);
        pst.executeUpdate();  
        response.sendRedirect("index.jsp");
        
      out.write("\n");
      out.write("        \n");
      out.write("        <script>  \n");
      out.write("            alert(\"Record Updateddddd\");          \n");
      out.write("       </script>\n");
      out.write("    ");
            
    }
 

      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"bootstrap-5.1.3-dist/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap-5.1.3-dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Student Update</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <form  method=\"POST\" action=\"#\" >\n");
      out.write("                    \n");
      out.write("                    ");
    
                         Connection con;
                        PreparedStatement pst;
                        ResultSet rs;
        
                         Class.forName("oracle.jdbc.driver.OracleDriver");
                         con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");
                          
                          String id = request.getParameter("id");
                          
                       pst = con.prepareStatement("select * from record where id = ? order by id");
                      
                        pst.setString(1, id);
                        rs = pst.executeQuery();
                        
                         while(rs.next())
                         {
                    
                    
      out.write("\n");
      out.write("                     <div alight=\"left\">\n");
      out.write("                        <label class=\"form-label\">ID</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"id\" value=\"");
      out.print( rs.getString("id"));
      out.write("\" name=\"id\" id=\"id\" required >\n");
      out.write("                     </div>\n");
      out.write("                    <div alight=\"left\">\n");
      out.write("                        <label class=\"form-label\">Student Name</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"name\" value=\"");
      out.print( rs.getString("sname"));
      out.write("\" name=\"name\" id=\"name\" required >\n");
      out.write("                     </div>\n");
      out.write("                        \n");
      out.write("                    <div alight=\"left\">\n");
      out.write("                        <label class=\"form-label\">Course</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"course\" name=\"course\" value=\"");
      out.print( rs.getString("course"));
      out.write("\" id=\"course\" required >\n");
      out.write("                     </div>\n");
      out.write("                        \n");
      out.write("                     <div alight=\"left\">\n");
      out.write("                        <label class=\"form-label\">Fee</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"fee\" name=\"fee\" id=\"fee\" value=\"");
      out.print( rs.getString("fee"));
      out.write("\" required >\n");
      out.write("                     </div>\n");
      out.write("                    \n");
      out.write("                    ");
 }  
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                         </br>\n");
      out.write("                        \n");
      out.write("                     <div alight=\"right\">\n");
      out.write("                         <input type=\"submit\" id=\"submit\" value=\"submit\" name=\"submit\" class=\"btn btn-info\">\n");
      out.write("                         <input type=\"reset\" id=\"reset\" value=\"reset\" name=\"reset\" class=\"btn btn-warning\">\n");
      out.write("                     </div>  \n");
      out.write("                        \n");
      out.write("                         <div align=\"right\">\n");
      out.write("                            \n");
      out.write("                             <p><a href=\"index.jsp\">Click Back</a></p>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                         </div>\n");
      out.write("  \n");
      out.write("                </form>\n");
      out.write("            </div>          \n");
      out.write("        </div>\n");
      out.write("  \n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
