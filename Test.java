public class Test {
     void show(int a) // Same method whit different method
     {
        System.out.print("Dheeraj ");
     }
     void show(int a ,int b) // Same method whit different method
     {
        System.out.print("Niraj kumar");
     }
     public static void main(String[] args){ // main method
        Test t=new Test(); // object
        t.show(10,20); //display
     }
}
// polymorphism method overloding