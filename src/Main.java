import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Math.sqrt;
import static java.lang.String.valueOf;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        getArrayMiddle1(new int[] {14, 16, 3});
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

