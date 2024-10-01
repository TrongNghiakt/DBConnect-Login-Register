<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>


<form action="${pageContext.request.contextPath}/admin/category/update" method="POST"
	enctype = "multipart/form-data">
	<input type="text" id="categoryid" name="categoryid" value="${cate.categoryid}" hidden = "hidden">
	<label for = "categoryname"> Category Name: </label><br>
	<input type="text" id="categoryname" name="categoryname" value="${cate.categoryname}">
	<br>
	<label for="images">Images:</label><br>
		<c:if test="${cate.images.substring(0,5)!= 'https'}">
				<c:url value = "/images?fname=${cate.images }" var = "imgUrl"></c:url>
			</c:if>
			<c:if test="${cate.images.substring(0,5)== 'https'}">
				<c:url value = "${cate.images }" var = "imgUrl"></c:url>
			</c:if>
			
			<img height ="150" width = "200" src = "${imgUrl }" id = "imagess"/>
	<br>
	<input type = "file" onchange = "chooseFile(this)" id = "images" name = "images" value = "${cate.images}"><br>
	<label for "status"> Status:</label><br>
	<input type = "text" id = "status" name = "status" value = "${cate.status}"><br>
	<input type = "submit" value = "Submit">
</form>