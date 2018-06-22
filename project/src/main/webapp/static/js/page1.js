$(function() {
	/*修改页面*/
	$("#updateCost").bind('click',function(){
		var row = $("#dg").datagrid('getSelected');
		if(row != null){
			$("#update_dialog").dialog('open');
		}else{
			$.messager.show({
				title:'提示',
				msg:'请选择需要修改的数据',
				timeout:5000,
				showType:'slide'
			})
		}
	})
	/*按钮确定*/
	$("#update_form_info").click(function(){
		$("#update_dialog").dialog('close');
	})


	/*添加页面*/
	$("#saveCost").bind('click',function(){
		$("#save_dialog").dialog('open');
	})
	/*按钮确定*/
	$("#save_form_info").click(function(){
		$("#save_dialog").dialog('close');
	})

	/*删除页面*/
	$("#deleteCost").bind('click',function(){
		var row = $("#dg").datagrid('getSelected');
		if(row != null){
			$("#delete_dialog").dialog('open');
		}else{
			$.messager.show({
				title:'提示',
				msg:'请选择需要删除的数据',
				timeout:5000,
				showType:'slide'
			})
		}
	})
	/*按钮确定*/
	$("#delete_form_info").click(function(){
		$("#delete_dialog").dialog('close');
	})

	/*开通页面*/
	$("#openCost").bind('click',function(){
		var row = $("#dg").datagrid('getSelected');
		if(row != null){
			$("#openCost_dialog").dialog('open');
		}else{
			$.messager.show({
				title:'提示',
				msg:'请选择需要开通的数据',
				timeout:5000,
				showType:'slide'
			})
		}
	})
	/*按钮确定*/
	$("#openCost_form_info").click(function(){
		$("#openCost_dialog").dialog('close');
	})

	/*暂停页面*/
	$("#closeCost").bind('click',function(){
		var row = $("#dg").datagrid('getSelected');
		if(row != null){
			$("#closeCost_dialog").dialog('open');
		}else{
			$.messager.show({
				title:'提示',
				msg:'请选择需要暂停的数据',
				timeout:5000,
				showType:'slide'
			})
		}
	})
	/*按钮确定*/
	$("#closeCost_form_info").click(function(){
		$("#closeCost_dialog").dialog('close');
	})


	/*根据资费的不同选择不同权限*/
	$("#update_costType").change(function() {
		var a = $("#update_costType").val();
		/*b = $("#update_costType option:checked").text();*/
		console.log("被选项目的值："+a+"。");
		if(a == "" || a== 1){
			$("#update_costUnit").attr("disabled","disabled");
		}else if(a == 2){
			$("#update_costUnit").attr("disabled","disabled");
		}
	});
});