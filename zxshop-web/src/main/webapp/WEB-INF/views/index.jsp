<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>jquery仿淘宝商城选择商品尺寸与大小颜色功能-xw素材网</title>
<link type="text/css" href="${ctx}/resources/test/base.css" rel="stylesheet" />
<script type="text/javascript" src="${ctx}/resources/test/jquery.js"></script>
</head>

<body>

	<div class="tab">
		<a href="index.html" class="cur">带图片选择</a> <a href="index2.html">纯文本选择</a>
	</div>
	<div class="iteminfo_buying">
		<!--规格属性-->
		<div class="sys_item_spec">
			<dl
				class="clearfix iteminfo_parameter iteminfo_parameter_default lh32">
				<dt>市场价</dt>
				<dd>
					<span class="iteminfo_mktprice">$<b
						class="sys_item_mktprice">13.00</b></span>
				</dd>
			</dl>
			<dl class="clearfix iteminfo_parameter lh32">
				<dt>本网价</dt>
				<dd>
					<span class="iteminfo_price">$ <b class="sys_item_price">6.80</b></span>
				</dd>
			</dl>
			
			<div id="saleaAttris">
			</div>
			
			<dl
				class="clearfix iteminfo_parameter iteminfo_parameter_default lh32">
				<dt>数量</dt>
				<dd>
					<span>库存<b
						class="sys_item_number"></b></span>
				</dd>
			</dl>
			<dl
				class="clearfix iteminfo_parameter iteminfo_parameter_default lh32">
				<dt></dt>
				<dd>
					<a href="#" id="J_LinkBuy">立即购买</a>
				</dd>
			</dl>
		</div>
		<!--规格属性-->
	</div>
	
	<script type="text/javascript">
	var product = {};
	var skuid =0;
	//商品规格选择
	$(function() {
		//初始化数据
		$.ajax({
					url: '${ctx}/product/detail',
					type: 'get',
					data: "pid=1",
					dataType: 'json',
					success: function(data){
						product = data.data;
						var saleaAttris = product.saleaAttriModels; //销售属性
						var html =  '';
							for(var i =0;i<saleaAttris.length;i++){
								var attri = saleaAttris[i];
								html += '<dl class="clearfix iteminfo_parameter sys_item_specpara" data-sid="1">';
								html += '<dt>'+attri.attribute+'</dt>';
							 	html += '<dd>';
							 	html += '<ul class="sys_spec_text">';
							 	for(var j=0;j<attri.valueModels.length;j++){
							 		var value = attri.valueModels[j];
							 		html += '<li data-aid="'+value.valueId+'"><a href="javascript:;" title="白色">'+value.value+'</a><i></i></li>';
							 	}
							 	
							 	html += '</ul>';
							 	html += '</dd>';
							 	html += '</dl>';
							}							
							
							//数据加载
							$("#saleaAttris").html(html);
							$(".sys_item_mktprice").text(product.shopprice); 
							$(".sys_item_price").text(product.shopprice);
							$(".sys_item_number").text(product.shopprice);
								
							
							
							$(".sys_item_spec .sys_item_specpara").each(
									function() {
										var i = $(this);
										var p = i.find("ul>li");
										p.click(function() {
											if (!!$(this).hasClass("selected")) {
												$(this).removeClass("selected");
												i.removeAttr("data-attrval");
											} else {
												$(this).addClass("selected").siblings("li")
														.removeClass("selected");
												i.attr("data-attrval", $(this).attr("data-aid"))
											}
											 
											getattrprice();
											
											
										})
									})
					},
					error: function(){
					},
					complete: function(){
						
					}
				});
		
		

		//获取对应属性的价格
		function getattrprice() {
			var defaultstats = true;
			var _val = '';
			var _resp = {
				mktprice : ".sys_item_mktprice",
				price : ".sys_item_price",
				number : ".sys_item_number"
			} 
			//输出对应的class
			$(".sys_item_spec .sys_item_specpara").each(function() {
				var i = $(this);
				var v = i.attr("data-attrval");
				if (!v) {
					defaultstats = false;
				} else {
					_val += _val != "" ? "_" : "";
					_val += v;
				}
			})
			if (!!defaultstats) {
				var attrvalue = product['skuatt'][_val];
				_mktprice = attrvalue['price'];
				_price = attrvalue['price'];
				_number = attrvalue['number'];
				skuid = attrvalue['skuid'];
			} else {
				_mktprice = product['shopprice'];
				_price = product['shopprice'];
				_number = product['shopprice'];
			}
			//输出价格
			$(_resp.mktprice).text(_mktprice); 
			$(_resp.price).text(_price);
			$(_resp.number).text(_number);
			
		}
		
		
		$("#J_LinkBuy").click(function(){
			if(skuid == 0){
				alert("选择===");
			}else{
				window.open('${ctx}/order/buyNowDetail?skuid='+skuid,'_self');
			}
			
		})
	})
	
	</script>
</body>
</html>

