
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style>
[class="body"]{
background-image: url("images/background.jsp") }
[class*="col"] {
  padding: 1rem;
  background-color: rgba(36, 31, 31, 0.514);
   color: white;
  text-align: center;
}
[class="row"]{
color: white;
background-color: rgba(36, 31, 31, 0.514);}
[class*="con"] {
  
  background-color: rgba(36, 31, 31, 0.514);
  
  
  text-align: center;
  background-image: url("images/background.jsp");
}
</style>
<link rel="stylesheet" href="form.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">





</head>

<body>
<!-- navbar -->
 <div class="container-md">
    <div class="row">
    <h3>Bienvenu <c:out value="${user.name}"></c:out></h3>
<h5>Votre mail: <c:out value="${user.email}"></c:out></h5>
<h5>Votre password:<c:out value="${user.password}"></c:out></h5>


  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
                  <script src="js/bootstrap.js"></script>
</body>
</html>
