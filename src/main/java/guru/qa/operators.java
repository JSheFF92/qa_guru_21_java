package guru.qa;

public class operators {
    public static void main(String[] args) {

        //TODO
        // 0) прочитать про диапазоны типов данных для вещественных / чисел с плавающей точкой
        // https://javarush.com/groups/posts/2136-ustroystvo-vejshestvennihkh-chisel
        // 1) поупражняться с математическими и логическими операторами, добиться переполнения при вычислениях,
        // посмотреть результаты (вывести в консоль)
        // Переполнение арифметических методов + инкремент + дикремент
        byte b = -128; // диапазон от -128 до 127!
        short s = 32767; // –32768 до 32767
        int i = 2147483647; // -2 147 483 648 до 2 147 483 647
        long l = 9223372036854775807L; // 9 223 372 036 854 775 808 до 9 223 372 036 854 775 807
        char c = (char) -1;//0 до 65536

        b -= 2;
        s += 2;
        i += 3;
        l += 2;
        c += 1244;

        System.out.println("перегрузка byte: " + b);
        System.out.println("перегрузка short: " + s);
        System.out.println("перегрузка int: " + i);
        System.out.println("перегрузка long: " + l);
        System.out.println("перегрузка char: " + c);

        //математические операции
        int plus = 54;
        System.out.println("математическая операция '+': " + (-20 + plus));

        int minus = 54;
        System.out.println("математическая операция '-': " + (- 20 - minus));

        int multiplication = 46;
        System.out.println("математическая операция '*': " + multiplication * 0.2);

        int division = 746347324;
        System.out.println("математическая операция '/': " + division / 34);

        int remainder = 85;
        System.out.println("математическая операция '%': " + remainder % 9);

        int inc = 5;
        int dec = 5;
        inc--;
        dec++;
        System.out.println("инкремент: " + inc);
        System.out.println("декремент: " + dec);

        int after = 5;
        int before = 5;
        before += 6;
        after -= 6;
        System.out.println("прибавить сначала потом вывести результат: " + before);
        System.out.println("отнять сначала потом вывести результат:" + after);



        //логиеские операции

       int oneNumber = 5;
       int twoNumber = 10;
        System.out.println("oneNumber == twoNumber: " + (oneNumber == twoNumber));
        System.out.println("oneNumber > twoNumber: " + (oneNumber > twoNumber));
        System.out.println("oneNumber < twoNumber: " + (oneNumber < twoNumber));
        System.out.println("oneNumber != twoNumber: " + (oneNumber != twoNumber));
        System.out.println("oneNumber >= twoNumber: " + (oneNumber >= twoNumber));
        System.out.println("oneNumber <= twoNumber: " + (oneNumber <= twoNumber));

        //еще так удобно делать, решил это сделать что бы запомнить такой способ условий
        String myName = "Jenya";
        String name = myName == "Shevchuk"
                ? "True"
                : "False";

        System.out.println("проверка на правду имени: " + name);

        //TODO
        // 2) попробовать вычисления комбинаций типов данных (int и double)
        System.out.println("Если один из операндов операции относится к типу double, то и второй операнд преобразуется к типу double");
        System.out.println("операция int и double '+': " + (-20 + 25.6));

        System.out.println("операция int и double '-': " + (- 20 - 0.98));

        System.out.println("операция int и double '*': " + 5 * 0.2);

        System.out.println("операция int и double '/': " + 67.3 / 34);

        System.out.println("операция int и double '%': " + 874.7856 % 9);

    }
}