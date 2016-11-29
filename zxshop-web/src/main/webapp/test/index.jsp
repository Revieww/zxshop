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
<link type="text/css" href="${ctx}/base.css" rel="stylesheet" />
<script type="text/javascript" src="${ctx}/jquery.js"></script>
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
			<dl class="clearfix iteminfo_parameter sys_item_specpara"
				data-sid="1">
				<dt>颜色</dt>
				<dd>
					<ul class="sys_spec_img">
						<li data-aid="3"><a href="javascript:;" title="白色"><img
								src="${ctx}/img/1.png" alt="白色" /></a><i></i></li>
						<li data-aid="4"><a href="javascript:;" title="粉色"><img
								src="${ctx}/img/2.png" alt="粉色" /></a><i></i></li>
						<li data-aid="8"><a href="javascript:;" title="蓝色"><img
								src="${ctx}/img/3.png" alt="蓝色" /></a><i></i></li>
						<li data-aid="9"><a href="javascript:;" title="绿色"><img
								src="${ctx}/img/4.png" alt="绿色" /></a><i></i></li>
						<li data-aid="10"><a href="javascript:;" title="黄色"><img
								src="${ctx}/img/5.png" alt="黄色" /></a><i></i></li>
						<li data-aid="12"><a href="javascript:;" title="灰色"><img
								src="${ctx}/img/6.png" alt="灰色" /></a><i></i></li>
					</ul>

				</dd>
			</dl>
			<dl class="clearfix iteminfo_parameter sys_item_specpara"
				data-sid="2">
				<dt>尺码</dt>
				<dd>
					<ul class="sys_spec_text">
						<li data-aid="13"><a href="javascript:;" title="S">S</a><i></i></li>
						<li data-aid="14"><a href="javascript:;" title="M">M</a><i></i></li>
						<li data-aid="16"><a href="javascript:;" title="L">L</a><i></i></li>
						<li data-aid="17"><a href="javascript:;" title="XL">XL</a><i></i></li>
					</ul>
				</dd>
			</dl>
		</div>
		<!--规格属性-->
	</div>
</body>
</html>
<script>
	//价格json
	var sys_item = {
		"mktprice" : "13.00",
		"price" : "6.80",
		"sys_attrprice" : {
			"3_13" : {
				"price" : "6.80",
				"mktprice" : "13.00"
			},
			"3_14" : {
				"price" : "7.80",
				"mktprice" : "14.00"
			},
			"3_16" : {
				"price" : "8.80",
				"mktprice" : "15.00"
			},
			"3_17" : {
				"price" : "9.80",
				"mktprice" : "16.00"
			},
			"4_13" : {
				"price" : "6.80",
				"mktprice" : "13.00"
			},
			"4_14" : {
				"price" : "7.80",
				"mktprice" : "14.00"
			},
			"4_16" : {
				"price" : "8.80",
				"mktprice" : "15.00"
			},
			"4_17" : {
				"price" : "9.80",
				"mktprice" : "16.00"
			},
			"8_13" : {
				"price" : "6.80",
				"mktprice" : "13.00"
			},
			"8_14" : {
				"price" : "7.80",
				"mktprice" : "1400"
			},
			"8_16" : {
				"price" : "8.80",
				"mktprice" : "15.00"
			},
			"8_17" : {
				"price" : "9.80",
				"mktprice" : "16.00"
			},
			"9_13" : {
				"price" : "6.80",
				"mktprice" : "13.00"
			},
			"9_14" : {
				"price" : "7.80",
				"mktprice" : "14.00"
			},
			"9_16" : {
				"price" : "8.80",
				"mktprice" : "15.00"
			},
			"9_17" : {
				"price" : "9.80",
				"mktprice" : "16.00"
			},
			"10_13" : {
				"price" : "6.80",
				"mktprice" : "13.00"
			},
			"10_14" : {
				"price" : "7.80",
				"mktprice" : "14.00"
			},
			"10_16" : {
				"price" : "8.80",
				"mktprice" : "15.00"
			},
			"10_17" : {
				"price" : "9.80",
				"mktprice" : "16.00"
			},
			"12_13" : {
				"price" : "6.80",
				"mktprice" : "13.00"
			},
			"12_14" : {
				"price" : "7.80",
				"mktprice" : "14.00"
			},
			"12_16" : {
				"price" : "8.80",
				"mktprice" : "15.00"
			},
			"12_17" : {
				"price" : "9.80",
				"mktprice" : "16.00"
			}
		}
	};

	//商品规格选择
	$(function() {
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
						getattrprice() //输出价格
					})
				})

		//获取对应属性的价格
		function getattrprice() {
			var defaultstats = true;
			var _val = '';
			var _resp = {
				mktprice : ".sys_item_mktprice",
				price : ".sys_item_price"
			} //输出对应的class
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
				_mktprice = sys_item['sys_attrprice'][_val]['mktprice'];
				_price = sys_item['sys_attrprice'][_val]['price'];
			} else {
				_mktprice = sys_item['mktprice'];
				_price = sys_item['price'];
			}
			//输出价格
			$(_resp.mktprice).text(_mktprice); ///其中的math.round为截取小数点位数
			$(_resp.price).text(_price);
		}
	})
</script>

