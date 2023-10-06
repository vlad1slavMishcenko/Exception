package homeWork3;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        InputWriter in = new InputWriter();
        try {
            String[] a = in.inputName();
            String b = in.inputDate();
            long c = in.inputNumber();
            String d = in.gender();
            in.create(a,b,c,d);
        }
        catch (InputError | IOException w){
            System.out.println(w.getMessage());
        }
    }
}
