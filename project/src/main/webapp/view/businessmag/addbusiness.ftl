<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>添加业务账号</title>
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
<h1 style="text-align: center;color: #e38d13"><b>添加业务账号</b></h1>
<p style="text-align: center;color: red">红框为必填项</p>

<form action="/project/business/save" id="business_form" method="POST">
    <div style="width: 1000px;margin-left: 200px" id="add_div" class="row">
        <div class="col-md-8 col-md-offset-4">
            <div class="row" id="row_div">
                <div class="col-md-3">
                    	<b>账务帐号</b>
                </div>
                <div class="col-md-9">
	                <input class="easyui-combobox" name="userAcc" editable="false"
						data-options="
						url:'/project/user/userCombobox',
						method:'get',
						valueField:'id',
						textField:'userAcc',
						panelHeight:'auto',
						required:true
					">
                </div>
                <div class="col-md-3">
                    	<b>资费类型</b>
                </div>
                <div class="col-md-9">
                	<input class="easyui-combobox" name="costName" editable="false"
						data-options="
						url:'/project/business/costCombobox',
						method:'get',
						valueField:'id',
						textField:'costName',
						panelHeight:'auto',
						required:true
					">
                </div>
                <div class="col-md-3">
                    	<b>服务器</b>
                </div>
                <div class="col-md-9">
	                <input class="easyui-combobox" name="serverIp" editable="false"
							data-options="
							url:'/project/server/serverCombobox',
							method:'get',
							valueField:'id',
							textField:'serverIp',
							panelHeight:'auto',
							required:true
					">
                </div>
                <div class="col-md-3">
                    <label for="businessAcc">业务账号</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="businessAcc" name="businessAcc" data-options="required:true" />
                </div>
                <div class="col-md-3">
                    <label for="businessPwd">密码</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="businessPwd" name="businessPwd" data-options="required:true" />
                </div>
                <div class="col-md-3">
                    <label for="pwd">确认密码</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="pwd" name="pwd" data-options="required:true" />
                </div>
                
                <input type="hidden" value="0" name="businessCostNext"/>
                <input type="hidden" value="1" name="businessState"/>
                <div class="col-md-12"></div>
                <div class="col-md-3">
                    &nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">确认开通</button>
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