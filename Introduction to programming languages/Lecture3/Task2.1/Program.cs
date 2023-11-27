//Отсортировать массив, используя сортировку Выбором. От наибольшего к меньшему.

int[] arr = {2,3,5,6,7,8,45,3,2,5,6,8,9,5,43,54,56,7,6};

void PrintArray(int[] array){
    int count = array.Length;

    for(int i = 0; i < count; i++){
        System.Console.Write($"{array[i]} ");
    }
    System.Console.WriteLine();
}
//PrintArray(arr);

void SelectionSort(int[] array){

    for(int i = 0; i < array.Length - 1; i++){
        int minPosition = i;

        for(int j = i+1; j < array.Length; j++){
            if(array[j] < array[minPosition]){
                minPosition = j;
            }
        }
        int temp = array[i];
        array[i] = array[minPosition];
        array[minPosition] = temp;
        // array[i] = array[i] + array[minPosition];
        // array[minPosition] = array[i] - array[minPosition];
        // array[i] = array[i] - array[minPosition];
        
    }
    
}

SelectionSort(arr);
PrintArray(arr);