<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action = "${pageContext.request.contextPath}/admin/category/insert" method = "POST" 
	enctype = "multipart/form-data">
  <label for="fname">Category name:</label><br>
  <input type="text" id="categoryname" name="categoryname"><br>
  <label for="lname">Images:</label>
  <br>
  <img height = "150" width = "200" src = "" id="imagess"/>
  <br>
  <input type="file" onchange = "chooseFile(this)" id="images" name="images">
  <br>
  <label for="lname">Status:</label><br>
  <input type="text" id="status" name="status">
  <br> <input type = "submit" value = "Submit">
</form>