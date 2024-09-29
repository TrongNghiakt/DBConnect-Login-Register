<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action = "${pageContext.request.contextPath} /admin/category/insert" method = "POST">
  <label for="fname">Category name:</label><br>
  <input type="text" id="categoryname" name="categoryname"><br>
  <label for="lname">Images:</label><br>
  <input type="file" id="images" name="images">
  <label for="lname">Status:</label><br>
  <input type="text" id="status" name="status">
  <br> <input type = "submit" value = "Submit">
</form>