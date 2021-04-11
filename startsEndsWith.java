public class startsEndsWith {
    public static void main(String args[]) {
      System.out.println("endsWith IS case-sensitive \n"+("Foobar".endsWith("Bar")));
      
      System.out.println("Foobar".endsWith("bar"));
      
      System.out.println("\n***\nstartsWith IS case-sensitive \n"+("Foobar".startsWith("Foo")));
      System.out.println(("Foobar".startsWith("foo")));
      
      System.out.println("\n***\nstartsWith == endsWith \n"+("Foobar".startsWith("bar",3)));
    }
}