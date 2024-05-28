import java.util.Scanner;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ScannerException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String expression = scanner.nextLine();
        scanner.close();
        String result = calc(expression);
        System.out.println(result);
    }

    public static String calc(String input) throws ScannerException {

        char [] charArray = input.toCharArray();

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

                RimValue[] RimValues = RimValue.values();
                String resultRim = RimValues[result-1].name();
               // RimValue resultRim = RimValue.values()[result];
               //   System.out.println("resultRim="+resultRim);
                return  resultRim;
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
                if(result < 0) {
                    throw new ScannerException("error input");
                }
                RimValue[] RimValues = RimValue.values();
                String resultRim = RimValues[result-1].name();
                 return  resultRim;
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

                RimValue[] RimValues = RimValue.values();
                String resultRim = RimValues[result-1].name();
                return  resultRim;
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
                result = parseInt(a.getValue()) / parseInt(b.getValue());

                RimValue[] RimValues = RimValue.values();
                String resultRim = RimValues[result-1].name();
                return  resultRim;
            }

        }

        return Integer.toString(result) ;
    }

}

