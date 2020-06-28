package java_2;

public class MyArraySizeException {
    public static int getMyArraySizeException(int num) throws MyArraySizeException_1 {
        int[][] MyArray = new int[4][4];
        MyArray[2][2] = 0;
        int result = 4;

        if (MyArray.length < 4) throw new MyArraySizeException_1("выход за пределы массива", num);

        for (int i = 4; i <= num; i++) {
            result = i;
        }
        return result;
    }


    static class MyArraySizeException_1 extends Exception {

        private int number;

        public int getNumber() {
            return number;
        }

        public MyArraySizeException_1(String message, int num) {

            super(message);
            number = num;
        }
    }
}






