package com.clust.customexceptions;

	import org.springframework.http.HttpStatus;

	import org.springframework.web.bind.annotation.ResponseStatus;

	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Student Not Found") //404
	public class StudentNotFoundException extends Exception {

		private static final long serialVersionUID = -3332292346834265371L;

		public StudentNotFoundException(int id){
			super("StudentNotFoundException with id="+id);
		}
	}
