function check(){
	var name=document.getElementById("name").value;
	var password=document.getElementById("password").value;
	if(name=""||name==null||password==null){
		alert("用户名或密码不能为空！")
		return false;
	}else{
		return true;
	}
}