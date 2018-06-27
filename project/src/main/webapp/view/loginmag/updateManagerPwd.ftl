<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>管理员修改密码</title>
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
            background-image: url("/project/static/images/bcd61662bc4bef165d26f4f80849dbe6.jpg");
            background-size: 100% auto;
            height: 768px;
            width: 1366px;
        }
        #change{
            position: relative;
            font-size: 45px;
            left: 450px;
            color: #07b344;
            font-family: fantasy;

        }

    </style>
</head>
<body>
<div id="max">
    <br><br><br><br>
    <p id="change">请谨慎修改您的密码</p>
    <br><br><br><br>
    <form id="scend" action="#" method="post">
        <div class="container-fluid">
            <div class="row" id="a">
                <div class="col-lg-6 col-md-offset-3">
                    <div class="input-group">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                        <input type="text" class="form-control" placeholder="请输入您的账号" id="name">
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
                        <input type="text" class="form-control" placeholder="请输入原密码" id="pwd">

                    </div>
                </div>
                <div class="row" id="e">
                    <div class="col-lg-6 col-md-offset-3">
                        <div class="input-group">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            <input type="text" class="form-control" placeholder="请输入新密码，不能与原密码相同" id="pwd2">

                        </div>
                    </div></div>
                <div class="row" id="f">
                    <div class="col-lg-6 col-md-offset-3">
                        <div class="input-group">
                            <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                            <input type="text" class="form-control" placeholder="请再次输入新密码" id="pwd3">

                        </div>
                    </div></div>


                <div class="col-lg-1 text-center"id="d">
                    <span class="glyphicon glyphicon-ok" style="display: none;color: #5cb85c" id="span3"></span>

                    <span class="glyphicon glyphicon-remove" style="display: none;color: red" id="span4"></span>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4 col-md-offset-4">
                    <br><br>
                    <button onclick="jump()" type="submit" class="btn btn-success btn-lg btn-block" id="button1"><span class="glyphicon glyphicon-ok"></span>确认修改</button>



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
    var pwd2 = document.getElementById("pwd2");
    var pwd3 = document.getElementById("pwd3");
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

    pwd3.onblur=function(){
        if(pwd2=pwd){
            alert("不能与原密码相同")
        }
    }



    function jump(){
        window.open("managerLogin.ftl")
    }
    
    

</script>
</html>