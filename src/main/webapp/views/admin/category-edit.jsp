<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = jakarta.tags.core %>
<form action = "${pageContext.request.contextPath} /admin/category/update" method = "POST">
    <input type="text" id="categoryid" name="categoryid" value = "${cate.categoryid}" hidden = "hidden"><br>
  <label for="fname">Category name:</label><br>
  <input type="text" id="categoryname" name="categoryname" value = "${cate.categoryname}"><br>
  <label for="lname">Images:</label><br>
  <c:if test = "${cate.images.substring(0,5) !=  'https'}"> 
			<c:url value="/image?fname=${cate.images }" var="imgUrl"></c:url>
			</c:if>
			
			<c:if test = "${cate.images.substring(0,5) ==  'https'}">
			<td><img height="150" width="200" src="${imgUrl}" /></td>
			</c:if>
  
  <input type="file" id="images" name="images">
  <label for="lname">Status:</label><br>
  <input type="text" id="status" name="status" value = "${cate.status}"><br>
  <br> <input type = "submit" value = "Submit">
</form>