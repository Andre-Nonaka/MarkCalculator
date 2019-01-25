import java.util.*;

public class MarksStats2_AndreN
{
  public static void main (String[] args)
  {
    Scanner input = new Scanner (System.in);
    int [] mark = new int [25];
    // generate 25 random integers
    for(int j = 0; j<25; j++)
    {
    mark[j]=(int)(Math.random()* 71) +30; //random integer from 30 to 100
    }
    Arrays.sort(mark); //sort array
    //display marks (from lowest to highest)
    System.out.println("From the lowest mark to the highest mark = ");
    for(int j = 0; j<mark.length; j++){
      System.out.println(mark[j] +"");
      System.out.println();
    }
    //method calls
     int cc = markPass(mark);
     int high = markHigh(mark);
     int range =markRange(mark);
     double average = markAverage(mark);
     
     // Display class statistics (how many are passing, highest mark, range and average)
    System.out.println(cc + " number of people passed");
    if (mark[24]>mark[23]){
      System.out.println("The highest mark in the class is " +high+ " %");
    }
    if(mark[24]==mark[23]){//if more than one person have the same highest mark then display message 
        System.out.println("There is at least one other student with the highest mark : "+high+ "%");
    }
      System.out.println("The range of marks in the class is " + range);
      System.out.printf("The class average in percentage is %.2f", average);
  }
    //helper method to determine how many marks are over 50%
    public static int markPass (int[]fifty)
    {
      int c = 0;
      //increment counter if mark is over 50%
      for(int j=0; j <fifty.length; j++)
      {
        if (fifty[j] >=50)
          c++;
      }
      return c;
    }
    
    //helper method to determine the highest mark
    public static int markHigh(int[]highest)
    {
      int top = 0;
      //sort array
      Arrays.sort(highest);
      //return highest mark
      top = highest[24];
      return top;
    }
    //helper method to determine range
    public static int markRange(int[]marks)
    {
      Arrays.sort(marks); //sort array
      //highest mark minus lowest mark
      int rangeA = marks[24] - marks[0];
      return rangeA;
    }
    //helper method to determine average 
    public static double markAverage(int[]total)
    {
      double avg = 0;
      int sum = 0;
      //find sum
      for(int j = 0; j<total.length;j++)
      {
        sum = sum + total[j];
      }
      //find average
      avg = (double)sum/25;
      return avg;
    }
  }
      
     
    