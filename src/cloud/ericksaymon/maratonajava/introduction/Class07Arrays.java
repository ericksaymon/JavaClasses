package cloud.ericksaymon.maratonajava.introduction;

public class Class07Arrays {
    public static void main(String[] args) {
        int[] ages = new int[10];
        ages[0] = 10;
        ages[1] = 24;
        ages[2] = 15;
        ages[6] = 12;
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] == 0){
                continue;
            }
            System.out.println(ages[i]);
        }
        String[] names = new String[10];
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Jack";
        names[3] = "Bob";

        for(String i:names) {
            if(i == null){
                continue;
            }
            System.out.println(i);
        }

    }
}
