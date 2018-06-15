<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<base href="<%=basePath%>">
	<!-- 下拉框 -->
	<link rel="stylesheet" href="static/ace/css/chosen.css" />
	<!-- jsp文件头和头部 -->
	<%@ include file="../../system/index/top.jsp"%>
	<!-- 日期框 -->
	<link rel="stylesheet" href="static/ace/css/datepicker.css" />
</head>
<body class="no-skin">
<!-- /section:basics/navbar.layout -->
<div class="main-container" id="main-container">
	<!-- /section:basics/sidebar -->
	<div class="main-content">
		<div class="main-content-inner">
			<div class="page-content">
				<div class="row">
					<div class="col-xs-12">
					
					<form action="easybookgua/${msg }.do" name="Form" id="Form" method="post">
						<input type="hidden" name="EASYBOOKGUA_ID" id="EASYBOOKGUA_ID" value="${pd.EASYBOOKGUA_ID}"/>
						<div id="zhongxin" style="padding-top: 13px;">
						<table id="table_report" class="table table-striped table-bordered table-hover">
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注1:</td>
								<td><input type="number" name="ID" id="ID" value="${pd.ID}" maxlength="32" placeholder="这里输入备注1" title="备注1" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注2:</td>
								<td><input type="text" name="GUA_CODE" id="GUA_CODE" value="${pd.GUA_CODE}" maxlength="6" placeholder="这里输入备注2" title="备注2" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注3:</td>
								<td><input type="text" name="NAME" id="NAME" value="${pd.NAME}" maxlength="255" placeholder="这里输入备注3" title="备注3" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注4:</td>
								<td><input type="text" name="TITLE" id="TITLE" value="${pd.TITLE}" maxlength="255" placeholder="这里输入备注4" title="备注4" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注5:</td>
								<td><input type="text" name="QUICK_JUDGE_IMG" id="QUICK_JUDGE_IMG" value="${pd.QUICK_JUDGE_IMG}" maxlength="255" placeholder="这里输入备注5" title="备注5" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注6:</td>
								<td><input type="text" name="TITLE_IMG" id="TITLE_IMG" value="${pd.TITLE_IMG}" maxlength="255" placeholder="这里输入备注6" title="备注6" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注7:</td>
								<td><input type="text" name="ORIGIN_CONTENT" id="ORIGIN_CONTENT" value="${pd.ORIGIN_CONTENT}" maxlength="255" placeholder="这里输入备注7" title="备注7" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注8:</td>
								<td><input type="text" name="EXPLAIN_CONTENT" id="EXPLAIN_CONTENT" value="${pd.EXPLAIN_CONTENT}" maxlength="255" placeholder="这里输入备注8" title="备注8" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注9:</td>
								<td><input type="text" name="PICTURE_CONTENT" id="PICTURE_CONTENT" value="${pd.PICTURE_CONTENT}" maxlength="255" placeholder="这里输入备注9" title="备注9" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注10:</td>
								<td><input type="text" name="EXPLAIN_PICTURE_CONTENT" id="EXPLAIN_PICTURE_CONTENT" value="${pd.EXPLAIN_PICTURE_CONTENT}" maxlength="255" placeholder="这里输入备注10" title="备注10" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注11:</td>
								<td><input type="text" name="MODERN_EXPLAIN_CONTENT" id="MODERN_EXPLAIN_CONTENT" value="${pd.MODERN_EXPLAIN_CONTENT}" maxlength="255" placeholder="这里输入备注11" title="备注11" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注12:</td>
								<td><input type="text" name="MODERN_EXPLAIN_PICTURE_CONTENT" id="MODERN_EXPLAIN_PICTURE_CONTENT" value="${pd.MODERN_EXPLAIN_PICTURE_CONTENT}" maxlength="255" placeholder="这里输入备注12" title="备注12" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注13:</td>
								<td><input type="text" name="ENLIGHTENMENT" id="ENLIGHTENMENT" value="${pd.ENLIGHTENMENT}" maxlength="255" placeholder="这里输入备注13" title="备注13" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注14:</td>
								<td><input type="text" name="MODERN_EXPLAIN_GUA" id="MODERN_EXPLAIN_GUA" value="${pd.MODERN_EXPLAIN_GUA}" maxlength="255" placeholder="这里输入备注14" title="备注14" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注15:</td>
								<td><input type="text" name="DUAN_YI_TIAN_JI" id="DUAN_YI_TIAN_JI" value="${pd.DUAN_YI_TIAN_JI}" maxlength="255" placeholder="这里输入备注15" title="备注15" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注16:</td>
								<td><input type="text" name="DUAN_YI_TIAN_JI_IMG" id="DUAN_YI_TIAN_JI_IMG" value="${pd.DUAN_YI_TIAN_JI_IMG}" maxlength="255" placeholder="这里输入备注16" title="备注16" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注17:</td>
								<td><input type="text" name="MAIN_IDEA" id="MAIN_IDEA" value="${pd.MAIN_IDEA}" maxlength="255" placeholder="这里输入备注17" title="备注17" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注18:</td>
								<td><input type="text" name="STORY" id="STORY" value="${pd.STORY}" maxlength="255" placeholder="这里输入备注18" title="备注18" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注19:</td>
								<td><input class="span10 date-picker" name="CREATE_TIME" id="CREATE_TIME" value="${pd.CREATE_TIME}" type="text" data-date-format="yyyy-mm-dd" readonly="readonly" placeholder="备注19" title="备注19" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="width:75px;text-align: right;padding-top: 13px;">备注20:</td>
								<td><input class="span10 date-picker" name="UPDATE_TIME" id="UPDATE_TIME" value="${pd.UPDATE_TIME}" type="text" data-date-format="yyyy-mm-dd" readonly="readonly" placeholder="备注20" title="备注20" style="width:98%;"/></td>
							</tr>
							<tr>
								<td style="text-align: center;" colspan="10">
									<a class="btn btn-mini btn-primary" onclick="save();">保存</a>
									<a class="btn btn-mini btn-danger" onclick="top.Dialog.close();">取消</a>
								</td>
							</tr>
						</table>
						</div>
						<div id="zhongxin2" class="center" style="display:none"><br/><br/><br/><br/><br/><img src="static/images/jiazai.gif" /><br/><h4 class="lighter block green">提交中...</h4></div>
					</form>
					</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.page-content -->
		</div>
	</div>
	<!-- /.main-content -->
</div>
<!-- /.main-container -->


	<!-- 页面底部js¨ -->
	<%@ include file="../../system/index/foot.jsp"%>
	<!-- 下拉框 -->
	<script src="static/ace/js/chosen.jquery.js"></script>
	<!-- 日期框 -->
	<script src="static/ace/js/date-time/bootstrap-datepicker.js"></script>
	<!--提示框-->
	<script type="text/javascript" src="static/js/jquery.tips.js"></script>
		<script type="text/javascript">
		$(top.hangge());
		//保存
		function save(){
			if($("#ID").val()==""){
				$("#ID").tips({
					side:3,
		            msg:'请输入备注1',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#ID").focus();
			return false;
			}
			if($("#GUA_CODE").val()==""){
				$("#GUA_CODE").tips({
					side:3,
		            msg:'请输入备注2',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#GUA_CODE").focus();
			return false;
			}
			if($("#NAME").val()==""){
				$("#NAME").tips({
					side:3,
		            msg:'请输入备注3',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#NAME").focus();
			return false;
			}
			if($("#TITLE").val()==""){
				$("#TITLE").tips({
					side:3,
		            msg:'请输入备注4',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#TITLE").focus();
			return false;
			}
			if($("#QUICK_JUDGE_IMG").val()==""){
				$("#QUICK_JUDGE_IMG").tips({
					side:3,
		            msg:'请输入备注5',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#QUICK_JUDGE_IMG").focus();
			return false;
			}
			if($("#TITLE_IMG").val()==""){
				$("#TITLE_IMG").tips({
					side:3,
		            msg:'请输入备注6',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#TITLE_IMG").focus();
			return false;
			}
			if($("#ORIGIN_CONTENT").val()==""){
				$("#ORIGIN_CONTENT").tips({
					side:3,
		            msg:'请输入备注7',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#ORIGIN_CONTENT").focus();
			return false;
			}
			if($("#EXPLAIN_CONTENT").val()==""){
				$("#EXPLAIN_CONTENT").tips({
					side:3,
		            msg:'请输入备注8',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#EXPLAIN_CONTENT").focus();
			return false;
			}
			if($("#PICTURE_CONTENT").val()==""){
				$("#PICTURE_CONTENT").tips({
					side:3,
		            msg:'请输入备注9',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#PICTURE_CONTENT").focus();
			return false;
			}
			if($("#EXPLAIN_PICTURE_CONTENT").val()==""){
				$("#EXPLAIN_PICTURE_CONTENT").tips({
					side:3,
		            msg:'请输入备注10',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#EXPLAIN_PICTURE_CONTENT").focus();
			return false;
			}
			if($("#MODERN_EXPLAIN_CONTENT").val()==""){
				$("#MODERN_EXPLAIN_CONTENT").tips({
					side:3,
		            msg:'请输入备注11',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#MODERN_EXPLAIN_CONTENT").focus();
			return false;
			}
			if($("#MODERN_EXPLAIN_PICTURE_CONTENT").val()==""){
				$("#MODERN_EXPLAIN_PICTURE_CONTENT").tips({
					side:3,
		            msg:'请输入备注12',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#MODERN_EXPLAIN_PICTURE_CONTENT").focus();
			return false;
			}
			if($("#ENLIGHTENMENT").val()==""){
				$("#ENLIGHTENMENT").tips({
					side:3,
		            msg:'请输入备注13',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#ENLIGHTENMENT").focus();
			return false;
			}
			if($("#MODERN_EXPLAIN_GUA").val()==""){
				$("#MODERN_EXPLAIN_GUA").tips({
					side:3,
		            msg:'请输入备注14',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#MODERN_EXPLAIN_GUA").focus();
			return false;
			}
			if($("#DUAN_YI_TIAN_JI").val()==""){
				$("#DUAN_YI_TIAN_JI").tips({
					side:3,
		            msg:'请输入备注15',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#DUAN_YI_TIAN_JI").focus();
			return false;
			}
			if($("#DUAN_YI_TIAN_JI_IMG").val()==""){
				$("#DUAN_YI_TIAN_JI_IMG").tips({
					side:3,
		            msg:'请输入备注16',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#DUAN_YI_TIAN_JI_IMG").focus();
			return false;
			}
			if($("#MAIN_IDEA").val()==""){
				$("#MAIN_IDEA").tips({
					side:3,
		            msg:'请输入备注17',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#MAIN_IDEA").focus();
			return false;
			}
			if($("#STORY").val()==""){
				$("#STORY").tips({
					side:3,
		            msg:'请输入备注18',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#STORY").focus();
			return false;
			}
			if($("#CREATE_TIME").val()==""){
				$("#CREATE_TIME").tips({
					side:3,
		            msg:'请输入备注19',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#CREATE_TIME").focus();
			return false;
			}
			if($("#UPDATE_TIME").val()==""){
				$("#UPDATE_TIME").tips({
					side:3,
		            msg:'请输入备注20',
		            bg:'#AE81FF',
		            time:2
		        });
				$("#UPDATE_TIME").focus();
			return false;
			}
			$("#Form").submit();
			$("#zhongxin").hide();
			$("#zhongxin2").show();
		}
		
		$(function() {
			//日期框
			$('.date-picker').datepicker({autoclose: true,todayHighlight: true});
		});
		</script>
</body>
</html>