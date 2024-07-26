import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Math.sqrt;


public class Main {
    public static void main(String[] args) throws ScannerException, IOException {
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
        //Задание 2.1.9 {
//        ComplexNumber a = new ComplexNumber(504.0, 741.0);
//        ComplexNumber b = new ComplexNumber(741.0, 504.0);
//        System.out.println(a.equals(b));
//        System.out.println(a.hashCode() == b.hashCode());
//}
//2.5.6+
//        byte[] example = {72, 101, 108, 108, 111, 33};
//        AsciiCharSequence sequence = new AsciiCharSequence(example);
//        System.out.println(sequence.toString());
//        System.out.println(sequence.length());
//        System.out.println(sequence.charAt(4));
//        System.out.println(sequence.subSequence(1, 4));
//        example[0] = 74;
//        System.out.println(sequence.toString());

//        Не забудьте прежде всего дописать в класс implements. Далее методы: length - всё предельно просто, charAt - массив надо привести к char, toString - конструктор и туда массив, subSequence самое сложное, но на самом деле всё просто возвращать надо AsciiCharSequence через copyOfRange.
//        }

        /*Для большего понимания при создании checkLabels:
//TextAnalyzer[] analyzers - это массив из созданных {new SpamAnalyzer, new NegativeTextAnalyzer, new TooLongTextAnalyzer}.
//Решение: цикл для всех + сравнения .processText(text) c Label.OK. */
//    }
//    public interface TextAnalyzer {
//        Label processText(String text);
//    }
//    public enum Label {
//        SPAM, NEGATIVE_TEXT, TOO_LONG, OK
//    }
//    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
////ну а дальше сами...
//        и да, для запуска в IDE классам KeywordAnalyzer, SpamAnalyzer, NegativeTextAnalyzer, TooLongTextAnalyzer ставил модификатор static, без них IDE ругается, но Тесту это не нравится, поэтому, когда копипаст сюда, static уберите.
//        и да, если к абстактному классу вы приклеяли интерфейс, то в наследниках этот же интерфейс приклеивать не нужно...

      // инициализация анализаторов для проверки в порядке данного набора анализаторов

    //2.5.7
//        String[] spamKeywords = {"spam", "bad"};
//        int commentMaxLength = 40;
//        TextAnalyzer[] textAnalyzers1 = {
//                new SpamAnalyzer(spamKeywords),
//                new NegativeTextAnalyzer(),
//                new TooLongTextAnalyzer(commentMaxLength)
//        };
//        TextAnalyzer[] textAnalyzers2 = {
//                new SpamAnalyzer(spamKeywords),
//                new TooLongTextAnalyzer(commentMaxLength),
//                new NegativeTextAnalyzer()
//        };
//        TextAnalyzer[] textAnalyzers3 = {
//                new TooLongTextAnalyzer(commentMaxLength),
//                new SpamAnalyzer(spamKeywords),
//                new NegativeTextAnalyzer()
//        };
//        TextAnalyzer[] textAnalyzers4 = {
//                new TooLongTextAnalyzer(commentMaxLength),
//                new NegativeTextAnalyzer(),
//                new SpamAnalyzer(spamKeywords)
//        };
//        TextAnalyzer[] textAnalyzers5 = {
//                new NegativeTextAnalyzer(),
//                new SpamAnalyzer(spamKeywords),
//                new TooLongTextAnalyzer(commentMaxLength)
//        };
//        TextAnalyzer[] textAnalyzers6 = {
//                new NegativeTextAnalyzer(),
//                new TooLongTextAnalyzer(commentMaxLength),
//                new SpamAnalyzer(spamKeywords)
//        };
//        // тестовые комментарии
//        String[] tests = new String[8];
//        tests[0] = "This comment is so good.";                            // OK
//        tests[1] = "This comment is so Loooooooooooooooooooooooooooong."; // TOO_LONG
//        tests[2] = "Very negative comment !!!!=(!!!!;";                   // NEGATIVE_TEXT
//        tests[3] = "Very BAAAAAAAAAAAAAAAAAAAAAAAAD comment with :|;";    // NEGATIVE_TEXT or TOO_LONG
//        tests[4] = "This comment is so bad....";                          // SPAM
//        tests[5] = "The comment is a spam, maybeeeeeeeeeeeeeeeeeeeeee!";  // SPAM or TOO_LONG
//        tests[6] = "Negative bad :( spam.";                               // SPAM or NEGATIVE_TEXT
//        tests[7] = "Very bad, very neg =(, very ..................";      // SPAM or NEGATIVE_TEXT or TOO_LONG
//        TextAnalyzer[][] textAnalyzers = {textAnalyzers1, textAnalyzers2, textAnalyzers3,
//                textAnalyzers4, textAnalyzers5, textAnalyzers6};
//        Main testObject = new Main();
//        int numberOfAnalyzer; // номер анализатора, указанный в идентификаторе textAnalyzers{№}
//        int numberOfTest = 0; // номер теста, который соответствует индексу тестовых комментариев
//        for (String test : tests) {
//            numberOfAnalyzer = 1;
//            System.out.print("test #" + numberOfTest + ": ");
//            System.out.println(test);
//            for (TextAnalyzer[] analyzers : textAnalyzers) {
//                System.out.print(numberOfAnalyzer + ": ");
//                System.out.println(testObject.checkLabels(analyzers, test));
//                numberOfAnalyzer++;
//            }
//            numberOfTest++;
//        }

        //3.1.4

//        Object i = Integer.valueOf(42);
//        String s = (String)i;
        //3.2.4
//        public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
//            try {
//                return bankWorker.checkClientForCredit(bankClient);
//            } catch (BadCreditHistoryException e1) {
//                System.out.println("Проблемы с банковской историей");
//                return false;
//            } catch (ProblemWithLawException e2) {
//                return false;
//            }
//        }

//                System.out.println(getCallerClassAndMethodName());
//                m1();

//3.2.5
//try(Car car = new Car()) {
//    car.drive();
//} catch (RuntimeException ignore){
//
//}

        //3.2.6
//        алгоритм который ипользовал я м.б кому-то пригодится
//        1) RobotConnection con = null;
//        2) цикл for где i < 3
//        2) for (int i = 0; i < 3; i++) {
//            try {
//                con.метод(соединения);
//                con.метод(int, int);
//                выход из цикла
//            } catch (исключение о) {
//                if (условие для проверки) {
//                    throw new исключение("hello", o);
//                }
//            } finally {
//                try {
//                    con.метод(закрытия);
//                } catch (Trowable e) {
//
//                }
//            }
//        }
        //4.2.5
//        byte[] original = {1, -2, -3, 4, 5};
//        InputStream inputStream = new ByteArrayInputStream(original);
////        int ans = 0;
////         ans = sumOfStream(new Main().sumOfStream(inputStream));
//        System.out.println(new Main().sumOfStream(inputStream));
////        System.out.println(ans);
    }
    //4.2.5
//    public  int sumOfStream(InputStream inputStream) throws IOException {
//        byte b = (byte) inputStream.read();
//       System.out.println(b);
//        return b;
//    };
    //3.2.6
    interface RobotConnectionManager {
        RobotConnection getConnection();
    }

    interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);
        @Override
        void close();
    }
    class Robot implements RobotConnection{
        public void close(){
            System.err.println("Close");
        }
        public void moveRobotTo(int x, int y){
            System.err.println("move "+   x +  " ^ " +  y);
        }
    }

    class RobotCon implements RobotConnectionManager {
        static int k = 0;
        public RobotConnection getConnection() { // бросает k эксепшенов тебе в метод k;
           
            System.err.println("k = " +  k);
            if (k != 5) { // меняй как смотри что будет меняться, попробуй 3-ку и 2-ку
                throw new RobotConnectionException(""  +  k);
            } else {
                return new Robot();
            }
        }
    }

    static class RobotConnectionException extends RuntimeException {
        public RobotConnectionException(String message) {
            super(message);
        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public class Test {
        public static void main(String[] args) {
//            moveRobot(new RobotCon(), 1, 2); // здесь цифры ничего не значат
        }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
            RobotConnection rcon = null;
        for (int i = 0; i < 3; i++) {
          try {
              rcon = robotConnectionManager.getConnection();
              rcon.moveRobotTo(toX, toY);
//              if (rcon == null & i == 2 ) {
//                  break;
//              }

          } catch (RobotConnectionException e) {
              if(i == 2) {
                  throw new RobotConnectionException("не соединилось");
              }

          } finally {
              try {
                  if (rcon != null) {
                      rcon.close();
                  }
              }catch (Exception e){

              }
          }

          }

        }


    }
//3.2.5
public static class Car implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Машина закрывается...");
    }
    public void drive() {
        System.out.println("Машина поехала.");
    }
}

//    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient)  {
//        try {
//          return checkClientForCredit(BankWorker bankWorker, BankClient bankClient)
//        }catch (BadCreditHistoryException e1) {
//            System.out.println("Проблемы с банковской историей");
//            return  false;
//        }catch (ProblemWithLawException e2) {
//            return  false;
//        }
//    }
    //3.1.6
static void m1() {
    System.out.println(getCallerClassAndMethodName());
    m2();    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());    }

public static String getCallerClassAndMethodName() {
    StackTraceElement[] stackTraceElements =  new Exception().getStackTrace();
    String message = "";
    if(stackTraceElements.length < 3){
        return null;
    }else{
        StackTraceElement element = stackTraceElements[2];
        String className = element.getClassName();
        String methodName = element.getMethodName();
        message = className + "#" + methodName;
        return message;
    }

}
    //3.1.4



    //3.2.4


    class MyNewException extends Exception {

    }

    public void testExp() throws MyNewException {
          throw new MyNewException();
    }
        //2.5.7
public static Label checkLabels(TextAnalyzer[] analyzers, String text) {
         Label result = Label.OK;
        for (TextAnalyzer analyzer : analyzers) {
               result = analyzer.processText(text);
          if (result != Label.OK) {
                 return result;
            }

            }


    return result;
}

enum Label {
            SPAM, NEGATIVE_TEXT, TOO_LONG, OK
        }
abstract static class KeywordAnalyzer implements TextAnalyzer {
      abstract protected String[] getKeywords() ;
      abstract protected Label getLabel() ;

      public Label processText(  String text){
          String[] keyWords = getKeywords();
          Label label = getLabel();
        for (String keyword: keyWords) {
            if(text.contains(keyword)){
                return label;
            }
        }
       return Label.OK;
    };
}

public static class SpamAnalyzer extends KeywordAnalyzer {
        private String[] keywords ;
//        public Label label;
        public SpamAnalyzer(String[] keywords){
            this.keywords = keywords;
//            System.out.println(this.keywords);
//            this.label = processText(keywords);
        }

        protected String[] getKeywords() {
            return keywords;
        }
        public Label getLabel() {
           return Label.SPAM;
        }


    }

    public static class NegativeTextAnalyzer  extends KeywordAnalyzer {
        private  String[] keywords = {":(", "=(", ":|" } ;
        protected String[] getKeywords() {
            return  keywords;
        }
        public Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }

    public static class TooLongTextAnalyzer  implements TextAnalyzer {
        private int maxLength;
//        public Label label ;
        public TooLongTextAnalyzer(int maxLength) {
            this.maxLength = maxLength;
//            this.label = processText(text);
        }
        public Label processText(String text) {
            if(text.length() > maxLength){
                return Label.TOO_LONG;
            }
            return Label.OK;
        };

    }
    interface TextAnalyzer {
        Label processText(String text);
    }
//2.5.6
    public static class AsciiCharSequence implements CharSequence
    {
        public byte[] mass;

        public AsciiCharSequence (byte[] mass) {
            this.mass = mass;

        }

        @Override
        public int length() {
            return mass.length;
        }

        @Override
        public char charAt(int index) {
            char[] charArray = new String(mass).toCharArray();
            return charArray[index];
        }

        @Override
        public AsciiCharSequence subSequence(int start, int end) {
            byte[] arr = Arrays.copyOfRange(mass, start, end);

            AsciiCharSequence instance = new AsciiCharSequence(arr);

//               String charArray = new String(mass);

            return instance;

        }

        @Override
        public String toString () {
            char[] charArray  = new String(mass).toCharArray();

            return new String(charArray);
//
        }
   }
    //Задание 2.4.9
    public static class Student {
        protected final String studying;
        protected Student(String work) {
            this.studying = work;
        }
        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }
        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

    public static class JavaStudent extends Student {
             public  JavaStudent() {
                    super();
                }


    }

    //Задание 2.3.11
    public class Human {
        private final String secret; //секретики
        private final String news; //новости
        private final String experience; //опыт
        private final String gossip; //сплетни

        public Human(String secret, String news, String experience, String gossip) {
            this.secret = secret;
            this.news = news;
            this.experience = experience;
            this.gossip = gossip;
        }

       private String getSecret() {
            return this.secret;
       }
        public String getNews() {
            return this.news;
        }
        protected String getExperience() {
            return this.experience;
        }
        protected String getGossip() {
            return this.gossip;
        }
    }
    //Задание 2.2.8
    public static boolean isWeekend2(String dayName) {
        return dayName.equals("Sunday") || dayName.equals("Saturday");
    }

    public static int weekendCount(String[] days) {
        int i = 0;
        for (String day : days) {
            if (isWeekend2(day) ){
                i++;
            }
        }
        return i;
    }


    public static int weekdayCount(String[] days) {
        int i = 0;
        for (String day : days) {
            if (!isWeekend2(day) ){
                i++;
            }
        }
        return i;
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
//    public enum Direction {
//        UP,
//        DOWN,
//        LEFT,
//        RIGHT
//    }
//
//    public static class Robot {
//        int x;
//        int y;
//        Direction dir;
//
//        public Robot (int x, int y, Direction dir) {
//            this.x = x;
//            this.y = y;
//            this.dir = dir;
//        }
//
//        public Direction getDirection() {return dir;}
//
//        public int getX() {return x;}
//
//        public int getY() {return y;}
//
//        public void turnLeft() {
//            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
//            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
//            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
//            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
//        }
//
//        public void turnRight() {
//            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
//            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
//            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
//            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
//        }
//
//        public void stepForward() {
//            if (dir == Direction.UP)    {y++;}
//            if (dir == Direction.DOWN)  {y--;}
//            if (dir == Direction.LEFT)  {x--;}
//            if (dir == Direction.RIGHT) {x++;}
//        }
//    }
//
//    public static void moveRobot(Robot robot, int toX, int toY) {
//         if(robot.getY() < toY){
//             while (!robot.getDirection().equals(Direction.UP)) {
//                 robot.turnLeft();
//                 System.out.println("robot.turnLeft()");
//
//             }
//             while (robot.getY() < toY){
//                 System.out.println("robot.stepForward()");
//                 robot.stepForward();
//             }
//         }
//
//        if(robot.getY() > toY){
//            while (!robot.getDirection().equals(Direction.DOWN)) {
//                robot.turnLeft();
//                System.out.println("robot.turnLeft()");
//            }
//            while (robot.getY() > toY){
//                robot.stepForward();
//            }
//        }
//        if(robot.getX() < toX){
//            while (!robot.getDirection().equals(Direction.RIGHT)) {
//                robot.turnLeft();
//                System.out.println("robot.turnLeft()");
//            }
//            while (robot.getX() < toX){
//                robot.stepForward();
//                System.out.println("robot.stepForward()");
//            }
//        }
//        if(robot.getX() > toX){
//            while (!robot.getDirection().equals(Direction.LEFT)) {
//                robot.turnLeft();
//                System.out.println("robot.turnLeft()");
//            }
//            while (robot.getX() > toX){
//                robot.stepForward();
//                System.out.println("robot.stepForward()");
//            }
//        }
//   }

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

