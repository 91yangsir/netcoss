 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link rel="stylesheet"
	href="/project/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" href="/project/static/easyui/themes/icon.css">
<link rel="stylesheet" href="/project/static/css/addmanager.css"type="text/css">
<script src="/project/static/js/jquery-3.3.1.min.js"></script>
<script src="/project/static/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/project/static/js/addManager.js"></script>
</head>
<body>

<div id="add1">
    <h2>添加管理员</h2>


   
    <p>Fill the form and submit it.</p>
    <div style="margin:20px 0;"></div>
    <div class="easyui-panel" title="New Topic" style="width:600px ; height: 500px">
        <div style="padding:10px 60px 20px 60px">
            <form id="ff" method="POST" action="/project/manager/add">
            <input type="hidden" name="_method" value="POST">
                <br/>  <br/>  
                <table cellpadding="5">
                    <tr>

                    <td >管理员账号:</td>
                    <td><input id="managerAcc" class="easyui-textbox" type="text" name="managerAcc" data-options="required:true"/></td>
                </tr>
                    </tr>

                    <tr>

                        <td>管理员名称:</td>
                        <td><input    id="managerName" class="easyui-textbox" type="text" name="managerName" data-options="required:true"/></td>
                    </tr>

                    <tr>
                        <td>管理员密码:</td>
                        <td><input  id="managerPwd"  class="easyui-textbox" type="password" name="managerPwd" data-options="required:true"/></td>
                    </tr>

                    <tr>
                        <td>确认密码:</td>
                        <td><input    id="managerPwd1" class="easyui-textbox" type="password" name="managerPwd1" data-options="required:true"/></td>
                    </tr>


                    <tr>
                        <td>管理员电话:</td>
                        <td><input  id="managerTel"  class="easyui-textbox" type="text" name="managerTel" data-options="required:true"/></td>
                    </tr>


                    <tr>
                        <td>管理员邮箱:</td>
                        <td><input  id="managerMail"    class="easyui-textbox" type="text" name="managerMail" data-options="required:true"/></td>

                    </tr>
                    <tr>
                        <td>分配管理员:</td>

                        <td>
                            <input id = "roleName" name="roleName" class="easyui-combobox" 
						data-options="panelHeight:'auto',valueField:'id',textField:'roleName',method:'get', url:'/project/manager/rolelist'" />
                        </td>
                    </tr>
                </table>
                <br/><br/><br/>
			<div id="tijiao">
			
			</div>
               
            </form>
             <input  id="ad" type="button" style="width: 100px; height:40px" value="添加"/>
            <div  style="text-align:center;padding:5px">
             <div style="text-align:center;padding:5px">
                    
                </div>
            </div>
        </div>
    </div>


</div>
</body>
</html>