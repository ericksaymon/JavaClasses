package cloud.ericksaymon.maratonajava.introduction;

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
            System.out.println(number + " is equal to 10.");
        }
        else if (number > 10) {
            System.out.println(number + " is greater than 10.");
        }
        else {
            System.out.println(number + " is less than 10.");
        }

        double salary = 100;
        String canDonateMessage = "I will donate $500.00 to DevJovo";
        String canNotDonateMessage = "I will not donate $500.00 to DevJovo";
        String canDonate = salary > 500 ? canDonateMessage : canNotDonateMessage;
        System.out.println(canDonate);

        double salary2 = 80000;
        String taxesPercentage = salary2 > 68508 ? "49.50%" : (salary2 > 34713) ? "37.35%" : "9.70";
        System.out.println("Taxes percentage: " + taxesPercentage);

        int numberOfTheWeek = 1;

        switch (numberOfTheWeek) {
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Invalid input number");
        }
    }
}
