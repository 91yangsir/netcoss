/**
 * Created by Yangsir on 2018/6/19.
 */

function submitForm(){
    $('#ff').form('submit');
}
function clearForm(){
    $('#ff').form('clear');
}

$(function(){
	$('#up').click(function(){
		var data={
				
			   id :$('#managerId').val(),
			   managerAcc:$('#managerAcc').val(),
			   managerName:$('#managerName').val(),
				managerPwd:$('#managerPwd').val(),
				managerTel:$('#managerTel').val(),
				managerMail:$('#managerMail').val(),
				roleName : $('#roleName').combobox('getText')			
		}
		console.log(111111)
		   $.ajax({  
	           url: '/project/manager/update1',  
	           data: data,  
	           dataType: 'json',          
	           type: "POST",  
	           // traditional: true,  
	           success: function (res) {  
	        	  console.log(111111)
	               location.herf="/project/view/managermag/mangagerindex.ftl"  

	           }  
	       }); 
	});
})


