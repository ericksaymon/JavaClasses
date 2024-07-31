package cloud.ericksaymon.maratonajava.introducao;

public class Class05ConditionalStructures {
    public static void main(String[] args) {
        char letter = 'x';
        if (letter == 'x') {
            System.out.println("X is true");
        }
        else {
            System.out.println("X is false");
        }
        int number = 10;
        if (number == 10) {
            System.out.println(number + "is equal to 10.");
        }
        else if (number > 10) {
            System.out.println(number + "is greater than 10.");
        }
        else {
            System.out.println(number + "is less than 10.");
        }
    }
}
