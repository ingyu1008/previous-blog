<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
    <head>
        <title>테스트 페이지 입니다</title>
    </head>
    <body>
        <form method="post" action="/blog/auth">
            pw : <input type="text" name="pw"><br>
            <input type="submit" value="확인">
        </form>
    </body>
</html>
