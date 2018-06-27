
<script type="text/javascript" src="static/js/loginlog.js"></script>

<!--查询表单-->

<div class="row">
    <div class="col-md-4 col-md-offset-4">
        <div style="margin:20px 0;"></div>
        <div class="easyui-panel" title="登陆日志查询" style="width:400px">
            <div style="padding:10px 60px 20px 60px">
                <form id="ff" method="post">
                    <table cellpadding="5">
                        <tr>
                            <td>管理员:</td>
                            <td><input class="easyui-textbox" type="text" id="manager" name="manager"></td>
                        </tr>
                        <tr>
                            <td>操作类型:</td>
                            <td>
	                            <select class="easyui-combobox" name="type" id="type" style="width:100px" data-options="panelHeight:76">
								    <option value="-1" selected>所有</option>
								    <option value="0">登录</option>
								    <option value="1">退出</option>
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
                    <a href="javascript:void(0)" class="easyui-linkbutton" id="check" onclick="submitForm()">查询</a>
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
                <th data-options="field:'managerName',width:80,align:'center'">管理员</th>
                <th data-options="field:'loginLogType',width:100,align:'center'">操作类型</th>
                <th data-options="field:'loginLogTime',width:80,align:'center',formatter: formatDatebox">操作时间</th>
                <th data-options="field:'loginLogIP',width:80,align:'center'">操作地IP</th>
            </tr>
            </thead>
        </table>

    </div>
</div>
