package seminar1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class Seminar1 {
    public static void main(String[] args) {

        /*
        // написать алгоритм суммы чиел от до.
        int number = 4;
        int sum = 0;
        for (int i = 1; i < number; i++, sum +=i);
        System.out.println(sum);

        int sum2 = 0;
        for (int i = 1; i < number; i++)
            sum2 +=i;
        System.out.println(sum2);
        */


        /*
        // Написать алгоритм поиска простых чисел
        int number2 = 10;
        List<Integer> simpleDigit = new ArrayList<>();
        for (int i = 1; i < number2; i++) {
            boolean simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                simpleDigit.add(i);
                System.out.println(i);
            }
        }
        */


        /*
        1. Необходимо написать алгоритм поиска всех доступных комбинаций
        (посчитать количество) для количества кубиков K с количеством граней N.
        2. У вас еть 2 варианта на выбор – количество кубиков может быть строго
        ограничено (4 кубика, например), либо их количество будет
        динамическим. Выбор за вами.
        3. Если вы реализуете простой вариант, обращает внимание, что данное
        решение имеет сложность O(n4
        ), но если количество кубиков сделать
        переменной, то она трансформируется в O(nk
        ), что будет представлять
        собой экспоненциальную сложность. Для второго решения очевидно, что
        его сложность O(nk
        ) с самого начала.

        int side = 7, count = 0;
        List<String> simpleList = new ArrayList<>();
        for (int i1 = 1; i1 < side; i1++) {
            for (int i2 = 1; i2 < side; i2++) {
                for (int i3 = 1; i3 < side; i3++) {
                    for (int i4 = 1; i4 < side; i4++) {
                        simpleList.add(" " + i1 + i2 + i3 + i4);
                        count++;
                    }
                }
            }
        }
        System.out.println(simpleList);
        System.out.println(count);
        */



        /*
        1. Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
        2. Считаем, что 1 и 2 значения последовательности равны 1.
        3. Искать будем по формуле On=On-1+On-2 что предполагает использовать
        рекурсивного алгоритма.
*/
        AtomicLong cnt = new AtomicLong();
        System.out.println(fib(40, cnt));
        System.out.println(cnt);




        /*
        1.Пишем алгоритм поиска нужного числа последовательности Фибоначчи, но в этот
        раз откажемся от рекурсии и воспользуемся обычным алгоритмом, что даст нам
        линейную сложность, т.к. вычисление каждого из чисел последовательности будет
        происходить ровно 1 раз.
        1.Вариантов решения может быть несколько, но нужно предложить студентам
        считать последовательность с первого числа и далее до тех пор, пока не доберемся
        до нужного номера. При этом значение предыдущих элементов нужно сохранять,
        чтобы не приходилось вычислять заново, как это происходило при рекурсивном
        методе.
         */
        cnt = new AtomicLong(0);
        System.out.println(fib2(40, cnt));
        System.out.println(cnt);

    }



    public static int fib(int number, AtomicLong cnt) {
        cnt.incrementAndGet();
        if (number == 1 || number == 2)
            return 1;
        return fib(number - 1, cnt) + fib(number -2, cnt);
    }

    public static int fib2(int number, AtomicLong cnt) {
        if (number == 1 || number == 2)
            return 1;
       int f1 = 1, f2 = 1;
       int f3 = f1 + f2;
       while (number-- > 3){
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
            cnt.incrementAndGet();
       }
        return f3;
    }

}


