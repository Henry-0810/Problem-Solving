package PS5.a;

public class TestEmployee {
    public static void main(String[] args) {
        String str;
        Employee[] allEmployee = new Employee[5];
        Address address1 = new Address("123 Hyde Road","Ballydehob","Cork","Ireland",
                "R54HT7D");
        Address address2 = new Address("Boreennad Tonnta","Connemara","Galway","Ireland",
                "PG52K3B");
        Address address3 = new Address("87 Racecourse Lawn","Tralee","Kerry","Ireland",
                "AH78P36");
        Address address4 = new Address("2 Rock St","Mallow","Cork","Ireland","YU67R34");
        Address address5 = new Address("12 Westbrook Drive","Trim","Meath","Ireland",
                "78TYMDS");

        Insurance insurance1 = new Insurance("Irish Life Excel 500",5468292);
        Insurance insurance2 = new Insurance("AXA Superlative Life",9374633);
        Insurance insurance3 = new Insurance("LA Brokers Golden Goose", 7372642);
        Insurance insurance4 = new Insurance("LA Brokers Golden Goose",7372642);

        Employee employee1 = new Employee("Joseph Bloggs III",536272,address1,insurance1);
        Employee employee2 = new Employee("Marie O Connell",982111,address2,null);
        Employee employee3 = new Employee("Mark Mc Manus",352723,address3,insurance3);
        Employee employee4 = new Employee("Jaimie O Toole",234234,address4,insurance4);
        Employee employee5 = new Employee("Lara Connolly",568554,address5,insurance4);

        allEmployee[0] = employee1;
        allEmployee[1] = employee2;
        allEmployee[2] = employee3;

        //first part
//        for (int i = 0; i < allEmployee.length; i++) {
//            str = "Employee " + (i+1) + "\n\n";
//            System.out.println(str + allEmployee[i] +"\n");
//        }

        //second part
//        for (int i = 0; i < allEmployee.length; i++) {
//            if(allEmployee[i].getName().contains("Joseph")){
//                str = """
//                Now searching through the array of Employee objects to find any employees whose name contains the word 'joseph'\s
//
//
//                The details of all employees whose name contains the word 'joseph' is:
//
//                """ + allEmployee[i] + "\n\n\n\n";
//                Address addressCHG = new Address("56 Main Street","Thurles", "Tipperary", "Ireland", "B87JH5Q");
//                allEmployee[i] = new Employee(allEmployee[i].getName(),allEmployee[i].getId(),addressCHG,allEmployee[i].getInsurance());
//                str += "Now changing the address of Joseph Bloggs III\n\n\n" +
//                        "Displaying the state of the 'Joseph Bloggs III' employee now gives\n\n" + allEmployee[i];
//                System.out.println(str);
//                break;
//            }
//        }

        //third part

//        System.out.println("""
//                Now removing the insurance details completely for the second employee object
//
//                Displaying the state of the second employee now gives
//
//                """ + employee2 + "\n\nDisplaying the state of the second employee insurance object now gives\n\n" +
//                insurance2);

        //forth part
//        for (Employee employee : allEmployee) {
//            if (employee.getAddress().getCounty().equals("Kerry")) {
//                System.out.println("Displaying the state of all employees who hail from county Kerry\n\n" +
//                        employee);
//                break;
//            }
//        }

        //fifth part
        sortEmployeesByName(allEmployee);
    }

    private static void sortEmployeesByName(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            int minIndex = i;

            for (int j = 0; j < employees.length; j++) {

            }
        }
    }
}
