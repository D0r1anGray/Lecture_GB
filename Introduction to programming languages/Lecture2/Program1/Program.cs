//Нахождение максимума из 9 чисел "стихийным" способом
int a1 = 14;
int b1 = 45;
int c1 = 36;
int a2 = 3;
int b2 = 63;
int c2 = 23;
int a3 = 12312;
int b3 = 16;
int c3 = 47;

int max = a1;

if (b1 > max) {
    max = b1;
}
if (c1 > max) {
    max = c1;
}

if (a2 > max) {
    max = a2;
}
if (b2 > max) {
    max = b2;
}
if (c2 > max) {
    max = c2;
}

if (a3 > max) {
    max = a3;
}
if (b3 > max) {
    max = b3;
}
if (c3 > max) {
    max = c3;
}

 System.Console.WriteLine("Максиму " + max);
