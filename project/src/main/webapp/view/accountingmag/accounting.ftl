<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>账务查询</title>
</head>
<base href="/project/">
<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" href="static/bootstrap/css/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="static/bootstrap/css/project.css"/>
<link rel="stylesheet" type="text/css" href="static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="static/easyui/themes/icon.css">
<script src="static/js/jquery-3.3.1.min.js"></script>
<script src="static/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="static/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="static/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="static/bootstrap/js/DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="static/js/accounting.js"></script>

<body>
<div style="margin:20px 0;"></div>
<!-- 查询条件 -->
<div class="row">
    <div class="col-md-5 col-md-offset-3">
        <div class="easyui-panel" title="账务查询" >
            <div>
                <form id="ff" class="easyui-form" method="post" data-options="novalidate:true">
                    <br/>
                    <div class="row">
                        <div class="col-md-8 col-md-offset-1">
                            <label for="acc">账务账号:</label><input type="text" id="acc" name="accounting" data-options="required:true">
                        </div>
                    </div>
                    <br/>
                    <div class="row">
                        <div class="col-md-2 col-md-offset-1">
                            <input id="find1" type="radio" name="findType" checked="checked" value="year"><label for="find1">按年查询 </label>
                        </div>
                        <div class="col-md-2">
                            <input id="find2" type="radio" name="findType" value="month"><label for="find2">按月查询</label>
                        </div>
                        <div class="col-md-5">
                            <div id="chooseYear">
                                <label for="year">年份：</label>
                                <input type="text" id="year" onclick="WdatePicker({skin:'whyGreen',dateFmt:'yyyy年'})" class="Wdate"/>
                            </div>
                            <div id="chooseMonth">
                                <label for="month">月份：</label>
                                <input type="text" id="month" onclick="WdatePicker({skin:'whyGreen',dateFmt:'yyyy年MM月'})" class="Wdate"/>
                            </div>
                        </div>
                    </div>
                </form>
                <br/>
                <div class="row">
                    <div class="col-md-2 col-md-offset-2">
                        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">查询</a>
                    </div>
                    <div class="col-md-2 col-md-offset-1">
                        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<br/><br/>
<!--分页数据-->

<div class="row">
    <div class="col-md-6 col-md-offset-3">
        <div style="margin:20px 0;"></div>
        <table id="dg" title="账务帐号为acc使用记录" style="width:700px;height:250px"
               data-options="rownumbers:true,singleSelect:true,fitColumns:true,pagination:true,url:'datagrid_data1.json',method:'get'">
            <thead>
            <tr>
                <th data-options="field:'itemid',width:80,align:'center'">业务账号</th>
                <th data-options="field:'productid',width:100,align:'center'">服务器IP</th>
                <th data-options="field:'listprice',width:80,align:'center'">时长</th>
                <th data-options="field:'unitcost',width:80,align:'center'">日期</th>
            </tr>
            </thead>
        </table>

    </div>
</div>


</body>
</html>