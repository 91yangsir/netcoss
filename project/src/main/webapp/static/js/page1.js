$(function() {
	/*修改页面*/
	$("#updateCost").bind('click',function(){
		var row = $("#dg").datagrid('getSelected');
		if(!row){
			$.messager.show({
				title:'提示',
				msg:'请选择需要修改的数据',
				timeout:5000,
				showType:'slide'
			})
		}else{
			$("#update_dialog").dialog('open');
			update(row);
		}
	});

	/*按钮确定*/
	function update(row){
		$("#update_form_info").bind('click',function(){
			var data = {
				id : row.id,
				costName:$("#update_costName").val(),
				costType:$("#update_costType").val(),
				costTime:$("#update_costTime").val(),
				costBase:$("#update_costBase").val(),
				costUnit:$("#update_costUnit").val(),
				costExplain:$("#update_costExplain").val()
			};
			console.log(data.id);
			$.ajax({
				type:"PUT",
				data : data,
				url:"/project/cost/update?id="+data.id+"&costName="+data.costName+"&costType="+data.costType+"&costTime="+data.costTime+"&costBase="+data.costBase+"&costUnit="+data.costUnit+"&costExplain="+data.costExplain+"",
				datatype:"json",
					success:function(msg){
						$.messager.show({
						title:'提示',
						msg:'修改资费成功',
						timeout:5000,
						showType:'slide'
					})
				}
			});
			$("#update_dialog").dialog('close');
			getData();
			$("#update_costName").val('');
			$("#update_costType").val(1);
			$("#update_costTime").val('');
			$("#update_costBase").val('');
			$("#update_costUnit").val('');
			$("#update_costExplain").val('')
		})
	}

	/*添加页面*/
	$("#saveCost").bind('click',function(){
		$("#save_dialog").dialog('open');
	})
	/*按钮确定*/
	$("#save_form_info").bind('click',function(){
		var data = {
			costName:$("#save_costName").val(),
			costType:$("#save_costType").val(),
			costTime:$("#save_costTime").val(),
			costBase:$("#save_costBase").val(),
			costUnit:$("#save_costUnit").val(),
			costExplain:$("#save_costExplain").val(),
		};
		$.ajax({
			type:"POST",
			data:data,
			url:'/project/cost/save',
			datatype:"json",
			success:function(msg){
				$.messager.show({
					title:'提示',
					msg:'添加资费成功',
					timeout:5000,
					showType:'slide'
				})
			}
		});
		$("#save_dialog").dialog('close');
		getData();
		$("#save_costName").val('');
		$("#save_costType").val(1);
		$("#save_costTime").val('');
		$("#save_costBase").val('');
		$("#save_costUnit").val('');
		$("#save_costExplain").val('')
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
});



