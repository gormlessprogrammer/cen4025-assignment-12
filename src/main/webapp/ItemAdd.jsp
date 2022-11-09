<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>To Do List</title>
</head>
<body>
	<div id="add">
		<h1>Adding to do list item :-)</h1>
			<form action="tdListController" method="GET">
				<table>
					<tr>
					<td> To Do List Item: </td>
					<td><input type="text" name="tdItem"></td>
					</tr>
					
					<tr>
                    <td><input type="submit" name="addTdItem" value="Add"></td>
                    
                </tr>
				</table>
				</form>
				</div>
				
				<form action="tdListController" method="POST">
				<input type="submit" name="showTdList" value="Show">
			</form>
			
</body>
</html>