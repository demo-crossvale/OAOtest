package com.crossvale.oao;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("creditScore")
public class CreditScore implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "score")
   private java.lang.Integer score;
   @org.kie.api.definition.type.Label(value = "rating")
   private java.lang.String rating;

   public CreditScore()
   {
   }

   public java.lang.Integer getScore()
   {
      return this.score;
   }

   public void setScore(java.lang.Integer score)
   {
      this.score = score;
   }

   public java.lang.String getRating()
   {
      return this.rating;
   }

   public void setRating(java.lang.String rating)
   {
      this.rating = rating;
   }

   public CreditScore(java.lang.Integer score, java.lang.String rating)
   {
      this.score = score;
      this.rating = rating;
   }

}