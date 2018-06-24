<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
<meta charset="UTF-8">
<title>登陆日志查询</title>
</head>
<base href="/project/">
<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="static/bootstrap/css/bootstrap-theme.min.css" />
<link rel="stylesheet" href="static/bootstrap/css/project.css" />
<link rel="stylesheet" type="text/css"
	href="static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="static/easyui/themes/icon.css">
<script src="static/js/jquery-3.3.1.min.js"></script>

<script type="text/javascript"
	src="static/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="static/easyui/jquery.easyui.min.js"></script>

<body>
	<div id="window1"></div>
	<br>
	<br>
	<!--分页数据-->
	<div style="margin-left: 350px;">
		<table id="dg" style="width: 600px;"></table>
	</div>
	<!--查询表单-->

	<div style="margin-left: 350px; margin-top: 20px;">
		<div class="easyui-panel" title="角色管理" style="width: 600px;">
			<form id="ff" method="post">
				<br> 角色名称: <input class="easyui-textbox" type="text"
					id="manager" name="manager"> <br> <br> 角色类型:<select
					class="easyui-combobox" name="type" id="type" style="width: 100px"
					data-options="panelHeight:76">
					<option value="0" selected>普通管理员</option>
					<option value="1">用户</option>
					<option value="2">超级管理员</option>
				</select>

				<button style="margin-left: 50px; width: 100px; margin-top: 15px;">查询</button>
			</form>
			<button style="margin-left: 50px; width: 100px; margin-top: 25px;"
				id="add">添加角色</button>
			<button style="margin-left: 50px; width: 100px; margin-top: 25px;"
				id="dele">删除角色</button>
			<button style="margin-left: 50px; width: 100px; margin-top: 25px;"
				id="update">更改角色</button>
		</div>
	</div>
</body>
<script type="text/javascript">
	var roleName = "";
	var roleType = "";
	var roleId = 0;

	$("#dg").datagrid({
		url : '/project/role/get',
		columns : [ [ {
			field : 'roleName',
			title : '角色名称',
			width : 100
		}, {
			field : 'roleType',
			title : '角色类型',
			width : 100
		}, {
			field : 'list',
			title : '角色权限',
			width : 200
		}, ] ],
		fitColumns : true,
		singleSelect : true,
		pagination : true,
		pageNumber : 1,
		pageSize : 5,
		pageList : [ 5, 10 ],
		fit : false,
		rownumbers : true
	});

	$("#add").click(function() {
		//打开窗口1
		$("#window1").window({
			title : "增加角色",
			width : 500,
			height : 400,
			left : 400,
			top : 100,
			minimizable : false,
			maximizable : false,
			collapsible : false,
			closable : true,
			draggable : true,
			resizable : false,
			href : "/project/view/powermag/addRole.ftl"
		});

	})

	$("#update").click(function() {
		//打开窗口1
		var rowInfo = $("#dg").datagrid('getSelected');
		if (rowInfo == null) {
			$.messager.alert("警告框", "请选择一行", "warning");
		} else {
			roleId = rowInfo.id;
			roleName = rowInfo.roleName;
			roleType = rowInfo.roleType;
			$("#window1").window({
				title : "修改角色",
				width : 500,
				height : 400,
				left : 400,
				top : 100,
				minimizable : false,
				maximizable : false,
				collapsible : false,
				closable : true,
				draggable : true,
				resizable : false,
				href : "/project/view/powermag/updateRole.ftl"

			});

		}
	});

	$("#dele").click(function() {
		//打开窗口1
		var rowInfo = $("#dg").datagrid('getSelected');
		if (rowInfo == null) {
			$.messager.alert("警告框", "请选择一行", "warning");
		} else {
			$.messager.alert("警告框","确定要删除吗？","warning",function(){
				
			});
			roleId = rowInfo.id;
			roleName = rowInfo.roleName;
			roleType = rowInfo.roleType;
			$.post('/project/role/deleRole',{
				"roleId":roleId
			},function(info){
				
				
			},'json')
			
			$.messager.alert("提示框","删改成功","warning",function(){
				window.location.reload(true);
			});

		}
	});
</script>
</html>