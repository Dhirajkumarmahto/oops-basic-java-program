class A{ // class 
    int a=10; // instance variable
}
class B extends A{ // second class with inheritanse
    int a=20;
    void show(int a){ // method
        System.out.println(super.a); // use super keyword for parent class
        System.out.println(this.a); // this keywor used for current instance variable 
        System.out.println(a); // display show method
    }
    public static void main(String[] args){ //main method
        B ob1=new B(); // object
        ob1.show(30);
    }
}