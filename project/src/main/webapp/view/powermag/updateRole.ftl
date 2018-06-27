

	<div style="margin-left: 100px;">
		<br> <br> 角色名称<input type="text"  id=name1 />
		<br> <br /> 角色类型
		<select id="type1">
			<option value="1">超级管理员</option>
			<option value="2">普通管理员</option>
			<option value="3">用户</option>
		</select> <br/><br>
		 角色权限<input id="cc1">   
		 <br><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;
		<button id="btn2">提交</button>
	</div>
	
	
<script type="text/javascript">

$('#cc1').combobox({  
    url:'/project/menu/get1', 
    multiple:true, //支持多选
    valueField:'id',
    textField:'text'  
});

$("#btn2").click(function(){
	var val = $('#cc1').combobox('getText');//获取文本框的值。
	console.log(val);
	$.post('/project/role/updateRole',{
		"menu":val,
		"type":$("#type1").val(),
		"name":$("#name1").val(),
		"roleId":roleId
	},function(info){
		
		
	},'json')
	
	$.messager.alert("提示框","修改成功","warning",function(){
		$('#dg4').datagrid('reload')
	});
})


</script>