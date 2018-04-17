package com.neo.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class PhoneForm  extends ActionForm {
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		String phone;

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public ActionErrors validate(ActionMapping pMapping, HttpServletRequest pRequest) {
			
			ActionErrors errors = new ActionErrors();
			
			if (phone == null || phone.length() == 0) {
				errors.add("phone", new ActionMessage("errors.search.phone.required"));
						
			} else if (phone.length() != 10) {
				errors.add("phone", new ActionMessage("errors.search.phone.length"));
											
			} else {
				try {
					long ph = Long.parseLong(phone);
				} catch (Exception e) {
					errors.add("phone", new ActionMessage("errors.search.phone.notnumber"));
							
				}
			}
			return errors;
		}

	}

