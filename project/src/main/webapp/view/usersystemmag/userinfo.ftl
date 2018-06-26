<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>个人信息</title>
    <link rel="stylesheet" href="/project/static/bootstrap/css/project.css"/>
    <link rel="stylesheet" type="text/css" href="/project/static/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/project/static/easyui/themes/icon.css">
    <script src="/project/static/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/project/static/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="/project/static/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/project/static/js/usersystemmag/userinfo.js"></script>
    <script type="text/javascript" src="/project/static/bootstrap/js/DatePicker/WdatePicker.js"></script>
</head>
<body>
<table id="tt" class="easyui-datagrid" style="width:900px;height:250px"
       title="个人信息" iconCls="icon-update"
       toolbar="#tb">

    <thead>
    <tr>
        <th field="name" width="110" align="right">真实姓名</th>
        <th field="gender" width="120" align="right">性别</th>
        <th field="card" width="100" align="right">身份证号码</th>
        <th field="acc" width="100" align="right">账务账号</th>
        <th field="tel" width="100" align="right">电话</th>
        <th field="address" width="120" align="right">地址</th>
        <th field="post" width="120" align="right">邮编</th>
        <th field="QQ" width="130" align="right">QQ号码</th>
    </tr>
    </thead>
    <tbody>
        <tr>
            <td>${user.userName}</td>
 			<td>男</td>
			<td>${user.userCard}</td>
			<td>${user.userAcc}</td>
			<td>${user.userTel}</td>
			<td>${user.userAddress}</td>
			<td>${user.userPost}</td>
			<td>${user.userQQ}</td>
        </tr>
    </tbody>
</table>
<div id="tb">
    <a id="updateUserinfo" href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">修改个人信息</a>&nbsp;&nbsp;
</div>

<!--修改页面-->
<div id="update_dialog" class="easyui-dialog" title="修改个人信息" style="width:500px;height:350px;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,buttons:'#update_userinfo_tb',closed:true">
    <form id="update_userinfo_form" method="post" action="/project/usersystem/update">

        真实姓名：&nbsp;&nbsp;&nbsp;<input class="easyui-validatebox" data-options="required:false" id="update_userName" name="userName" placeholder="输入中文姓名"  value="${user.userName}"/><br/><br/>


        身份证号码：${user.userCard}<br/><br/>


        账务账号：&nbsp;&nbsp;&nbsp;${user.userAcc}<br/><br/>


        电话：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="easyui-validatebox" placeholder="输入正确的电话号码" data-options="required:true" id="update_userPhone" name="userPhone" value="${user.userTel}"/><br/><br/>



        地址：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="easyui-validatebox" data-options="required:false" id="update_userAddress" name="userAddresss" value="${user.userAddress}"/><br/><br/>


        邮编：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class="easyui-validatebox" data-options="required:false" id="update_userPost" name="userPost" value="${user.userPost}"/><br/><br/>


   QQ号码：&nbsp;&nbsp;&nbsp;&nbsp;<input class="easyui-validatebox" data-options="required:false" id="update_userQQ" name="userQQ" value="${user.userQQ}"/><br/><br/>

    </form>
</div>
<!--修改页面里的两个按钮-->
<div id="update_userinfo_tb" style="text-align: center;">
    <a id="update_form_info" href="javascript:void(0)" class="easyui-linkbutton"
       data-options="iconCls:'icon-save',plain:true">保存</a>
    <a
            href="javascript:$('#update_dialog').dialog('close')"
            class="easyui-linkbutton"
            data-options="iconCls:'icon-no',plain:true">取消</a>
</div>

</body>
</html>