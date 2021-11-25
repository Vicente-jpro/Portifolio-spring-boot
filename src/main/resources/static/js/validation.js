function validationSave() {
	
	let name = $('#name').val();
	let email = $('#email').val();
	
	if (name === '' || name.lenght() < 0) {
		alert('Name can not be null');
		return false;
	} else if (email === '' || email.lenght() < 0) {
		alert('Email can not be null')
		return false;
	}
	
	return true;
}

