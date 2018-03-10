<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/3/9
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>

    <style>

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
            <form action="/customer/login.do" class="form-horizontal">
                <div class="form-group">
                    <label class="control-label col-sm-2" >用户名：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="customerName" >
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">密&nbsp;&nbsp;码&nbsp;：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="password" name="customerPassword">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">手机号：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="customerPhone">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">邮&nbsp;&nbsp;箱&nbsp;：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="email" name="customerEmail">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-3 col-sm-offset-2">
                        <input class="btn-primary " type="submit" value="确定">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
