



<div id="window2"></div>
<div>
		<table id="dg6" style="width: 600px;"></table>
	</div>

<script type="text/javascript">
var businessAcc1=0;
$("#dg6").datagrid({
	url : '/project/bill/get1?id='+billId+'&month='+month,
	columns : [ [ {
		field : 'businessAcc',
		title : '账务账号',
		width : 80,
		align : 'center'
	
	}, {
		field : 'serverIP',
		title : '服务器信息',
		width : 160,
		align : 'center'
	}, {
		field : 'monthTime',
		title : '时长	',
		width : 50,
		align : 'center'
	},{
		field : 'month',
		title : '月份',
		width : 50
	},{
		field : 'monthMoney',
		title : '账单金额',
		width : 50,
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
	onDblClickRow:function(){
		var rowInfo1 = $("#dg6").datagrid('getSelected');
		businessAcc1=rowInfo1.businessAcc;
		$("#window2").window({
			title : "消费详情",
			width : 1000,
			height : 400,
			left : 200,
			top : 100,
			minimizable : false,
			maximizable : false,
			collapsible : false,
			closable : true,
			draggable : true,
			resizable : false,
			href : "/project/view/billmag/data1.ftl"
		});
		 
	 }
});




</script>
