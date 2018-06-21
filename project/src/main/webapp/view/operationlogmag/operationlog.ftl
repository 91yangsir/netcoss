<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>操作日志查询</title>
</head>
<base href="/project/">
<link rel="stylesheet" href="static/bootstrap/css/bootstrap.min.css"/>
<link rel="stylesheet" href="static/bootstrap/css/bootstrap-theme.min.css"/>
<link rel="stylesheet" href="static/bootstrap/css/project.css"/>
<link rel="stylesheet" type="text/css" href="static/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="static/easyui/themes/icon.css">
<script src="static/bootstrap/js/jquery-3.2.0.min.js"></script>
<script src="static/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="static/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="static/easyui/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="static/bootstrap/js/DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="static/js/operationlog.js"></script>
<script type="text/javascript" src="static/js/dateconvert.js"></script>

<body>

<!--查询表单-->

<div class="row">
    <div class="col-md-4 col-md-offset-4">
        <div style="margin:20px 0;"></div>
        <div class="easyui-panel" title="操作日志查询" style="width:400px">
            <div style="padding:10px 60px 20px 60px">
                <form id="ff" method="post">
                    <table cellpadding="5">
                        <tr>
                            <td>管理员:</td>
                            <td><input class="easyui-textbox" type="text" id="manager" name="manager"></td>
                        </tr>
                        <tr>
                            <td>操作模块:</td>
                            <td>
                            	<select class="easyui-combobox" name="model" id="model" style="width:100px" data-options="panelHeight:76">
								    <option value="0" selected>所有</option>
								    <option value="1">日志管理</option>
								    <option value="2">用户管理</option>
								    <option value="3">资费管理</option>
								    <option value="4">权限管理</option>
								    <option value="5">账单管理</option>
								    <option value="6">账务查询管理</option>
								    <option value="7">业务帐号管理</option>
								    <option value="8">管理员管理</option>
								</select>
                        </tr>
                        <tr>
                            <td>操作类型:</td>
                            <td>
                            	<select class="easyui-combobox" name="type" id="type" style="width:100px" data-options="panelHeight:76">
								    <option value="-1" selected>所有</option>
								    <option value="0">新增</option>
								    <option value="1">修改</option>
								    <option value="2">删除</option>
								</select>
							</td>
                        </tr>
                        <tr>
                            <td>起始时间:</td>
                            <td><input class="easyui-datebox" type="text" id="startTime" name="startTime" data-options="sharedCalendar:'#cc'"></td>
                        </tr>
                        <tr>
                            <td>结束时间:</td>
                            <td><input class="easyui-datebox" type="text" id="endTime" name="endTime" data-options="sharedCalendar:'#cc'"></td>
                        </tr>
                        <div id="cc" class="easyui-calendar"></div>
                    </table>
                </form>
                <div style="text-align:center;padding:5px">
                    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">查询</a>
                    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
                </div>
            </div>
        </div>
    </div>
</div>

<!--分页数据-->

<div class="row">
    <div class="col-md-6 col-md-offset-3">
        <div style="margin:20px 0;"></div>
        <table id="dg" title="登陆日志" style="width:700px;height:250px"
                data-options="rownumbers:true,singleSelect:true,fitColumns:true,pagination:true,method:'get'">
            <thead>
            <tr>
                <th data-options="field:'manager',width:50,align:'center'">管理员</th>
                <th data-options="field:'type',width:50,align:'center'">操作类型</th>
                <th data-options="field:'data',width:100,align:'center'">操作数据</th>
                <th data-options="field:'date',width:70,align:'center'">操作时间</th>
            </tr>
            </thead>
        </table>

    </div>
</div>
</body>
</html>
