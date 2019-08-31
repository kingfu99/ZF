<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<!-- saved from url=(0030)http://localhost:8080/House-2/ -->
<HTML xmlns="http://www.w3.org/1999/xhtml"><HEAD><TITLE>布谷租房 - 首页</TITLE>
<META content="text/html; charset=utf-8" http-equiv=Content-Type>
<LINK rel=stylesheet type=text/css href="../css/style.css">
<META name=GENERATOR content="MSHTML 8.00.7601.17514"></HEAD>
<BODY>
<DIV id=header class=wrap>
<DIV id=logo><IMG src="../images/logo.gif"></DIV></DIV>
<DIV id=navbar class=wrap>
<DL class="search clearfix">
  <FORM id=sform method=post action=/house/search>
      <input type="hidden" id="pageNum" name="pageNum">
  <DT>
  <UL>
    <LI class=bold>房屋信息</LI>
    <LI>标题：<INPUT class=text type=text name=name value="${vo.name}"> <LABEL class=ui-blue><INPUT  value=搜索房屋 type=submit name=search></LABEL>
    </LI></UL></DT>
  <DD>
  <UL>
    <LI class=first>价格 </LI>
    <LI><SELECT name=price> <OPTION selected value="">不限</OPTION> <OPTION
      value=0-100>100元以下</OPTION> <OPTION value=100-200>100元—200元</OPTION>
      <OPTION value=200-1000000>200元以上</OPTION></SELECT> </LI></UL></DD>
  <DD>
  <UL>
    <LI class=first>房屋位置</LI>
    <LI><SELECT id=street name=street_id> <OPTION selected
      value="">不限</OPTION> <OPTION value=1000>知春路</OPTION> <OPTION
      value=1001>中关村大街</OPTION> <OPTION value=1002>学院路</OPTION> <OPTION
      value=1003>朝阳路</OPTION></SELECT> </LI></UL></DD>
  <DD>
  <UL>
    <LI class=first>房型</LI>
    <LI><SELECT name=type_id> <OPTION  selected  value="">不限</OPTION> <OPTION
      value=1000>一室一厅</OPTION> <OPTION value=1001>一室两厅</OPTION> <OPTION
      value=1002>两室一厅</OPTION> <OPTION value=1003>两室两厅</OPTION></SELECT>
  </LI></UL></DD>
  <DD>
  <UL>
    <LI class=first>面积 </LI>
    <LI><SELECT name=floorage> <OPTION ${vo.floorage==""?"selected":""} value="">不限</OPTION> <OPTION
      value=0-40 ${vo.floorage=="0-40"?"selected":""}>40以下</OPTION> <OPTION value=40-500 ${vo.floorage=="40-500"?"selected":""}>40-500</OPTION> <OPTION
      value=500-1000000 ${vo.floorage=="500-10000000"?"selected":""}>500以上</OPTION></SELECT> </LI></UL></DD></FORM></DL></DIV>
<DIV class="main wrap">
<TABLE class=house-list>
  <TBODY>
  <c:forEach items="${pageInfo.list}" var="house">
  <TR>
    <TD class=house-thumb><span><A href="/house/details?id=${house.hId}" target="_blank"><img src="/house/images?imgName=${house.hImg}" width="100" height="75" alt=""></a></span></TD>
    <TD>
      <DL>
        <DT><A href="/house/details?id=${house.hId}" target="_blank">${house.hName}</A></DT>
        <DD>${house.hLoc1}${house.hLoc2},${house.hRect}平米<BR>联系方式：3456 </DD></DL></TD>
    <TD class=house-type>一室一厅</TD>
    <TD class=house-price><SPAN>346.0</SPAN>元/月</TD></TR>
  </c:forEach>
  </TBODY></TABLE>
<DIV class=pager>
<UL>
  <LI class=current><A href="javascript:void(0)" onclick="dosubmit(${pageInfo.firstPage})">首页</A></LI>
  <LI><A href="javascript:void(0)" onclick="dosubmit(${pageInfo.hasPreviousPage?pageInfo.prePage:pageInfo.pageNum})">上一页</A></LI>
  <LI><A href="javascript:void(0)" onclick="dosubmit(${pageInfo.hasNextPage?pageInfo.nextPage:pageInfo.pageNum})">下一页</A></LI>
  <LI><A href="javascript:void(0)" onclick="dosubmit(${pageInfo.lastPage})">末页</A></LI></UL><SPAN
class=total>${pageInfo.pageNum}/${pageInfo.pages}页</SPAN> </DIV></DIV>
<DIV id=footer class=wrap>
    <script>
        function dosubmit(pageNum) {
            var p=document.getElementById("pageNum");
            p.value=pageNum;
            var form=document.getElementById("sform");
            form.submit();
        }
    </script>
<DL>
  <DT>布谷租房 © 2010 布谷租房 京ICP证1000001号</DT>
  <DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD></DL></DIV></BODY></HTML>
