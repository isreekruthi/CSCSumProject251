import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_sree_inuganti
{
   public static void main(String[] args) throws IOException
   {
      
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      int numSmokers = 0;
      
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      
      while(inputFile.hasNext())
      {
      
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
          policyList.add(new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight));
      
      }
      
      
      for(Policy policy : policyList)
      { 
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
         System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
         System.out.println();
         
         if(policy.getSmokingStatus().equalsIgnoreCase("smoker"))
            numSmokers++;
      }
      
      
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) );
   }
}