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
			console.log(data.id);
			$.post('/project/cost/update',data,function(info){
				if(info == true){
					console.log(123456);
					$.messager.show({
						title:'提示',
						msg:'修改资费成功',
						timeout:5000,
						showType:'slide'
					})
				}else{
					$.messager.show({
						title:'提示',
						msg:'当前资费有用户使用，不能修改',
						timeout:5000,
						showType:'slide'
					})
				}
			},'json')
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
			console.log(data.id);
			$.post('/project/cost/delete',data,function(info){
				if(info == true){
					$.messager.show({
						title:'提示',
						msg:'删除资费成功',
						timeout:5000,
						showType:'slide'
					})
				}else{
					$.messager.show({
						title:'提示',
						msg:'当前资费有用户使用，不能删除',
						timeout:5000,
						showType:'slide'
					})
				}
			},'json');
			$("#delete_dialog").dialog('close');
			getData();
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
			console.log(data.id);
			$.post('/project/cost/updateopen',data,function(info){
				if(info == 1){
					$.messager.show({
						title:'提示',
						msg:'开通资费成功',
						timeout:5000,
						showType:'slide'
					})
				}else{
					$.messager.show({
						title:'提示',
						msg:'资费已经是开通状态',
						timeout:5000,
						showType:'slide'
					})
				}
			},'json');
			
			$("#openCost_dialog").dialog('close');
			getData();
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
			console.log(data1.id);
			$.post('/project/cost/updateout',data1,function(info){
				if(info == true){
					$.messager.show({
						title:'提示',
						msg:'暂停资费成功',
						timeout:5000,
						showType:'slide'
					})
				}else{
					$.messager.show({
						title:'提示',
						msg:'当前资费有用户使用，不能暂停',
						timeout:5000,
						showType:'slide'
					})
				}
			},'json');
			$("#closeCost_dialog").dialog('close');
			getData();
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

	
	
	

});



