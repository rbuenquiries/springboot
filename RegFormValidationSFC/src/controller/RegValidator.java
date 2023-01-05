package controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class RegValidator implements Validator {

	@Override
	public boolean supports(Class c) {

		return true;
	}

	@Override
	public void validate(Object bean, Errors error) {
		RegBean rb = (RegBean) bean;
		if (rb.getName().equals(""))
			error.reject("msg1");
		if (rb.getEmail().equals(""))
			error.reject("msg2");
		if (rb.getAddress().equals(""))
			error.reject("msg3");

	}
}
