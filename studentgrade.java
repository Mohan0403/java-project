//Java program to compute student grade
import java.util.*;
class Student{
   int marks[]=new int[5];
    int total=0;
    static int totalmark[]=new int[5];
    static int fail=0;
    static int countFail=0;
    static int c=0;
    static int totc=0;
    static String stuname[]=new String[5];
    static int classAvg=0;
   void getName(){
     Scanner s= new Scanner(System.in);
     System.out.print("Enter student name: ");
     String name=s.nextLine();
     stuname[c] = name;
     c++;
      }
         

   void getMarks(){
     for(int i=0;i<5;i++){
              System.out.print("Enter mark "+(i+1)+":");
              Scanner s= new Scanner(System.in);
              marks[i]=s.nextInt();
       }
       
    }
   void grade(){
        for(int i=0;i<5;i++)
       {
            System.out.print("Grade for Subject "+(i+1)+": ");
            if(marks[i]>90 && marks[i]<=100){
                  System.out.println("S");
             }
            else if(marks[i]>80 && marks[i]<=90){
                 System.out.println("A+");
            }
            else if(marks[i]>70 && marks[i]<=80){
                 System.out.println("A");
            }
            else if(marks[i]>60 && marks[i]<=70){
                System.out.println("B+");
            }
           else if(marks[i]>50 && marks[i]<=60){
               System.out.println("B");
           }
           else {
               System.out.print("Fail");
               fail++;
           }
         
       
       }
  }
   void totalMarks(){
       for(int i=0;i<5;i++){
             total+=marks[i];
        }
       System.out.println("Total Marks of Student : "+total);
       totalmark[totc] = total;
       totc++;
    }
 void failure(){
    System.out.println("Number of failure: "+fail);
}
void passP(){
   for(int i=0;i<5;i++){
      if(marks[i]<50){
          countFail++;
          break;
      }
      
   }
}
void passPercent(){
  int pass=(5-countFail)*20;
  System.out.println("Pass percentage :"+pass+"%");
}
void rankList(){
   for(int i=0;i<45;i++){
       for(int j=i+1;j<5;j++){
           if(totalmark[i]<totalmark[j]){
               int temp=totalmark[i];
               totalmark[i]=totalmark[j];
               totalmark[j]=temp;
               
               String temp2 = stuname[i];
               stuname[i]=stuname[j];
               stuname[j]=temp2;
           }
       }
    }
   for(int i=0;i<(5-countFail);i++){
     System.out.println("Rank "+(i+1)+" :");
     System.out.println("Name: "+stuname[i]);
     System.out.println("Total marks :"+totalmark[i]);
 }
}
    


}
         
       

 public class studentgrade{
  public static void main(String[] args){
       Student s[]= new Student[5];
       for(int i=0;i<5;i++){
          System.out.println("Enter the Student "+(i+1)+" details");
          s[i] = new Student();
          s[i].getName();
          s[i].getMarks();
          s[i].grade();
          s[i].totalMarks();
          s[i].passP();
        }
       Student obj = new Student();
       obj.failure();
       obj.rankList();
       obj.passPercent();
   }
}