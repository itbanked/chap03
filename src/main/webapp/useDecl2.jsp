<%@ page contentType="text/html; charset=utf-8" %>
<%!
	public int add(int a, int b){
		int c = a + b;
		return c;
	}
	public int substract(int a, int b){
		int c = a - b;
		return c;
	}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스크립트릿에서 선언부 사용하기</title>
</head>
<body>
<%
	int val1 = 3;
	int val2 = 9;
	
	int addresult = add(val1,val2);
	int subresult = substract(val1, val2);	
%>

<%=val1 %> + <%=val2 %> = <%= addresult %>
<br>
<%=val1 %> - <%=val2 %> = <%= subresult %>

</body>
</html>