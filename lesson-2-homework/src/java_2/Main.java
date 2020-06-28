package java_2;


import java.io.IOException;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {
        // 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
        // при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
        //
        //2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и
        // просуммировать. Если в каком-то элементе массива преобразование не удалось
        // (например, в ячейке лежит символ или текст вместо числа),
        // должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
        //
        //3. В методе main() вызвать полученный метод, обработать возможные исключения
        // MySizeArrayException и MyArrayDataException, и вывести результат расчета.
        //
        //4. Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
        //
        //С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.
        //Возвращает кол-во оставшихся рабочих часов до конца
        //недели по заданному текущему дню. Считается, что
        //текущий день ещё не начался, и рабочие часы за него
        //должны учитываться.
        //public class DayOfWeekMain {
        //public static void main(final String[] args) {
        //System.out.println(getWorkingHours(DayOfWeek.MONDAY));
        try {
            int result = MyArraySizeException.getMyArraySizeException(2);
            System.out.println(result);
        } catch (MyArraySizeException.MyArraySizeException_1 ex) {

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());

        }


        int[][] myArray = {{1, 1, 2, 1}, {7, 0, 1, 1}, {1, 1, 2, 1}, {8, 1, 2, 1}};//объявили массив и заполнили его элементами
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(" " + myArray[i][j] + " ");
            }
            System.out.println();

        }
    }

}

//static void array_2 throws MyArrayDataException {
// int[][] numbersCopy = Arrays.copyOf(myArray, myArray.length);

//  System.out.println("массив корректен");
//  System.out.println(Arrays.deepEquals(myArray, numbersCopy));

// System.out.println(Arrays.deepToString(numbersCopy));








