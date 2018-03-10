<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/9
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>

    <style>
        .container{
            margin-top: 80px;
            margin-left: 500px;
        }
        body{
            background-image: url("/images/223.jpg");
            background-repeat: no-repeat;
            background-size: 100%;

        }
    </style>
</head>
<body>
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <form action="/admin/adminLogin.do" class="form-horizontal">
                        <div class="form-group">
                            <label class="control-label col-sm-2">用户名：</label>
                            <div class="col-sm-4">
                                <input class="form-control" type="text" name="adminName" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label col-sm-2">密&nbsp;&nbsp;码&nbsp;：</label>
                            <div class="col-sm-4">
                                <input class="form-control" type="password" name="adminPassword" required>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-3 col-sm-offset-2">
                                <input type="checkbox" value="on" name="isremember">
                                <label class="control-label ">记住密码</label>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2">
                                <input class="btn-primary" type="submit" value="登录">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
</body>
</html>
