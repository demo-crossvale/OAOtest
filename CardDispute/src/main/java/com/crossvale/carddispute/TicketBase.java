package com.crossvale.carddispute;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("TicketBase")
public class TicketBase implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("ticketNumber")
   private java.lang.String ticketNumber;
   @org.kie.api.definition.type.Label("dateReceived")
   private java.util.Date dateReceived;
   @org.kie.api.definition.type.Label("source")
   private java.lang.String source;
   @org.kie.api.definition.type.Label("customerNumber")
   private java.lang.String customerNumber;
   @org.kie.api.definition.type.Label("groupAssigned")
   private java.lang.String groupAssigned;
   @org.kie.api.definition.type.Label("dueDate")
   private java.util.Date dueDate;
   @org.kie.api.definition.type.Label("status")
   private java.lang.String status;
   @org.kie.api.definition.type.Label("narrative")
   private java.lang.String narrative;
   @org.kie.api.definition.type.Label("accountNumber")
   private java.lang.String accountNumber;
   @org.kie.api.definition.type.Label("issue")
   private java.lang.String issue;

   public TicketBase()
   {
   }

   public java.lang.String getTicketNumber()
   {
      return this.ticketNumber;
   }

   public void setTicketNumber(java.lang.String ticketNumber)
   {
      this.ticketNumber = ticketNumber;
   }

   public java.util.Date getDateReceived()
   {
      return this.dateReceived;
   }

   public void setDateReceived(java.util.Date dateReceived)
   {
      this.dateReceived = dateReceived;
   }

   public java.lang.String getSource()
   {
      return this.source;
   }

   public void setSource(java.lang.String source)
   {
      this.source = source;
   }

   public java.lang.String getCustomerNumber()
   {
      return this.customerNumber;
   }

   public void setCustomerNumber(java.lang.String customerNumber)
   {
      this.customerNumber = customerNumber;
   }

   public java.lang.String getGroupAssigned()
   {
      return this.groupAssigned;
   }

   public void setGroupAssigned(java.lang.String groupAssigned)
   {
      this.groupAssigned = groupAssigned;
   }

   public java.util.Date getDueDate()
   {
      return this.dueDate;
   }

   public void setDueDate(java.util.Date dueDate)
   {
      this.dueDate = dueDate;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
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

   public java.lang.String getIssue()
   {
      return this.issue;
   }

   public void setIssue(java.lang.String issue)
   {
      this.issue = issue;
   }

   public TicketBase(java.lang.String ticketNumber, java.util.Date dateReceived,
         java.lang.String source, java.lang.String customerNumber,
         java.lang.String groupAssigned, java.util.Date dueDate,
         java.lang.String status, java.lang.String narrative,
         java.lang.String accountNumber, java.lang.String issue)
   {
      this.ticketNumber = ticketNumber;
      this.dateReceived = dateReceived;
      this.source = source;
      this.customerNumber = customerNumber;
      this.groupAssigned = groupAssigned;
      this.dueDate = dueDate;
      this.status = status;
      this.narrative = narrative;
      this.accountNumber = accountNumber;
      this.issue = issue;
   }

}