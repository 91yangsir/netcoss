
	<script type="text/javascript" src="static/js/usermag.js"></script>
	

<br/><br/>
<div style="width: 1000px;margin-left: 200px" id="show_div" class="row">
     <div class="row" id="row_div">
         <div class="col-md-4">
             <label for="userName">真实姓名&nbsp;&nbsp;&nbsp;</label><input type="text" name="userName" id="userName"/>
         </div>
         <div class="col-md-4">
             <label for="userAcc">账务账号&nbsp;&nbsp;&nbsp;</label><input type="text" name="userAcc" id="userAcc"/>
         </div>
         <div class="col-md-4">
             <button class="easyui-linkbutton" data-options="iconCls:'icon-search'" id="queryUser">查询</button>
         </div>
         </br></br></br>
         <div class="col-md-2">
             <a href="view/usermag/adduser.ftl" class="easyui-linkbutton" data-options="iconCls:'icon-mini-add'">添加账号</a>
         </div>
         <div class="col-md-2">
             <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'">批量添加</a>
         </div>
         <div class="col-md-2">
             <button class="easyui-linkbutton" data-options="iconCls:'icon-lock'">暂停</button>
         </div>
         <div class="col-md-2">
             <button class="easyui-linkbutton" data-options="iconCls:'icon-reload'">恢复</button>
         </div>
         <div class="col-md-2">
         	<button class="easyui-linkbutton" data-options="iconCls:'icon-edit'" id="updateUser">修改</button>
         </div>
         <div class="col-md-2">
             <button class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" id="deleteUser">删除</button>
         </div>

         <div class="col-md-12">
             <br/>
             <table id="user_table" title="用户信息" style="width:950px;height:400px" data-options="
				rownumbers:true,
				singleSelect:true,
				autoRowHeight:false,
				pagination:true,
				method:'get',
				pageSize:10">
                 <thead>
                 <tr>
                     <th field="userName" width="80" align="center">真实姓名</th>
                     <th field="userGender" width="80" align="center">性别</th>
                     <th field="userAcc" width="120" align="center">账务账号</th>
                     <th field="userTel" width="120" align="center">联系电话</th>
                     <th field="userQQ" width="120" align="center">QQ</th>
                     <th field="userState" width="80" align="center">状态</th>
                     <th field="userAddress" width="280" align="center">通信地址</th>
                 </tr>
                 </thead>
             </table>
         </div>
     </div>
</div>
