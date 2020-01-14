var validChk = function(str, typ){
	if(typ == "userId"){
		var regExp = /[\{\}\[\]\/?.,;:|\)*~`!^\-+<>@\#$%&\\\=\(\'\"]/gi;
		 
		if(regExp.test(str)){
			return false;
		}else{
			return true;
		}
	}
};

