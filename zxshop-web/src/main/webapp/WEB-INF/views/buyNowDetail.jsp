<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'buyNowDetail.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<link type="text/css" href="${ctx}/resources/test/base.css"
	rel="stylesheet" />
</head>

<body>
<div class="iteminfo_buying">
		<!--规格属性-->
		<div class="sys_item_spec">
			<dl
				class="clearfix iteminfo_parameter iteminfo_parameter_default lh32">
				<dt>店铺名称:</dt>
				<dd>
					${detail.storename}
				</dd>
			</dl>
			<dl
				class="clearfix iteminfo_parameter iteminfo_parameter_default lh32">
				<dt>商品名称:</dt>
				<dd>
					<img alt="" src="${detail.showimg}" />${detail.name}
				</dd>
				
			</dl>
			<dl
				class="clearfix iteminfo_parameter iteminfo_parameter_default lh32">
				<dt>商品属性:</dt>
				<dd>
					${detail.attributevaluesb}
				</dd>
			</dl>
			<dl
				class="clearfix iteminfo_parameter iteminfo_parameter_default lh32">
				<dt>商品价格:</dt>
				<dd>
					${detail.price}
				</dd>
			</dl>
			<dl
				class="clearfix iteminfo_parameter iteminfo_parameter_default lh32">
				<dt>购买数量:</dt>
				<dd>
					${detail.number}
				</dd>
			</dl>
			<dl
				class="clearfix iteminfo_parameter iteminfo_parameter_default lh32">
				<dt></dt>
				<dd>
					<a href="#" id="J_LinkBuy">提交订单</a>
				</dd>
			</dl>
		</div>
		<!--规格属性-->
	</div>
</body>
</html>
