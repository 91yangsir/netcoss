<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>账务查询</title>
</head>
<link rel="stylesheet" href="/project/static/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" href="/project/static/bootstrap/css/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="/project/static/bootstrap/css/project.css"/>
<link rel="stylesheet" href="/project/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" href="/project/static/easyui/themes/icon.css">
<script src="/project/static/bootstrap/js/jquery-3.2.0.min.js"></script>
<script src="/project/static/bootstrap/js/bootstrap.min.js"></script>
<script src="/project/static/easyui/jquery.easyui.min.js"></script>
<script src="/project/static/easyui/locale/easyui-lang-zh_CN.js"></script>
<script src="/project/static/bootstrap/js/DatePicker/WdatePicker.js"></script>
<script src="/project/static/js/accounting.js"></script>
<script src="/project/static/js/dateconvert.js"></script>

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
                                <input type="text" id="year" readonly onclick="WdatePicker({skin:'whyGreen',dateFmt:'yyyy'})" class="Wdate"/>
                            </div>
                            <div id="chooseMonth">
                                <label for="month">月份：</label>
                                <input type="text" id="month" readonly onclick="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM'})" class="Wdate"/>
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
        <table id="dg" title="使用记录" style="width:700px;height:250px"
               data-options="rownumbers:true,singleSelect:true,fitColumns:true,pagination:true,method:'get'">
        </table>

    </div>
</div>

<!-- 双击年使用情况显示的月使用记录窗口 -->
<div id="win1" class="easyui-window" title="月使用记录" data-options="iconCls:'icon-save',resizable:false,closed:true" style="width:850px;height:400px;">
	<div class="row">
	    <div class="col-md-10 col-md-offset-1">
	        <div style="margin:20px 0;"></div>
	        <table id="dg_month" title="使用记录" style="width:700px;height:250px"
	               data-options="rownumbers:true,singleSelect:true,fitColumns:true,pagination:true,method:'get'">
	        </table>
	    </div>
	</div>
</div>

<!-- 双击月使用情况显示的每日使用记录窗口 -->
<div id="win2" class="easyui-window" title="每日使用记录" data-options="iconCls:'icon-save',resizable:false,closed:true" style="width:850px;height:400px;">
	<div class="row">
	    <div class="col-md-10 col-md-offset-1">
	        <div style="margin:20px 0;"></div>
	        <table id="dg_day" title="使用记录" style="width:700px;height:250px"
	               data-options="rownumbers:true,singleSelect:true,fitColumns:true,pagination:true,method:'get'">
	        </table>
	    </div>
	</div>
</div>
</body>
</html>