	//查询和重置按钮
	function submitForm(){
		 $('#dg').datagrid({loadFilter:pagerFilter}).datagrid('loadData', getData());
    }
	
    function clearForm(){
        $('#ff').form('reset');
    }

    //ajax得到数据
    function getPager(){
    	var rows = [];
    	var params = {
				manager	:$('#manager').val(),
	        	type	:$('#type').val(),
	        	startTime	:$('#startTime').val(),
	        	endTime	:$('#endTime').val(),
	        	rows	:$('#dg').datagrid('options').pageSize,
	        	page	:$('#dg').datagrid('options').pageNumber
		};
        $.ajax({
        	   type: "GET",
        	   url: "loginlog/getLoginLogPager",
        	   data: params,
        	   dataType:"json",
        	   success: function(msg){
        		   for(var i=0; i<msg.datas.length; i++){
	       	            rows.push({
	       	            	managerName: msg.datas[i].managerName,
	       	                loginLogTime: msg.datas[i].loginLogTime,
	       	                loginLogType: msg.datas[i].loginLogType,
	       	                loginLogIP:  msg.datas[i].loginLogIP
	       	            });
        		   	}
        	   }
        });
        return rows;
    }
    
    //分页数据
    function getData(){
    	console.log(getPager())
    	
    	
//        return rows;
    }

    function pagerFilter(data){
        if (typeof data.length == 'number' && typeof data.splice == 'function'){	// is array
            data = {
                total: data.length,
                rows: data
            }
        }
        var dg = $(this);
        var opts = dg.datagrid('options');
        var pager = dg.datagrid('getPager');
        pager.pagination({
            onSelectPage:function(pageNum, pageSize){
                opts.pageNumber = pageNum;
                opts.pageSize = pageSize;
                pager.pagination('refresh',{
                    pageNumber:pageNum,
                    pageSize:pageSize
                });
                dg.datagrid('loadData',data);
            }
        });
        if (!data.originalRows){
            data.originalRows = (data.rows);
        }
        var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
        var end = start + parseInt(opts.pageSize);
        data.rows = (data.originalRows.slice(start, end));
        return data;
    }
    
    $(function(){
    	
        $('#dg').datagrid({loadFilter:pagerFilter}).datagrid('loadData', getData());
    });