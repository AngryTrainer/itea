package lesson01;

import java.io.Serializable;

public class Dog extends Animal implements Serializable{
	String type="dog";
	
	Dog(String name) {
		super(name);
	}

}
