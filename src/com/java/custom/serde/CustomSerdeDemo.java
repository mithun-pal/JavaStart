package com.java.custom.serde;
import java.io.*;


class Account implements Serializable{
  String name="Mithun";
 transient String pw = "hello";

 private void writeObject(ObjectOutputStream os) throws Exception{
 os.defaultWriteObject();
 String epw = "123"+pw;
 os.writeObject(epw);
}
private void readObject(ObjectInputStream is) throws Exception{
 is.defaultReadObject();
 String epw = (String)is.readObject();
 pw = epw.substring(3);
}

}
public class CustomSerdeDemo {
  public static void main(String[] args) throws Exception{
    Account a1 = new Account();
    FileOutputStream fos = new FileOutputStream("file.ser");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(a1);

    FileInputStream fis = new FileInputStream("file.ser");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Account a2 = (Account)ois.readObject();

    System.out.println(a2.name+"........"+a2.pw);
    //System.out.println(ois.readObject());




  }

}
