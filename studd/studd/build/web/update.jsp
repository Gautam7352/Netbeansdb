<%-- 
    Document   : update
    Created on : 12 Mar, 2022, 1:56:34 PM
    Author     : ADITI SINHA
--%>

<%@page import="java.sql.*" %>
 
<%
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
        pst = con.prepareStatement("update record set sname = ?,course =?,fee= ? where id = ?");
        pst.setString(1,id);
        pst.setString(2,name);
        pst.setString(3,course);
         pst.setString(4,fee);
        pst.executeUpdate();  
        
        %>
        
        <script>  
            alert("Record Updateddddd");          
       </script>
    <%            
    }
 
%>
 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bootstrap-5.1.3-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
         
        <link href="bootstrap-5.1.3-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        
        
    </head>
    <body>
        <h1>Student Update</h1>
        
        
        <div class="row">
            <div class="col-sm-4">
                <form  method="POST" action="#" >
                    
                    <%    
                         Connection con;
                        PreparedStatement pst;
                        ResultSet rs;
        
                         Class.forName("oracle.jdbc.driver.OracleDriver");
                         con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");
                          
                          String id = request.getParameter("id");
                          
                        pst = con.prepareStatement("select * from record where id = ?");
                        pst.setString(1, id);
                        rs = pst.executeQuery();
                        
                         while(rs.next())
                         {
                    
                    %>
                     <div alight="left">
                        <label class="form-label">ID</label>
                        <input type="text" class="form-control" placeholder="ID" value="<%= rs.getString("id")%>" name="id" id="id" required >
                     </div>
                    <div alight="left">
                        <label class="form-label">Student Name</label>
                        <input type="text" class="form-control" placeholder="name" value="<%= rs.getString("sname")%>" name="name" id="name" required >
                     </div>
                        
                    <div alight="left">
                        <label class="form-label">Course</label>
                        <input type="text" class="form-control" placeholder="course" name="course" value="<%= rs.getString("course")%>" id="course" required >
                     </div>
                        
                     <div alight="left">
                        <label class="form-label">Fee</label>
                        <input type="text" class="form-control" placeholder="fee" name="fee" id="fee" value="<%= rs.getString("fee")%>" required >
                     </div>
                    
                    <% }  %>
                    
                    
                    
                         </br>
                        
                     <div alight="right">
                         <input type="submit" id="submit" value="submit" name="submit" class="btn btn-info">
                         <input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning">
                     </div>  
                        
                         <div align="right">
                            
                             <p><a href="index.jsp">Click Back</a></p>
                            
                            
                         </div>
  
                </form>
            </div>          
        </div>
  
    </body>
</html>