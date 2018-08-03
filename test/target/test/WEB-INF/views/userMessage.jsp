<%--
  Created by IntelliJ IDEA.
  User: fhd
  Date: 2018/7/23
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
   pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<html>
<head>
    <title>用户信息</title>
    <script src="${APP_PATH }/static/js/jquery3.3.1.js" type="text/javascript"></script>
    <script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.js" type="text/javascript"></script>
    <link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="${APP_PATH }/static/css/userList.css" rel="stylesheet" type="text/css">
    <script>
        $(document).ready(function () {
            $("#change").click(function () {
                $(this).hide();
                $("#t2").show();
                $("#t1").hide();
                $("#save").show();
                $("#back").show();
            });
            $("#back").click(function () {
                $(this).hide();
                $("#save").hide();
                $("#change").show();
                $("#t1").show();
                $("#t2").hide();

            });
            $("#save").click(function () {
                var user={
                    userName:$("#userName").val(),
                    sex:$("#sex").val(),
                    age:$("#age").val(),
                    phoneNumber:$("#phoneNumber").val(),
                    comments:$("#comments").val()
                };
                console.log(user);
                $.ajax({
                    url:"updateUserMessage",
                    dataType : "JSON",
                    data:user,
                    type:"PUT",
                    success:function(result){
                        if(result.code==100) {
                            console.log("yes");
                            alert("更新成功");
                            window.location.reload();
                        }
                        else {
                        }
                    }
                });
            });
        });
    </script>
</head>
<body>

    <div class="container-fluid">
        <div class="row head">
            <div class="col-md-12" style="margin-top: 8px">
                <h4 style="color: #a4d3ee;">个人代办事项管理系统</h4>
            </div>
        </div>
        <div class="row">
            <div class="col-md-2 l">
                <div style="background-color: #28b779;" class="ll">
                    <a >用户信息</a>
                </div>
                <div style=";" class="ll">
                    <a href="todoItems">代办事项</a>
                </div>
            </div>
            <div class="col-md-10 r">
                <div class="rhead">
                    <p style="font-size: 20px;font-weight: 600;margin: 10px 10px;">用户信息</p>
                </div>
                <div class="rcontent">
                    <table id="t1" class="table table-bordered" style="width: 50%">
                        <tr>
                            <td class="tl">用户名:</td>
                            <td>${user.getUserName()}</td>
                        </tr>
                        <tr>
                            <td class="tl">性别:</td>
                            <td>${user.getSex()}</td>
                        </tr>
                        <tr>
                            <td class="tl">年龄:</td>
                            <td>${user.getAge()}</td>
                        </tr>
                        <tr>
                            <td class="tl">电话号码:</td>
                            <td>${user.getPhoneNumber()}</td>
                        </tr>
                        <tr>
                            <td class="tl">创建时间:</td>
                            <td><p id="creationDate">${user.getCreationDate()}</p></td>
                        </tr>
                        <tr>
                            <td class="tl">更新时间:</td>
                            <td>${user.getLastUpdateDate()}</td>
                        </tr>
                        <tr>
                            <td class="tl">备注:</td>
                            <td>${user.getComments()}</td>
                        </tr>
                    </table>
                    <table id="t2" class="table table-bordered" style="width: 50%;display: none" >
                        <tr>
                            <td class="tl">用户名:</td>
                            <td><input id="userName" value="${user.getUserName()}"></td>
                        </tr>
                        <tr>
                            <td class="tl">性别:</td>
                            <td><input id="sex" value="${user.getSex()}"></td>
                        </tr>
                        <tr>
                            <td class="tl">年龄:</td>
                            <td><input id="age" value="${user.getAge()}"></td>
                        </tr>
                        <tr>
                            <td class="tl">电话号码:</td>
                            <td><input id="phoneNumber" value="${user.getPhoneNumber()}"></td>
                        </tr>
                        <tr>
                            <td class="tl">创建时间:</td>
                            <td>${user.getCreationDate().toString()}</td>
                        </tr>
                        <tr>
                            <td class="tl">更新时间:</td>
                            <td>${user.getLastUpdateDate()}</td>
                        </tr>
                        <tr>
                            <td class="tl">备注:</td>
                            <td><input id="comments" value="${user.getComments()}"></td>
                        </tr>
                    </table>
                    <div style="margin-left: 15%">
                        <button id="change" class="btn btn-primary">修改</button>
                        <button id="save" class="btn btn-success" style="display: none">保存</button>
                        <button id="back" class="btn btn-info" style="display:none;">返回</button>
                    </div>

                </div>
            </div>
        </div>

    </div>
</body>
</html>
