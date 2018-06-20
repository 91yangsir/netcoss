 //加载时隐藏月份搜索
    $(function(){
        $('#chooseMonth').css({"display":"none"})
    })

    //点击年份换成年份搜索
    $('#find1').click(function(){
        $('#chooseMonth').css({"display":"none"})
        $('#chooseYear').css({"display":"inline"})
    })

    //点击月份换成月份搜索
    $('#find2').click(function(){
    	console,log(1111)
        $('#chooseYear').css({"display":"none"})
        $('#chooseMonth').css({"display":"inline"})
    })

    //提交查询
    function submitForm(){
        $('#ff').form('submit');
    }

    //重置输入
    function clearForm(){
        $('#ff').form('reset');
    }

    //分页数据
    function getData(){
        var rows = [];
        for(var i=1; i<=800; i++){
            var amount = Math.floor(Math.random()*1000);
            var price = Math.floor(Math.random()*1000);
            rows.push({
                inv: 'Inv No '+i,
                date: $.fn.datebox.defaults.formatter(new Date()),
                name: 'Name '+i,
                amount: amount,
                price: price,
                cost: amount*price,
                note: 'Note '+i
            });
        }
        return rows;
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


    $('#dg').datagrid({
        onDblClickCell: function(index,field,value){
            console.log(index)
            console.log(field)
            console.log(value)
            $(this).datagrid('beginEdit', index);
            var ed = $(this).datagrid('getEditor', {index:index,field:field});
            $(ed.target).focus();
        }
    });