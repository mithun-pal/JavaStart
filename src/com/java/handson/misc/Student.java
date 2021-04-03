package com.java.handson.misc;

public class Student{
    private String firstName;
    private String lastName;
    private int id;
    private int[] testScores;
    private char grade;
    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    public Student(String firstName,String lastName,int id, int[] testScores){
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        this.testScores=testScores;
    }
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate(){
        int avg=0,sum=0;
        for(int i=0; i <= testScores.length-1; i++){
            sum=sum+testScores[i];
        }
        avg=sum/testScores.length;
        if(avg<40)
            grade= 'T';
        else if(avg>=40 && avg<55)
            grade=  'D';
        else if(avg>=55 && avg<70)
            grade=  'P';
        else if(avg>=70 && avg<80)
            grade= 'A';
        else if(avg>=80 && avg<90)
            grade= 'E';
        else if(avg>=90 && avg<=100)
            grade= 'O';

        return  grade;

    }
  public static void main(String[] args){
     Student s=new Student("Ian","Ben",20875,new int[]{46,86}) ;
     System.out.println(s.calculate());
  }

}
