 <%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%-- 
    Document   : Main
    Created on : Sep 4, 2013, 10:45:50 PM
    Author     : G0pS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<link href="cs.css" rel="stylesheet" type="text/css"> 
<title>Important</title>
 
</head>
<body>
<div class="main">
    <div class="minihead"></div>
    <div class="head" >
        <div class="logo">
             <a href="Main.jsp"><img src="images/pcs.PNG" width="200" height="90"></a>
        </div>
        <div class="Utabs"></div>
        <div class="tabs">
       
        </div>
    </div>  
    <div class="middle_box">
    <div class="l1"></div>
    <div class="matter"><br> 
        <%
        java.sql.Connection conn=null;
                String url="jdbc:mysql://localhost:3306/pcs";
                Class.forName("com.mysql.jdbc.Driver");
                conn=(java.sql.Connection) DriverManager.getConnection(url,"root","root");
                PreparedStatement pst=conn.prepareStatement("Select UserName,message from forum where VedioName=?");
                String video=request.getParameter("videoid");
                session=request.getSession(true);
                session.setAttribute("present_video",video);
                pst.setString(1,video);
                System.out.println("Video--->"+video);
                ResultSet rs=pst.executeQuery();
                while(rs.next()){
                    String empid=rs.getString("UserName");
                    String message=rs.getString("message");
                    %>
                    EmpId:  <%=empid%><br>
                    Message:    <%=message%><br>
        <%
                }
        %>
        <form name="message" action="forum" method="get">
                Enter message::     <input type="text"  name="message" ><br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   <input type="submit" value="submit">
        </form>
    </div>
    <div class="r1"><br><br><br><br> 
          
    </div>
    </div>
    <div class="footer">  </div>
</div>
    
</body>
</html>