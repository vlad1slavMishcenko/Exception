package homeWork2;

public class Task2 {


        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;//Возможен выход за пределы массива и
        // блок catch не поймает эту ошибку
            System.out.println("catchedRes1 = " + catchedRes1);//Эта строка кода никогда не запустится
            // так как мы заведомо присвоили переменной нулевое значение
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
            //Программа ловит только одну ошибку в этом сообщении особого смысла нет
        }

}
