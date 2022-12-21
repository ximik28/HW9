import java.util.Scanner;

public class Main {
    static int a;
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами

        inputNum();
        inspectNum();
    }

    static void inputNum() {
        System.out.println("Введите целое число:");
        a = new Scanner(System.in).nextInt();

    }
    static void inspectNum() {
        boolean isRes;
        if (a % 2 == 0) {
            isRes = true;
        } else {
            isRes = false;
        }
        System.out.println(isRes);
    }
}
