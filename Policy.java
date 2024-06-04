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
   
  
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   
   public String getProviderName()
   {
      return providerName;
   }
   
   
   public String getFirstName()
   {
      return FirstName;
   }
   
   
   public String getLastName()
   {
      return LastName;
   }
   
   
   public int getAge()
   {
      return age;
   }
   
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   
   public double getHeight()
   {
      return height;
   }
   
   
   public double getWeight()
   {
      return weight;
   }
   
   
   public void setPolicyNumber(String policyNumber)
   {
      policyNumber = policyNumber;
   }
   

   public void setProviderName(String policyName)
   {
      providerName = policyName;
   }
   
   
   public void setFirstName(String firstName)
   {
      FirstName = firstName;
   }
   
   
   public void setLastName(String lastName)
   {
      LastName = lastName;
   }
   
   public void setAge(int a)
   {
      age = a;
   }
   
   
   public void setSmokingStatus(String smokeStatus)
   {
      smokingStatus = smokeStatus;
   }
   
   
   public void setHeight(double h)
   {
      height = h;
   }
   
      public void setWeight(double w)
   {
      weight = w;
   }
   
   
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
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