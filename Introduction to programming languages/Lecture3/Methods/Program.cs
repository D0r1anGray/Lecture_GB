//1 вид Метода - Ничего не принимает и ничего не возвращает.
void Method1(){
    System.Console.WriteLine("Автор сего проекта Лол Галимов!"); //Можно использовать в принципе для указания авторства
}
//Method1();//Как вызвать метод. Обязательно скобочки!!!


//2 вид Метода - Ничего не возвращают, но что-то принимают
void Method2(string msg){
    System.Console.WriteLine(msg);
}
//Method2("Лол Галимов!!!");//- указание неименованного аргумента

void Method21(string msg, int count){
    int i =0;
    while(i < count){
        Console.WriteLine(msg);
        i++;
    }
}
//Method21(msg: "Галимов Лол!!!", count: 4); //-указание именованного аргумента (Можно писать не по-порядку)


//3 вид Метода - Что-то возвращают, но ничего не принимают 
int Method3(){
    return DateTime.Now.Year;
}
// int year = Method3();
// System.Console.WriteLine(year);

//4 вид Метода - Что-то возвращают и что-то принимают
string Method4(int count, string text){
    int i = 0;
    string result = String.Empty;
    while(i < count){
        result = result + text;
        i++;
    }
    return result;
}
string res = Method4(10, "йцукен");
Console.WriteLine(res);