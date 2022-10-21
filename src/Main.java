import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //2

        Scanner sc = new Scanner(System.in);
       /* System.out.print("Введіть розмір массиву: ");
        double[] array = new double[sc.nextInt()];
        int r = array.length;
        double sum=0;
        double averange =0;
        double maxNumber=array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((double)(Math.random() * 5));
            sum+=array[i];
            System.out.println(array[i]);
            if(maxNumber <= array[i]){
                maxNumber = array[i];
            }
        }
        averange=sum/r;
        System.out.println("Середне значення =>> "+averange);
        System.out.println("Найбільше значення =>> "+maxNumber);
*/
        Random random = new Random();
        System.out.print("Kількість точок: ");
        int[][] array = new int[sc.nextInt()][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(101) - 50;

            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("x" + (i+1) + " = %d" + ";" + " y" + (i + 1) + " = %d\n", array[i][0], array[i][1]);
            }
        for (int i = 0; i < array.length; i++) {
            if(array[i][0]>0 && array[i][1]<0){
                System.out.println("Точкаx x" + (i+1) + "" + ";" + "y" + (i + 1)+" знаходиться в четвертій площині");
            }
        }
    }
}