<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
</head>
<script src="/project/static/js/jquery-3.3.1.min.js"></script>
<script src="/project/static/easyui/jquery.easyui.min.js"></script>
<link rel="stylesheet"
	href="/project/static/easyui/themes/default/easyui.css">
<link rel="stylesheet" href="/project/static/easyui/themes/icon.css">
<body>
<ul id="tt"></ul> 
</body>

<script type="text/javascript">
$('#tt').tree({   
    url:'menu/get' ,
    checkbox:'true',
    onlyLeafCheck:'true',
    	lines:'true'
});


</script>
</html>