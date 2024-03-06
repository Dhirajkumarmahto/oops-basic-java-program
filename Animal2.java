public class Animal2 {
    
    String color;
    int age;

    public static void main(String[] args) {

        Animal2 buzo = new Animal2(); // Corrected the class name
        buzo.color = "BLACK";
        buzo.age = 10; // Corrected the assignment without quotes for integers
        System.out.println(buzo.color+ buzo.age);
    }
}
