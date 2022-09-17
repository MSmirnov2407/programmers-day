import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {                 //если год високосный то
            System.out.println("12.09."+year);  //выводим 12 сент
        } else {                                //иначе выводим 13 сент
            System.out.println("13.09."+year);
        }
    } //main

    public static boolean isLeapYear(int year) {//  метод определения, является ли переданный год високосным
        boolean isLeap = false;                             //переменная, хранящая результат определения високосности
        if (year %400 == 0){                                   //если делится на 400 то високосный
                isLeap = true;
        } else if ((year %4 == 0) && (year %100 != 0)){     //если делится на 4 и не делится на 100 то високосный
            isLeap = true;
        }                                                    //в остальных случаях не високосный
        return isLeap;
    }//isLeapYear
} 