//Class MyClass with some instance members
package com.fileio.myclass;

import java.io.Serializable;

public class MyClass implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int value;
	
	public MyClass(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}

	//Display details
	@Override
	public String toString() {
		return "MyClass [name=" + name + ", value=" + value + "]";
	}	

}
