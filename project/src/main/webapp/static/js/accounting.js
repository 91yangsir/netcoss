//加载时隐藏月份搜索
$(function() {
	$('#chooseMonth').css({
		"display" : "none"
	})
	// 初始化表格
	$('#dg').datagrid({
		title : "使用记录",
		// 格式化每个字段的显示
		columns : [ [ {
			field : 'businessAcc',
			title : '业务账号',
			width : 70,
			align : 'center'
		},

		{
			field : 'yearTime',
			title : '年使用时长',
			width : 70,
			align : 'center',
		},

		{
			field : 'year',
			title : '年份',
			width : 50,
			align : 'center',
		},

		{
			field : 'serverIP',
			title : '服务器IP',
			width : 70,
			align : 'center'
		}

		] ]

	})
})

// 点击年份换成年份搜索,点击月份换成月份搜索
$(document).ready(function() {
	$('input:radio[name="findType"]').change(function() {
		if (this.value == 'month') {
			$('#chooseYear').css({
				"display" : "none"
			})
			$('#chooseMonth').css({
				"display" : "inline"
			})
		} else {
			$('#chooseMonth').css({
				"display" : "none"
			})
			$('#chooseYear').css({
				"display" : "inline"
			})
		}
	})
})

// 得到查询参数
function queryParams() {
	var data = {
		accounting : $('#acc').val(),
		year : $('#year').val(),
		month : $('#month').val(),
	};
	return data;
}

// 查询和重置按钮
function submitForm() {
	var val = $('input:radio[name="findType"]:checked').val();
	if (val == 'month') {
		getMonthData();
	} else {
		getYearData();
	}
}

function clearForm() {
	$('#ff').form('reset');
}

// 取得年使用数据
function getYearData() {

	// 初始化表格
	$('#dg').datagrid({
		url : '/project/accounting/getYearUsePager',
		queryParams : queryParams(),
		title : "账务帐号为：  " + $('#acc').val() + "  的年使用记录",
		onDblClickRow : function(rowIndex, rowData) {
			getMonthData(rowData.businessAcc, rowData.year)
		},
		// 格式化每个字段的显示
		columns : [ [ {
			field : 'businessAcc',
			title : '业务账号',
			width : 70,
			align : 'center'
		},

		{
			field : 'yearTime',
			title : '年使用时长',
			width : 70,
			align : 'center',
		},

		{
			field : 'year',
			title : '年份',
			width : 50,
			align : 'center',
		},

		{
			field : 'serverIP',
			title : '服务器IP',
			width : 70,
			align : 'center'
		}

		] ]

	});

}

// 直接取得月使用数据
function getMonthData() {

	// 初始化表格
	$('#dg').datagrid({
		url : '/project/accounting/getMonthUsePager',
		queryParams : queryParams(),
		title : "账务帐号为：  " + $('#acc').val() + "  的月使用记录",
		onDblClickRow : function(rowIndex, rowData) {
			getDayData(rowData.businessAcc, rowData.month);
		},
		// 格式化每个字段的显示
		columns : [ [ {
			field : 'businessAcc',
			title : '业务账号',
			width : 70,
			align : 'center'
		},

		{
			field : 'monthTime',
			title : '月使用时长',
			width : 70,
			align : 'center',
		},

		{
			field : 'month',
			title : '月份',
			width : 50,
			align : 'center',
		},

		{
			field : 'serverIP',
			title : '服务器IP',
			width : 70,
			align : 'center'
		}

		] ]

	});

}

// 在年使用记录的基础上取得月使用数据
function getMonthData(businessAcc, year) {
	// 显示年使用记录基础上的月使用记录窗口
	$('#win1').window('open');
	// 初始化表格
	$('#dg_month').datagrid(
			{
				url : '/project/accounting/getMonthUsePager',
				queryParams : data = {
					business : businessAcc,
					month : year
				},
				title : "账务帐号为：  " + $('#acc').val() + "  下业务账号为：  "
						+ businessAcc + "的月使用记录",
				onDblClickRow : function(rowIndex, rowData) {
					getDayData(rowData.businessAcc, rowData.month)
				},
				// 格式化每个字段的显示
				columns : [ [ {
					field : 'businessAcc',
					title : '业务账号',
					width : 70,
					align : 'center'
				},

				{
					field : 'monthTime',
					title : '月使用时长',
					width : 70,
					align : 'center',
				},

				{
					field : 'month',
					title : '月份',
					width : 50,
					align : 'center',
				},

				{
					field : 'serverIP',
					title : '服务器IP',
					width : 70,
					align : 'center'
				}

				] ]

			});

}

// 取得每日使用数据
function getDayData(businessAcc, month) {
	$('#win2').window('open');
	// 初始化表格
	$('#dg_day').datagrid(
			{
				url : '/project/accounting/getDayUsePager',
				queryParams : data = {
					business : businessAcc,
					day : month,
				},
				closed : false,
				title : "账务帐号为：  " + $('#acc').val() + "  下业务账号为：  "
						+ businessAcc + "的每日使用记录",
				// 格式化每个字段的显示
				columns : [ [ {
					field : 'dayTime',
					title : '每日使用时长',
					width : 70,
					align : 'center',
				},

				{
					field : 'day',
					title : '日期',
					width : 50,
					align : 'center',
				},

				{
					field : 'serverIP',
					title : '服务器IP',
					width : 70,
					align : 'center'
				}

				] ]

			});

}