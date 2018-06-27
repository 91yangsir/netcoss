<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>添加账务账户</title>
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
<h1 style="text-align: center;color: #e38d13"><b>添加账务账户</b></h1>
<p style="text-align: center;color: red">红框为必填项</p>

<form action="/project/user/save" id="user_form" method="POST">
    <div style="width: 1000px;margin-left: 200px" id="add_div" class="row">
        <div class="col-md-8 col-md-offset-4">
            <div class="row" id="row_div">
                <div class="col-md-3">
                    <label for="name">真实姓名</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="name" name="userName" data-options="required:true" />
                </div>
                <div class="col-md-3">
                    <b>性别</b>
                </div>
                <div class="col-md-9">
                	<select id="gender" class="easyui-combobox" name="userGender" editable="false" style="width:247px;">  
					    <option value="0">女</option>
					    <option value="1">男</option>
					    <option value="2" selected>其他</option>
					</select>
                </div>
                <div class="col-md-3">
                    <label for="card">身份证号</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="card" name="userCard" data-options="required:true" />
                </div>
                <div class="col-md-3">
                    <label for="acc">账务账号</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="acc" name="userAcc" data-options="required:true" />
                </div>
                <div class="col-md-3">
                    <label for="pwd">密码</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="pwd" name="userPwd" data-options="required:true" />
                </div>
                <div class="col-md-3">
                    <label for="tel">联系电话</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="tel" name="userTel" data-options="required:true" />
                </div>
                <div class="col-md-3">
                    <label for="address">通信地址</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="address" name="userAddress" data-options="required:true" />
                </div>
                <div class="col-md-3">
                    <label for="post">邮编</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="post" name="userPost" />
                </div>
                <div class="col-md-3">
                    <label for="qq">QQ号</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="qq" name="userQQ"/>
                </div>
                <input type="hidden" value="1" name="userState"/>
                <div class="col-md-12"></div>
                <div class="col-md-3">
                    &nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">确认开通</button>
                </div>
                <div class="col-md-9">
                    &nbsp;&nbsp;&nbsp;&nbsp;<a id="btn" href="/project/view/usermag/showuser.ftl" class="easyui-linkbutton" data-options="iconCls:'icon-back'">返回</a>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>