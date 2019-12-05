<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>


<table class="table table-bordered">
	<thead>
		<tr>
			<th scope="col">Name</th>
			<th scope="col">Email</th>
			<th scope="col">Login</th>
			<th scope="col">Id</th>
			<th scope="col">AvatarURL</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${listGithuber}" var="item" varStatus="status">
			<tr>
				<td><c:out value="${item.name}" /></td>
				<td>${item.email}</td>
				<td>${item.login}</td>
				<td>${item.id}</td>
				<td>${item.avatarUrl}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<a href="index">Retour </a>
</body>
</html>