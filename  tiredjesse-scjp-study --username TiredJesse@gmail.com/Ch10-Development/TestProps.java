import java.util.*;

public class TestProps {
  public static void main(String[] args) {
    String property;
    Properties p = System.getProperties();
    p.setProperty("myProp", "myValue");
    p.list(System.out);
    property = p.getProperty("newProp", "newValue");
    System.out.printf("The prorperty of newProp is: %s\n", property);
  }

}