$(document).ready(
		function() {
			$("#submit").click(
					function() {
						var username = $('#username').val();
						var email = $('#email').val();
						var password = $('#password').val();
						var conformpassword = $('#conformpassword').val();
						var phone = $('#phone').val();
						if (username.length == 0) {
							$("#username_error").text(
									"UserName Should not be  Empty");
							$("#username").focus();
							return false;
						} else if (email.length == 0) {
							$("#username_error").text("");
							$('#email_error')
									.text("Email Should not be  Empty")
							$("#email_error").focus();
							return false;
						} else if (password.length == 0) {
							$('#email_error').text("")
							$('#password_error').text(
									"Password Should not be  Empty")
							$("#password").focus();
							return false;
						} else if (conformpassword.length == 0) {
							$('#password_error').text("")
							$('#conformpassword_error').text(
									"Conform Password Should not be  Empty")
							$("#conformpassword").focus();
							return false;
						} else if (phone.length == 0) {
							$('#conformpassword_error').text("")
							$('#phone_error')
									.text("Phone Should not be  Empty")
							$("#phone").focus();
							return false;
						}
					});
		});