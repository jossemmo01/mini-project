<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>미니 프로젝트</title>
	<tiles:insertAttribute name="cssInc"/>
	<tiles:insertAttribute name="jsInc"/>
</head>
<body>
	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="content"/>
	<tiles:insertAttribute name="footer"/>
</body>
</html>