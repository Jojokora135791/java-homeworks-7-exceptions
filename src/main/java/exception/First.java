package exception;

public class First {
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        try {
            divideByZero();
        } catch (ArithmeticException exp) {
            System.out.println(ANSI_RED + "Произошло деление на ноль");
        }
        try {
            tryToCreateFunnyArray();
        } catch (NegativeArraySizeException exp) {
            System.out.println(ANSI_RED + "Предпринята попытка создания массива с отр числом");
        }
        try {
            searchSomethingOutString();
        } catch (StringIndexOutOfBoundsException exp) {
            System.out.println("Ошибка в индексе");
        }
        try {
            accessToUnexistingElement();
            playWithNullPointer();
            System.out.println("Ура! Меня снова печают");
        }
        catch (Exception exp) {
            System.out.println(exp.getClass());
        }

    }


    public static void divideByZero() {
        int a = 777 / (666 - 666);
    }

    public static void accessToUnexistingElement(){
        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length+1; i++) {
            System.out.printf("%d,", i);
        }
    }

    public static void playWithNullPointer() {
        String importantData = null;
        System.out.println("important is " + importantData);
    }

    public static void tryToCreateFunnyArray() {
        int i[] = new int[-5];
    }

    public static void searchSomethingOutString() {
        String secret = "Пин-код от карты: 123";
        secret.charAt(22);
    }

}
