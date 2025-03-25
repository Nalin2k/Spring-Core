package spring.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//@Data
@Getter
@Setter //(value = AccessLevel.PRIVATE)
@ToString //(exclude = "name")
@RequiredArgsConstructor
@AllArgsConstructor
public class Address {
	
	private String city, state;
}
