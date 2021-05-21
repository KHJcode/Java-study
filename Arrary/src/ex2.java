public class ex2 {
    public static void main(String args[]) {
        int[] grade1 = { 70, 80, 90 };
        int[] grade2 = new int[]{ 70, 90, 80 };
        int[] grade3;

        int sum = 0;

        grade3 = new int[]{ 70, 90, 80 };

        for (int i = 0; i < grade3.length; i++) {
            sum += grade3[i];
        }

        System.out.println("점수의 합:" + sum);
        System.out.print("평균: " + sum / grade3.length);
    }
}
