


$(function() {
	/*修改页面*/
	$("#updateUserinfo").bind('click',function(){
		var row = $("#tt").datagrid('getSelected');
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
	
	
	
});
//保存 修改的内容
$('#update_form_info').bind('click', function(){   
	var row =  $('#tt').datagrid('getSelected'); 
	var url = "usersystem/"+row.id;
	$('#update_form_info').form('submit', {   
	    url:url,   
	    onSubmit: function(){   
	        // do some check   
	        // return false to prevent submit; 
	    	return true;
	    },   
	    success:function(data){ 
	    	var data = eval('(' + data + ')'); 
	    	$.messager.show({
				title:'提示',
				msg:data.information,
				timeout:5000,
				showType:'slide'
			});  
	    	if(data.status){
	    		$('#update_dialog').dialog('close');
	    		$('#tt').datagrid('reload');
	    	}
	    }   
	});  
}); 
