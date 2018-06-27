<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>欢迎登陆本系统</title>
     <base href="/project/">
    <link rel="stylesheet" type="text/css" href="static/easyui/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="static/easyui/themes/icon.css"/>
	<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="static/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="static/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="static/js/jquery.json-2.4.js"></script>
	<script type="text/javascript" src="static/bootstrap/js/bootstrap.min.js"></script>
    <style>
        #max{
            position: relative;

            background-image: url("/project/static/images/99.jpg");
            background-size: 100% auto;
            height: 768px;
            width: 1366px;
        }
        #scend{
            position: relative;
            top: 300px;
        }

#a{
    margin-bottom: 30px;
}
        #b{
            margin-bottom: 30px;
        }
        #d{
            height: 34px;
            line-height: 34px;
        }
        #p{
            position: relative;
            left: 500px;
            top: 160px;
            font-family: fantasy;
            font-size:xx-large;
            font-style: oblique;
            color: #66F4DF;

        }

    </style>

</head>
<body>
<div id="max">
    <div>

    </div>
<br/><br/><br/>

<p id="p">欢迎使用本系统——用户入口</p>
<form id="scend" action="#" method="post">
    <div class="container-fluid">
    <div class="row" id="a">
        <div class="col-lg-6 col-md-offset-3">
    <div class="input-group">
        <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
        <input type="text" class="form-control" placeholder="请输入字母，数字" id="name">
    </div>
        </div>
        <div class="col-lg-1 text-center" id="c">
            <span class="glyphicon glyphicon-ok" style="display: none;color: #5cb85c" id="span1"></span>

            <span class="glyphicon glyphicon-remove" style="display: none;color: red" id="span2"></span>
        </div>
        </div>

        <div class="row" id="b">
            <div class="col-lg-6 col-md-offset-3">
    <div class="input-group">
        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
        <input type="text" class="form-control" placeholder="请输入6位数字" id="pwd">
    </div>
            </div>
            <div class="col-lg-1 text-center"id="d">
                <span class="glyphicon glyphicon-ok" style="display: none;color: #5cb85c" id="span3"></span>

                <span class="glyphicon glyphicon-remove" style="display: none;color: red" id="span4"></span>
            </div>
        </div>
        <div class="row">
            <div class="col-lg-4 col-md-offset-4">
    <button type="submit" class="btn btn-success btn-lg btn-block" id="button1"><span class="glyphicon glyphicon-ok"></span>用户登陆</button>

           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="updateUserPwd.ftl" style="font-size: 20px;color: #66F4DF">修改用户密码</a>

            </div>
            <div class="col-lg-2"></div>
        </div>

    </div>
</form>

</div>

</body>
<script>
    var userName = document.getElementById("name");
    var pwd = document.getElementById("pwd");
    var span1 = document.getElementById("span1");
    var span2 = document.getElementById("span2");
    var span3 = document.getElementById("span3");
    var span4 = document.getElementById("span4");

    //失去焦点事件
    var bo1 = false
    userName.onblur = function(){
        var regex1 = /^[0-9a-zA-Z]{3,16}$/;
        if(!regex1.test(userName.value)){
            console.log(userName.style);
            span1.style.display = "none";
            span2.style.display = "block";
            bo1 = false
        }else{
            span1.style.display = "block";
            span2.style.display = "none";
            bo1 = true
        }
    }
    var bo2 = false
    pwd.onblur = function(){
        var regex1 = /^[0-9]{6,10}$/;
        if(!regex1.test(pwd.value)){
            console.log(pwd.style);
            span3.style.display = "none";
            span4.style.display = "block";
            bo2 = false
        }else{
            span3.style.display = "block";
            span4.style.display = "none";
            bo2 = true
        }
    }
    $("#button1").click(function(){
        if(bo1&&bo2){
            userName.value = ""
            pwd.value = ""
            return true
        }else{
            return false
        }
    })

</script>
</html>