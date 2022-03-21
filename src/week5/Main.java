package week5;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Arie", "de Beuker",33);

        System.out.println(person1.getFirstName());

        person1.setLastName("Bakker");
        person1.setLastName("bb");

        System.out.println(person1.isAdult());

        System.out.println(person1.getPercentageOfAge(8));

        System.out.println("The person loves: " +person1.getHobbyAtIndex(99));
    }
}
