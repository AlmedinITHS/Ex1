public class Person {
  private static String name;
  public int age;

  public void setName(String n) {
    name = n;
  }
  public String getName() {
    return name;
  }
  public String toString() {
    return "age is:" + age + "\nname is: " + name;
  }
}
