<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
</head>
<script src="/project/static/js/jquery-3.3.1.min.js"></script>
<script src="/project/static/easyui/jquery.easyui.min.js"></script>
<link rel="stylesheet" href="/project/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" href="/project/static/easyui/themes/icon.css">
<body>

<!-- Layout布局 -->
<div id="layoutID"  class="easyui-layout" data-options="fit:true">

    <!-- 北 -->
    <div data-options="region:'north',border:true,iconCls:'icon-remove',collapsible:true" style="height:80px;text-align: center;background-color:#b3b3b3">
        <span style="font-size:30px;line-height: 78px">电信营运系统</span>
    </div>

    <!-- 南 -->
    <div data-options="region:'south'" style="height:40px;text-align: center">
        <span style="font-size:10px;line-height: 40px">2018 &copy; System Develop by J154 Forth Group. </span>
    </div>

    <!-- 西 -->
    <div data-options="region:'west'" style="width:200px;">
        <!-- Accordion分类,左侧菜单为可伸缩面板 -->
        <div
                id="accordionID"
                class="easyui-accordion"
                data-options="fit:true,border:true,
                selected:-1"
                style="width:300px;
                height:400px;">
            <!--显示的菜单中必须要有title-->
            <div title="前台用户系统" data-options="iconCls:'icon-tip'" style="padding:10px;">
                <a
                        id="btn_add"
                        href="#"
                        class="easyui-linkbutton"
                        data-options="">用户自助服务系统</a>
            </div>
            <div title="前台营运系统" data-options="iconCls:'icon-tip'" style="padding:10px;">
                <ul id="tree" class="easyui-tree" data-options="lines:true">
                    <li>
                        <span>用户管理系统</span>
                        <ul>
                            <li>
                                <span>账务账号管理系统</span>
                            </li>
                            <li>
                                <span>业务账号管理系统</span>
                            </li>
                        </ul>
                    </li>
                    <li><span>管理员管理系统</span></li>
                    <li><span>资费管理系统</span></li>
                    <li><span>账单查询系统</span></li>
                    <li><span>账务查询系统</span></li>
                    <li>
                        <span>账务查询系统</span>
                        <ul>
                            <li><span>角色管理</span></li>
                            <li><span>权限管理</span></li>
                        </ul>
                    </li>
                    <li>
                        <span>前台日志系统</span>
                        <ul>
                            <li><span>登录服务日志</span></li>
                            <li><span>操作服务日志</span></li>
                        </ul>
                    </li>
                    <li>
                        <span>报表查询系统</span>
                        <ul>
                            <li><span>账单账务报表</span></li>
                            <li><span>业务账务报表</span></li>
                        </ul>
                    </li>
                </ul>
            </div>

        </div>

    </div>

    <!-- 中 -->
    <div data-options="region:'center'" style="padding:5px;background:#eee;">
        <!-- Tabs选项卡 -->
        <div
                id="tabsID"
                class="easyui-tabs"
                style="width:500px;height:250px;"
                data-options="plain:true,border:false,selected:-1,fit:true">
        </div>
    </div>

</div>












<script type="text/javascript">
    //定位4个按钮
    $("a").click(function(){
        //获取你所单击的按钮的标题
        var title = $(this).text();
        //去空格
        title = $.trim(title);
        //如果title变量是"增加部门"
        if("用户自助服务系统" == title){
            //查看该选项卡是否已经打开
            var flag = $("#tabsID").tabs("exists",title);
            //如果未打开
            if(!flag){
                //打开选项卡
                $("#tabsID").tabs("add",{
                    "title" : title,
                    "closable" : true,
                    "content" : "文本",
                    "iconCls" : "icon-reload"
                });
            }
        }
    });
    $(function(){
        //收起所有的选项
        $("#tree").tree("collapseAll");
    });
    $("#tree").tree({
        onClick : function(node){
            //获取点击树节点的文本
            var title = node.text;
            //去空格
            title = $.trim(title);
            //判断是否为子叶点，如果是的话弹出选项卡
            if($(this).tree('isLeaf',node.target)){
                //产生tab选项卡
                var flag = $("#tabsID").tabs("exists",title);
                //如果没有打开的话
                if(!flag){
                    //打开选项卡
                    $("#tabsID").tabs("add",{
                        "title" : title,
                        "closable" : true,
                      	"content" : "文本",
                        "iconCls" : "icon-search"
                    });
                }

            }


        }
    });

</script>


</body>
</html>