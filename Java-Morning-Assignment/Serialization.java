package com.assignment;
import java.io.*;
import java.util.*;
class Emp implements Serializable {

  UUID serialversionUID = new UUID(100,10);
  transient int usn;
  transient String department;
  int id;
  String name;
  int age;

  public Emp(String name, int age, int usn, String department,int id) {
      this.name = name;
      this.age = age;
      this.usn = usn;
      this.department = department;
      this.id = id;
  }

}

public class Serialization {
  public static void printdata(Emp object1) {

      System.out.println("name = " + object1.name);
      System.out.println("age = " + object1.age);
      System.out.println("usn = " + object1.usn);
      System.out.println("department = " + object1.department);
      System.out.println("id = " + object1.id);
  }

  public static void main(String[] args) {
      Emp object = new Emp("Saumya", 21, 91, "computer science",1);
      String filename = "saumya_details.txt";

      try {

          FileOutputStream file = new FileOutputStream(filename);
          ObjectOutputStream out = new ObjectOutputStream(file);

          out.writeObject(object);

          out.close();
          file.close();

          System.out.println("Object has been serialized\n" + "Data before Deserialization.");
          printdata(object);

      }

      catch (IOException ex) {
          System.out.println("IOException is caught");
      }

      object = null;

      try {

          FileInputStream file = new FileInputStream(filename);
          ObjectInputStream in = new ObjectInputStream(file);

          object = (Emp) in.readObject();

          in.close();
          file.close();
          System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
          printdata(object);

      }

      catch (IOException ex) {
          System.out.println("IOException is caught");
      }

      catch (ClassNotFoundException ex) {
          System.out.println("ClassNotFoundException" + " is caught");
      }
  }
}
