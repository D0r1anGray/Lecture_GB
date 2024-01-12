package Java_BasicAPI.Lectures.Lecture1.Task1;

public class program {
    public static void main(String[] args) {
        var a = 123;
        System.out.println(a); // 123
        var d = 123.456;
        System.out.println(d); // 123.456 System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double d = 1022; = System.out.println(d); // 1022
        //а = "mistake";
        //error: incompatible types:
        //String cannot be converted to double
    }
    static String getType (Object o) {
        return o.getClass() .getSimpleName ();
    }
}