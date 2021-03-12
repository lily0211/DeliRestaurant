
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
     <div class=col-md>
    <h5>    
        <%@include file="pageRepeat.jsp"%>
          
        </h5>
      </div>
    </div>
  </div>
  <!-- form login -->
  <div class="container-md">
    <div class="row">
      <div class="col-md-2"></div>
      <div class="col-md-8">
        <form action="inscription" method="post">
          <fieldset>
            <legend>Inscription</legend>
           
            <label for="name">Votre nom et prénom</label>
             <input name="name" type="text" id="name" size="20" maxlength="60"></input><br />
            <label for="adresse">Votre adresse</label> <input
              name="adresse" type="text" id="adresse" size="20"
              maxlength="60"><br />
              
              <label for="telephone">Votre telephone" </label>
              <input name="telephone" type="text" id="telephone" size="20" maxlength="60"><br/>
              <label for="email">Votre email<span class="requis">*</span> </label>
             <input name="email" type="email" id="email" size="20"
        maxlength="60" value='<c:out value="${user.email}"></c:out>'>
      <span class="error">${inscriptionVerification.erreurs['email']}</span><br />
             
              <label for="password"> password<span class="requis">*</span>
      </label> <input name="password" type="password" id="password" size="20"
        maxlength="60" value='<c:out value="${user.password }"></c:out>'>
      <span class="error">${inscriptionVerification.erreurs['password']}</span><br />
            <label for="confirmation"> confirmation<span
        class="requis">*</span>
      </label> <input name="confirmation" type="password" id="confirmation"
        size="20" maxlength="60"> <br /> <span class="error">${erreurs['confirmation']}</span>
              <input value="rentrer" type="submit" id="login" class="sansLabel">
              
              <p class="${empty erreurs ?'succesful' : 'error'}">${resultat}</p>  
          
          </fieldset>

        </form>
      </div>
 
    </div>
  </div>
  







  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
                  <script src="js/bootstrap.js"></script>
</body>
</html>