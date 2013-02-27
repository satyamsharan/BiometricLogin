<%@page import="in.ac.dei.pcs.csw.BiometricVerification"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% String uid=request.getParameter("uid");
	out.print((new BiometricVerification()).getPassword(uid));
%>