<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>账单报表2</title>
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
<script src="/project/static/js/report2.js"></script>
<script src="/project/static/js/dateconvert.js"></script>
<script src="/project/static/js/echarts.js"></script>


<body>

<div style="margin:20px 0;"></div>
<!-- 查询条件 -->
<div class="row">
    <div class="col-md-5 col-md-offset-3">
        <div class="easyui-panel" title="账单报表查询" >
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
                        <div class="col-md-5 col-md-offset-1">
                            <div id="chooseYear">
                                <label for="year">年份：</label>
                                <input type="text" id="year" readonly onclick="WdatePicker({skin:'whyGreen',dateFmt:'yyyy'})" class="Wdate"/>
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


<!--定义页面图表容器-->
    <!-- 必须制定容器的大小（height、width） -->
    <div id="main"
        style="height: 400px; border: 1px solid #ccc; padding: 10px;"></div>


</body>
</html>