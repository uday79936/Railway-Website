<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<html>
<head>
    <title>Railway Reservation</title>
</head>
<body>

<h2>🚆 Available Trains</h2>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Source</th>
        <th>Destination</th>
    </tr>

    <c:forEach var="train" items="${trainList}">
        <tr>
            <td>${train.id}</td>
            <td>${train.name}</td>
            <td>${train.source}</td>
            <td>${train.destination}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>