

	<div style="margin-left: 100px;">
		<br> <br> 角色名称<input type="text"  id=name />
		<br> <br /> 角色类型
		<select id="type2">
			<option value="1">超级管理员</option>
			<option value="2">普通管理员</option>
			<option value="3">用户</option>
		</select> <br/><br>
		 角色权限<input id="cc">   
		 <br><br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;
		<button id="btn1">提交</button>
	</div>


<script type="text/javascript">

$('#cc').combobox({  
    url:'/project/menu/get1', 
    multiple:true, //支持多选
    valueField:'id',  
    textField:'text'  
});

$("#btn1").click(function(){
	var val = $('#cc').combobox('getText');//获取文本框的值。
	console.log(val);
	$.post('/project/role/choice',{
		"menu":val,
		"type":$("#type2").val(),
		"name":$("#name").val()
	},function(info){
		
		
	},'json')
	$.messager.alert("提示框","增加成功","warning",function(){
		window.location.reload(true);
	});
	
})


</script>