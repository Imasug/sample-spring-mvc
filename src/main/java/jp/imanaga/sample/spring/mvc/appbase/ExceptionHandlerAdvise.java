package jp.imanaga.sample.spring.mvc.appbase;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import jp.imanaga.sample.spring.mvc.common.helpers.MessageHelper;
import jp.imanaga.sample.spring.mvc.data.SampleData;

@RestControllerAdvice
public class ExceptionHandlerAdvise {

	@Autowired
	private MessageHelper messageHelper;

	@ExceptionHandler
	public String bindingError(MethodArgumentNotValidException e) {

		System.out.println("bindingError");

		BindingResult result = e.getBindingResult();
		for (FieldError error : result.getFieldErrors()) {
			String fieldName = error.getField();
			MessageFormat messageFormat = new MessageFormat(error.getDefaultMessage());
			String message = messageFormat.format(new Object[] { this.messageHelper.toText(fieldName) });
		}

		return "bindingError";
	}

	@ExceptionHandler
	public SampleData anotherError(Exception e) {
		return new SampleData(-1, "error");
	}

}
