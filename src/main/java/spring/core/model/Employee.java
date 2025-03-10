package spring.core.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//@Data
@Getter
//@Setter //(value = AccessLevel.PRIVATE)
@ToString //(exclude = "name")
@RequiredArgsConstructor
//@AllArgsConstructor
public class Employee {

	private int id;
	private String name,gender;
	
	public Employee(int id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		System.out.println("Employee.Employee()");
	}
	public void setId(int id) {
		System.out.println("Employee.setId()");
		this.id = id;
	}
	public void setName(String name) {
		System.out.println("Employee.setName()");
		this.name = name;
	}
	public void setGender(String gender) {
		System.out.println("Employee.setGender()");
		this.gender = gender;
	}

}
