package Equal;

public class Main {

    public static void main(String[] args) {
	    employee emp1 =  new employee("01", "Alpha", "Nipun","990420971v", "Bombuwala, Kaluthara");
        employee emp2 =  new employee("02", "Bravo", "Nadeeshana","199904200971", "Pagoda Road, Nugegoda");

        boolean equal = emp1.equals(emp2);
        System.out.println(equal);
        System.out.println(emp1);
        System.out.println(emp2);

        emp2.setEmpId("01");
        emp1.setEmpCode("Bravo");
        boolean equal2 = emp1.equals(emp2);
        System.out.println(equal2);

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
