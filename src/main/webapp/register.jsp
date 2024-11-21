<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
<link rel="stylesheet" href="Styles/head.css">
<style>
	.button{
		background-color:rgb(2,158,255);
		color:white;
		border:none;
		height:36px;
		width:74px;
		border-radius:18px;
		font-weight:bold;
		font-size:15px;
		cursor:pointer;
	}
	.button:hover{
		opacity:0.8;
	}
	.button:hover{
		opacity:0.8;
	}2
	.button:active{
		opacity:0.3;
	}
	.button:active{
		opacity:0.3;
	}
	.register-style{
	
		height: 320px;
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
</style>

</head>
<body>
<form action="Addition" method="post">
		<div style="text-align:center;" class="register-style">
			
				<p>账号：<input type="text" name="account"></p>
				<p>密码：<input type="text" name="pwd"></p>
				<p>邮箱：<input type="text" name="mail"></p>
				<input class="button" type="submit" value="提交" >
					<a href=front.jsp><input class="reset" type="button" value="返回"></a><br>
				<c:if test="${requestScope.addSuccess != null }">
					<span style="color:red">${requestScope.addSuccess }</span>
				</c:if>
				<c:if test="${requestScope.addError != null }">
					<span style="color:red">${requestScope.addError }</span>
				</c:if>
		</div>
	</form>
</body>
</html>