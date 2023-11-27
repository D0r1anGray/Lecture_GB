//Факториал через рекурсию

double Factorial(double n){
    if(n == 1 || n == 0){
        return 1;
    }
    else{
        return n * Factorial(n - 1);
    }
}

// System.Console.WriteLine(Factorial(0));

for(int i = 0; i < 40; i++){
    System.Console.WriteLine($"{i}! = {Factorial(i)}");
}