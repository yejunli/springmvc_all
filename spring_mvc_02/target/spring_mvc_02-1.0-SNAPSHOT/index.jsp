<%--
  Created by IntelliJ IDEA.
  User: YeZhan
  Date: 2021/6/30
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="dateByReceive">
        <p>姓名:<input type="text" name="ename"></p>
        <p>年龄:<input type="text" name="age"></p>
        <p>性别:
            <input type="radio" name="gender" value="1">男
            <input type="radio" name="gender" value="0">女
        </p>
        <p>爱好:
            <input type="checkbox" name="hobby" value="1">足球
            <input type="checkbox" name="hobby" value="2">篮球
            <input type="checkbox" name="hobby" value="3">羽毛球
        </p>
        <p>生日:
            <input type="text" name="birthdate">
        </p>
        <hr>
        宠物:
       <%-- <p>
            名字:<input type="text" name="petName">类型: <input type="text" name="petType">
        </p>--%>
        <p>
            单个宠物:
            <input type="text" name="pet.petName">类型: <input type="text" name="pet.petType">
        </p>
        <p>
            名字:<input type="text" name="pets[0].petName">宠物类型:<input type="text" name="pets[0].petType">
        </p>
        <p>
            名字:<input type="text" name="pets[1].petName">宠物类型:<input type="text" name="pets[1].petType">
        </p>
        <p>
            Map宠物1: <input type="text" name="petMap[a].petName">类型: <input type="text" name="petMap[a].petType">
        <p/>
        <p>
            Map宠物2: <input type="text" name="petMap[b].petName">类型: <input type="text" name="petMap[b].petType">
        </p>
        <input type="submit" value="提交">
    </form>

</body>
</html>
