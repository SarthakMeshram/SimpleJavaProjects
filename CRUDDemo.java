import java.util.*;

class Employee{
    private int empno;
    private String ename;
    private int salary;

    Employee(int empno, String ename, int salary){
        this.empno = empno;
        this.ename =  ename;
        this.salary = salary;
    }

    public int getEmpno(){
        return empno;
    } 

    public String getEname(){
        return ename;
    }

    public int getSalary(){
        return salary;
    }

    public String toString(){
        return empno + " " + ename + " " + salary;
    }
}

class CRUDDemo{
    public static void main(String Args[]){

        List<Employee> c = new ArrayList<Employee>();
        int ch;
        try (Scanner s = new Scanner(System.in)) {
            try (Scanner s1 = new Scanner(System.in)) {
                do {
                    System.out.println("1.Insert");
                    System.out.println("2.Display");
                    System.out.println("3.Search");
                    System.out.println("4.Delete");
                    System.out.println("5.Update");
                    System.out.println("0.Quit");
                    System.out.print("Enter your choice: ");
                    ch = s.nextInt();
                    switch (ch){
                        case 1:
                            System.out.print("Enter Empno : ");
                            int empno = s.nextInt();
                            System.out.print("Enter Ename : ");
                            String ename = s1.nextLine();
                            System.out.print("Enter salary : ");
                            int salary = s.nextInt();

                            c.add(new Employee(empno, ename, salary));
                            break;

                        case 2:
                            System.out.println("-------------------------");
                            Iterator<Employee> i = c.iterator();
                            while (i.hasNext()) {
                                Employee e = i.next();
                                System.out.println(e);
                            }
                            System.out.println("-------------------------");
                            break;

                        case 3:
                            boolean found = false;
                            System.out.println("Enter employee no to search: ");
                            empno = s.nextInt();
                            System.out.println("-------------------------");
                            i = c.iterator();
                            while (i.hasNext()) {
                                Employee e = i.next();
                                if(e.getEmpno() == empno){
                                System.out.println(e);
                                found = true;
                                }
                            }
                            if(!found){
                                System.out.println("Not found!");
                            }
                            System.out.println("-------------------------");
                            break;


                        case 4:
                            found = false;
                            System.out.println("Enter employee no to delete: ");
                            empno = s.nextInt();
                            System.out.println("-------------------------");
                            i = c.iterator();
                            while (i.hasNext()) {
                                Employee e = i.next();
                                if(e.getEmpno() == empno){
                                i.remove();
                                found = true;
                                }
                            }                
                            if(!found){
                                System.out.println("Not found!");
                            }
                            else{
                                System.out.println("Deleted Successfully");
                            }
                            System.out.println("-------------------------");
                            break;


                        case 5:
                            found = false;
                            System.out.println("Enter employee no to Update: ");
                            empno = s.nextInt();
                            System.out.println("-------------------------");
                            ListIterator<Employee>li = c.listIterator();
                            while (li.hasNext()) {
                                Employee e = li.next();
                                if(e.getEmpno() == empno){
                                System.out.print("Enter new name: ");
                                ename = s1.nextLine();

                                System.out.print(("Enter new salary: "));
                                salary =s.nextInt();

                                li.set(new Employee(empno, ename, salary));

                                found = true;
                                }
                            }
                            if(!found){
                                System.out.println("Not found!");
                            }
                            else{
                                System.out.println("Updated Successfully");
                            }
                            System.out.println("-------------------------");
                            break;

                     
                    }
                } while(ch!=0);
            }
        }
    }
}
