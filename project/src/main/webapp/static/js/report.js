
function getData(){

	$().ready(function() {
		var myChart = echarts.init(document.getElementById('main'));
		// 图表显示提示信息
		myChart.showLoading();
		// 定义图表options
		var options = {
			    title : {
			        text: '某站点用户访问来源',
			        subtext: '纯属虚构',
			        x:'center'
			    },
			    tooltip : {
			        trigger: 'item',
			        formatter: "{a} <br/>{b} : {c} ({d}%)"
			    },
			    legend: {
			        orient: 'vertical',
			        left: 'left',
			        data: ['直接访问','邮件营销','联盟广告','视频广告','搜索引擎']
			    },
			    series : [
			        {
			            name: '访问来源',
			            type: 'pie',
			            radius : '55%',
			            center: ['50%', '60%'],
			            data:[
			                {value:335, name:'直接访问'},
			                {value:310, name:'邮件营销'},
			                {value:234, name:'联盟广告'},
			                {value:135, name:'视频广告'},
			                {value:1548, name:'搜索引擎'}
			            ],
			            itemStyle: {
			                emphasis: {
			                    shadowBlur: 10,
			                    shadowOffsetX: 0,
			                    shadowColor: 'rgba(0, 0, 0, 0.5)'
			                }
			            }
			        }
			    ]
			};


		// 通过Ajax获取数据
		$.ajax({
			type : "get",
			async : false, // 同步执行
			url : "/project/report/getYearBill",
			data: queryParams(),
			dataType : "json", // 返回数据形式为json
			success : function(result) {
				if (result) {
					// 将返回的category和series对象赋值给options对象内的category和series
					// 因为xAxis是一个数组 这里需要是xAxis[i]的形式
					//options.xAxis[0].data = result.category;
					options.series = result.series;
					options.legend.data = result.legend;
					myChart.hideLoading();
					myChart.setOption(options);
				}
			},
			error : function(errorMsg) {
				alert("图表请求数据失败啦!");
			}
		});

	});
}


// 得到查询参数
function queryParams() {
	var data = {
		userAcc : $('#acc').val(),
		year : $('#year').val()
	};
	return data;
}

// 查询和重置按钮
function submitForm() {
	getData();
}

function clearForm() {
	$('#ff').form('reset');
}
