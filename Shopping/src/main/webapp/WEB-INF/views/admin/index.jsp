<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<link rel="stylesheet" href="/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/css/bootstrap-grid.css">
<link rel="stylesheet" href="/resources/css/admin/base.css">
<script src="/resources/js/jquery-1.8.1.min.js" type="text/javascript"></script>
<script src="/resources/js/common/commonUtil.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function(){
		$("#submit").on("click",function(){
			var userId = $("#userId").val();
			var password = $("#pasword").val();
			
			if(!validChk(userId,"userId")){
				alert("특수문자 X");	
			}
			
			$("#loginForm").attr("action", "/admin/login");
			$("#loginForm").submit();
		});
	});
</script>
<body>
	<div class="wrap">
		<div class="subj">
			<p>ADMIN</p>
		</div>
		<div class="content">
			<form id="loginForm" method="post">
				<div class="form-group">
			    	<label for="exampleInputEmail1">ID</label>
			    	<input type="text" class="form-control" id="userId" name="id" aria-describedby="emailHelp">
			    	<small id="emailHelp" class="form-text text-muted"></small>
			  	</div>
			  	<div class="form-group">
			    	<label for="exampleInputPassword1">Password</label>
			    	<input type="password" class="form-control" id="password" name="password">
			  	</div>
			  	<div class="form-group form-check">
			    	<input type="checkbox" class="form-check-input" id="exampleCheck1">
			    	<label class="form-check-label" for="exampleCheck1">Check me out</label>
			  	</div>
			  	<button id="submit" type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>
