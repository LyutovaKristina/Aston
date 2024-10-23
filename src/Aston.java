
//Задание 1

public class Aston {
    public static void main(String[] args) {
        System.out.print("Orange\nBanana\nApple");
    }
}


//Задание 2

public class Aston {
    public static void main(String[] args) {
        int a = -200, b = 150, c = a + b;
        if (c > 0)
            System.out.println("Сумма положительная");
            else{
                System.out.println("Сумма отрицательная");
            }

    }
}




//Задание 3

public class Aston {
    public static void main(String[] args) {
        int value = 20;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }
}


//Задание 4

public class Aston {
    public static void main(String[] args) {
        int a = 12, b = 155;
        if(a >= b)
            System.out.println("a >= b");
            else
                System.out.println("a < b");

    }
}


//Задание 5

public class Aston {
    public static void main(String[] args) {
        System.out.println(isSumInRange(41, 5));
    }
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}


//Задание 6
public class Aston {
     public static void main(String[] args) {
        int a = 10;{
            if (a >= 0)
            System.out.println("Положительное");
                else
                    System.out.println("Отрицательное");
         }
         }
     }

//Задание 7

public class Aston
    public static void main(String[] args) {
        System.out.println(isNegative(-5));
        System.out.println(isNegative(0));
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }
}

//Задание 8

public class Aston {
    public static void main(String[] args) {
        int a;
        String b;
        a = 5;
        b = "Hello, World!";
        System.out.println(b.repeat(a));
    }

}

//Задание 9

public class Aston {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2000));
    }

//Задание 10

public class Aston {
    public static void main(String[] args) {
        int[] myArray  = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1) {
                myArray[i] = 0;
            } else if (myArray[i] == 0) {
                myArray[i] = 1;
            }
        }
        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }
}


//Задание 11

public class Aston {
    public static void main(String[] args) {
        int[] myArray = new int[101];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}

//Задание 12

public class Aston {
    public static void main(String[] args) {
        int[] myArray  = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < 6) {
                myArray[i] = myArray[i] * 2;
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}

// Задание 13

public class Aston {
    public static void main(String[] args) {
        int size = 5;
        int[][] myArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            myArray[i][i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Задание 14

public class Aston {
    public static void main(String[] args) {
        int[] resultArray = createArray(5, 3);
        for (int value : resultArray) {
            System.out.print(value + " ");
        }
    }
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}