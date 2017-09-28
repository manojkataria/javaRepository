package main.java;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BSerializer {

    public static void main(String ... args) throws Exception {
        B b = new B();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(b);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        B deserialized = (B) ois.readObject();   //InvalidClassException
        System.out.println(deserialized.defaultValue);
    }
}

 class A {
	public int defaultValue; 
    public A(String some) {};
    public A() {
    	defaultValue = 10;
    } //as protected or public everything would work
}

 class B extends A implements Serializable {
	 public int defaultValue; 
	 public B() {
		 
        super("");
        defaultValue = 20; 
    }
    //these doesn't really matter
    //private void writeObject(java.io.ObjectOutputStream out) throws IOException {  }
    //private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException { }
}