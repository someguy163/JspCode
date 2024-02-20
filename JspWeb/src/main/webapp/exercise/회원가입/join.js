/**
 * 
 */

	function check_ok() {
		if (document.reg_frm.name.value.length == 0) {
			alert("이름을  써주세요.");
			reg_frm.name.focus();
			return false;
		}
	if (document.reg_frm.jumin_1.value.length != 6) {
			alert("주민번호 6글자이어야 합니다.");
			reg_frm.jumin_1.focus();
			return false;
		}
	if (document.reg_frm.jumin_2.value.length != 7) {
			alert("주민번호 7글자이어야 합니다.");
			reg_frm.jumin_2.focus();
			return false;			
		}
	if (document.reg_frm.id.value.length == 0) {
			alert("아이디를 써주세요");
			reg_frm.id.focus();
			return false;
		}
	if (document.reg_frm.id.value.length < 4) {
			alert("아이디는 4글자이상이어야 합니다.");
			reg_frm.id.focus();
			return false;
		}
	 if (document.reg_frm.pwd.value == "") {
			alert("패스워드는 반드시 입력해야 합니다.");
			reg_frm.pwd.focus();
			return false;
		}
	if (document.reg_frm.pwd.value != document.reg_frm.pwd_re.value) {
			alert("패스워드가 일치하지 않습니다.");
			reg_frm.pwd_re.focus();
			return false;
		}
	return trun;

	}