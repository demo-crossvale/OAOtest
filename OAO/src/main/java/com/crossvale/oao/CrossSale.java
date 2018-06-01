package com.crossvale.oao;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("crossSale")
public class CrossSale implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("customerType")
   private java.lang.String customerType;
   @org.kie.api.definition.type.Label("creditScore")
   private java.lang.Integer creditScore;

   @org.kie.api.definition.type.Label("creditCard")
   private String creditCard;

   @org.kie.api.definition.type.Label("loan")
   private java.lang.String loan;

   @org.kie.api.definition.type.Label(value = "riskFactor")
   private java.lang.String riskFactor;

   public CrossSale()
   {
   }

   public java.lang.String getCustomerType()
   {
      return this.customerType;
   }

   public void setCustomerType(java.lang.String customerType)
   {
      this.customerType = customerType;
   }

   public java.lang.Integer getCreditScore()
   {
      return this.creditScore;
   }

   public void setCreditScore(java.lang.Integer creditScore)
   {
      this.creditScore = creditScore;
   }

   public java.lang.String getCreditCard()
   {
      return this.creditCard;
   }

   public void setCreditCard(java.lang.String creditCard)
   {
      this.creditCard = creditCard;
   }

   public java.lang.String getLoan()
   {
      return this.loan;
   }

   public void setLoan(java.lang.String loan)
   {
      this.loan = loan;
   }

   public java.lang.String getRiskFactor()
   {
      return this.riskFactor;
   }

   public void setRiskFactor(java.lang.String riskFactor)
   {
      this.riskFactor = riskFactor;
   }

   public CrossSale(java.lang.String customerType, java.lang.Integer creditScore,
         java.lang.String creditCard, java.lang.String loan,
         java.lang.String riskFactor)
   {
      this.customerType = customerType;
      this.creditScore = creditScore;
      this.creditCard = creditCard;
      this.loan = loan;
      this.riskFactor = riskFactor;
   }

}