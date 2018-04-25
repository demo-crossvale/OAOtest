package com.crossvale.carddispute;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Transaction implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("transactionNumber")
   private java.lang.String transactionNumber;
   @org.kie.api.definition.type.Label("postedDate")
   private java.util.Date postedDate;
   @org.kie.api.definition.type.Label("narrative")
   private java.lang.String narrative;
   @org.kie.api.definition.type.Label("accountNumber")
   private java.lang.String accountNumber;
   @org.kie.api.definition.type.Label("ticketNumber")
   private java.lang.String ticketNumber;
   @org.kie.api.definition.type.Label("checkNumber")
   private java.lang.String checkNumber;
   @org.kie.api.definition.type.Label("amount")
   private java.lang.Float amount;
   @org.kie.api.definition.type.Label("creditFlag")
   private java.lang.String creditFlag;
   @org.kie.api.definition.type.Label("transactionCode")
   private java.lang.String transactionCode;
   @org.kie.api.definition.type.Label("country")
   private java.lang.String country;

   public Transaction()
   {
   }

   public java.lang.String getTransactionNumber()
   {
      return this.transactionNumber;
   }

   public void setTransactionNumber(java.lang.String transactionNumber)
   {
      this.transactionNumber = transactionNumber;
   }

   public java.util.Date getPostedDate()
   {
      return this.postedDate;
   }

   public void setPostedDate(java.util.Date postedDate)
   {
      this.postedDate = postedDate;
   }

   public java.lang.String getNarrative()
   {
      return this.narrative;
   }

   public void setNarrative(java.lang.String narrative)
   {
      this.narrative = narrative;
   }

   public java.lang.String getAccountNumber()
   {
      return this.accountNumber;
   }

   public void setAccountNumber(java.lang.String accountNumber)
   {
      this.accountNumber = accountNumber;
   }

   public java.lang.String getTicketNumber()
   {
      return this.ticketNumber;
   }

   public void setTicketNumber(java.lang.String ticketNumber)
   {
      this.ticketNumber = ticketNumber;
   }

   public java.lang.String getCheckNumber()
   {
      return this.checkNumber;
   }

   public void setCheckNumber(java.lang.String checkNumber)
   {
      this.checkNumber = checkNumber;
   }

   public java.lang.Float getAmount()
   {
      return this.amount;
   }

   public void setAmount(java.lang.Float amount)
   {
      this.amount = amount;
   }

   public java.lang.String getCreditFlag()
   {
      return this.creditFlag;
   }

   public void setCreditFlag(java.lang.String creditFlag)
   {
      this.creditFlag = creditFlag;
   }

   public java.lang.String getTransactionCode()
   {
      return this.transactionCode;
   }

   public void setTransactionCode(java.lang.String transactionCode)
   {
      this.transactionCode = transactionCode;
   }

   public java.lang.String getCountry()
   {
      return this.country;
   }

   public void setCountry(java.lang.String country)
   {
      this.country = country;
   }

   public Transaction(java.lang.String transactionNumber,
         java.util.Date postedDate, java.lang.String narrative,
         java.lang.String accountNumber, java.lang.String ticketNumber,
         java.lang.String checkNumber, java.lang.Float amount,
         java.lang.String creditFlag, java.lang.String transactionCode,
         java.lang.String country)
   {
      this.transactionNumber = transactionNumber;
      this.postedDate = postedDate;
      this.narrative = narrative;
      this.accountNumber = accountNumber;
      this.ticketNumber = ticketNumber;
      this.checkNumber = checkNumber;
      this.amount = amount;
      this.creditFlag = creditFlag;
      this.transactionCode = transactionCode;
      this.country = country;
   }

}