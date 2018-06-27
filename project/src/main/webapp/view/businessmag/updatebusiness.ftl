<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>修改业务信息</title>
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
<h1 style="text-align: center;color: #e38d13"><b>修改业务信息</b></h1>

<form id="business_form" action="/project/business/update1" method="post">
    <div style="width: 1000px;margin-left: 200px" id="update_div" class="row">
    	<input type="hidden" value="${business.id}" id="businessId" name="id">
    	<input type="hidden" value="${business.businessState}" id="businessState" name="businessState">
    	<input type="hidden" value="${business.businessCostNext}" id="businessCostNext" name="businessCostNext">
    	<input type="hidden" value="${business.user.id}" id="userId" name="userId">
    	<input type="hidden" value="${business.cost.id}" id="costId" name="costId">
    	<input type="hidden" value="${business.server.id}" id="serverId" name="serverId">
        <div class="col-md-8 col-md-offset-4">
            <div class="row" id="row_div">
                <div class="col-md-3">
                    <b>账务帐号</b>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="user" name="userAcc" value="${business.user.userAcc}" readonly/>
                </div>
                <div class="col-md-3">
                	<b>资费类型</b>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="cost" name="costName" value="${business.cost.costName}" readonly/>
                </div>
                <div class="col-md-3">
                	<b>服务器</b>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="server" name="serverIp" value="${business.server.serverIp}" readonly/>
                </div>
                <div class="col-md-3">
                    <label for="businessAcc">业务账号</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="businessAcc" name="businessAcc" value="${business.businessAcc}" />
                </div>
                <div class="col-md-3">
                    <label for="businessPwd">密码</label>
                </div>
                <div class="col-md-9">
                    <input class="easyui-validatebox" type="text" id="businessPwd" name="businessPwd" value="${business.businessPwd}" />
                </div>
                <div class="col-md-12"></div>
                <div class="col-md-3">
                    &nbsp;&nbsp;&nbsp;&nbsp;<button type="submit" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">确认修改</button>
                </div>
                <div class="col-md-9">
                    &nbsp;&nbsp;&nbsp;&nbsp;<a id="btn" href="/project/view/businessmag/showbusiness.ftl" class="easyui-linkbutton" data-options="iconCls:'icon-back'">返回</a>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>