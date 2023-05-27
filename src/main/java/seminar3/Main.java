package seminar3;

public class Main {
    public static void main(String[] args) {
        OneListWay <Integer> oneListWay = new OneListWay<>();
        oneListWay.add(351);
        oneListWay.add(1);
        oneListWay.add(312251);
        oneListWay.add(1, 2);
        oneListWay.addLast(11111);

        System.out.println(oneListWay.size());
        System.out.println(oneListWay.get(1));
        System.out.println(oneListWay.get(oneListWay.size()-1));
        System.out.println(oneListWay.contains(10));
        System.out.println(oneListWay.indexOf(1));

        TwoListWay <Integer> twoListWay = new TwoListWay<>();
        twoListWay.add(351);
        twoListWay.add(1);
        twoListWay.add(312251);
        twoListWay.add(1, 2);
        twoListWay.addLast(11111);

    }
}
