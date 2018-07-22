<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
								<input type="hidden" name="ID" id="ID" value="${pd.ID}" />
								<div id="zhongxin" style="padding-top: 13px;">
									<table id="table_report" class="table table-striped table-bordered table-hover">
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">gua_code:</td>
											<td><input type="text" name="GUA_CODE" id="GUA_CODE" value="${pd.GUA_CODE}" maxlength="6" placeholder="这里输入gua_code" title="gua_code" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">挂名:</td>
											<td><input type="text" name="NAME" id="NAME" value="${pd.NAME}" maxlength="255" placeholder="这里输入name" title="name" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">标题:</td>
											<td><input type="text" name="TITLE" id="TITLE" value="${pd.TITLE}" maxlength="255" placeholder="这里输入title" title="title" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">运势速断:</td>
											<td><input type="hidden" name="QUICK_JUDGE_IMG" id="QUICK_JUDGE_IMG" value="${pd.QUICK_JUDGE_IMG}" /> <input type="file"
												onchange="upPhoto('QUICK_JUDGE_IMG_FILE','QUICK_JUDGE_IMG')" name="QUICK_JUDGE_IMG_FILE" id="QUICK_JUDGE_IMG_FILE" maxlength="255"
												placeholder="这里输入quick_judge_img" title="quick_judge_img" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">挂图:</td>

											<td><input type="hidden" name="TITLE_IMG" id="TITLE_IMG" value="${pd.TITLE_IMG}" /> <input type="file" onchange="upPhoto('TITLE_IMG_FILE','TITLE_IMG')"
												name="TITLE_IMG_FILE" id="TITLE_IMG_FILE" maxlength="255" placeholder="这里输入title_img" title="title_img" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">原文:</td>
											<td><input type="text" name="ORIGIN_CONTENT" id="ORIGIN_CONTENT" value="${pd.ORIGIN_CONTENT}" maxlength="255" placeholder="这里输入origin_content"
												title="origin_content" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">彖曰:</td>
											<td><input type="text" name="EXPLAIN_CONTENT" id="EXPLAIN_CONTENT" value="${pd.EXPLAIN_CONTENT}" maxlength="255" placeholder="这里输入explain_content"
												title="explain_content" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">象曰:</td>
											<td><input type="text" name="PICTURE_CONTENT" id="PICTURE_CONTENT" value="${pd.PICTURE_CONTENT}" maxlength="255" placeholder="这里输入picture_content"
												title="picture_content" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">译文:</td>
											<td><input type="text" name="EXPLAIN_PICTURE_CONTENT" id="EXPLAIN_PICTURE_CONTENT" value="${pd.EXPLAIN_PICTURE_CONTENT}" maxlength="255"
												placeholder="这里输入explain_picture_content" title="explain_picture_content" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">彖辞说:</td>
											<td><input type="text" name="MODERN_EXPLAIN_CONTENT" id="MODERN_EXPLAIN_CONTENT" value="${pd.MODERN_EXPLAIN_CONTENT}" maxlength="255"
												placeholder="这里输入modern_explain_content" title="modern_explain_content" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">象辞说:</td>
											<td><input type="text" name="MODERN_EXPLAIN_PICTURE_CONTENT" id="MODERN_EXPLAIN_PICTURE_CONTENT" value="${pd.MODERN_EXPLAIN_PICTURE_CONTENT}"
												maxlength="255" placeholder="这里输入modern_explain_picture_content" title="modern_explain_picture_content" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">启示:</td>
											<td><input type="text" name="ENLIGHTENMENT" id="ENLIGHTENMENT" value="${pd.ENLIGHTENMENT}" maxlength="255" placeholder="这里输入enlightenment"
												title="enlightenment" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">卦辞说:</td>
											<td><input type="text" name="MODERN_EXPLAIN_GUA" id="MODERN_EXPLAIN_GUA" value="${pd.MODERN_EXPLAIN_GUA}" maxlength="255"
												placeholder="这里输入modern_explain_gua" title="modern_explain_gua" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">断易天机:</td>
											<td><input type="text" name="DUAN_YI_TIAN_JI" id="DUAN_YI_TIAN_JI" value="${pd.DUAN_YI_TIAN_JI}" maxlength="255" placeholder="这里输入duan_yi_tian_ji"
												title="duan_yi_tian_ji" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">断易天机IMG:</td>
											<td><input type="hidden" name="DUAN_YI_TIAN_JI_IMG" id="DUAN_YI_TIAN_JI_IMG" value="${pd.DUAN_YI_TIAN_JI_IMG}" /> <input type="file"
												onchange="upPhoto('DUAN_YI_TIAN_JI_IMG_FILE','DUAN_YI_TIAN_JI_IMG')" name="DUAN_YI_TIAN_JI_IMG_FILE" id="DUAN_YI_TIAN_JI_IMG_FILE" maxlength="255"
												placeholder="这里输入duan_yi_tian_ji_img" title="duan_yi_tian_ji_img" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">点睛:</td>
											<td><input type="text" name="MAIN_IDEA" id="MAIN_IDEA" value="${pd.MAIN_IDEA}" maxlength="255" placeholder="这里输入main_idea" title="main_idea"
												style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="width: 75px; text-align: right; padding-top: 13px;">典故:</td>
											<td><input type="text" name="STORY" id="STORY" value="${pd.STORY}" maxlength="255" placeholder="这里输入story" title="story" style="width: 98%;" /></td>
										</tr>
										<tr>
											<td style="text-align: center;" colspan="10"><a class="btn btn-mini btn-primary" onclick="save();">保存</a> <a class="btn btn-mini btn-danger"
												onclick="top.Dialog.close();">取消</a></td>
										</tr>
									</table>
								</div>
								<div id="zhongxin2" class="center" style="display: none">
									<br />
									<br />
									<br />
									<br />
									<br />
									<img src="static/images/jiazai.gif" /><br />
									<h4 class="lighter block green">提交中...</h4>
								</div>
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
		
		function upPhoto(fileId,inputId){
		    var url = "<%=basePath%>gua/upPhoto.do";//这里填请求的地址
			var formData = new FormData();
			formData.append("file", $("#" + fileId)[0].files[0]);
			$.ajax({
				url : url,
				type : 'POST',
				data : formData,
				processData : false,
				contentType : false,
				success : function(data) {
					$("#" + inputId).val(data.url);
					$("#" + fileId).tips({
						side : 3,
						msg : '上传成功' + data.url,
						bg : '#AE81FF',
						time : 2
					});
					$("#" + fileId).focus();
				},
				error : function() {
					alert("请链接网络");
				}
			})
		}

		//保存
		function save() {
			if ($("#GUA_CODE").val() == "") {
				$("#GUA_CODE").tips({
					side : 3,
					msg : '请输入gua_code',
					bg : '#AE81FF',
					time : 2
				});
				$("#GUA_CODE").focus();
				return false;
			}
			if ($("#NAME").val() == "") {
				$("#NAME").tips({
					side : 3,
					msg : '请输入name',
					bg : '#AE81FF',
					time : 2
				});
				$("#NAME").focus();
				return false;
			}
			if ($("#TITLE").val() == "") {
				$("#TITLE").tips({
					side : 3,
					msg : '请输入title',
					bg : '#AE81FF',
					time : 2
				});
				$("#TITLE").focus();
				return false;
			}
			if ($("#QUICK_JUDGE_IMG").val() == "") {
				$("#QUICK_JUDGE_IMG").tips({
					side : 3,
					msg : '请输入quick_judge_img',
					bg : '#AE81FF',
					time : 2
				});
				$("#QUICK_JUDGE_IMG").focus();
				return false;
			}
			if ($("#TITLE_IMG").val() == "") {
				$("#TITLE_IMG").tips({
					side : 3,
					msg : '请输入title_img',
					bg : '#AE81FF',
					time : 2
				});
				$("#TITLE_IMG").focus();
				return false;
			}
			if ($("#ORIGIN_CONTENT").val() == "") {
				$("#ORIGIN_CONTENT").tips({
					side : 3,
					msg : '请输入origin_content',
					bg : '#AE81FF',
					time : 2
				});
				$("#ORIGIN_CONTENT").focus();
				return false;
			}
			if ($("#EXPLAIN_CONTENT").val() == "") {
				$("#EXPLAIN_CONTENT").tips({
					side : 3,
					msg : '请输入explain_content',
					bg : '#AE81FF',
					time : 2
				});
				$("#EXPLAIN_CONTENT").focus();
				return false;
			}
			if ($("#PICTURE_CONTENT").val() == "") {
				$("#PICTURE_CONTENT").tips({
					side : 3,
					msg : '请输入picture_content',
					bg : '#AE81FF',
					time : 2
				});
				$("#PICTURE_CONTENT").focus();
				return false;
			}
			if ($("#EXPLAIN_PICTURE_CONTENT").val() == "") {
				$("#EXPLAIN_PICTURE_CONTENT").tips({
					side : 3,
					msg : '请输入explain_picture_content',
					bg : '#AE81FF',
					time : 2
				});
				$("#EXPLAIN_PICTURE_CONTENT").focus();
				return false;
			}
			if ($("#MODERN_EXPLAIN_CONTENT").val() == "") {
				$("#MODERN_EXPLAIN_CONTENT").tips({
					side : 3,
					msg : '请输入modern_explain_content',
					bg : '#AE81FF',
					time : 2
				});
				$("#MODERN_EXPLAIN_CONTENT").focus();
				return false;
			}
			if ($("#MODERN_EXPLAIN_PICTURE_CONTENT").val() == "") {
				$("#MODERN_EXPLAIN_PICTURE_CONTENT").tips({
					side : 3,
					msg : '请输入modern_explain_picture_content',
					bg : '#AE81FF',
					time : 2
				});
				$("#MODERN_EXPLAIN_PICTURE_CONTENT").focus();
				return false;
			}
			if ($("#ENLIGHTENMENT").val() == "") {
				$("#ENLIGHTENMENT").tips({
					side : 3,
					msg : '请输入enlightenment',
					bg : '#AE81FF',
					time : 2
				});
				$("#ENLIGHTENMENT").focus();
				return false;
			}
			if ($("#MODERN_EXPLAIN_GUA").val() == "") {
				$("#MODERN_EXPLAIN_GUA").tips({
					side : 3,
					msg : '请输入modern_explain_gua',
					bg : '#AE81FF',
					time : 2
				});
				$("#MODERN_EXPLAIN_GUA").focus();
				return false;
			}
			if ($("#DUAN_YI_TIAN_JI").val() == "") {
				$("#DUAN_YI_TIAN_JI").tips({
					side : 3,
					msg : '请输入duan_yi_tian_ji',
					bg : '#AE81FF',
					time : 2
				});
				$("#DUAN_YI_TIAN_JI").focus();
				return false;
			}
			if ($("#DUAN_YI_TIAN_JI_IMG").val() == "") {
				$("#DUAN_YI_TIAN_JI_IMG").tips({
					side : 3,
					msg : '请输入duan_yi_tian_ji_img',
					bg : '#AE81FF',
					time : 2
				});
				$("#DUAN_YI_TIAN_JI_IMG").focus();
				return false;
			}
			if ($("#MAIN_IDEA").val() == "") {
				$("#MAIN_IDEA").tips({
					side : 3,
					msg : '请输入main_idea',
					bg : '#AE81FF',
					time : 2
				});
				$("#MAIN_IDEA").focus();
				return false;
			}
			if ($("#STORY").val() == "") {
				$("#STORY").tips({
					side : 3,
					msg : '请输入story',
					bg : '#AE81FF',
					time : 2
				});
				$("#STORY").focus();
				return false;
			}
			$("#Form").submit();
			$("#zhongxin").hide();
			$("#zhongxin2").show();
		}

		$(function() {
			//日期框
			$('.date-picker').datepicker({
				autoclose : true,
				todayHighlight : true
			});
		});
	</script>
</body>
</html>