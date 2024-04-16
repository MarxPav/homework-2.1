//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //task 5
        int value = 33;
        System.out.println("Value before: " + value);
        changeValue(value);
        System.out.println("Value after: " + value);
        //Объяснение: Ввиду того, что сейчас мы работаем с примитивным типом данных параметры передаются по значению, а не по ссылке. В методе changeValue просто создается ячейка информации и изменения применяются только в этом методе. Следовательно в методе Main значение никак не меняется
        //task 6
        Integer value1 = 33;
        System.out.println("Value before: " + value1);
        changeValue(value1);
        System.out.println("Value after: " + value1);
        //Объяснение: В данном задании меняется только тип хранения данных (Integer). Объекты подобного характера также передаются по значению, но изменения переменной внутри "ChangeValue" опять никак не влияют на переменную "value1". Следовательно при выводе значения в коносль,значение не меняется.

        //task 7
        Integer[] value2 = new Integer[]{3, 4};
        System.out.println("Value before " + Arrays.toString(value2));
        changeValue(value2);
        System.out.println("Value after " + Arrays.toString(value2));
        //Объяснение: этот новый адрес ссылается на массив 1,2, НО старый адрес (по которому у нас указан массив 3,4) мы не меняли. Изменения любой ссылочной переменной в методе (включая массивы) не отразятся на оригинальной переменной в вызывающем методе. После выхода из метода changeValue(Integer[] value) массив 3,4 остался без изменений, так что в консоль выводится 3,4.
        //Уточню, что по какой-то причине джава не хочет работать с Arrays, что я делаю не так?

        //task 8
        Integer[] value3 = new Integer[]{3, 4};
        System.out.println("Value before " + Arrays.toString(value3));
        changeValue1(value3);
        System.out.println("Value after " + Arrays.toString(value3));
        //Объяснение: Наконец-то у нас что-то меняется! Изменения в массиве внутри метода `changeValue1` будут видны в методе `main`, потому что изменение происходит по ссылке на исходный массив. По этой причине в консоль выводится 99, 4

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