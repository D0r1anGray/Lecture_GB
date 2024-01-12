package Java_BasicAPI.Lecture1.Task7_FormatOutput;

public class program {
    public static void main(String[] args) {
        String s = "qwerty";
        int a = 123;
        String b = s + a;
        System.out.println(b);
        // Может быть вопрос сколько строк по итогу получили? Ответ 4, так как: 5-ая строчка, 3х7-ая строчка
        //(неявное преобразование a - первая строчка, конкатенация s + a - вторая строчка и занесение это в b -
        // третья строчка).

    }
    
}
