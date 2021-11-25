
	
	function validationSave() {

	let name = $('#name').val();
	let email = $('#email').val();
	
	if (name === '' ) {
		alert('Name can not be null');
		return false;
	} else if (email === '' ){
		alert('Email can not be null')
		return false;
	}
	
	return true;
}

