package homework4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Створюємо джерело - масив чисел
        int[] sourceArray = {1, 2, 3, 4, 5};

// Створюємо масив-призначення з більшою довжиною
        int[] destinationArray = new int[7];

// Копіюємо вміст джерела у масив-призначення
        System.arraycopy(sourceArray, 0, destinationArray, 0, sourceArray.length);
        System.out.println(Arrays.toString(destinationArray));

// Результат: destinationArray містить {1, 2, 3, 4, 5, 0, 0}

        // Створюємо масив чисел
        int[] sourceArray2 = {1, 2, 3, 4, 5};

        // Копіюємо масив із збільшенням його розміру на 3 елементи
        int[] newArray = Arrays.copyOf(sourceArray2, sourceArray2.length + 3);
        System.out.println(Arrays.toString(sourceArray2));

        // Результат: newArray містить {1, 2, 3, 4, 5, 0, 0, 0}

    }
}