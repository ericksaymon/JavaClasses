package cloud.ericksaymon.maratonajava.introduction;

public class Class06RepetitionStructures {
    public static void main(String[] args) {
        int counter = 0;
        System.out.println("while:");
        while(counter < 10) {
            System.out.println("Counter: " + counter);
            counter++;
        }
        counter = 200;
        System.out.println("do-while:");
        do {
            System.out.println("Counter: " + counter);
            counter++;
        } while (counter < 10);
        System.out.println("for:");
        for(counter = 0; counter <= 10; counter++) {
            System.out.println("Counter: " + counter);
        }
        // Lesson
        for(int i = 0; i <=100000; i+=2){
            if(i % 2 != 0){
                i++;
            }
            System.out.println(i);
        }
        // Lesson 2
        float carValue = 40000;
        for (float installment = 1; installment <= carValue; installment++) {
            float installmentValue = carValue/installment;
            if(installmentValue <= 1000){
                System.out.println("Max installments: " + installment);
                break;
            }
        }
    }
}
