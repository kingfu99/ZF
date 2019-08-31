<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<!-- saved from url=(0050)http://localhost:8080/HouseRent/manage!list.action -->
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
    <TITLE>布谷租房 - 用户管理</TITLE>
    <META content="text/html; charset=utf-8" http-equiv=Content-Type>
    <LINK
            rel=stylesheet type=text/css href="../../css/style.css">

    <META name=GENERATOR>
</HEAD>
<BODY>
<DIV id=header class=wrap>
    <DIV id=logo><IMG src="../../images/logo.gif"></DIV>
    <DIV class=search><LABEL class="ui-green searchs"><a href="../../fabu.jsp" title="">发布房屋信息</a></LABEL>
        <LABEL class=ui-green><INPUT onclick='document.location="/user/login"' value="退       出" type=button
                                     name=search></LABEL>
        <LABEL class=ui-green><INPUT onclick='document.location="/house/search"' value="所有房源信息" type=button
                                     name=search></LABEL>
    </DIV>
</DIV>
<DIV class="main wrap">
    <DIV id=houseArea>
        <TABLE class=house-list>
            <TBODY>
            <c:forEach items="${houses}" var="house">
            <TR>
                <TD class=house-thumb><SPAN><A href="/house/details?id=${house.hId}" target="_blank"><img
                        src="/house/images?imgName=${house.hImg}" width="100" height="75" alt=""></A></SPAN></TD>
                <TD>
                    <DL>
                        <DT><<A href="/house/details?id=${house.hId}" target="_blank">${house.hName}</A></DT>
                        <DD>${house.hLoc1}${house.hLoc2},${house.hRect}平米<BR>联系方式：123</DD>
                    </DL>
                </TD>
                <TD class=house-type><LABEL class=ui-green><a href="/house/update?houseId=${house.hId}"> <INPUT  value="修    改" type=button name=search></a></LABEL></TD>
                <TD class=house-price><LABEL class=ui-green><a href="/house/delete?hId=${house.hId}"><INPUT value="删    除" type=submit name=delete></a></LABEL></TD>
            </TR>
            </c:forEach>
            </TBODY>
        </TABLE>
    </DIV>
    <DIV class=pager>

            <UL>
                <LI class=current><A href="javascript:void(0)" onclick="dosubmit(${guanliPageInfo.firstPage})">首页</A></LI>
                <LI><A href="javascript:void(0)" onclick="dosubmit(${guanliPageInfo.hasPreviousPage?guanliPageInfo.prePage:guanliPageInfo.pageNum})">上一页</A></LI>
                <LI><A href="javascript:void(0)" onclick="dosubmit(${guanliPageInfo.hasNextPage?guanliPageInfo.nextPage:guanliPageInfo.pageNum})">下一页</A></LI>
                <LI><A href="javascript:void(0)" onclick="dosubmit(${guanliPageInfo.lastPage})">末页</A></LI>
            </UL><SPAN class=total>${pageInfo.pageNum}/${pageInfo.pages}页</SPAN> </DIV></DIV>
<FORM id=sform method=post action="/house/guanliList">
    <input type="hidden" id="pageNum" name="pageNum">
</FORM>F
<DIV id=footer class=wrap>
    <DL>
        <DT>布谷租房 © 2010 布谷租房 京ICP证1000001号</DT>
        <DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD>
    </DL>
</DIV>
</BODY>
<script>
    function dosubmit(pageNum) {
        var p = document.getElementById("pageNum");
        p.value=pageNum;
        var form = document.getElementById("sform");
        form.submit();
    }
</script>
</HTML>
