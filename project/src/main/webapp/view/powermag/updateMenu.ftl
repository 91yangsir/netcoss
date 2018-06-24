

	<div style="margin-left: 100px;">
		<br>
		<br> 菜单名称<input type="text" name="menuName1" id=name1 /> <br>
		<br /> 菜单编号<input type="text" name="menuNum1" id="num1" /> <br />
		<br /> 菜单等级<input type="text" name="menuLevel1" id="level1" /> <br>
		<br>  
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;
		<button id="btn2">提交</button>
	</div>

<script type="text/javascript">
$("#btn2").click(function(){
	
	var menuName = $("#name1").val();
	var menuNum = $("#num1").val();
	var menuLevel = $("#level1").val();
	$.post("/project/menu/1", {
		"id":id,
		"menuName" : menuName,
		"menuNum" : menuNum,
		"menuLevel" : menuLevel
	}, function(info) {
	
	}, "json")
	$.messager.alert("提示框","修改成功","warning");
}) 

</script>