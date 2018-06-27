

<div>
		<table id="dg2" style="width: 1000px;"></table>
	</div>

<script type="text/javascript">
Date.prototype.toLocaleString = function() {
    return this.getFullYear() + "/" + (this.getMonth() + 1) + "/" + this.getDate() + "/ " + this.getHours() + ":" + this.getMinutes() + ":" + this.getSeconds();
};
$("#dg2").datagrid({
	url : '/project/bill/get2?month='+month+"&acc="+businessAcc1,
	columns : [ [ {
		field : 'business',
		title : '业务账号',  
		width : 80,
		align : 'center'
	
	}, {
		field : 'loginTime',
		title : '登入时间',
		width : 100,
		align : 'center',
		formatter : function(value, row, index) {
			var unixTimestamp = new Date( value ) ;
			commonTime = unixTimestamp.toLocaleString();
			 return commonTime;
		}
	}, {
		field : 'outTime',
		title : '登出时间',
		width : 100,
		align : 'center',
		formatter : function(value, row, index) {
			var unixTimestamp = new Date( value ) ;
			commonTime = unixTimestamp.toLocaleString();
			 return commonTime;
		}
	},{
		field : 'useTime',
		title : '使用时长(分钟)',
		width : 50,
		formatter : function(value, row, index) {
			 return value/60;
		}
	},{
		field : 'totalUseTime',
		title : '使用总时长(分钟)',
		width : 70,
		align : 'center',
		formatter : function(value, row, index) {
			 return value/60;
		}	
	},{
		field : 'serverIp',
		title : '服务器IP',
		width : 50,
		align : 'center'
	},{
		field : 'onceMoney',
		title : '本次消费',
		width : 50,
		align : 'center'
	},{
		field : 'cost',
		title : '使用套餐',
		width : 50,
		align : 'center',
		formatter : function(value, row, index) {
			if (value == 1) {
				return '包月';
			} else if(value==2){
				return '计时';
			}else{
				return '套餐';
			}
		}
	},{
		field : 'serverText',
		title : '备注',
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
	rownumbers : true

});




</script>
