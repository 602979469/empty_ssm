<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Faker
  Date: 2020/2/26
  Time: 9:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<form action="login" method="post">
    用户名<input name="username"><br>
    密码<input name="password"><br>
    <input type="submit">
</form>

<c:if test="${login_error!=null}">
    ${login_error}
</c:if>
<c:if test="${login_msg!=null}">
    ${login_msg}
</c:if>
</body>
</html>