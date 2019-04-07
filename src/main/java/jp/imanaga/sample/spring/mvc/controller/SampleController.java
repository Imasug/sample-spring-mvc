package jp.imanaga.sample.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.imanaga.sample.spring.mvc.data.SampleData;

@RestController
public class SampleController {

	// test
	@RequestMapping("/test-web")
	public String test() {
		return "test";
	}

	@GetMapping("/")
	public SampleData getData() {
		return new SampleData(0, "nomal");
	}

	@PostMapping("/check")
	public String check(@Valid @RequestBody SampleData data) {
		return "check";
	}

	@GetMapping("/error")
	public String error() {
		String nullValue = null;
		nullValue.toString();
		return "error";
	}

}
