<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<style>
	.login{
		background-color:rgb(2,158,255);
		color:white;
		border:none;
		height:36px;
		width:74px;
		border-radius:18px;
		font-weight:bold;
		font-size:15px;
		cursor:pointer;
		transition:opacity 0.2s,box-shadow 0.2s;
	}
	.reset{
		background-color:rgb(2,158,255);
		color:white;
		border:none;
		height:36px;
		width:74px;
		border-radius:18px;
		font-weight:bold;
		font-size:15px;
		cursor:pointer;
		transition:opacity 0.2s,box-shadow 0.2s;
	}
	.login:hover{
		opacity:0.7;
		box-shadow:5px 5px 10px rgba(0,0,0,0.15);
	}
	.reset:hover{
		opacity:0.7;
		box-shadow:5px 5px 10px rgba(0,0,0,0.15);
	}
	.login:active{
		opacity:0.3;
	}
	.reset:active{
		opacity:0.3;
	}
	body{
			background-image: url('Img/background.jpg');
            background-size: cover; /* 背景图片覆盖整个页面 */
            background-repeat: no-repeat; /* 不重复背景图片 */
		
	}
	.login-style{
		height: 420px;
        width: 500px;
        border: 1px solid ;
        border-radius: 20px;
        font-size: 26px;
        background: rgba(255, 255, 255, 0.3); /* 半透明白色 */
        backdrop-filter: blur(10px); /* 背景模糊效果 */
        border: 1px solid rgba(255, 255, 255, 0.2); /* 边框（可选） */
        /* 圆角（可选） */
        box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2); /* 阴影（可选） */
	}
	body {
            margin: 0;
            display: flex;
            justify-content: center; /* 水平居中 */
            align-items: center;   /* 垂直居中 */
            height: 100vh;        /* 全屏高度 */
            background-color: #f0f0f0; /* 背景颜色（可选） */
        }
     .account{
     	height:20px;
     	padding-top:5px;
     }
     .pwd{
     	height:20px;
     	padding-top:5px;
     }
</style>
</head>
<body >
<form action="Logincheck" method="post">
		<div style="text-align:center;" class="login-style">
		<h1>Login</h1>
		<p style="text-align: center;">账号：<input class="account" type="text" name="account"></p>
		<p>密码：<input class="pwd" type="password" name="pwd"></p>
		<input class="login" type="submit" value="登陆">
		<a href=front.jsp><input class="reset" type="button" value="返回"></a><br>
		<c:if test="${requestScope.loginError != null }">
			<span style="color:red">${requestScope.loginError }</span>
		</c:if>
		<c:if test="${requestScope.loginError2 != null }">
			<span style="color:red">${requestScope.loginError2 }</span>
		</c:if>
		</div>
	</form>
</body>
</html>