package homeWork2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            System.out.println(inputData());
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }



    public static String inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные: ");
        String data = scanner.nextLine();
        if (data.isEmpty()){
            throw new RuntimeException("Строка пустая, попробуйте снова!");
        }
        return data;
         }

}
