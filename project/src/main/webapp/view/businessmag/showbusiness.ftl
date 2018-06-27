
  
	<script type="text/javascript" src="static/js/businessmag.js"></script>
	
<br/><br/>
<div style="width: 1000px;margin-left: 100px;" id='show_div' class="row">
     <div class="row" id="row_div">
         <div class="col-md-4">
             <label for="userAcc">账务账号&nbsp;&nbsp;&nbsp;</label><input type="text" name="userAcc" id="userAcc"/>
         </div>
         <div class="col-md-4">
             <label for="businessAcc">业务账号&nbsp;&nbsp;&nbsp;</label><input type="text" name="businessAcc" id="businessAcc"/>
         </div>
         <div class="col-md-4">
             <button class="easyui-linkbutton" data-options="iconCls:'icon-search'" id="queryBusiness">查询</button>
         </div>
         </br></br></br>
         <div class="col-md-2">
             <a href="view/businessmag/addbusiness.ftl" class="easyui-linkbutton" data-options="iconCls:'icon-mini-add'">添加账号</a>
         </div>
         
         <div class="col-md-2">
             <button class="easyui-linkbutton" data-options="iconCls:'icon-lock'">暂停</button>
         </div>
         <div class="col-md-2">
             <button class="easyui-linkbutton" data-options="iconCls:'icon-reload'">恢复</button>
         </div>
         <div class="col-md-2">
             <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" id="updateBusiness">修改</a>
         </div>
         <div class="col-md-2">
             <button class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" id="deleteBusiness">删除</button>
         </div>

         <div class="col-md-12">
             <br/>
             <table id="business_table" title="业务详情" style="width:900px;height:400px" data-options="
				rownumbers:true,
				singleSelect:true,
				autoRowHeight:false,
				pagination:true,
				method:'get',
				pageSize:10">
                 <thead>
                 <tr>
                     <th field="user" width="120" align="center">账务帐号</th>
                     <th field="cost" width="120" align="center">资费类型</th>
                     <th field="server" width="120" align="center">服务器</th>
                     <th field="businessAcc" width="120" align="center">业务帐号</th>
                     <th field="businessPwd" width="120" align="center">密码</th>
                     <th field="businessState" width="80" align="center">状态</th>
                     <th field="businessCostNext" width="200" align="center">下月资费</th>
                 </tr>
                 </thead>
             </table>
         </div>
     </div>
</div>

