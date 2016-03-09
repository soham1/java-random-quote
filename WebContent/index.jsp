<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Random Quote Generator</title>
		<link rel="stylesheet" href="lib/materialize/css/materialize.min.css">
		<script src="lib/jquery/jquery-2.2.1.min.js">
		<script src="lib/materialize/js/materialize.min.js"></script>
	</head>
	<body>
	<nav class="light-blue lighten-1" role="navigation">
    <div class="nav-wrapper container"><a id="logo-container" href="#" class="brand-logo center">Random Quote Generator</a></div>
  </nav>
  <div class="section no-pad-bot" id="index-banner">
    <div class="container">
      <br><br>
      <h1 class="header center orange-text">Your Random Quote is:</h1>
      <div class="row center">
        <h5 class="header col s12 light">${quote}</h5>
      </div>
      <br><br>
    </div>
  </div>
	</body>
</html>