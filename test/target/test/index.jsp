<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<head>
    <script src="static/js/jquery3.3.1.js" type="text/javascript"></script>
    <script>
        $(document).ready(function () {
            $("#login").click(function () {

                var user = {userName:$("#username").val(),password:$("#password").val()};
                $.ajax({
                    url:"login",
                    dataType : "JSON",
                    data:user,
                    type:"POST",
                    success:function(result){
                        if(result.code==100) {
                            console.log("yes");
                            window.location.href = "http://localhost:8080/test/user"
                        }
                        else {
                            console.log(result.extend.va_msg);
                            $("#err").show();
                            $("#err").text(result.extend.va_msg);
                        }
                    }
                });
            });
        });
    </script>
</head>
<body>
<h2>登陆页面</h2>
<p>用户名</p>
<input type="text" id="username">
<p>密码</p>
<input type="password" id="password">
<button id="login">登陆</button>
<p style="color: red;display: none" id="err">错误提示</p>
</body>
</html>
