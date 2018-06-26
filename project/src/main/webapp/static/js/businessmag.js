$(function() {
	
	//查询
	$('#queryBusiness').bind('click', function(){   
		getData();
	    });

	// 删除
	$('#deleteBusiness').bind('click', function(){   
		
		var datas =  $('#business_table').datagrid('getSelections');  
		var lenth = datas.length;
		if(lenth == 0){
			$.messager.show({
				title:'提示',
				msg:'请选择需要删除的数据！',
				timeout:5000,
				showType:'slide'
			});
		}else{
			var jsonArray = $.toJSON(datas);
			console.log(jsonArray);
			$.ajax({
				   type: "DELETE",
				   url: "business/delete",
				   data: jsonArray,
				   contentType:"application/json;charset=utf-8",
				   success: function(msg){
					   $.messager.show({
							title:'提示',
							msg: '删除成功',
							timeout:5000,
							showType:'slide'
						});  
				   }
				});
		}
		
    }); 
	
	
	//修改
	$('#updateBusiness').bind('click', function(){   
		var row =  $('#business_table').datagrid('getSelected'); 
		
		if(!row){
			$.messager.show({
				title:'提示',
				msg:'请选择需要修改的数据！',
				timeout:5000,
				showType:'slide'
			});
		}else{
			
			var rows =  $('#business_table').datagrid('getSelections'); 
			var lenth = rows.length;
			if(lenth > 1){
				$.messager.show({
					title:'提示',
					msg:'每次只能修改1条数据！',
					timeout:5000,
					showType:'slide'
				});
			}else{
				
				$('#update_dialog').dialog('open');
				$('#update_id').val(row.id);
				$('#update_version').val(row.version);
				$('#update_customerName').val(row.customerName);
				$('#update_loginName').val(row.loginName);
				$('#update_telphone').val(row.telphone);
				

				
			}
		}
    });
	
	
	
	
});	



// 得到查询参数
function queryParams() {
	var data = {
		businessAcc : $('#businessAcc').val(),
		userAcc : $('#userAcc').val()
	};
	console.log(data)
	return data;
}


// 自启动
$(function() {
	getData();
});

// 分页表格取得数据
function getData() {
	// 初始化表格
	$('#business_table').datagrid({
		url : 'business/showPage',
		type : 'get',
		queryParams : queryParams(),
		// 格式化每个字段的显示
		columns : [ [ {
			field : 'user',
			title : '账务帐号',
			width : 120,
			align : 'center',
			formatter : function(value, row, rec) {
				return value.userAcc;
			}
				
		},

		{
			field : 'cost',
			title : '资费类型',
			width : 120,
			align : 'center',
			formatter : function(value, row, rec) {
				return value.costName;
			}
		},

		{
			field : 'server',
			title : '服务器',
			width : 120,
			align : 'center',
			formatter : function(value, row, rec) {
				return value.serverIp;
			}
				
		},
		
		{
			field : 'businessAcc',
			title : '业务帐号',
			width : 120,
			align : 'center',
		},
		
		{
			field : 'businessPwd',
			title : '密码',
			width : 120,
			align : 'center',
		},
		
		{
			field : 'businessState',
			title : '状态',
			width : 80,
			align : 'center',
			formatter : function(value, row, index) {
				if (value == 0) {
					return '暂停';
				} else {
					return '开通';
				}
			}
		},
		
		{
			field : 'businessCostNext',
			title : '下月资费',
			width : 200,
			align : 'center',
			formatter : function(value, row, index) {
				return value.costName;
			}
		},

		] ]

	});

}
