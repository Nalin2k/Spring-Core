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
@Setter //(value = AccessLevel.PRIVATE)
@ToString //(exclude = "name")
@RequiredArgsConstructor
@AllArgsConstructor
public class Address {
	
	private String city, state;
}
