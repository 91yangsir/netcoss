<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>修改用户信息</title>
    <base href="/project/">
    <link rel="stylesheet" type="text/css" href="static/easyui/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="static/easyui/themes/icon.css"/>
	<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css"/>
    <script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="static/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="static/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="static/js/jquery.json-2.4.js"></script>
	<script type="text/javascript" src="static/bootstrap/js/bootstrap.min.js"></script>

</head>
<style>
    #row_div>div{
        font-size: 20px;
        margin-top: 20px;
    }
</style>
<body>
<br/>
<h1 style="text-align: center;color: #e38d13"><b>修改用户信息</b></h1>

<form id="user_form" method="post">
    <div style="width: 1000px;margin-left: 200px" id="update_div" class="row">
        <div class="col-md-8 col-md-offset-4">
            <div class="row" id="row_div">
                <div class="col-md-3">
                    <label for="name">真实姓名</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userName" name="userName" />
                </div>
                <div class="col-md-3">
                    <label for="gender">性别</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userGender" name="userGender" />
                </div>
                <div class="col-md-3">
                    <label for="card">身份证号</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userCard" name="userCard" />
                </div>
                <div class="col-md-3">
                    <label for="acc">账务账号</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userAcc" name="userAcc" />
                </div>
                <div class="col-md-3">
                    <label for="pwd">密码</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userPwd" name="userPwd" />
                </div>
                <div class="col-md-3">
                    <label for="tel">联系电话</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userTel" name="userTel" />
                </div>
                <div class="col-md-3">
                    <label for="address">通信地址</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userAddress" name="userAddress" />
                </div>
                <div class="col-md-3">
                    <label for="post">邮编</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userPost" name="userPost" />
                </div>
                <div class="col-md-3">
                    <label for="qq">QQ号</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userQQ" name="userQQ"/>
                </div>
                <div class="col-md-12"></div>
                <div class="col-md-3">
                    &nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">确认修改</button>
                </div>
                <div class="col-md-9">
                    &nbsp;&nbsp;&nbsp;&nbsp;<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-back'">返回</a>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>