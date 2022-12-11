package PS10.a;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person person1 = new Person("James O Mahoney", "13 Eden Drive, Ballybunion",
                new GregorianCalendar(2001, 6, 23));
        Person person2 = new Person("Mary Woodley", "43 Haigs Terrace, Tralee",
                new GregorianCalendar(1982, 1, 28));
        Person person3 = new Person("Kevin Collins", "Ocean View Lodge, Kenmare",
                new GregorianCalendar(1977, 4, 7));
        Person person4 = new Person("Laura Mc Carthy", "8 Fairway Heights, Tralee",
                new GregorianCalendar(1963, 5, 17));
        Person person5 = new Person("Mike Delahunty", "Radharc na hEaglaise, Ardfert",
                new GregorianCalendar(2003, 3, 15));

        ArrayList<Person> people = new ArrayList<>(Arrays.asList(person1,person2,person3,person4,person5));

        System.out.println("""
                Calling the Person(String,String,GregorianCalendar) constructor to create 5 Person objects .....
                                
                Adding the Person objects to an array-list.....
                                
                Displaying state of the Person objects in the array-list.....         
                """);
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("\nPlease enter the name of the person you wish to find: ");
        String name = sc.nextLine();

        int i;
        for (i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println("Found " + name + "!");
                break;
            }
        }
        if(i == people.size()){
            System.out.println("Name not found!");
        }

        System.out.println("\nPlease enter the name of the person whose address you wish to amend: ");
        name = sc.nextLine();
        for (Person person: people) {
            if(person.getName().equalsIgnoreCase(name)){
                System.out.println("Found " + name + "!");

                System.out.println("The current address for this person is " + person.getAddress());

                System.out.println("\nPlease enter the new address for this person: ");
                String address = sc.nextLine();
                person.setAddress(address);

                System.out.println("\nDisplaying updated state of this Person object .....\n" + person);
            }
        }

        System.out.println("\nPlease enter name of the person whose date of birth you wish to amend: ");
        name = sc.nextLine();

        for (Person person:people) {
            if(person.getName().equalsIgnoreCase(name)){
                System.out.println("Found " + name + "!");

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                System.out.println("The current date of birth for this person is " + dateFormat.format(person.getDateOfBirth().getTime()));

                System.out.println("\nPlease enter the new date of birth for this person (in the form dd-mm-yyyy): ");
                String date = sc.nextLine();
                int year = Integer.parseInt(date.substring(6));
                int month = Integer.parseInt(date.substring(3,5));
                int day = Integer.parseInt(date.substring(0,2));
                GregorianCalendar newDOB = new GregorianCalendar(year,month,day);

                person.setDateOfBirth(newDOB);

                System.out.println("\nDisplaying updated state of this Person object .....\n" + person);
            }
        }

        System.out.println("Please enter the name of the person you would like to remove: ");
        name = sc.nextLine();
        for (i = 0;i<people.size();i++) {
            if(people.get(i).getName().equalsIgnoreCase(name)){
                System.out.println("Found " + name + "!");
                System.out.println("The current state for this person is ......"+people.get(i));

                System.out.println("\nIf you are sure you wish to remove this person, enter yes: ");
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("yes")){
                    people.remove(i);
                }
            }
        }

        System.out.println("\nDisplaying updated state of the Person objects in the array-list.....\n");
        for (Person person:people) {
            System.out.println(person);
        }

        System.out.println("""
                Making a copy of original array-list.....
                
                
                Displaying updated state of the Person objects in the array-list.....
                
                """);

        ArrayList<Person> oriPeople = new ArrayList<>(people);

        for (Person person: oriPeople) {
            System.out.println(person);
        }

        System.out.println("""
                
                Now sorting the array-list into ascending order by date of birth .....
                
                Displaying updated state of the Person objects in the array-list after sorting .....
                
                """);




    }

    private static void sortArrayListByDateOfBirth(ArrayList<Person> allPersons){
        int l = allPersons.size();

        for (int i = 0; i < l-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < l; j++) {
                if(allPersons.indexOf(j) < allPersons.indexOf(min_idx)){
                    min_idx = j;
                }
            }

            int temp = allPersons.indexOf(min_idx);
            allPersons = allPersons.indexOf(i);

        }
    }
}
