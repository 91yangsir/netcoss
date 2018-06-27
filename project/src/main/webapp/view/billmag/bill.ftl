
	<div id="window1"></div>
	<br>
	<br>
	<!--分页数据-->
	<div style="margin-left: 100px;">
		<table id="dg" style="width: 600px;"></table>
	</div>
	<!--查询表单-->

	<div style="margin-left: 100px; margin-top: 20px;">
		<div class="easyui-panel" title="角色管理" style="width: 600px;">
			<form id="ff" method="post">
				<br> <br> 身份证号: <input
					class="easyui-textbox" type="text" id="idCard" name="idCard">
				<br> <br> 账务账号: <input class="easyui-textbox" type="text"
					id="userAcc" name="userAcc"> <br> <br> 年份: <input
					class="easyui-textbox" type="text" id="useYear" name="useYear">
				<br> <br> 月份: <input class="easyui-textbox" type="text"
					id="useMonth" name="useMonth"> <br>

			</form>
			<button style="margin-left: 50px; width: 100px; margin-top: 15px;"
				id="check">查询</button>
		</div>
	</div>

<script type="text/javascript">
	var billId = 0;
	var month = 0;

	function queryParams() {
		var data = {
			userAcc : $('#userAcc').val(),
			idCard : $('#idCard').val(),
			useMonth : $('#useMonth').val(),
			useYear : $('#useYear').val()
		};
		return data;
	}

	function getData() {
		$("#dg").datagrid({
			url : '/project/bill/check',
			queryParams : queryParams(),
			columns : [ [ {
				field : 'account',
				title : '账务账号',
				width : 80,
				align : 'center'

			}, {
				field : 'idCard',
				title : '身份证号',
				width : 160,
				align : 'center'
			}, {
				field : 'year',
				title : '年份',
				width : 50,
				align : 'center'
			}, {
				field : 'month',
				title : '月份',
				width : 50
			}, {
				field : 'costMoney',
				title : '账单金额',
				width : 50,
				align : 'center'
			}, {
				field : 'payType',
				title : '支付方式',
				width : 50,
				align : 'center'
			}, {
				field : 'payState',
				title : '支付状态',
				width : 60,
				align : 'center'
			}, ] ],
			fitColumns : true,
			singleSelect : true,
			pagination : true,
			pageNumber : 1,
			pageSize : 5,
			pageList : [ 5, 10 ],
			fit : false,
			rownumbers : true,
			onDblClickRow : function() {
				var rowInfo = $("#dg").datagrid('getSelected');
				billId = rowInfo.id;
				month = rowInfo.month;
				$("#window1").window({
					title : "业务账号账单详情",
					width : 615,
					height : 400,
					left : 400,
					top : 100,
					minimizable : false,
					maximizable : false,
					collapsible : false,
					closable : true,
					draggable : true,
					resizable : false,
					href : "/project/view/billmag/data.ftl"
				});

			}
		});
	}

	$(function() {
		getData();
	})

	$("#check").click(function() {
		getData();
	})
</script>
