$(function() {
	getData();
	
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

	
});

function getData(){    
	console.log(111)
    /*获得初始数据显示在页面*/
	$("#dg").datagrid({
		url:'/project/cost/page',
		//格式化每个字段的显示
		columns:[[ 
			{field:'costName',title:'资费名',width:100,align:'center'},
			{field:'costType',title:'资费类型',width:100,align:'center'},
			{field:'costTime',title:'基本时长',width:90,align:'center'},
			{field:'costBase',title:'基本费用',width:90,align:'center'},
			{field:'costUnit',title:'单位费用',width:90,align:'center'},
			{field:'costStart',title:'开通时间',width:120,align:'center'},
			{field:'costExplain',title:'资费说明',width:190,align:'center'} 
			]]
	
	
	});
}