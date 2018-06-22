<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="/project/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" href="/project/static/easyui/themes/icon.css">
<link rel="stylesheet" href="/project/static/css/managerIndex.css"
	type="text/css">
<script src="/project/static/js/jquery-3.3.1.min.js"></script>
<script src="/project/static/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/project/static/js/managerIndex.js"></script>
</head>
<body>
	<h1>用户管理</h1>

	<div id="container">

		<div id="top">

			<table id="manager" title="管理员查询" style="width: 800px; height: 300px"
				data-options="rownumbers:true,singleSelect:true,fitColumns:true,pagination:true,method:'get'">

			</table>
		</div>

		<div id="down">


			<div id="down1">

				<button  id="add" ; style="width: 80px; height: 50px">添加</button>
				&nbsp&nbsp&nbsp
				<button id="update"; style="width: 80px; height: 50px">修改</button>

				&nbsp&nbsp&nbsp
				<button style="width: 80px; height: 50px">删除</button>
			</div>
			<div id="down2">
				<form id="ff" method="post">
					<br /> <br />
					<div>
						<label for="managerName">用户名称:&nbsp</label> <input
							class="easyui-validatebox" type="text" id="managerName" />
					</div>
					<br />
					<div>
						<label for="managerTel">用户电话:&nbsp</label> <input
							class="easyui-validatebox" type="text" id="managerTel" />
					</div>
					<br /> <br />
					<div>
						分配管理员:<select id="managerType" style="width: 170px">
							<option value="用户管理员" selected="selected">用户管理员</option>
							<option value="账单管理员">账单管理员</option>
							<option value="资费管理">资费管理</option>
							<option value="账务管理员">账务管理员</option>
						</select>
					</div>
					<br /> <br /> <input type="submit" width="50" onclick="sub"
						style="width: 100px; height: 40px" />
				</form>
			</div>
		</div>

	</div>

</body>

</html>