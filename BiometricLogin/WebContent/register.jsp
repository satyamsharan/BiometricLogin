<%@page import="in.ac.dei.pcs.csw.BiometricVerification"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />

<title>Register</title>
</head>
<body>

	<div id="header"></div>

	<div id="bioMetricDiv">

	<%
		String uid = request.getParameter("uid");
		String password = request.getParameter("password");
		String min = request.getParameter("min1");
		
		BiometricVerification bio = new BiometricVerification();
		boolean result = bio.register(uid, password, min);
		if (result) {
	%>

		<h1>Congrats! Registration Successful Bio-Metric Authentication</h1>
		<br /> <a
			title="If you already have Bio-Metric credentials, login from here."
			href="index.html" class="button">Login using Bio-Metric Login</a><br />
		<a
			title="If you don't have a biometric device you can use your password to login."
			href="http://csw.pcs.dei.ac.in:8080/portal" class="button">Login
			through your password</a><br /> <img src="images/images.jpg"
			class="success" />
			<%
		} else {
	%>
	<h1>Something went wrong, Please try latter.</h1>
	<a href="http://csw.pcs.dei.ac.in:8080/portal" class="button">Login
			through your password</a><br />

	<%
		}
	%>
	</div>
	

	<div id="footer">
		<div class="footerExtNav" align="center">
			| <a href="http://www.dei.ac.in" target="_blank">Dayalbagh
				Educational Institute</a> | <a
				href="http://node11.clab.pcs.dei:8080/portal/site/!gateway/page/!gateway-600"
				target="_blank">Acknowledgements</a> |
		</div>
		<br />
		<div class="sakaiCopyrightInfo">
			&copy; 2009 Dayalbagh Educational Institute, Dayalbagh, Agra UP
			282005, INDIA<br> Phone: +91-0562-2801545 Fax: +91-0562-2801226
		</div>
	</div>
</body>
</html>