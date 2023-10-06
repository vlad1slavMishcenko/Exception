package homeWork3;

public class InputError extends RuntimeException {
    InputError(String message){
        super("Неверный ввод: "+message);
    }

}
