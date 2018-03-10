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
    <title>管理员操作界面</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/admin/adminIndex.jsp">管理页面</a>
        </div>
        <div>
            <a class="navbar-text navbar-left" href="page/product/productManager.jsp">商品管理</a>
            <a class="navbar-text navbar-left" href="page/order/orderManager.jsp">订单管理</a>
            <a class="navbar-text navbar-left" href="page/product/stockManager.jsp">库存管理</a>
            <a class="navbar-text navbar-left" href="page/admin/customerManager.jsp">用户管理</a>
            <a class="navbar-text navbar-left" href="page/product/shelfManager.jsp">货架管理</a>
            <a class="navbar-text navbar-right" href="page/admin/userIndex.jsp">账户管理</a>
            <a class="navbar-text navbar-right" href="logout.do">退出</a>
        </div>
    </div>
</nav>
</body>
</html>
