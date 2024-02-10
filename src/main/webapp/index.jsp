<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Логин</title>
</head>
<body>
    <h2>Форма входа</h2>
    <form action="Addservlet" method="post">
        <label for="username">Имя пользователя:</label>
        <input type="text" id="username" name="username" required><br>

        <label for="password">Пароль:</label>
        <input type="password" id="password" name="password" required><br>

        <input type="submit" value="Войти">
    </form>
</body>
</html>