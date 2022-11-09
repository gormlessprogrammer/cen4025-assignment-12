<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show All</title>
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script>
	$(document).ready(function()){
		$("#deleteTdItem").hide();
		$("#updateTdList").hide();
		
		$("#update").click(function()){
			$("#deleteTdItem").hide();
			$("#updateTdList").show();
		});
		
		$("#delete").click.function(){
			$("#deleteTdItem").show();
			$("#updateTdList").hide();
		});

	});
	</script>
</head>
<body>
	
	To Do List Items: <br>
	
		<c:forEach items="{$tdList}" var="list">
		
			To Do List Item: ${tdListItem.id} <br>
			
			</c:forEach>
			           
	
</body>
</html>