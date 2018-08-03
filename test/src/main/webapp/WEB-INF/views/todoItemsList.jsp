<%--
  Created by IntelliJ IDEA.
  User: fhd
  Date: 2018/7/23
  Time: 23:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<html>
<head>
    <title>代办事项</title>
    <script src="${APP_PATH }/static/js/jquery3.3.1.js" type="text/javascript"></script>
    <script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.js" type="text/javascript"></script>
    <link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="${APP_PATH }/static/css/userList.css" rel="stylesheet" type="text/css">
    <script>
        $(document).ready(function () {
            $(".btn-danger").click(function () {
                alert($(this).next().val());
            });
            $(".btn-success").click(function () {
                alert($(this).next().next().val());
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
            <div class="ll">
                <a href="user">用户信息</a>
            </div>
            <div style="background-color: #28b779;" class="ll">
                <a >代办事项</a>
            </div>
        </div>
        <div class="col-md-10 r">
            <div class="rhead">
                <p style="font-size: 20px;font-weight: 600;margin: 10px 10px;">用户信息</p>
            </div>
            <div class="rcontent">
                <table class="table table-bordered" style="width: 100%">
                    <tr>
                        <td>序号:</td>
                        <td>标题:</td>
                        <td>内容:</td>
                        <td>优先级:</td>
                        <td>创建时间:</td>
                        <td>更新时间:</td>
                        <td>备注:</td>
                        <td>操作</td>
                    </tr>
                    <c:set var="index" value="${(pageInfo.pageNum-1)*6}" />
                    <c:forEach items="${pageInfo.list }" var="todo">
                        <c:set var="index" value="${index+1}" />
                        <tr>
                            <td>${index}</td>
                            <td>${todo.todoItemTitle }</td>
                            <td>${todo.todoItemContent }</td>
                            <td>${todo.priority}</td>
                            <td>${todo.creationDate }</td>
                            <td>${todo.lastUpdateDate}</td>
                            <td>${todo.comments}</td>
                            <td>
                                <button class="btn btn-success" >修改</button>
                                <button class="btn btn-danger"  >删除</button>
                                <input value="${todo.todoItemId}" type="hidden">
                            </td>
                        </tr>
                    </c:forEach>
                </table>
                <!-- 显示分页信息 -->
                <div class="row">
                    <!--分页文字信息  -->
                    <div class="col-md-6">当前 ${pageInfo.pageNum }页,总${pageInfo.pages }
                        页,总 ${pageInfo.total } 条记录
                    </div>
                    <!-- 分页条信息 -->
                    <div class="col-md-6">
                        <nav aria-label="Page navigation">
                            <ul class="pagination">
                                <li><a href="${APP_PATH }/todoItems?pn=1">首页</a></li>
                                <c:if test="${pageInfo.hasPreviousPage }">
                                    <li><a href="${APP_PATH }/todoItems?pn=${pageInfo.pageNum-1}"
                                           aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
                                    </a></li>
                                </c:if>


                                <c:forEach items="${pageInfo.navigatepageNums }" var="page_Num">
                                    <c:if test="${page_Num == pageInfo.pageNum }">
                                        <li class="active"><a href="#">${page_Num }</a></li>
                                    </c:if>
                                    <c:if test="${page_Num != pageInfo.pageNum }">
                                        <li><a href="${APP_PATH }/todoItems?pn=${page_Num }">${page_Num }</a></li>
                                    </c:if>

                                </c:forEach>
                                <c:if test="${pageInfo.hasNextPage }">
                                    <li><a href="${APP_PATH }/todoItems?pn=${pageInfo.pageNum+1 }"
                                           aria-label="Next"> <span aria-hidden="true">&raquo;</span>
                                    </a></li>
                                </c:if>
                                <li><a href="${APP_PATH }/todoItems?pn=${pageInfo.pages}">末页</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
