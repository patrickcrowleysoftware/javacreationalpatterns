package com.patrick.java.patterns.creational;

import com.patrick.java.patterns.creational.singleton.SingleObject;

public class SingletonDemo {

	   public static void main(String[] args) {

		      //illegal construct
		      //Compile Time Error: The constructor SingleObject() is not visible
		      //SingleObject object = new SingleObject();

		      //Get the only object available
		      SingleObject object = SingleObject.getInstance();

		      //show the message
		      object.showMessage();
		   }
	}