package cloud.ericksaymon.maratonajava.introducao;

public class Class04Operators {
    public static void main(String[] args) {
        // Basic Operators
        int number01 = 10;
        int number02 = 20;
        int sum = number01 + number02;
        int equal = number01 == number02 ? 1 : 0;
        int difference = number01 - number02;
        int multiplication = number01 * number02;
        int division = number01 / number02;
        int rest = number01 % number02;

        System.out.println("sum = " + sum);
        System.out.println("equal = " + equal);
        System.out.println("difference = " + difference);
        System.out.println("multiplication = " + multiplication);
        System.out.println("division = " + division);
        System.out.println("rest = " + rest);

        // Relational Operators
        boolean isEqual = number02 == number01;
        boolean isGreaterThan  = number02 > number01;
        boolean isSmallerThan  = number02 < number01;
        boolean isGreaterThanOrEqualTo = number02 >= number01;
        boolean isSmallerThanOrEqualTo = number02 <= number01;
        boolean isDifferentThan = number02 != number01;
        System.out.println("isEqual = " + isEqual);
        System.out.println("isGreaterThan = " + isGreaterThan);
        System.out.println("isSmallerThan = " + isSmallerThan);
        System.out.println("isGreaterThanOrEqualTo = " + isGreaterThanOrEqualTo);
        System.out.println("isSmallerThanOrEqualTo = " + isSmallerThanOrEqualTo);
        System.out.println("isDifferentThan = " + isDifferentThan);

        //Logic Operators
        int age = 18;
        float salary = 4612F;
        boolean isInsideTheLawOver30YearsOld = age >= 30 && salary >= 4612;
        boolean isInsideTheLawUnder30YearsOld = age < 30 && salary >= 3381;
        System.out.println("isInsideTheLawOver30YearsOld = " + isInsideTheLawOver30YearsOld);
        System.out.println("isInsideTheLawUnder30YearsOld = " + isInsideTheLawUnder30YearsOld);

        double totalValueOnBank = 200;
        double totalValueOnInvestments = 3000;
        double playStationFiveValue = 5000;
        boolean canBuyAPlayStationFive = playStationFiveValue <= totalValueOnBank || playStationFiveValue <= totalValueOnInvestments;
        System.out.println("canBuyAPlayStationFive = " + canBuyAPlayStationFive);
    }
}
