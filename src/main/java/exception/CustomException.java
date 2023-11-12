package exception;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class Example {
    public static final String ANSI_RED = "\u001B[31m";

    public void throwCustomException() throws CustomException {
// Бросаем наше исключение
        throw new CustomException(ANSI_RED + "Пример бросания собственного исключения");
    }


    public static void main(String[] args) {
        Example example = new Example();

        try {
            example.throwCustomException();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}