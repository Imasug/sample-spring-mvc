package jp.imanaga.sample.spring.mvc.data;

import javax.validation.constraints.Size;

public class SampleData {

	private int id;

	@Size(max = 5)
	private String name;

	public SampleData() {
	}

	public SampleData(int id, String name) {
		this.id = id;
		this.name = name;
	}

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

}
