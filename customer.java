import java.util.*;
class cus{
    int [][]cus_id=new int[100][];
    int []cus=new int[100];
    int price[][]=new int[100][100];
    int total[]=new int[100];
    int totalin[]=new int[100];
    static int num;
    static int noItem;

    
    void getDetails(){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the number of customer:");
       num=n.nextInt();
        for(int i=0;i<num;i++){
            Scanner s= new Scanner(System.in);
            System.out.print("Enter customer "+(i+1)+" id:");
             int id=s.nextInt();
            cus[i]=id;
            System.out.print("Enter no of Items:");
            noItem=s.nextInt();
            cus_id[i]=new int[noItem];
            System.out.println("Enter transaction item id between 1000 to 1010:");
            for(int j=0;j<noItem;j++){
                System.out.print("Enter Transaction item "+(j+1)+" number:");
                cus_id[i][j]=s.nextInt();
            }
        }
   }
   void price(){
    for(int i=0;i<num;i++){
        price[i]=new int[noItem];
        for(int j=0;j<noItem;j++){
            if(cus_id[i][j]==1000){
                price[i][j]=200;
            }
            else if(cus_id[i][j]==1001){
                price[i][j]=225;
            }
             else if(cus_id[i][j]==1002){
                price[i][j]=250;
            }
             else if(cus_id[i][j]==1003){
                price[i][j]=275;
            }
             else if(cus_id[i][j]==1004){
                price[i][j]=300;
            }
             else if(cus_id[i][j]==1005){
                price[i][j]=325;
            }
             else if(cus_id[i][j]==1006){
                price[i][j]=350;
            }
             else if(cus_id[i][j]==1007){
                price[i][j]=375;
            }
             else if(cus_id[i][j]==1008){
                price[i][j]=400;
            }
             else if(cus_id[i][j]==1009){
                price[i][j]=425;
            }
             else if(cus_id[i][j]==10010){
                price[i][j]=450;
            }
            else{
                System.out.print("Invalid input");
            }
        }
    }
   }
   void display(){
    System.out.println("Customer Details:");
    for(int i=0;i<num;i++){
        System.out.println("Customer "+(i+1)+" id:"+cus[i]);
        for(int j=0;j<noItem;j++){
            System.out.println("Transaction item "+(j+1)+" number:"+cus_id[i][j]);
            System.out.println("Price for "+(j+1)+" item:"+price[i][j]);
               total[i]+=price[i][j];
        }
        System.out.println("Total price: "+total[i]);
    }
   }
   void searchCustomer(int in){
     boolean b=false;
      for(int i=0;i<num;i++){
        if(cus[i]==in){
            for(int j=0;j<noItem;j++){
                System.out.println("Transaction item "+(j+1)+" number:"+cus_id[i][j]);
                System.out.println("Price for "+(j+1)+" item: "+price[i][j]);
                totalin[i]=price[i][j];
                b=true;
            }
            System.out.println("Total price: "+totalin[i]);
            break;
        }
      }
      if(!b){
        System.out.println("Customer not found..");
      }


   }
            

            

        }
class customer{
    public static void main(String[] args){
        cus c=new cus();
        char choice;
        Scanner s=new Scanner(System.in);
        c.getDetails();
        c.price();
      do{
         System.out.print("Enter 1.Search Customer"+"\n"+"2.Display all customer:");
        int cho=s.nextInt();
        switch(cho){
            case 1:
                System.out.print("Enter Customer Id:");
                int c_id=s.nextInt();
                c.searchCustomer(c_id);
                break;
            case 2:
                c.display();
                break;
            default:
                System.out.println("Invalid input");
            
        }
        System.out.print("Do you want to continue then press 'y':");
         choice=s.next().charAt(0);
      }while(choice=='y'||choice=='Y');
    }
}