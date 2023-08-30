<html>
<head>
    <title>Employee Information</title>
</head>
<body>
<h1>Welcome To My First Page</h1>
<table border="1">
    <caption>Employee information display table</caption>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Job</th>
    </tr>
<g:each in="${empList}" var="employee">
    <tr>
        <td>${employee.id}</td>
        <td>${employee.nameE}</td>
        <td>${employee.age}</td>
        <td>${employee.job}</td>
    </tr>
</g:each>
</table>
</body>
</html>