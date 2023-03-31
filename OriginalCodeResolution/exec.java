
    package resolucaoEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exec {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.println("Enter the number of Employees");
        int numberOfEmployees = sc.nextInt();

        for(int i = 0; i < numberOfEmployees; i++ ){
            System.out.println("Employee #"+i+1+"data:");
            System.out.println("Outsourced(y/n)?");
            char outsourced = sc.next().charAt(0);
            System.out.println("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours:");
            int hours = sc.nextInt();
            System.out.println("Value per Hour:");
            double valuePerHour = sc.nextDouble();
            if(outsourced == 'y'){
                System.out.println("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));


        }
        else{
            list.add(new Employee(name, hours, valuePerHour));
        }
        

        
    }
    System.out.println();
        System.out.println("Payments:");
        for(Employee emp : list){
            System.out.println(emp.getName() +" - $"+String.format("%.2f",emp.payment()));
        }
    sc.close();
}
}
    
