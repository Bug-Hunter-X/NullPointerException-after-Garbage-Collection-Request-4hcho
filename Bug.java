public class MyClass {
    private int x = 0;

    public void incrementX() {
        x++;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.incrementX();
        System.out.println(obj.getX()); // Output: 1
        obj = null; // Making the object eligible for garbage collection
        System.gc(); // Requesting garbage collection
        System.out.println(obj.getX()); // Throws NullPointerException
    }
}