public class Person {
    private String name;

    private String surname;

    public Person(java.lang.String name, java.lang.String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }

    @Override
    public java.lang.String toString() {
        return "Person{" +
                "name=" + name +
                ", surname=" + surname +
                '}';
    }
}
