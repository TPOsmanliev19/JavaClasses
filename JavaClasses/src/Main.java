import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Animal dog= new Animal("Dog", 20);
        Animal cat = new Animal("Cat", 10);
        Animal dog2 = new Animal();

        System.out.println(dog.getAge());
        System.out.println(cat.getAge());

        System.out.println();
        System.out.println();

        dog.setAge(21);
        cat.setAge(11);

        System.out.println(dog.getAge());
        System.out.println(cat.getAge());

        System.out.println();
        System.out.println();

        System.out.println(dog);
        System.out.println(cat);

        System.out.println();
        System.out.println();
        System.out.println(Animal.test);
    */

        Scanner scanner = new Scanner(System.in);
        List<Person> people= new ArrayList<>();
        int n=Integer.parseInt(scanner.nextLine());

        for (int i=0;i<n;i++)
        {
            String[] input =scanner.nextLine().split("\\s+");
            String name=input[0];
            int age= Integer.parseInt(input[1]);

            Person person= new Person(name,age);
            people.add(person);
        }



        for (int i=0;i<people.size();i++) {
            if (people.get(i).getAge() >= 30) {
                System.out.println(people.get(i));

            }
        }

        for (Person per: people)
        {
            System.out.println(per);
        }



    }

}