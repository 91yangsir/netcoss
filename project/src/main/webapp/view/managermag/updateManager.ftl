<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="/project/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" href="/project/static/easyui/themes/icon.css">
<link rel="stylesheet" href="/project/static/css/updatemanager.css"
	type="text/css">
<script src="/project/static/js/jquery-3.3.1.min.js"></script>
<script src="/project/static/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/project/static/js/updateManager.js"></script>
</head>
<body>

<div id="add1">
    <h2>添加管理员</h2>


    <h2>Managerment</h2>
    <p>Fill the form and submit it.</p>
    <div style="margin:20px 0;"></div>
    <div class="easyui-panel" title="New Topic" style="width:600px ; height: 500px">
        <div style="padding:10px 60px 20px 60px">
            <form id="ff" method="POST">
            	<input type="hidden" value="${manager.id}" id="managerId">
            	<input type="hidden" value="${manager.managerAcc}" id="managerAcc">
            	<input type="hidden" value="${manager.managerName}" id="managerName">
                <br/>  <br/>
                <table cellpadding="5">
                    <tr>

                        <td >管理员账号:</td>
 						
                        <td ><span style="color:blue;font-size:20px" name="managerAcc">${manager.managerAcc}</span></td>
                    </tr>
                    </tr>

                    <tr>

                        <td>管理员名称:</td>
                        <td><span style="color:blue;font-size:20px" name="managerName">${manager.managerName}</span></td>
                    </tr>

                    <tr>
                        <td>管理员密码:</td>
                        <td><input  id="managerPwd"  class="easyui-textbox" type="password" name="managerPwd" data-options="required:true" value="${manager.managerPwd}"/></td>
                    </tr>

                    <tr>
                        <td>确认密码:</td>
                        <td><input    id="managerPwd1" class="easyui-textbox" type="password" name="managerPwd1" data-options="required:true" value="${manager.managerPwd}"/></td>
                    </tr>


                    <tr>
                        <td>管理员电话:</td>
                        <td><input  id="managerTel"  class="easyui-textbox" type="text" name="managerTel" data-options="required:true" value="${manager.managerTel}"/></td>
                    </tr>


                    <tr>
                        <td>管理员邮箱:</td>
                        <td><input  id="managerMail"    class="easyui-textbox" type="text" name="managerMail" data-options="required:true" value="${manager.managerMail}"/></td>

                    </tr>
                    <tr>
                        <td>管理员类型:</td>

                        <td>
                           <input id = "roleName" name="roleName" class="easyui-combobox " 
						data-options="panelHeight:'auto',valueField:'id',textField:'roleName',method:'get', url:'/project/manager/rolelist'" 
						
						/>
                        </td>
                    </tr>
                </table>
                <input type="button" value="提交"  id="up" width="50"  style="width: 100px;height: 40px" />
            </form>
            <div style="text-align:center;padding:5px">
                
            </div>
        </div>
    </div>
   

</div>
</body>
</html>