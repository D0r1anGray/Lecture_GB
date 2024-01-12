package Java_BasicAPI.Lecture1.Task5_Massive;

public class program {
    public static void main(String[] args) {
        // Одномерные массивы
        int[] arr = new int[10];
        arr[3] = 13;
        System.err.println(arr[3]);

        int[] array = {1, 2, 3, 4, 5};
        System.err.println(array[2]);

        int brr[]; //Так тоже можно написать, но есть нюанс
        int[] crr; //Так тоже можно написать, но есть нюанс

        // Многомерные массивы
        int[] lol[] = new int[3][5]; //или так int[][] lol = new int[3][5]

        for (int i = 0; i < lol.length; i++){
            for(int j = 0; j < lol[i].length; j++){
                System.out.printf("%d ", lol[i][j]);
            }
            System.err.println();
        }


    }
}
