/**
 * Created by Yangsir on 2018/6/19.
 */


function clearForm(){
    $('#ff').form('clear');
}
$(function(){
	$('#ad').click(function(){
		var data={
				managerAcc:$('#managerAcc').val(),
				managerName:$('#managerName').val(),
				managerPwd:$('#managerPwd').val(),
				managerTel:$('#managerTel').val(),
				managerMail:$('#managerMail').val(),
				roleName : $('#roleName').combobox('getText')			
		}
		
		   $.ajax({  
	           url: '/project/manager/add',  
	           data: data,  
	           dataType: 'json',          
	           type: "POST",  
	           // traditional: true,  
	           success: function (res) {  
	        	  console.log(111111)
	               location.href="/project/view/managermag/managerindex.ftl"  

	           }  
	       }); 
	});
})



