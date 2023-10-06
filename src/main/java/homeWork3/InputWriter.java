package homeWork3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputWriter {
    private String path = "C:/Users/Владислав/IdeaProjects/exception/";
    Scanner scanner = new Scanner(System.in);

    private boolean isNumAndChar(String[] arr){
        for (int i=0;i< arr.length;i++){
           if (arr[i].matches(".*[0-9=+/?:;<>,.}{)(*&^%$#@!|].*")){
               return false;
           }
        }
        return true;
    }
    public String[] inputName(){
            System.out.println("Введите ФИО через пробел ");
            String[] name = scanner.nextLine().split(" ");
            if (isNumAndChar(name)) {
                if (name.length == 3) {
                    for (int i = 0; i < name.length; i++) {
                        name[i] = name[i].substring(0, 1).toUpperCase() + name[i].substring(1).toLowerCase();
                    }
                    return name;
                } else {
                    throw new InputError("ФИО введено не коректно");
                }
            }throw new InputError("ФИО не должно содержать цифры и знаки");

    }
    public String inputDate(){
        System.out.println("Введите дату рождения в формате dd.mm.yyyy");
        String date = scanner.nextLine();
        try {
            String[] parseDate = date.split("\\.");
            if (parseDate.length==3){
                int a = Integer.parseInt(parseDate[0]);
                    if (0 < a && a < 32){
                        int b = Integer.parseInt(parseDate[1]);
                        if (b>0 && b<13){
                            int c = Integer.parseInt(parseDate[2]);
                            if (c>1923 && c<2023){
                                return date;
                        }
                            throw new InputError("Год введен не верно");
                    }throw new InputError("Месяц введен не верно");
                }throw new InputError("День введен не верно");
            }throw new InputError("Неверный формат ввода");
        }catch (NumberFormatException e){
            throw new InputError("Дата введена не верно");
        }
    }
    public long inputNumber(){
        try {
            System.out.println("Введите номер телефона без знаков и пробелов");
            return scanner.nextLong();
        }catch (NumberFormatException| InputMismatchException e){
            throw new InputError("Номер введен неверно");
        }
    }

    public String gender(){
        System.out.println("Введите пол в формате: f/m");
        String gen = scanner.next();
        if (gen.length() == 1){
            if (gen.equals("f")||gen.equals("m")){
                return gen;
            }
            throw new InputError("Пол введен неверно");
        }
        throw new InputError("Пол введен неверно");

    }



    public void create(String[] name,String date,long number, String gen) throws IOException {
        try ( FileWriter write = new FileWriter(path+name[0],true);
              BufferedWriter bufferedWriter = new BufferedWriter(write))
        {
            File file = new File(path+name[0]);
            if (file.createNewFile()) {
                bufferedWriter.write("<"+name[0]+"><"+name[1]+"><"+name[2]+"><"+date+"><"+number+"><"+gen+">"+"\n");
            } else {
                bufferedWriter.write("<"+name[0]+"><"+name[1]+"><"+name[2]+"><"+date+"><"+number+"><"+gen+">"+"\n");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
