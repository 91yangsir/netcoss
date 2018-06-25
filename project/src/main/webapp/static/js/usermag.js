$(function() {
	
	//查询
	$('#queryUser').bind('click', function(){   
		getData();
	    });

	// 删除
	$('#deleteUser').bind('click', function(){   
		
		var datas =  $('#user_table').datagrid('getSelections');  
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
				   url: "user/delete",
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
	$('#updateUser').bind('click', function(){   
		var row =  $('#user_table').datagrid('getSelected'); 
		
		if(!row){
			$.messager.show({
				title:'提示',
				msg:'请选择需要修改的数据！',
				timeout:5000,
				showType:'slide'
			});
		}else{
			
			var rows =  $('#user_table').datagrid('getSelections'); 
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
		userName : $('#userName').val(),
		userAcc : $('#userAcc').val()
	};
	console.log(data)
	return data;
}


// 自启动
$(function() {
	getData();
});

// 取得数据
function getData() {
	// 初始化表格
	$('#user_table').datagrid({
		url : 'user/showPage',
		type : 'get',
		queryParams : queryParams(),
		// 格式化每个字段的显示
		columns : [ [ {
			field : 'userName',
			title : '真实姓名',
			width : 80,
			align : 'center'
		},

		{
			field : 'userGender',
			title : '性别',
			width : 80,
			align : 'center',
			formatter : function(value, row, index) {
				if (value == 0) {
					return '女';
				} else if (value == 1){
					return '男';
				} else {
					return '其他';
				}
			}
		},

		{
			field : 'userAcc',
			title : '账务账号',
			width : 120,
			align : 'center',
		},

		{
			field : 'userTel',
			title : '联系电话',
			width : 120,
			align : 'center'
		},
		
		{
			field : 'userQQ',
			title : 'QQ',
			width : 120,
			align : 'center',
		},

		{
			field : 'userState',
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
			field : 'userAddress',
			title : '通信地址',
			width : 280,
			align : 'center'
		},

		] ]

	});

}
