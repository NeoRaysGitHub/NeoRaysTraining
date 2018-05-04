			function validate()
			{ 
				 if( document.StudentRegistration.textnames.value == "" || document.S )
				 {
					 document.getElementById('name-error').innerHTML="Please provide your Name";
					 document.StudentRegistration.textnames.focus() ;


					 return false;
				 }
				 else if{
				 	document.getElementById('name-error').innerHTML="";
				 }

				 if( document.StudentRegistration.fathername.value == "" )
				 {
				 	 document.getElementById('fathername-error').innerHTML = "Please provide your Father Name!";
					 document.StudentRegistration.fathername.focus() ;
					 return false;
				 }
				 else{
				 	document.getElementById('fathername-error').innerHTML="";
				 }
				 
				 if( document.StudentRegistration.paddress.value == "" )
				 {
					 document.getElementById('paddress-error').innerHTML = "Please provide your Postal Address!" ;
					 document.StudentRegistration.paddress.focus() ;
					 return false;
				 }
				 else{
				 	document.getElementById('paddress-error').innerHTML="";
				 }

				 if( document.StudentRegistration.personaladdress.value == "" )
				 {
					 document.getElementById('personaladdress-error').innerHTML = "Please provide your Personal Address!" ;
					 document.StudentRegistration.personaladdress.focus() ;
					 return false;
				 }
				  else{
				 	document.getElementById('personaladdress-error').innerHTML="";
				 }

				 if ( ( StudentRegistration.sex[0].checked == false ) && ( StudentRegistration.sex[1].checked == false ) )
				 {
				 	document.getElementById('sex-error').innerHTML =  "Please choose your Gender: Male or Female" ;
				 return false;
				 }
				  else{
				 	document.getElementById('sex-error').innerHTML="";
				 }

				 if( document.StudentRegistration.City.value == "-1" )
				 {
				 		document.getElementById('City-error').innerHTML = "Please provide your City!"  ;
					 document.StudentRegistration.City.focus() ;
					 return false;
				 }
				  else{
				 	document.getElementById('City-error').innerHTML="";
				 }

				 if( document.StudentRegistration.Course.value == "-1" )
				 {
				 		document.getElementById('Course-error').innerHTML = "Please provide your Course!";		
					 return false;
				 }
				  else{
				 	document.getElementById('Course-error').innerHTML="";
				 }

				 if( document.StudentRegistration.District.value == "-1" )
				 {
				 		document.getElementById('District-error').innerHTML =  "Please provide your Select District!" ;		
					 return false;
				 }
				  else{
				 	document.getElementById('District-error').innerHTML="";
				 }

				 if( document.StudentRegistration.State.value == "-1" )
				 {
				 		document.getElementById('State-error').innerHTML =   "Please provide your Select State!" ;
					 	return false;
				 }
				  else{
				 	document.getElementById('State-error').innerHTML="";
				 }

				 if( document.StudentRegistration.pincode.value == "" ||
								 isNaN( document.StudentRegistration.pincode.value) ||
								 document.StudentRegistration.pincode.value.length != 6 )
				 {
				 	document.getElementById('pincode-error').innerHTML =   "Please provide a pincode in the format ######." ;
					 document.StudentRegistration.pincode.focus() ;
					 return false;
				 }
				  else{
				 	document.getElementById('pincode-error').innerHTML="";
				 }

			 // Email validation....
			 var email = document.StudentRegistration.emailid.value;
				atpos = email.indexOf("@");
				dotpos = email.lastIndexOf(".");

			 if (email == "" || atpos < 1 || ( dotpos - atpos < 2 )) 
			 {
			 		document.getElementById('emailid-error').innerHTML =  "Please enter correct email ID" ;
					 document.StudentRegistration.emailid.focus() ;
					 return false;
			 }
			  else{
				 	document.getElementById('emailid-error').innerHTML="";
				 }

 
				if( document.StudentRegistration.dob.value == "" )
				 {
				 	 document.getElementById('dob-error').innerHTML = "Please provide your DOB!"  ;
					 document.StudentRegistration.dob.focus() ;
					 return false;
				 }
				 else{
				 	document.getElementById('dob-error').innerHTML="";
				 }

				if( document.StudentRegistration.mobileno.value == "" ||
								 isNaN( document.StudentRegistration.mobileno.value) ||
								 document.StudentRegistration.mobileno.value.length != 10 )
				 {
				 	document.getElementById('mobileno-error').innerHTML =  "Please provide a Mobile No in the format 123."  ;
					 document.StudentRegistration.mobileno.focus() ;
					 return false;
				 }
				 else{
				 	document.getElementById('mobileno-error').innerHTML="";
				 }

				 return( true );
			}