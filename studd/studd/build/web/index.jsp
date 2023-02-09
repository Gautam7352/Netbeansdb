
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>

<%
    
    if (request.getParameter ("submit") !=null)
    {
        String id=request.getParameter("id");
   String name= request.getParameter ("name");
String course= request.getParameter ("course"); 
String fee= request.getParameter ("fee");


Connection con;
PreparedStatement pst;
ResultSet rs;
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");
pst=con.prepareStatement("insert into record values(?,?,?,?)");
pst.setString(1,id);
pst.setString (2, name);
pst.setString (3, course);
pst.setString (4, fee);
pst.executeUpdate();

%>

<script>
    
    alert("Record Added");
    
    </script>
    
    
    
    
    <%

    }


%>










<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bootstrap-5.1.3-dist/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap-5.1.3-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Student Registration page for the Sanghathan</h1>
        
        <div class="row">
            <div class="col-sm-4">
                <form class="card" method="POST" action="#">
                    <div alight="left">
            <label class="form-label">ID</label>
<input type="text" class="form-control" placeholder="id" name="id" id="id" required > 
                    </div>
                    <div align="left">
                      <label class="form-label">Student Name</label>
                      <input type="text" class="form-control" placeholder=" Student Name" name="name" id="sname" required >
                      </div>
                          
                       <div alight="left">
            <label class="form-label">Course</label>
<input type="text" class="form-control" placeholder="course" name="course" id="course" required > 

                      </div>
    
                    <div alight="left">

<label class-form-label">Fee</label>
<input type="text" class="form-control" placeholder="fee" name="fee" id="fee" required >
<br>
               </div>
    <div alight-"right">
         </br>
<input type="submit" id="submit" value="submit" name="submit" class="btn btn-info">
        <input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning">
    </div>
                </form>                                      
            </div>
            <div class="col-sm-4">
                <div class="panel-body">

<table id="tbl-student" class="table table-responsive table-bordered" cellpadding="0" width="100%"> 
    <thead>
<tr>
    <th>ID</th>
<th>Student Name</th>
<th>Course</th>
<th>Fee</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<%
    
    Connection con;
PreparedStatement pst;
ResultSet rs;
Class.forName("oracle.jdbc.driver.OracleDriver");
con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-ONDH6FL6:1521:XE","M1","M1");

  String query="select * from record";
  Statement st=con.createStatement();
  rs=st.executeQuery(query);
  
  
  while(rs.next())
  {
      String id=rs.getString("id");
 
      
      %>
      
  
    
<tr>
    <td><%=rs.getString("id") %></td>
    <td><%=rs.getString("sname") %></td>
<td><%=rs.getString("course") %></td>
<td><%=rs.getString("fee") %></td>
<td><a href="update.jsp?id=<%=id%>">Edit</a></td>
<td><a href="delete.jsp?id=<%=id%>">Delete</a></td>
</tr>

<%
    
    
    }

%>

</table>
            </div>
        </div>
        
        
    </body>
</html>
