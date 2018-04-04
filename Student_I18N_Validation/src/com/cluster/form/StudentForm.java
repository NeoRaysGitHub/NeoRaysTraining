package com.cluster.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class StudentForm extends ActionForm {
		private int id;
		private String name;
		private String address;
		private String phone;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		@Override
		public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		ActionErrors ae = new ActionErrors();
		if(id==0)
			ae.add("id",new ActionMessage("msg1"));
		if(name.equals("") && name.trim().length()==0)
			ae.add("name", new ActionMessage("msg2"));
		if(address.equals("") && address.trim().length()==0)
			ae.add("address",new ActionMessage("msg3"));
		if(phone.equals("") && phone.trim().length()==0)
			ae.add("phone", new ActionMessage("msg4"));
		return ae;
		}
}
