public class Main {
    public static void main(String[] args) {
        String word = "Комокс";
        if (word.equalsIgnoreCase(new StringBuffer(word).reverse().toString())) {
            System.out.println("Полиндром");}
        else {
            System.out.println("Не полиндром"); }
    }
}