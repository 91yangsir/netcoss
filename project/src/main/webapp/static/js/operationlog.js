
// 得到查询参数
function queryParams() {
	var data = {
		manager : $('#manager').val(),
		type : $('#type').combobox('getValue'),
		model : $('#model').combobox('getValue'),
		startTime : $('#startTime').datebox("getValue"),
		endTime : $('#endTime').datebox("getValue")
	};
	console.log(data)
	return data;
}

//查询和重置按钮
function submitForm() {
	getData();
}

function clearForm() {
	$('#ff').form('reset');
}

// 自启动
$(function() {
	getData();
});

// 取得数据
function getData() {
	// 初始化表格
	$('#dg').datagrid({
		url : 'operationlog/getOperationLogPager',
		queryParams : queryParams(),
		// 格式化每个字段的显示
		columns : [ [ {
			field : 'managerName',
			title : '管理员',
			width : 50,
			align : 'center'
		},

		{
			field : 'operationLogModel',
			title : '操作模块',
			width : 50,
			align : 'center',
			formatter : function(value, row, index) {
				if (value == 1) {
					return '日志管理';
				}else if(value == 2) {
					return '用户管理';
				}else if(value == 3) {
					return '资费管理';
				}else if(value == 4) {
					return '权限管理';
				}else if(value == 5) {
					return '账单管理';
				}else if(value == 6) {
					return '账务查询管理';
				}else if(value == 7) {
					return '业务帐号管理';
				} else{
					return '管理员管理';
				}
			}
		},
		
		{
			field : 'operationLogType',
			title : '操作类型',
			width : 50,
			align : 'center',
			formatter : function(value, row, index) {
				if (value == 0) {
					return '新增';
				} else if(value == 1) {
					return '修改';
				} else{
					return '删除';
				}
			}
		},

		{
			field : 'operationLogData',
			title : '操作数据',
			width : 100,
			align : 'center'
		},
		
		{
			field : 'operationLogTime',
			title : '操作时间',
			width : 70,
			align : 'center',
			formatter : function(value, row, index) {
				return formatDatebox(value)
			}

		}

		] ]

	});

}
