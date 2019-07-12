<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>test</title>
</head>
<body>

<h2>test</h2>


<c:forEach var="tempMessage" items="${usermessages}">

        <h5>${tempMessage.poster_id}- ${tempMessage.date}</h5>

        <p>${tempMessage.content}</p>

</c:forEach>

</body>
</html>