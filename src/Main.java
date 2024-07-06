import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Math.sqrt;
import static java.lang.String.valueOf;


public class Main {
    public static void main(String[] args) throws ScannerException {
//        test();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите выражение: ");
//        String expression = scanner.nextLine();
//        scanner.close();
//        String result = calc(expression);
       //System.out.println(0x0bp3);
      //  calcCircleRadius(123);
//    return a + b == c;
//    return Math.abs((a + b) - c) < 0.0001;
      //  maxLongSqr();
       //int result = charExpression(5) ;
       // charExpression(5);
       // factorialRecurs(5);
//

        //printArray(new int[] {1,2,3,4,5,5,6,7,7});
        //getSubArrayBetween(new int[] {1,3,5,6,9,11,24}, 4, 10);
//        getArrayMiddle(new int[] {});
//        inverseArray(new int[]  {1, 4, 6, 7});
       // mergeAndSort(new int[] {1, 3, 7, 5}, new int[] {8, 4, 2, 4});
//        System.out.println(Arrays.toString(mergeAndSort(new int[] {}, new int[] {})));
//        System.out.println(Arrays.toString(mergeAndSort(new int[] {14}, new int[] {16})));
//        System.out.println(Arrays.toString(mergeAndSort(new int[] {1, 5, 2, 17}, new int[] {4, 8, 6})));
//        System.out.println(Arrays.toString(mergeAndSort(new int[] {14, 16, 3}, new int[] {4, 2, 8})));
//        System.out.println(Arrays.toString(mergeAndSort(new int[] {14, 14, 3}, new int[] {4, 14, 8})));
//        getArrayMiddle1(new int[] {14, 16, 3});
//          parseAndPrintNumber("111");
//        isPalindrome("Was it a cat I saw?");
//        isGmailOrOutlook("@outlook.com");
//        String[] roles = new String[] {"Городничий","Аммос Федорович","Артемий Филиппович","Лука","Лука Лукич"};
//        String[] textLines = new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор."
//                ,"Аммос Федорович: Как ревизор?"
//                ,"Артемий Филиппович: Как ревизор?"
//                ,"Лука: Тра ля ля, тарам-парам"
//                ,"Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем."
//                ,"Аммос Федорович: Вот те на!","Артемий Филиппович: Вот не было заботы, так подай!"
//                ,"Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
//        System.out.println(printTextPerRole(roles,textLines));
//        System.out.println(Day.MONDAY.getRusName());
//        System.out.println(Day.SUNDAY.isWeekend());

        //Задание 2.3
//        Robot robot = new Robot(0,0, Direction.DOWN);
//        moveRobot(robot, 3, 5);
        //Задание 2.1.9
        ComplexNumber a = new ComplexNumber(504.0, 741.0);
        ComplexNumber b = new ComplexNumber(741.0, 504.0);
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());

                    }
    //Задание 2.1.9
    public static class ComplexNumber {
        private double re;
        private double im;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(getRe(), that.getRe()) == 0 && Double.compare(getIm(), that.getIm()) == 0;
        }

        @Override
        public int hashCode() {

            int total = 31;
            long lre = Double.doubleToLongBits(getRe()) + Double.doubleToRawLongBits(getRe());
            long lim = Double.doubleToLongBits(getIm());
            return  total + (int)(lre ^ (lre >>> 32)) + (int)(lim ^ (lim >>> 32));
        }

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

    }
    //Задание 2.3
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
         if(robot.getY() < toY){
             while (!robot.getDirection().equals(Direction.UP)) {
                 robot.turnLeft();
                 System.out.println("robot.turnLeft()");

             }
             while (robot.getY() < toY){
                 System.out.println("robot.stepForward()");
                 robot.stepForward();
             }
         }

        if(robot.getY() > toY){
            while (!robot.getDirection().equals(Direction.DOWN)) {
                robot.turnLeft();
                System.out.println("robot.turnLeft()");
            }
            while (robot.getY() > toY){
                robot.stepForward();
            }
        }
        if(robot.getX() < toX){
            while (!robot.getDirection().equals(Direction.RIGHT)) {
                robot.turnLeft();
                System.out.println("robot.turnLeft()");
            }
            while (robot.getX() < toX){
                robot.stepForward();
                System.out.println("robot.stepForward()");
            }
        }
        if(robot.getX() > toX){
            while (!robot.getDirection().equals(Direction.LEFT)) {
                robot.turnLeft();
                System.out.println("robot.turnLeft()");
            }
            while (robot.getX() > toX){
                robot.stepForward();
                System.out.println("robot.stepForward()");
            }
        }
   }

    //задание 2.3
    public enum Day {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("суббота"),
        SUNDAY("воскресенье");

        private String nameru;

         Day(String name) {
            this.nameru = name;
        }

        public boolean isWeekend() {
             return this.getRusName().equals("суббота") | this.getRusName().equals("воскресенье") ? true : false ;
       }

        public String getRusName(){
            return nameru;
        }
    }

    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу");
        }
    }

    public static class Dog {
        public void sayHello() {
            System.out.println("Гав");
        }

        public void catchCat(Cat cat) {
            System.out.println("Кошка поймана");
            this.sayHello();
            cat.sayHello();
        }
    }

//    Для решения задачи нужно понимать методы StringBuilder
//    Инструкция к решению пошагавая, но без кода, если она вам нужна ниже:

//    По сути вам нужно сделать:
//            1. Создать результирующий StringBuilder
//2. Добавить в него имя первой роли, двоеточие
//3. Добавить в него все строки, которые начинаются с этого имени(пронумерованные), и перевести строку
//4. Перевести строку)
//    Повторить это со всеми ролями

//    Стринг билдер и 2 цикла.
//1й цикл печатает только роли
//2й цикл печатает пронумерованные реплики ( что бы нумеровать репилики можно использовать счетчик i из цикла )
//
//    Основа: StringBuilder, for (), .append .startsWith

//    Час впустую из-за того, что после номера пробел. Структура ответа должна быть такой:
//            /n + роль + : + /n + номер + ) + пробел + текст реплики + /n

//во втором цикле и во вложенном условии (конец действия) выглядит ....substring((textLines[j].indexOf(":")) + 1)).append("\n")
//Обязательно используйте startsWith, а не просто contains.
//    Для всех кто отправил правильное решение 500 раз, знайте, между каждой ролью и словами должен быть пробел!!!!!

//    во втором цикле и во вложенном условии (конец действия) выглядит ....substring((textLines[j].indexOf(":")) + 1)).append("\n")

//    Сделал прошел тест:
//            1. создаем 2 объекта (один используется для роли, второй как конечный результат по мере выборки наполняем его)
//2. проходим for each по ролям ( заполняем конечный объект)
//3. Проходим For по репликам(создаем внутри объект)
//4. В цикле ставим условие сравнения
//5. Удаляем из реплики ролль , не забываем ":";
//6. Заполняем конечный объект
//    несколько проходов и мы заполнили конечный объект
//    не забываем про перенос строки "\n"

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder strBuffer = new StringBuilder();

        for (int i = 0; i < roles.length; i++) {
            strBuffer.append("\n").append(roles[i]).append(":");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i]+":")){
                    strBuffer.append("\n").append(j+1).append(")").append(textLines[j].substring(textLines[j].indexOf(":")+1));
                }
           }
            strBuffer.append("\n");
        }
       return strBuffer.toString();
    }

    public static boolean isGmailOrOutlook(String email) {
        Pattern pat = Pattern.compile("\\w{3,}+(@gmail.com$|@outlook.com$)");
        Matcher mat = pat.matcher(email);
        System.out.print(mat.matches());
        return  mat.matches();

    }

    public static boolean isPalindrome(String text) {
        String result = text.replaceAll("[^\\p{L}]", "").toLowerCase();
        StringBuffer strBuff = new StringBuffer(result);
        strBuff.reverse();
        System.out.println(result);
        System.out.println(strBuff.toString());
        if (strBuff.toString().equals(result)) {
            return  true;
        }
        else return false;
    }

    public static void parseAndPrintNumber(String str) {
        System.out.print(Integer.parseInt(str) / 2);
    }
    public static void main1(String[] args) {
        String name = "Sergey";
        System.out.print(name);
    }
    public static int[] getArrayMiddle1(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }
        if (numbers.length % 2 == 0) {
            int index1 = numbers.length / 2;
            int[] numbers1 = Arrays.copyOfRange(numbers, index1-1, index1 + 1  );
            System.out.print(Arrays.toString(numbers1));
            return numbers1;
        } else {
           int index1 = numbers.length / 2;
            int[] numbers1 = Arrays.copyOfRange(numbers, index1, index1+1);
            System.out.print(Arrays.toString(numbers1));
            return numbers1;
        }
    }
    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        if (firstArray.length == 0 ) {
            return new int[0];
        }
        if ( secondArray.length == 0) {
            return new int[0];
        }

        int[] firdArray = new int[firstArray.length + secondArray.length];
        int start = firstArray.length;
        int end = start + secondArray.length;

        for (int i = 0; i < start; i++) {
            firdArray[i] = firstArray[i];
        }

        int j = 0;
        for (int i = start; i < end; i++) {
            firdArray[i] = secondArray[j];
            j++;
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < firdArray.length; i++) {
                if (firdArray[i - 1] > firdArray[i]) {
                    int tmp = firdArray[i];
                    firdArray[i] = firdArray[i - 1];
                    firdArray[i - 1] = tmp;
                    isSorted = false;
                }
            }

        }
       // System.out.print(Arrays.toString(firdArray));
        return firdArray;
    }

    public static int[] inverseArray(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }
        int[] numbers1 = new int[numbers.length];
        int j = numbers.length;
        for (int i = 0; i < numbers.length; i++) {
            numbers1[j-1] = numbers[i];
            j = j - 1;
        }
        System.out.print(Arrays.toString(numbers1));
        return numbers1;
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }
        if (numbers.length % 2 == 0) {
            int[] numbers1 = new int[2];
            int index1 = numbers.length / 2;
            numbers1[0] = numbers[index1 - 1];
            numbers1[1] = numbers[index1];
            System.out.print(Arrays.toString(numbers1));
            return numbers1;
        } else {
            int[] numbers1 = new int[1];
            int index1 = numbers.length / 2;
            numbers1[0] = numbers[index1];
            System.out.print(Arrays.toString(numbers1));
            return numbers1;
        }
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        if(start > end | numbers.length == 0) {
            return new int[0];
        }

        int j = 0;
        for (int el : numbers) {
            if (el >= start & el <= end) {
                j++;
            }
        }
        int[] numbers1 = new int[j];
        j = 0;
        for (int el : numbers) {
            if (el >= start & el <= end) {
                numbers1[j] = el;
                j++;
            }
        }
        System.out.print(Arrays.toString(numbers1));
        return numbers1;
    }

    public static void printArray(int[] numbers) {
        if (numbers.length == 0) {
            System.out.print("[]");
        } else {
            System.out.print('[');
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i]);
                if (i == numbers.length - 1) {
                    System.out.print(']');
                } else {
                    System.out.print(", ");
                }
            }
        }
    }

    public static boolean isWeekend(String weekday) {
        if (weekday.equals("Saturday") | weekday.equals("Sunday")) {
            return true;
        } else {
            return false;
        }
    }

    public static String checkWeekend(String weekday) {
        return weekday.equals("Saturday") | weekday.equals("Sunday") ? "Ура, выходной!" : "Надо еще поработать";
    }


    public static boolean isWeekend1(String weekday) {
        switch (weekday) {
            case "Saturday", "Sunday":
                return  true;
            default:
                return false;
       }
    }

    public int determineGroup(int age) {
        if (age >= 7 & age <= 13) {
            return 1;
        }
        if (age >= 14 & age <= 17) {
            return 2;
        }
        if (age >= 18 & age <= 65) {
            return 3;
        }
        return -1;
    }

    public static BigInteger factorial(int value) {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
        return result;
    }

    public static BigInteger factorialRecurs(int value) {
        if (value <= 1) {
            return BigInteger.valueOf(1);
        } else {
            return BigInteger.valueOf(value).multiply(factorialRecurs(value - 1));
        }
    }

    public static void maxLongSqr() {
        BigInteger a = BigInteger.valueOf(Long.MAX_VALUE).multiply(BigInteger.valueOf(Long.MAX_VALUE));
        System.out.println(a);
    }
    public static void charExpression(int a) {
//        char n = 'g';
        System.out.println(Character.getNumericValue('\\'));

//       int z = Integer.parseInt(String.valueOf('\\'));

//        System.out.println(z);

        
    }
    public static void calcCircleRadius(double area) {
        System.out.printf("%.3f", sqrt(area / Math.PI));//Твой код тут
    }

    public static String calc(String input) throws ScannerException {

        int result = 0 ;


        //Сложение

        String [] stringArray = input.split("\\+");

        if (stringArray.length > 2) {
            throw new ScannerException("error input");
        }
        int flag = 0;
        if (stringArray.length > 1) {
            for ( String element : stringArray) {

                Double val = 100.1;
                String regex = "\\d+";

                if( element.matches(regex) ){
                    val =  parseDouble (element);
                }

                if(val % 1 == 0 && val <= 10 && val >=1 ) {
                     continue;
                }
                else if(RimValue.valueOf(element) instanceof RimValue ) {
                    flag = 1;
                }
                else {
                    throw new ScannerException("error input");
                }
            }


            if (flag == 0) {
                result = parseInt(stringArray[0]) + parseInt(stringArray[1]);
               } else {
                RimValue a = RimValue.valueOf(stringArray[0]);
                RimValue b = RimValue.valueOf(stringArray[1]);
                result = parseInt(a.getValue()) + parseInt(b.getValue());
//                System.out.println("result="+result);

                RimValue[] RimValues = RimValue.values();
                String rimResult = "";
                int difference = result;
                do {
                    int i = 0;
                    do {
                        if(difference >= parseInt(RimValues[i+1].getValue()) && difference <= parseInt(RimValues[i].getValue()) ){
                            if(difference == parseInt(RimValues[i].getValue())){
                                rimResult = RimValues[i].name();
                                return  rimResult;
                            }
                            else
                            {
                                rimResult = rimResult + RimValues[i+1].name();
                            }

//                            System.out.println(RimValues[i]);
                         //   System.out.println(rimResult);
                            break;
                        }
                        i++;
                    } while (i<=RimValues.length-1);

                    difference = difference - parseInt(RimValues[i+1].getValue());

                } while (difference!=0 | difference>0);

                return  rimResult;
            }

        }
        //Вычитание
         stringArray = input.split("-");

        if (stringArray.length > 2) {
            throw new ScannerException("error input");
        }

        if (stringArray.length > 1) {
            for ( String element : stringArray) {

                Double val = 100.1;
                String regex = "\\d+";

                if( element.matches(regex) ){
                    val =  parseDouble (element);
                }

                if(val % 1 == 0 && val <= 10 && val >=1 ) {
                    continue;
                }
                else if(RimValue.valueOf(element) instanceof RimValue ) {
                    flag = 1;
                }
                else {
                    throw new ScannerException("error input");
                }
            }
            if (flag == 0) {
                result = parseInt(stringArray[0]) - parseInt(stringArray[1]);
            } else {
                RimValue a = RimValue.valueOf(stringArray[0]);
                RimValue b = RimValue.valueOf(stringArray[1]);
                result = parseInt(a.getValue()) - parseInt(b.getValue());
//                System.out.println("result="+result);

                RimValue[] RimValues = RimValue.values();
                String rimResult = "";
                int difference = result;
                do {
                    int i = 0;
                    do {
                        if(difference >= parseInt(RimValues[i+1].getValue()) && difference <= parseInt(RimValues[i].getValue()) ){
                            if(difference == parseInt(RimValues[i].getValue())){
                                rimResult = RimValues[i].name();
                                return  rimResult;
                            }
                            else
                            {
                                rimResult = rimResult + RimValues[i+1].name();
                            }

//                            System.out.println(RimValues[i]);
//                            System.out.println(rimResult);
                            break;
                        }
                        i++;
                    } while (i<=RimValues.length-1);

                    difference = difference - parseInt(RimValues[i+1].getValue());

                } while (difference!=0 | difference>0);
                return  rimResult;
            }

        }

        //Деление
         stringArray = input.split("/");

        if (stringArray.length > 2) {
            throw new ScannerException("error input");
        }

        if (stringArray.length > 1) {
            for ( String element : stringArray) {

                Double val = 100.1;
                String regex = "\\d+";

                if( element.matches(regex) ){
                    val =  parseDouble (element);
                }

                if(val % 1 == 0 && val <= 10 && val >=1 ) {
                    continue;
                }
                else if(RimValue.valueOf(element) instanceof RimValue ) {
                    flag = 1;
                }
                else {
                    throw new ScannerException("error input");
                }
            }
            if (flag == 0) {
                result = parseInt(stringArray[0]) / parseInt(stringArray[1]);
            } else {
                RimValue a = RimValue.valueOf(stringArray[0]);
                RimValue b = RimValue.valueOf(stringArray[1]);
                result = parseInt(a.getValue()) / parseInt(b.getValue());
//                System.out.println("result="+result);

                RimValue[] RimValues = RimValue.values();
                String rimResult = "";
                int difference = result;
                do {
                    int i = 0;
                    do {
                        if(difference >= parseInt(RimValues[i+1].getValue()) && difference <= parseInt(RimValues[i].getValue()) ){
                            if(difference == parseInt(RimValues[i].getValue())){
                                rimResult = RimValues[i].name();
                                return  rimResult;
                            }
                            else
                            {
                                rimResult = rimResult + RimValues[i+1].name();
                            }

//                            System.out.println(RimValues[i]);
//                            System.out.println(rimResult);
                            break;
                        }
                        i++;
                    } while (i<=RimValues.length-1);

                    difference = difference - parseInt(RimValues[i+1].getValue());

                } while (difference!=0 | difference>0);

                return  rimResult;
            }

        }

        //Умножение
        stringArray = input.split("\\*");

        if (stringArray.length > 2) {
            throw new ScannerException("error input");
        }

        if (stringArray.length > 1) {
            for ( String element : stringArray) {

                Double val = 100.1;
                String regex = "\\d+";

                if( element.matches(regex) ){
                    val =  parseDouble (element);
                }

                if(val % 1 == 0 && val <= 10 && val >=1 ) {
                    continue;
                }
                else if(RimValue.valueOf(element) instanceof RimValue ) {
                    flag = 1;
                }
                else {
                    throw new ScannerException("error input");
                }
            }
            if (flag == 0) {
                result = parseInt(stringArray[0]) * parseInt(stringArray[1]);
            } else {
                RimValue a = RimValue.valueOf(stringArray[0]);
                RimValue b = RimValue.valueOf(stringArray[1]);
                result = parseInt(a.getValue()) * parseInt(b.getValue());
//                System.out.println("result="+result);

                RimValue[] RimValues = RimValue.values();
                String rimResult = "";
                int difference = result;
                do {
                    int i = 0;
                    do {
                        if(difference >= parseInt(RimValues[i+1].getValue()) && difference <= parseInt(RimValues[i].getValue()) ){
                            if(difference == parseInt(RimValues[i].getValue())){
                                rimResult = RimValues[i].name();
                                return  rimResult;
                            }
                            else
                            {
                                rimResult = rimResult + RimValues[i+1].name();
                            }

//                            System.out.println(RimValues[i]);
                            System.out.println(rimResult);
                            break;
                        }
                        i++;
                    } while (i<=RimValues.length-1);

                    difference = difference - parseInt(RimValues[i+1].getValue());

                } while (difference!=0 | difference>0);

                return  rimResult;
            }

        }

        return Integer.toString(result) ;
    }

    public static void test()  {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Imput ");
        String[] mass = new String[5];
        for(int i = 0; i<5; i++ ){
          mass[i] = scanner.nextLine();

        }
        scanner.close();
        System.out.println(Arrays.toString(mass));
    }
}

