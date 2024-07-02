public class Policy
{  
   private String policyNumber;
   private String providerName;

   public Policy()
   {
      policyNumber = "";
      providerName = "";
      
   }
   
   
   public Policy(String policyNumber, String policyName)
   {
      policyNumber = policyNumber;
      providerName = policyName;
      
   }
   
  
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   
   public String getProviderName()
   {
      return providerName;
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