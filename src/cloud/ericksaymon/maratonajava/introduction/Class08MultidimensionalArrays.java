package cloud.ericksaymon.maratonajava.introduction;

public class Class08MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] monthAndDays = new int[2][];
        monthAndDays[0] = new int[3];
        monthAndDays[1] = new int[10];
        monthAndDays[0][0] = 31;
        monthAndDays[0][1] = 28;
        monthAndDays[1][0] = 31;
        monthAndDays[1][1] = 29;

        for (int i = 0; i < monthAndDays.length; i++) {
            for (int j = 0; j < monthAndDays[i].length; j++) {
                System.out.println(monthAndDays[i][j] + " ");
            }
        }

        for (int[] arr: monthAndDays){
            for(int num: arr){
                System.out.print(num + " ");
            }
        }
    }
}
