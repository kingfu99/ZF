<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<!-- saved from url=(0044)http://localhost:8080/HouseRent/page/add.jsp -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<HTML xmlns="http://www.w3.org/1999/xhtml"><HEAD><TITLE>布谷租房 -发布房屋信息</TITLE>
<META content="text/html; charset=utf-8" http-equiv=Content-Type><LINK 
rel=stylesheet type=text/css href="../../css/style.css">
<META name=GENERATOR content="MSHTML 8.00.7601.17514"></HEAD>
<BODY>
<DIV id=header class=wrap>
<DIV id=logo><IMG src="../../images/logo.gif"></DIV></DIV>
<DIV id=regLogin class=wrap>
<DIV class=dialog>
<DL class=clearfix>
  <DT>修改房屋信息</DT>
  <DD class=past>填写房屋信息</DD></DL>
<DIV class=box>
<FORM id=add_action method=post name=add.action 
action="/house/updateHouse" enctype="multipart/form-data">
  <input type="hidden" name=hId value="${house.hId}">
<DIV class=infos>
<TABLE class=field>
  <TBODY>
  <TR>
    <TD class=field>标　　题：</TD>
    <TD><INPUT id=add_action_title class=text type=text name=title value="${house.hName}"> </TD></TR>

  <TR>
    <TD class=field>户　　型：</TD>
    <TD><SELECT class=text name=type_id><OPTION selected 
        value=1000>一室一厅</OPTION></SELECT></TD></TR>
  <TR>
    <TD class=field>面　　积：</TD>
    <TD><INPUT id=add_action_floorage class=text type=text 
name=floorage value="${house.hRect}"></TD></TR>
    <TD class=field>房产证日期：</TD>
    <TD><INPUT class=text type=text name=houseDate value="<fmt:formatDate value='${house.hDate}' pattern='yyyy-MM-dd' />"></TD></TR>
  <TR>
  <TR>
    <TD class=field>图     片：</TD>
    <TD><img src="/house/images?imgName=${house.hImg}" width="200"  alt=""><input>
      <INPUT id=img class=text type=file
               name=hImg value="${house.hImg}"></TD></TR>
  <TR>
    <TD class=field>位　　置：</TD>
    <TD>区：<SELECT class=text name=districtId><OPTION ${house.hLoc1=="1004"?"selected":""} value=1004>海淀区</OPTION></SELECT>
              街：<SELECT class=text name=streetId><OPTION ${house.hLoc2=="1001"?"selected":""} value=1001>中关村大街</OPTION></SELECT>
    </TD></TR><!--
						<tr>
							<td class="field">坐  标：</td>
							<td><input type="text" class="text" name="point" />
							</td>
						</tr>
						--><!--  <tr>
							<td class="field">Y 坐  标：</td>
							<td><input type="text" class="text" name="point.y" /></td>
						</tr>-->
  <TR>
    <TD class=field>联系方式：</TD>
    <TD><INPUT id=add_action_contact class=text type=text name=contact value="${loginUser.userTel}"> </TD></TR>
  <TR>
    <TD class=field>详细信息：</TD>
    <TD><TEXTAREA name=description></TEXTAREA></TD></TR></TBODY></TABLE>
<DIV class=buttons><INPUT  value=立即发布 type=submit>
</DIV></DIV></FORM></DIV></DIV></DIV>
<DIV id=footer class=wrap>
<DL>
  <DT>布谷租房 © 2010 布谷租房 京ICP证1000001号</DT>
  <DD>关于我们 · 联系方式 · 意见反馈 · 帮助中心</DD></DL></DIV></BODY></HTML>
