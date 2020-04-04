<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>  
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />  
        <jsp:setProperty name="mybean" property="name"  /> 
        <jsp:setProperty name="mybean" property="ano"  />
        <jsp:setProperty name="mybean" property="mes"  /> 
        
        <jsp:setProperty name="mybean" property="sem"  />
   <jsp:setProperty name="mybean" property="semI"  />
        <h1>Hello <jsp:getProperty name="mybean" property="name" />!, Usted tiene 
            <jsp:getProperty name="mybean" property= "ano" /> años
            y <jsp:getProperty name="mybean" property= "mes" /> meses <h1>
              
                deberia llevar <jsp:getProperty name="mybean" property="sem" /> semestres
                 
                <br>
              

                </body>
                </html>