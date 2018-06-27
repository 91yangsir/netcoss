<div style="margin-left: 100px;margin-top: 20px;">
<ul id="tt"></ul> 
<div id="window1"></div>
<br><br>
<button id="addBtn">增加菜单</button>&nbsp;&nbsp;&nbsp;<button id="updateBtn">修改菜单</button>
&nbsp;&nbsp;&nbsp;&nbsp;<button id="deleBtn">删除菜单</button>
</div>

<script type="text/javascript">

	var id=0;
	var menuName="";
$('#tt').tree({   
    url:'/project/menu/get' ,
    checkbox:false,
    onlyLeafCheck:true,
    	lines:true,
    	onClick: function(node){
	    	menuName=node.text; 
	    	id=node.id;}
});

	
$("#addBtn").click(function(){
	var selected=$('#tt').tree('getSelected');
	if(selected==null){
		$.messager.alert("警告框","请选择一个节点","warning");
	}else{
		console.log(id);
		console.log(menuName);
			//打开窗口1
			$("#window1").window({
				title : "增加菜单",
				width : 500,
				height : 400,
				left : 400,
				top : 100,
				minimizable : false,
				maximizable : false,
				collapsible : false,
				closable : true,
				draggable : true,
				resizable : false,
				href : "/project/view/powermag/addMenu.ftl"
			});
		
	}
	
	
})
$("#updateBtn").click(function(){
	var selected=$('#tt').tree('getSelected');
	if(selected==null){
		$.messager.alert("警告框","请选择一个节点","warning");
	}else{
		$.messager.prompt("输入框","请输入新名称",function(menuName){
			$.post('/project/menu/update',{
				"id":id,
				"menuName":menuName
				},function(info){
				
			
			},'json')
			
			$.messager.alert("提示框","更改成功","warning",function(){
				window.location.reload(true);
			});
		})
		
		
		
		}
	
})

$("#deleBtn").click(function(){
	var selected=$('#tt').tree('getSelected');
	if(selected==null){
		$.messager.alert("警告框","请选择一个节点","warning");
	}else{
		$.messager.alert("警告框","确定要删除吗？","warning",function(){
			
		});
		$.post('/project/menu/dele',{"id":id},function(info){
			
		},'json')
		$.messager.alert("提示框","删除成功","warning",function(){
			window.location.reload(true);
		});
		
	}
	
	
	
	
})

</script>
