<%-- 
    Document   : aboutus
    Created on : Jan 6, 2016, 1:02:12 AM
    Author     : Zeeshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="st" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        
        <!--Variables in Spring Format -->
        <st:url  var="bootstrap_theme"  value="/css/bootstrap-theme.css" /> 
        <st:url var="bootstrap_css" value="/css/bootstrap.css"   />
        <st:url var="jquery" value="/js/jquery-2.2.0.js" />
        <st:url var="bootstrap_js" value="/js/bootstrap.js" />
        
        <!--creating links for CSS and JavaScripts -->
        <link href="${bootstrap_theme}" rel="stylesheet" />
        <link href="${bootstrap_css}" rel="stylesheet" />       
        <script src="${jquery}"></script>
        <script src="${bootstrap_js}"></script>
        <title>About Us Page</title>
    </head>
    <body>        
      <!--  <h1><dfn>Welcome to <mark>about us</mark> page</dfn></h1>-->
      your message should display below
      <br/>
      <st:message code="message.successful" />
        <sf:form method="POST" action ="/SpringBasics/redirect.aspx" modelAttribute="basicClass">
            First Name: <sf:input path="firstName" cssStyle="color:red;" />
            <sf:errors path="firstName" />
        <br/>
            <input type="submit" value="Redirect Page" />      
            <a href="/SpringBasics/contact.hmb">Contact Page</a>
        </sf:form>
    </body>
</html>
