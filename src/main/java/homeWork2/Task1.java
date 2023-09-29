package homeWork2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(inputNum());
    }

    public static float inputNum(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите дробное число: ");
            return scanner.nextFloat();
        }catch (Exception e){
            System.out.println("Неверный ввод!");
           return inputNum();
        }
    }
}
