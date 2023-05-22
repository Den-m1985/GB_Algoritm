package seminar1;

public class Seminar1 {
    public static void main(String[] args) {

        // написать алгоритм суммы чиел от до.
        int number = 4;
        int sum = 0;
        for (int i = 1; i < number; i++, sum +=i);
        System.out.println(sum);

        int sum2 = 0;
        for (int i = 1; i < number; i++)
            sum2 +=i;
        System.out.println(sum2);

        //sum(20);
    }


    public static int sum(int a){

        return a+1;
    }

}