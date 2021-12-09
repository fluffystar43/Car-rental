<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div>
    <table>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Middle Name</th>
            <th>Second Name</th>
        </tr>
        <#list clients as client>
            <tr>
                <td>${client.id}</td>
                <td>${client.firstName}</td>
                <td>${client.middleName}</td>
                <td>${client.secondName}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>