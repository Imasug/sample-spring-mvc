package jp.imanaga.sample.spring.mvc.common.helpers;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class MessageHelper {

	@Autowired
	private MessageSource messageSource;

	public String toText(String key, Object... parameters) {
		return this.messageSource.getMessage(key, parameters, Locale.getDefault());
	}

}
