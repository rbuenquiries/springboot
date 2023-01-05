package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class RegFormSFC extends SimpleFormController {

	public RegFormSFC() {
		setCommandName("RF");
		setFormView("regform");
		setCommandClass(RegBean.class);
		setValidator(new RegValidator());
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {

		RegBean rb = (RegBean) command;
		System.out.println(rb.getName());
		System.out.println(rb.getEmail());
		System.out.println(rb.getAddress());

		return new ModelAndView("success");
	}

}
