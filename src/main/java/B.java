public class B extends  A{
    String meth(){

        return "Method is overridden in Extendend class B";
    }

    public static void main(String[] args) {
        B obj = new B();
        obj.meth();

        B obj1 = new B();
        obj1.meth();
    }
}
