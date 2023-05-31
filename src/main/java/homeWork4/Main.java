package homeWork4;

/*
Реализовать класс работающий по принципу HashMap.
Включая внутренний массив узлов с индексацией по хешу и описание узла. Добавить в класс методы:
Object put(Integer key , Integer value) добавить элемент
Object get(Integer key) получить значение соответствующее ключу
Object remove(Integer key) удалить элемент с соответствующем ключём
Object replays(Integer key, Integer v) заменить значение
int size() количество элементов
boolean containsKey(Integer key) проверка наличия ключа и значения
boolean containsValue(Integer v)
 */

public class Main {
    public static void main(String[] args) {


        Mapa<Integer, String> mapa = new Mapa<>();
        mapa.put(1, "a");
        mapa.put(2, "g");
        mapa.put(7, "fgn567!@#$");
        mapa.put(7, "f");
        System.out.println();

        System.out.println(mapa.get(1));
        System.out.println(mapa.get(106));
        System.out.println(mapa.get(7));
        System.out.println();

        System.out.println(mapa.remove(2));

        System.out.println(mapa.containsKey(1));
        System.out.println(mapa.containsValue("a"));

        System.out.println(mapa.replays(1, "1"));
        System.out.println();

    }
}
