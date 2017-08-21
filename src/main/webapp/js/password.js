function check(){
	var pw=document.getElementById("pw").value;
	var pw2=document.getElementById("pw2").value;
	if(pw!=pw2){
		alert("两次密码不一致")
		return false;
	}
	return true;
}