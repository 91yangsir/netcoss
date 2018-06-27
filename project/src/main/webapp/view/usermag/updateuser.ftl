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
	<script type="text/javascript" src="static/js/usermag.js"></script>

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

<form id="user_form" action="/project/user/update1" method="POST">
    <div style="width: 1000px;margin-left: 200px" id="update_div" class="row">
    	<input type="hidden" value="${user.id}" id="userId" name="id">
    	<input type="hidden" value="${user.userState}" id="userState" name="userState">
    	<input type="hidden" value="${user.role.id}" id="roleId" name="roleId">
    	
        <div class="col-md-8 col-md-offset-4">
            <div class="row" id="row_div">
                <div class="col-md-3">
                    <label for="name">真实姓名</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userName" name="userName" value="${user.userName}"/>
                </div>
                <div class="col-md-3">
                    <b>性别</b>
                </div>
                <div class="col-md-9">
                	<select id="userGender" class="easyui-combobox" name="userGender" editable="false" style="width:247px;">  
					    <option value="0" <#if user.userGender == 0>selected</#if>>女</option>
					    <option value="1" <#if user.userGender == 1>selected</#if>>男</option>
					    <option value="2" <#if user.userGender == 2>selected</#if>>其他</option>
					</select>
                </div>
                <div class="col-md-3">
                    <label for="card">身份证号</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userCard" name="userCard" value="${user.userCard}"/>
                </div>
                <div class="col-md-3">
                    <label for="acc">账务账号</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userAcc" name="userAcc" value="${user.userAcc}"/>
                </div>
                <div class="col-md-3">
                    <label for="pwd">密码</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userPwd" name="userPwd" value="${user.userPwd}"/>
                </div>
                <div class="col-md-3">
                    <label for="tel">联系电话</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userTel" name="userTel" value="${user.userTel}"/>
                </div>
                <div class="col-md-3">
                    <label for="address">通信地址</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userAddress" name="userAddress" value="${user.userAddress}"/>
                </div>
                <div class="col-md-3">
                    <label for="post">邮编</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userPost" name="userPost" value="${user.userPost}"/>
                </div>
                <div class="col-md-3">
                    <label for="qq">QQ号</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="userQQ" name="userQQ" value="${user.userQQ}"/>
                </div>
                <div class="col-md-12"></div>
                <div class="col-md-3">
                    &nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">确认修改</button>
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