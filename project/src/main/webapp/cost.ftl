<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>资费管理主页</title>
    <link rel="stylesheet" type="text/css" href="static/easyui/themes/default/easyui.css?">
    <link rel="stylesheet" type="text/css" href="static/easyui/themes/icon.css">
    <script type="text/javascript" src="static/js/jquery-3.3.1.min.js" charset="utf-8"></script>
    <script type="text/javascript" src="static/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="static/js/test.page.js"></script>
    <script type="text/javascript" src="static/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="static/js/jquery.json-2.4.js"></script>
</head>
<body>
<!--主体表格-->
<div data-options="region:'center'"
     style="padding: 5px; background: #eee;width: 100%;">
    <table id="dg" title="资费列表" style="width:100%;height:500px; " data-options="
				rownumbers:false,
				singleSelect:true,
				fitColumns:true,
				autoRowHeight:false,
				pagination:true,
				toolbar:'#tb',
				pageList:[10],
				pageSize:10">
        <thead>
        <tr>
            <th field="inv" width="110" align="right">资费名</th>
            <th field="date" width="120" align="right">资费类型</th>
            <th field="name" width="100" align="right">基本时长</th>
            <th field="amount" width="100" align="right">基本费用</th>
            <th field="price" width="100" align="right">单位费用</th>
            <th field="cost" width="120" align="right">开通时间</th>
            <th field="note" width="130" align="right">资费说明</th>
        </tr>
        </thead>
    </table>
</div>

<!--表格中五个操作按钮-->
<div id="tb">
    <a id="saveCost" href="javascript:void(0)"
       class="easyui-linkbutton"
       data-options="iconCls:'icon-add',plain:true">新增资费</a>&nbsp;&nbsp;
    <a id="updateCost" href="javascript:void(0)"
       class="easyui-linkbutton"
       data-options="iconCls:'icon-edit',plain:true">修改资费</a>&nbsp;&nbsp;
    <a id="deleteCost" href="javascript:void(0)"
       class="easyui-linkbutton"
       data-options="iconCls:'icon-cancel',plain:true">删除资费</a>&nbsp;&nbsp;
    <a id="openCost" href="javascript:void(0)"
       class="easyui-linkbutton"
       data-options="iconCls:'icon-ok',plain:true">开通资费</a>&nbsp;&nbsp;
    <a id="closeCost" href="javascript:void(0)"
       class="easyui-linkbutton"
       data-options="iconCls:'icon-clear',plain:true">暂停使用</a>
</div>

<!--修改页面-->
<div id="update_dialog" class="easyui-dialog" title="修改资费" style="width:500px;height:350px;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,buttons:'#update_dialog_tb',closed:true">
    <form id="update_cost_form" method="post">
        资费名：<input class="easyui-validatebox" data-options="required:true" id="update_costName" name="costName" /><br/><br/>
        资费类型：<select style="width: 100px" data-options="required:false;" id="update_costType" name="costType">
                    <option value="1" selected>包月</option>
                    <option value="2">计时</option>
                    <option value="3">套餐</option>
                 </select><br/><br/>
        基本时长：<input class="easyui-validatebox" data-options="required:false" id="update_costTime" name="costTime" /><br/><br/>
        基本费用：<input class="easyui-validatebox" id="update_costBase" name="costBase" data-options="required:false"/><br/><br/>
        单位费用：<input class="easyui-validatebox" data-options="required:false" id="update_costUnit" name="costUnit" /><br/><br/>
        资费说明：<input class="easyui-validatebox" data-options="required:true" id="update_costExplain" name="costExplain" /><br/><br/>
    </form>
</div>
<!--修改页面里的两个按钮-->
<div id="update_dialog_tb" style="text-align: center;">
    <a id="update_form_info" href="javascript:void(0)" class="easyui-linkbutton"
       data-options="iconCls:'icon-save',plain:true">保存</a>
    <a
            href="javascript:$('#update_dialog').dialog('close')"
            class="easyui-linkbutton"
            data-options="iconCls:'icon-no',plain:true">取消</a>
</div>

<!--添加页面-->
<div id="save_dialog" class="easyui-dialog" title="添加资费" style="width:500px;height:350px;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,buttons:'#save_dialog_tb',closed:true">
    <form id="save_cost_form" method="post">
        资费名：<input class="easyui-validatebox" data-options="required:true" id="save_costName" name="costName" /><br/><br/>
        资费类型：<select style="width:100px;" data-options="required:false;" id="save_costType" name="costType">
                    <option value="1" selected>包月</option>
                    <option value="2">计时</option>
                    <option value="3">套餐</option>
                </select><br/><br/>
        基本时长：<input class="easyui-validatebox" data-options="required:false" id="save_costTime" name="costTime" /><br/><br/>
        基本费用：<input class="easyui-validatebox" id="save_costBase" name="costBase" data-options="required:false"/><br/><br/>
        单位费用：<input class="easyui-validatebox" data-options="required:false" id="save_costUnit" name="costUnit" /><br/><br/>
        资费说明：<input class="easyui-validatebox" data-options="required:true" id="save_costExplain" name="costExplain" /><br/><br/>
    </form>
</div>
<!--添加页面里的两个按钮-->
<div id="save_dialog_tb" style="text-align: center;">
    <a id="save_form_info" href="javascript:void(0)" class="easyui-linkbutton"
       data-options="iconCls:'icon-save',plain:true">保存</a>
    <a
            href="javascript:$('#save_dialog').dialog('close')"
            class="easyui-linkbutton"
            data-options="iconCls:'icon-no',plain:true">取消</a>
</div>

<!--删除页面-->
<div id="delete_dialog" class="easyui-dialog" title="删除资费" style="width:350px;height:200px;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,buttons:'#delete_dialog_tb',closed:true">
    <span style="font-size:20px;">确定要删除此条数据吗？</span>
</div>
<!--删除页面里的两个按钮-->
<div id="delete_dialog_tb" style="text-align: center;">
    <a id="delete_form_info" href="javascript:void(0)" class="easyui-linkbutton"
       data-options="iconCls:'icon-save',plain:true">确定</a>
    <a
            href="javascript:$('#delete_dialog').dialog('close')"
            class="easyui-linkbutton"
            data-options="iconCls:'icon-no',plain:true">取消</a>
</div>

<!--开通页面-->
<div id="openCost_dialog" class="easyui-dialog" title="开通资费" style="width:350px;height:200px;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,buttons:'#openCost_dialog_tb',closed:true">
    <span style="font-size:20px;">确定开通此资费？</span>
</div>
<!--开通页面里的两个按钮-->
<div id="openCost_dialog_tb" style="text-align: center;">
    <a id="openCost_form_info" href="javascript:void(0)" class="easyui-linkbutton"
       data-options="iconCls:'icon-save',plain:true">确定</a>
    <a
            href="javascript:$('#openCost_dialog').dialog('close')"
            class="easyui-linkbutton"
            data-options="iconCls:'icon-no',plain:true">取消</a>
</div>

<!--暂停页面-->
<div id="closeCost_dialog" class="easyui-dialog" title="开通资费" style="width:350px;height:200px;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,buttons:'#closeCost_dialog_tb',closed:true">
    <span style="font-size:20px;">确定暂停此资费？</span>
</div>
<!--暂停页面里的两个按钮-->
<div id="closeCost_dialog_tb" style="text-align: center;">
    <a id="closeCost_form_info" href="javascript:void(0)" class="easyui-linkbutton"
       data-options="iconCls:'icon-save',plain:true">确定</a>
    <a
            href="javascript:$('#closeCost_dialog').dialog('close')"
            class="easyui-linkbutton"
            data-options="iconCls:'icon-no',plain:true">取消</a>
</div>


<script>

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
</script>
</body>
</html>