<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<html>
<head>
    <title>List Messages</title>
    <link type="text/css" rel="stylesheet"
          href=" <c:url value="/resources/css/style.css" />" />
 
    <style>
 
 
        body {
            font-family: Arial;
            padding: 20px;
            background: #f1f1f1;
        }
 
        .header {
            padding: 30px;
            font-size: 40px;
            text-align: center;
            background: white;
        }
 
        .leftcolumn {
            float: left;
            width: 70%;
        }
 
        .rightcolumn {
            float: left;
            width: 25%;
            padding-left: 20px;
        }
 
        .fakeimg {
            background-color: #aaa;
            width: 80%;
            padding: 20px;
        }
 
        .card {
            background-color: white;
            padding: 20px;
            margin-top: 20px;
        }
 
        .row:after {
            content: "";
            display: table;
            clear: both;
        }
 
        .footer {
            padding: 20px;
            text-align: center;
            background: #ddd;
            margin-top: 20px;
        }
 
 
 
 
    </style>
 
</head>
<body>
 
 
<div class="header">
    <h2>Miniblog</h2>
</div>
 
<div class="row">
    <div class="leftcolumn">
 
        <div class="card">
 
            <h2>Nowy wpis:</h2>
 
            <form:form action="addPost" modelAttribute="message" method="POST">
 
                <form:hidden path="poster_id" value="${user.user_id}"/>
 
                <form:input path="content"/>
                <input type="submit" value="Opublikuj" class="save"/>
 
            </form:form>
        </div>
        <c:forEach var="tempMessage" items="${allmessages}">
            <div class="card">
 
                <h5>${tempMessage.poster_id}- ${tempMessage.date}</h5>
 
                <p>${tempMessage.content}</p>
            </div>
        </c:forEach>
 
    </div>
    <div class="rightcolumn">
        <div class="card">
            <h2>${user.username}</h2>
            <div class="fakeimg" style="height:100px;">Image</div>
            <p>${user.email}</p>
            <p>id:${user.user_id}</p>
        </div>
 
        <div class="card">
            <h3>Follow Me</h3>
            <p>blabla</p>
        </div>
    </div>
</div>
 
<div class="footer">
    <h2>Footer</h2>
</div>
 
 
</body>
 
 
</html>
