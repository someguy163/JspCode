function check() {
	if (document.frm.id.value == "") {
		alert("아이디를 입력해주세요.");
		document.frm.id.focus();
		return false;	
	}else if (document.frm.pw.value == "") {
		alert("비밀번호를 입력해주세요.");
		document.frm.pw.focus();
		return false;	
	} else {
		return true;
	}
	
}