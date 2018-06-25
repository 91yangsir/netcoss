<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>账单信息</title>
    <link rel="stylesheet" type="text/css" href="/project/static/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/project/static/easyui/themes/icon.css">
    <script type="text/javascript" src="/project/static/js/jquery-3.3.1.min.js" charset="utf-8"></script>
    <script type="text/javascript" src="/project/static/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/project/static/js/userlist.page.js"></script>
    <script type="text/javascript" src="/project/static/easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="/project/static/js/jquery.json-2.4.js"></script>
    <script type="text/javascript" src="/project/static/js/userinfo.page.js"></script>
</head>
<body>
<div data-options="region:'center'"
     style="padding: 5px; background: #eee;width: 100%;">

    <table id="tt" class="easyui-datagrid" style="width:950px;height:450px"
           url="datagrid24_getdata.php" toolbar="#tb"
           title="账单信息" iconCls="icon-save"
           rownumbers="true" pagination="true">
        <thead>
        <tr>
            <th field="itemid" width="150">年份</th>
            <th field="productid" width="150">月份</th>
            <th field="listprice" width="150" align="right">金额</th>
            <th field="unitcost" width="230" align="right">支付方式</th>
            <th field="attr1" width="250">状态</th>

        </tr>
        </thead>
        <tbody>
        <tr>
            <td>2014</td>
            <td>6</td>
            <td>5000</td>
            <td>支付宝</td>
            <td>已付</td>
        </tr>
        </tbody>
    </table>
</div>
<div id="tb" style="padding:3px">
    <span>月份:</span>
    <input id="time" style="line-height:26px;border:1px solid #ccc">

    <a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch()">查询</a>
</div>




</body>
</html>