import java.lang.reflect.Array;
class Cat {
    int a = 10;
    String b = "황보";

    public Cat(){}

    public Cat(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

public class Main {
    public static void main(String[] args) {
        int i = 0;
        String hi = "hihi";

        Cat cat = new Cat(11, "성현");
        Cat cat1 = new Cat(12, "황보");


        System.out.println("cat =" + cat);
        System.out.println("cat1 =" + cat1);

        cat = cat1;

        System.out.println("cat =" + cat);
        System.out.println("cat1 =" + cat1);

    }
}