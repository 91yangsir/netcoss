<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>用户自服务系统</title>
</head>
<body>
<form  action="/project/usersystem/find" method="POST">
    账号：<input type="text" name="userAcc"  placeholder="输入6-16位纯数字账号"  pattern="^[0-9]*$" /> <br/><br/>
    <br/>
    密码：<input type="password" name="userPwd" id="password"  placeholder="输入6-16位纯数字密码"   pattern="^[0-9]*$" />
    <br/><br/>   
    <select id="userinfo" name="userinfo">
        <option>个人信息</option>
        <option>账单信息</option>
    </select>
    <br/><br/>
    <input type="submit" value="登录"/>
    
</form>
</body>
</html>