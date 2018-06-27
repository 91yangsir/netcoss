<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>菜单</title>
    <link rel="stylesheet" type="text/css" href="static/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="static/easyui/demo.css">
    <script type="text/javascript" src="static/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="static/easyui/jquery.easyui.min.js"></script>
</head>
<style>
    #center{
     width: 300px;
        height: 300px;
        border: 1px solid black;
        position: absolute;
        left: 330px;
    }



</style>
<body>
<h2 style="text-align: center ">欢迎来到用户自服务系统</h2>

<div id="center" style="margin:20px 0 10px 0;">
    <button onclick="window.open('/project/view/usersystemmag/userinfo.ftl')" style="height: 50px;width: 150px;background-color:darkgreen">个人信息</button><br><br><br>
    <button onclick="window.open('/project/view/usersystemmag/usersysbill.ftl')" style="height: 50px;width: 150px; background-color:gold">账单信息</button>
</div>

</body>

</html>