/**
 * Created by Yangsir on 2018/6/19.

 */


/**
 * 添加用户
 * @returns
 */




 //得到查询参数
function queryParams() {
	var data = {
			managerAcc : $('#managerName').val(),
			managerTel : $('#managerTel').val(),
			roleName : $('#managerType').val()

	};
	console.log(data)
	return data;
}

//查询和重置按钮
function submitForm() {
	getData();
}

function clearForm() {
	$('#manager').form('reset');
}

// 自启动
$(function() {
	getData();

});

// 取得数据
function getData() {
	// 初始化表格
	$('#manager').datagrid({
		url : '/project/manager/page',
		queryParams : queryParams(),
		// 格式化每个字段的显示
		columns : [ [ {
			field : 'managerAcc',
			title : '管理员账户',
			width : 150,
			align : 'center'
		},

		{
			field : 'managerName',
			title : '管理员名称',
			width : 150,
			align : 'center'
			
		},
		{
			field : 'managerTel',
			title : '管理员电话',
			width : 150,
			align : 'center'
			
		}
		,
		{
			field : 'managerMail',
			title : '管理员邮件',
			width : 150,
			align : 'center'			
		}
		,

		{
			field : 'role',
			title : '管理员角色',
			width : 150,
			align : 'center',
			formatter : function(value){
				return value.roleName;
			}
				
		}

		] ]

	});

}
