//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //task 5
        int value = 33;
        System.out.println("Value before: " + value);
        changeValue(value);
        System.out.println("Value after: " + value);
        //Объяснение: По причине того, что мы передали ссылку на переменную, а не значение, то в консоль выводит только значение 33 (связи с main и с changeValue никакой нет)
        //task 6
        Integer value1 = 33;
        System.out.println("Value before: " + value1);
        changeValue(value1);
        System.out.println("Value after: " + value1);
        //Объяснение: Мы создали локальную переменную типа Integer, в сравнении с заданием № 5 отличается только тип хранения данных, т.е. данная переменная хранит в себе адресс ссылки, по которой код следует в кучу, а там записано значение 33. По этой причине в консоль выводится значение 33.

        //task 7
        Integer[] value2 = new Integer[]{3, 4};
        System.out.println("Value before " + Arrays.toString(value2));
        changeValue(value2);
        System.out.println("Value after " + Arrays.toString(value2));
        //Объяснение: этот новый адрес ссылается на массив 1,2, НО старый адрес (по которому у нас указан массив 3,4) мы не меняли. После выхода из метода changeValue(Integer[] value) массив 3,4 остался без изменений, так что в консоль выводится 3,4
        //Уточню, что по какой-то причине джава не хочет работать с Arrays, что я делаю не так?

        //task 8
        Integer[] value3 = new Integer[]{3, 4};
        System.out.println("Value before " + Arrays.toString(value3));
        changeValue1(value3);
        System.out.println("Value after " + Arrays.toString(value3));
        //Объяснение: Наконец-то у нас что-то меняется! Суть в том, что обратившись к методу changeValue1(Integer[] value) произвели подмену значения в нулевой ячейке, а это изменение уже повлияло на то, что вывелось в консоль. Ибо мы не создали новый адрес памяти, а работаем со старым.

        //task 9
        Person person = new Person("Lyapis", "Trubetskoy");
        System.out.println("Value before: " + person);
        changeValue(person);
        System.out.println("Value after: " + person);
        //Объяснение: Результат абсолютно аналогичный, что и с прошлыми заданиями (кроме задания 8). Передали ссылку на информацию в куче, которая хранит информацию ("Lyapis", "Trubetskoy"), но в методе changeValue(Person person) мы просто создали новый участок памяти в куче, но он никак не влияет на Main

        //task 10
        Person person1 = new Person("Lyapis", "Trubetskoy");
        System.out.println("Value before: " + person1);
        changeValue1(person1);
        System.out.println("Value after: " + person1);
        //Объяснение: Тут значение меняется! Мы не создаём новый объект, мы работаем с существующим. В данном задании сеттеры помогли нам изменить состояние объекта, так что в консоль выводится "Ilya", "Lagutenko".


    }

    public static void changeValue(int value) {
        value = 22;

    }

    public static void changeValue(Integer value) {
        //value = Integer.valueof(22)
        value = 22;
    }

    public static void changeValue(Integer[] value) {
        value = new Integer[]{1, 2};
    }

    public static void changeValue1(Integer[] value) {
        value[0] = 99;
    }

    public static void changeValue(Person person) {
        System.out.println("from changeValue before: " + person);
        person = new Person("Ilya", "Lagutenko");
        System.out.println("from changeValue after: " + person);
    }

    public static void changeValue1(Person person) {
        System.out.println("from changeValue1 before: " + person);
        person.setName("Ilya");
        person.setSurname("Lagutenko");
        System.out.println("from changeValue1 after: " + person);
    }
}