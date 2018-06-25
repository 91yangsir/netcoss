

	<div style="margin-left: 100px;">
		<br>
		<br> 菜单名称<input type="text" name="menuName" id=name /> <br>
		<br /> 菜单编号<input type="text" name="menuNum" id="num" /> <br />
		<br /> 菜单等级<input type="text" name="menuLevel" id="level" /> <br>
		<br>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;
		<button id="btn1">提交</button>
	</div>

<script type="text/javascript">
$("#btn1").click(function(){
	console.log(33);
	var menuName = $("#name").val();
	var menuNum = $("#num").val();
	var menuLevel = $("#level").val();
	$.post("/project/menu/1", {
		"menuName" : menuName,
		"menuNum" : menuNum,
		"menuLevel" : menuLevel
	}, function(info) {
	
	}, "json")
	$.messager.alert("提示框","增加成功","warning",function(){
		window.location.reload(true);
	});
}) 

</script>