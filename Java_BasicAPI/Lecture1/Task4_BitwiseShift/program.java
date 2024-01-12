package Java_BasicAPI.Lecture1.Task4_BitwiseShift;

public class program {
    public static void main(String[] args) {
        int a = 8;
        // 1000
        // Побитовый сдвиг влево и вправо
        System.out.println(a << 1); // Вывод 16
        System.out.println(a >> 1); // Вывод 4

        int b = 5;
        int c = 2;
        // Побитовое "или"
        // 101 'или' 010 = 111
        System.out.println(b | c); // Вывод 7
        
        // Побитовое "и"
        // 101 'и' 010 = 000
        System.out.println(b & c); // Вывод 0

        // Разделительное "или"
        // Истино тогда, когда одно из строго истино. То есть 101 ^ 010 = 111
        System.out.println(b ^ c); // Вывод 7

        boolean an = true;
        boolean bn = true;
        System.out.println(an & bn); // 1 'и' 1 = 1
        System.out.println(an && bn); // && - быстрая операция

    }
    
}
