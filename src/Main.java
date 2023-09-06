public class Main {

    public static void main(String[] args) {
        int sum = add(1,4);
        System.out.println(sum);
        int anotherSum = add(3, 4, 5, 6);
        System.out.println(anotherSum);
        String morning = morningGreeting("Toby Fox");
        System.out.println(morning);
        String afternoon = afternoonGreeting("Mac Miller");
        System.out.println(afternoon);
        String word = triple("oohbaby");
        System.out.println(word);
        double number = half(3);
        System.out.println(number);
        int positiveRoundedNumber = roundPositiveValueToNearestInteger(8.5);
        System.out.println(positiveRoundedNumber);
        int negativeRoundedNumber = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(negativeRoundedNumber);
    }
    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d){
        return add(add(add(a, b), c), d);
    }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name + "!";
    }
    // 5. triple
    public static String triple(String word) {
        return word + word + word;
    }
    // 6. half
    public static double half(int number){

        double myDouble = number;
        return myDouble / 2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double number) {
        return (int)(number + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double number){
        return (int)(number - 0.5);
    }
}
