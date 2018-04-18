function validate()
{
		var name=document.form.name.value;
		var age=document.form.age.value;
		var mobile=document.form.mobile.value;
		var email=document.form.email.value;
		var password=document.form.password.value;
		var pswd=document.form.pswd.value;

		
		 if(!isNaN(name))
			{
			alert("Name cannot contain numbers");
			return false;
			}
		else if(name.length<2)
			{
			alert("Invalid name");
			return false;
			}


		 if(isNaN(age))
			{
			alert("Age contains only numbers");
			return false;
				}
		 
		 if(isNaN(mobile))
			{
			alert("Mobile contains only numbers");
			return false;
			}
		else if(mobile.length > 10 || mobile.length < 10)
			{
			alert("Please enter correct digits!!!! ");
			return false;
			}

	

		if(password == null||password == "")
			{
			alert("Please enter password");
			return false;
			}
		
		else if(password.length < 6)
			{
			alert("Weak password!!!! ");
			return false;
			}


		if(pswd != password)
			{
			alert("Re-Confirm password!!!! ");
			return false;
			}
		
		
		
	}

	