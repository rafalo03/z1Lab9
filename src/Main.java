public class Main {
    public static void main(String[] args) {
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();

        try {
            exceptionGenerator.generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Wystąpił wyjątek: " + e.getClass().getSimpleName());
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}