public class override { // class name 
    void show() //  Same method
    {
        System.out.print("Dheeraj");
    }
    public class xyz extends override // different class 
    {
        void show() // Same method
        {
            System.out.print("Niraj");
        }
    }
    public static void main(String [] args) // main method
    {
        override o=new override(); // object 
        o.show();
    }

}
