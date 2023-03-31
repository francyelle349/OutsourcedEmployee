package outsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class exec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees:");
        int number = sc.nextInt();
        

        List<Employee> listEmployee = new ArrayList<>();
        int countLoop = 1;
        String outsourcedString = "";
        int count = 0;

        while(true){
            count+=1;
            
            System.out.println("Employee # "+count+" data:");
            System.out.print("Outsourced(y/n)?");
            outsourcedString = sc.next();
            clearBuffer(sc);
            System.out.print("Name:");
            String name = sc.nextLine();
            
            char firstLetter = name.charAt(0);

            String firstLetterName = "" + firstLetter;
            if(firstLetterName.equals(firstLetterName.toUpperCase())){
                System.out.println("Valid name");
            }
            else{
                System.out.println("The name is not valid");
                continue;
            }
            System.out.print("Hour:");
            Integer Hour = sc.nextInt();
            System.out.print("Value per Hour:");
            Double valuePerHour = sc.nextDouble();
            if(outsourcedString.equals("y")){
                System.out.print("Additional Charge:");
                Double additionalCharge = sc.nextDouble();
                Employee outsourceEmployee1 = new OutsourceEmployee(name, Hour, valuePerHour, additionalCharge);
                listEmployee.add(outsourceEmployee1);
            }
            if(outsourcedString.equals("n")){
                Employee employee = new Employee(name, Hour, valuePerHour);
                listEmployee.add(employee);

            }

            if(countLoop == number){
                break;
            }
            countLoop++;
            
            
        




        }

        System.out.println("PAYMENTS:");

        for (Employee employee : listEmployee) {
            
            System.out.println(employee);
        }
        

       
        System.out.print("Do you want to remove some employee?"+"\n");
        clearBuffer(sc);
        String remove = sc.nextLine();

       
        if(remove.equals("y")){
            System.out.println("Enter the position:");
            Integer posiEmployee = sc.nextInt();
            
                for(int i = 0; i < listEmployee.size();i++){
                    if(posiEmployee == i){
                        listEmployee.remove(i);
                        System.out.println("Employee removed successfully.");
                    }
                }
              
            }
           

        
        for (Employee employee : listEmployee) {
            
            System.out.println(employee);
        }
        
        
        sc.close();
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    
}
}
 