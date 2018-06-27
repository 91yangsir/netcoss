

<link rel="stylesheet" href="/project/static/css/managerIndex.css"
	type="text/css">

<script type="text/javascript" src="/project/static/js/managerIndex.js"></script>

	<div id="container">

		<div id="top">

			<table id="manager" title="管理员查询" style="width: 800px; height: 300px"
				data-options="rownumbers:true,singleSelect:true,fitColumns:true,pagination:true,method:'get'">

			</table>
		</div>

		<div id="down">


			<div id="down1">

				<button  id="add"   style="width: 70px; height: 30px">添加</button>
				&nbsp&nbsp&nbsp
				<button id="update"  style="width: 70px; height: 30px">修改</button>

				&nbsp&nbsp&nbsp
				<button id="delete"  style="width: 70px; height: 30px">删除</button>
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
					<br /> 
					<div>
						分配管理员:<input id = "roleName" name="roleName" class="easyui-combobox" 
						data-options="panelHeight:'auto',valueField:'id',textField:'roleName',method:'get', url:'/project/manager/rolelist'"/>
					</div>
					<br>
					<input type="button" class="easyui-linkbutton"  onclick="submitForm()" width="50"
						style="width: 70px; height:30px"  value = "查询"/>
					<br /> <br /> 
				</form>
				
			</div>
		</div>

	</div>
