package Summary230623.MyPersonalTask1;

// Задача: написать код, находящий второе наименьшее число в массиве.
// Предусмотреть случай, когда все значения массива одинаковы.

import java.util.Arrays;
import java.util.Random;

public class MyTask {
    public static void main(String[] args) {
        System.out.println("For once again, ye good knight Sir Javalot is on a Noble Quest -");
        System.out.println("finding ye Second Smallest Number in ye abysmal depths of a Random Array!");
        System.out.println();
        Random r1 = new Random(); // здесь генерится случайный массив
        int randArrayLength = r1.nextInt(3, 11); // генерится случайная длина массива от 3 до 10
        int[] myArray = new int[randArrayLength];
        for (byte i = 0; i < randArrayLength; i++) { // в этом цикле массив населяется случайными значениями от -10 до 100
            Random r2 = new Random();
            myArray[i] = r2.nextInt(-10, 101);
        } // случайный массив сгенерирован. Теперь это наш основной массив, с которым и будем работать
//        int[] myArray = {4, 4, 4, 4, 4}; // Чтобы проверить работу программы с массивом, где все значения одинаковы,
//        int randArrayLength = myArray.length; // закомментируйте строки 14-20 и раскомментируйте строки 21-22
        System.out.println("Sir Javalot shouts: Me seeth thee, oh Random Array! Thou art " + randArrayLength + " elements long!"); // вывод длины сгенерированного массива
        System.out.println("Thy elements art " +  Arrays.toString(myArray) + "!"); // вывод данных о сгенерированном массиве
        System.out.println("Sir Javalot charges at the Random Array with his Method Lance!");
        System.out.println();

        if (!checkForEquality(myArray)) { // если не все элементы массива равны между собой, выводим результат - второе наименьшее число
            System.out.println("Sir Javalot's assault vanquishes the unholy elements dwelling in the Random Array, leaving only the Second Smallest to claim!");
            int result = findSecondSmallest(myArray); // можно было обойтись без этой переменной, но пусть будет для наглядности. Ей присваивается результат выполнения метода
            System.out.println("Victorious and triumphant, knowest now Sir Javalot that the Second Smallest Number is " + result + "!");
        }
        else { // здесь просто текст на случай того, если все элементы массива окажутся равны (метод checkForEquality вернёт значение true)
            System.out.println("Oh no - the Evil Sorcerer has cast a spell on the Random Array, making all ot its elements the same! Specifically, " + myArray[0]);
            System.out.println("It is now too easy for Sir Javalot to guess that this particular array has NO SECOND SMALLEST NUMBER WHATSOEVER.");
            System.out.println("Disgruntled, Sir Javalot mounts his trusted IntelliJ steed and rides off to find another chivalrous quest to accomplish.");
        }
    }

    public static int findSecondSmallest(int[] myArray) { // метод для вычисления второго наименьшего
                int smallest = Integer.MAX_VALUE; // задаётся переменная для наименьшего числа
        int secondSmallest = Integer.MAX_VALUE; // задаётся переменная для второго наименьшего числа
        int[] arrayAuxilia = new int[myArray.length-1]; // заводим вспомогательный массив
        int iteratorAuxilia = 0; //заводим дополнительный итератор для вспомогательного массива - тем же пользоваться не можем, так как вспомогательный массив короче основного
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < smallest) smallest = myArray[i]; // находим наименьший элемент
        }
        // System.out.println("Smallest value: " + smallest); // раскомментируйте, чтобы увидеть промежуточное значение - наименьший элемент
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != smallest) {
                arrayAuxilia[iteratorAuxilia] = myArray[i]; //если элемент из основнеого массива не является наименьшим - добавляем его во вспомогательный массив
                iteratorAuxilia++; //вручную увеличиваем дополнительный итератор на единицу
                }
            } // населили вспомогательный массив значениями
        // System.out.println("Auxiliary Array: " + Arrays.toString(arrayAuxilia)); // раскомментируйте, чтобы увидеть промежуточное значение - вспомогательный массив
        for (int i = 0; i < arrayAuxilia.length; i++) {
            if (arrayAuxilia[i] < secondSmallest) secondSmallest = arrayAuxilia[i]; // находим наименьший элемент из вспомогательного массива - он и будет вторым наименьшим из основного массива
        }
        return secondSmallest;
    }

    public static boolean checkForEquality (int[] myArray) { // метод для проверки того, не являются ли все числа в основном массиве одинаковыми
        // Для этой проверки достаточно сравнить первый (нулевой) элемент массива с каждым последующим. Если количество совпадений будет равно длине массива минус один - значит, все числа в масиве равны
        boolean allEqual = false;
        byte tempCounter = 0;
        for (byte i = 1; i < myArray.length; i++) {
            if (myArray[0] == myArray[i]) tempCounter++; // добавляем к счётчику по единице на кажом совпадении чисел
        }
        if (tempCounter >= (myArray.length - 1)) allEqual = true; // если условие по количеству совпадений будет выполнено, метод возвращает значение true
        return allEqual;
    }
}
