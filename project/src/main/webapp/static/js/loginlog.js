
// 得到查询参数
function queryParams() {
	var data = {
		manager : $('#manager').val(),
		type : $('#type').val(),
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
	$('#dg2').datagrid({
		url : 'loginlog/getLoginLogPager',
		queryParams : queryParams(),
		// 格式化每个字段的显示
		columns : [ [ {
			field : 'managerName',
			title : '管理员',
			width : 80,
			align : 'center'
		},

		{
			field : 'loginLogType',
			title : '操作类型',
			width : 100,
			align : 'center',
			formatter : function(value, row, index) {
				if (value == 0) {
					return '登录';
				} else {
					return '退出';
				}
			}
		},

		{
			field : 'loginLogTime',
			title : '操作时间',
			width : 80,
			align : 'center',
			formatter : function(value, row, index) {
				return formatDatebox(value)
			}

		},

		{
			field : 'loginLogIP',
			title : '操作地IP',
			width : 80,
			align : 'center'
		},

		] ]

	});

}
