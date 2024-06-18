public class Policy
{  
   private String policyNumber;
   private String providerName;
   private String FirstName;
   private String LastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   /**
   No-arg constructor that initializes all fields
   */

   public Policy()
   {
      policyNumber = "";
      providerName = "";
      FirstName = "";
      LastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
   Constructor that accepts arguments for each field
   @param policyNumber The Policy number
   @param policyName The Policy provider's Name
   @param firstName The Policyholder's first name
   @param lastName The Policyholder's last name
   @param a The Policyholder's age
   @param smokeStatus The Policyholder's smoking status
   @param h The Policyholder's height
   @param w The Policyholder's weight
   */

   
   public Policy(String policyNumber, String policyName, String firstName, String lastName,int a, String smokeStatus, double h, double w)
   {
      policyNumber = policyNumber;
      providerName = policyName;
      FirstName = firstName;
      LastName = lastName;
      age = a;
      smokingStatus = smokeStatus;
      height = h;
      weight = w;
   }
   
   //getters//
   /**
   @return The policy number
   */
  
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
   @return The policy provider name 
   */
   
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
   @return The policyholder's first name
   */
   public String getFirstName()
   {
      return FirstName;
   }
   
    /**
   @return The policyholder's last name
   */
   public String getLastName()
   {
      return LastName;
   }
   
   /**
   @return The policyholder's age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
   @return The policyholder's smoking status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   @return The policyholder's height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   @return The policyholder's weight
   */
   public double getWeight()
   {
      return weight;
   }
   
   //setters//
   
   /**
   @param policyNumber The policy number
   */
   public void setPolicyNumber(String policyNumber)
   {
      policyNumber = policyNumber;
   }
   
   /**
   @param policyName The policy provider's name
   */
   public void setProviderName(String policyName)
   {
      providerName = policyName;
   }
   
   /**
   @param firstName The policy provider's first name
   */
   public void setFirstName(String firstName)
   {
      FirstName = firstName;
   }
   
   /**
   @param lastName The policy provider's last name
   */
   public void setLastName(String lastName)
   {
      LastName = lastName;
   }
   
   /**
   @param a The policy provider's age
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
   @param smokeStatus The policy provider's smoking status
   */
   public void setSmokingStatus(String smokeStatus)
   {
      smokingStatus = smokeStatus;
   }
   
   /**
   @param h The policy provider's height
   */
   public void setHeight(double h)
   {
      height = h;
   }
  
  /**
   @param w The policy provider's weight
   */ 
      public void setWeight(double w)
   {
      weight = w;
   }
   
   
   /**
   Calculates the policyholder's BMI
   @return The BMI of the Policyholder
   */

   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   /**
   Calculates the policy's price
   @return The price of the policy
   */
     public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(smokingStatus.equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(getBMI() > BMI_THRESHOLD)
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }

}