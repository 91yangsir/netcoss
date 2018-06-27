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
	
	function update(row){
		/*按钮确定*/
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
			$.post('/project/cost/update',data,function(info){
				if(info == true){
					console.log(123456);
					$.messager.alert("提示","修改资费成功","warning",function(){
						$("#dg").datagrid("reload");
					});
				}else{
					$.messager.alert("提示","当前资费有用户使用，无法修改","warning",function(){
						$("#dg").datagrid("reload");
					});
				}
			},'json')
			$("#update_dialog").dialog('close');
			$("#update_costName").val('');
			$("#update_costType").val(1);
			$("#update_costTime").val('');
			$("#update_costBase").val('');
			$("#update_costUnit").val(0);
			$("#update_costExplain").val('')
		})
	}

	
	/*删除页面*/
	$("#deleteCost").bind('click',function(){
		var row = $("#dg").datagrid('getSelected');
		if(row != null){
			$("#delete_dialog").dialog('open');
			deleteCost(row);
		}else{
			$.messager.show({
				title:'提示',
				msg:'请选择需要删除的数据',
				timeout:5000,
				showType:'slide'
			})
		}
	})
	function deleteCost(row){
		/*按钮确定*/
		$("#delete_form_info").click(function(){
			var data = {
				id : row.id
			}
			$.post('/project/cost/delete',data,function(info){
				if(info == true){
					$.messager.alert("提示","删除成功","warning",function(){
						$("#dg").datagrid("reload");
					});
				}else{
					$.messager.alert("提示","当前资费有用户使用，不能删除","warning",function(){
						$("#dg").datagrid("reload");
					});
				}
			},'json');
			$("#delete_dialog").dialog('close');
		})
	}
	
	
	/*开通页面*/
	$("#openCost").bind('click',function(){
		var row = $("#dg").datagrid('getSelected');
		if(row != null){
			$("#openCost_dialog").dialog('open');
			updateState1(row);
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
	function updateState1(row){
		$("#openCost_form_info").bind('click',function(){
			var data = {
				id : row.id
			}
			$.post('/project/cost/updateopen',data,function(info){
				if(info == 1){
					$.messager.alert("提示","开通成功","warning",function(){
						$("#dg").datagrid("reload");
					});
				}else{
					$.messager.alert("提示","资费已经是开通状态","warning",function(){
						$("#dg").datagrid("reload");
					});
				}
			},'json');
			
			$("#openCost_dialog").dialog('close');
		})
	}
	
	/*暂停页面*/
	$("#closeCost").bind('click',function(){
		var row = $("#dg").datagrid('getSelected');
		if(row != null){
			$("#closeCost_dialog").dialog('open');
			updateState(row);
		}else{
			$.messager.show({
				title:'提示',
				msg:'请选择需要暂停的数据',
				timeout:5000,
				showType:'slide'
			})
		}
	})
	
	function updateState(row){
		/*按钮确定*/
		$("#closeCost_form_info").click(function(){
			var data1 = {
				id : row.id,
			}
			$.post('/project/cost/updateout',data1,function(info){
				if(info == true){
					$.messager.alert("提示","暂停成功","warning",function(){
						$("#dg").datagrid("reload");
					});
				}else{
					$.messager.alert("提示","当前资费有用户使用，不能暂停","warning",function(){
						$("#dg").datagrid("reload");
					});
				}
			},'json');
			$("#closeCost_dialog").dialog('close');
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
				$.messager.alert("提示","添加资费成功","warning",function(){
					$("#dg").datagrid("reload");
				});
			}
		});
		$("#save_dialog").dialog('close');
		$("#save_costName").val('');
		$("#save_costType").val(1);
		$("#save_costTime").val('');
		$("#save_costBase").val('');
		$("#save_costUnit").val(0);
		$("#save_costExplain").val('')
	})

	/*修改时根据资费的不同选择不同权限*/
	$(document).ready(function(){
		$("#update_costType").change(function(){
			console.log($(this).val());
			if($(this).val() == 1){
				$("#update_costTime").attr("disabled",false);
				$("#update_costTime").val("");
				$("#update_costBase").attr("disabled",false);
				$("#update_costBase").val("");
				$("#update_costUnit").attr("disabled","disabled");
				$("#update_costUnit").val(0);
			}else if($(this).val() == 2){
				$("#update_costTime").attr("disabled","disabled");
				$("#update_costTime").val(0);
				$("#update_costBase").attr("disabled","disabled");
				$("#update_costBase").val(0);
				$("#update_costUnit").attr("disabled",false);
				$("#update_costUnit").val("");
			}else if($(this).val() == 3){
				$("#update_costTime").attr("disabled",false);
				$("#update_costTime").val("");
				$("#update_costBase").attr("disabled",false);
				$("#update_costBase").val("");
				$("#update_costUnit").attr("disabled",false);
				$("#update_costUnit").val("");
			}
		})
	});
	
	/*添加时根据资费的不同选择不同权限*/
	$(document).ready(function(){
		$("#save_costType").change(function(){
			console.log($(this).val());
			if($(this).val() == 1){
				$("#save_costTime").attr("disabled",false);
				$("#save_costTime").val("");
				$("#save_costBase").attr("disabled",false);
				$("#save_costBase").val("");
				$("#save_costUnit").attr("disabled","disabled");
				$("#save_costUnit").val(0);
			}else if($(this).val() == 2){
				$("#save_costTime").attr("disabled","disabled");
				$("#save_costTime").val(0);
				$("#save_costBase").attr("disabled","disabled");
				$("#save_costBase").val(0);
				$("#save_costUnit").attr("disabled",false);
				$("#save_costUnit").val("");
			}else if($(this).val() == 3){
				$("#save_costTime").attr("disabled",false);
				$("#save_costTime").val("");
				$("#save_costBase").attr("disabled",false);
				$("#save_costBase").val("");
				$("#save_costUnit").attr("disabled",false);
				$("#save_costUnit").val("");
			}
		})
	});
	
	
});



