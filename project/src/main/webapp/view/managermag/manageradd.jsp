<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


             <h1 style="color: #c9302c">添加用户信息</h1>
             <br/><br/>
             <form  id="fo1" action="/secondProject/addUser" method="post">
                 <div class="container-fluid">
                         <div class="row">
                         	<div class="col-md-4 col-md-offset-4"></div>
                         </div><br/><br/>
                     <div class="row">
                         <div class="col-md-4 col-md-offset-2"><span class="glyphicon glyphicon-user" style="padding-right: 0px ;font-size: 20px" >用户名</span></div>
                         <div class="col-md-4" style="padding-left: 0px;"><input type="text" name="name" id="name"/></div>
                         <div class="col-md-2 ">
                         <span class="glyphicon glyphicon-ok" id="nameRight" style="color: green"></span>
                         <span class="glyphicon glyphicon-remove" id="nameError" style="color: red;  font-size: 15px "  >姓名只能是字母、中文、数字2-10</span>
                         <span id="s1"></span>
                         </div>

                         </div>
                     <br/><br/><br/>
                     <div class="row">
                         <div class="col-md-4 col-md-offset-2"><span class="glyphicon glyphicon-lock" style="padding-right: 0px;font-size: 20px">密码</span></div>
                         <div class="col-md-4" style="padding-left: 0px"><input type="password" name="pwd" id="pwd"/></div>
                         <div class="col-md-2 "><span class="glyphicon glyphicon-ok" id="pwdRight" style="color: green"></span><span class="glyphicon glyphicon-remove" id="pwdError" style="color: red;  font-size: 15px "  >密码只能是字母、数字3-12</span></div>

                     </div>
                     <br/><br/><br/>
                     <div class="row">
                         <div class="col-md-4 col-md-offset-2"><span class="glyphicon glyphicon-lock" style="padding-right: 0px;font-size: 20px">确认密码</span></div>
                         <div class="col-md-4" style="padding-left: 0px"><input type="password" name="pwd1" id="pwd1"/></div>
                         <div class="col-md-2 "><span class="glyphicon glyphicon-ok" id="pwdRight1" style="color: green"></span><span class="glyphicon glyphicon-remove" id="pwdError1" style="color: red; font-size: 15px "  >密码必须保持一致</span></div>

                     </div>
                     <br/><br/><br/>
                     <div class="row">
                         <div class="col-md-4 col-md-offset-2"><span class="glyphicon glyphicon-usr" style="padding-right: 0px;font-size: 20px">真实姓名</span></div>
                         <div class="col-md-4" style="padding-left: 0px"><input type="text" name="realname" id="realname"/></div>
                         <div class="col-md-2 "><span class="glyphicon glyphicon-ok " id="realnameRight" ></span><span id="realnameError" class="glyphicon glyphicon-remove" style="color: red;  font-size: 15px "  >姓名只能是字母和中文2-10</span></div>

                     </div>

                     
<br/><br/>

 <div class="col-md-4 col-md-offset-2" > <span style="font-size:20px"> 用户等级</span></div>
                         <select name="level" id="sel" style="width: 100px">
                         <option value="超级管理员">超级管理员</option>
                         <option value="资料管理员">资料管理员</option>
                         <option value="灾情管理员">灾情管理员</option>
                         <option value="专家管理员">专家管理员</option>
                         <option value="库房管理员">库房管理员</option>

                     </select><br/><br/><br/><br/>
                          <div class="row"> <div class="col-md-4 col-md-offset-4">

                         <input type="submit"  id="addsub" class="btn  btn-info" style="display: block;margin-left: 200px  ;font-size: 20px"  value="添加"/>
                     </div></div>
                     </div>
             </form>

</body>
</html>