package com.crossvale.carddispute;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("Task")
public class Task implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("taskNumber")
   private java.lang.String taskNumber;
   @org.kie.api.definition.type.Label("taskType")
   private java.lang.String taskType;
   @org.kie.api.definition.type.Label("description")
   private java.lang.String description;
   @org.kie.api.definition.type.Label("ticketNumber")
   private java.lang.String ticketNumber;
   @org.kie.api.definition.type.Label("customInfo")
   private java.lang.String customInfo;
   @org.kie.api.definition.type.Label("dueDate")
   private String dueDate;
   @org.kie.api.definition.type.Label("username")
   private java.lang.String username;

   public Task()
   {
   }

   public java.lang.String getTaskNumber()
   {
      return this.taskNumber;
   }

   public void setTaskNumber(java.lang.String taskNumber)
   {
      this.taskNumber = taskNumber;
   }

   public java.lang.String getTaskType()
   {
      return this.taskType;
   }

   public void setTaskType(java.lang.String taskType)
   {
      this.taskType = taskType;
   }

   public java.lang.String getDescription()
   {
      return this.description;
   }

   public void setDescription(java.lang.String description)
   {
      this.description = description;
   }

   public java.lang.String getTicketNumber()
   {
      return this.ticketNumber;
   }

   public void setTicketNumber(java.lang.String ticketNumber)
   {
      this.ticketNumber = ticketNumber;
   }

   public java.lang.String getCustomInfo()
   {
      return this.customInfo;
   }

   public void setCustomInfo(java.lang.String customInfo)
   {
      this.customInfo = customInfo;
   }

   public java.lang.String getUsername()
   {
      return this.username;
   }

   public void setUsername(java.lang.String username)
   {
      this.username = username;
   }

   public java.lang.String getDueDate()
   {
      return this.dueDate;
   }

   public void setDueDate(java.lang.String dueDate)
   {
      this.dueDate = dueDate;
   }

   public Task(java.lang.String taskNumber, java.lang.String taskType,
         java.lang.String description, java.lang.String ticketNumber,
         java.lang.String customInfo, java.lang.String dueDate,
         java.lang.String username)
   {
      this.taskNumber = taskNumber;
      this.taskType = taskType;
      this.description = description;
      this.ticketNumber = ticketNumber;
      this.customInfo = customInfo;
      this.dueDate = dueDate;
      this.username = username;
   }

}