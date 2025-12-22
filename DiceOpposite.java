import java.util.Scanner;
public class DiceOpposite{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("enter a number 1 to 6");
             int num=sc.nextInt();
              sc.close();
             switch(num){
                case 1:
                System.out.println("the opposite side is 6");
                break;
                case 2:
                    System.out.println("the opposite side is 5");
                break;
                case 3:
                    System.out.println("the opposite side is 4");
                break;
                case 4:
                    System.out.println("the opposite side is 3");
                break;
                case 5:
                    System.out.println("the opposite side is 2");
                break;
                case 6:
                    System.out.println("the opposite side is 1");
                break;
                default:
                    System.out.println("invalid input");
                    return;
             }
        }
    
}
}

//or using if,elseif

// public class Main{
//     public static int oppSide(int n){
//         int opp;
//         if(n==1){
//             opp=6;
//         }
//         else if(n==2){
//             opp=5;
//         }
//         else if(n==3){
//             opp=4;
//         }
//         else if(n==4){
//             opp=3;
//         }
//         else if(n==5){
//             opp=2;
//         }
//         else{
//             opp=1;
//         }
//         return opp;
//         }
//         public static void main(String[] args){
//             Scanner sc=new Scanner(System.in);
//             system.out.println("enter a number 1 to 6");
//             int n=sc.nextInt();
//             System.out.println("The opposite side is" + oppSide(n));
//         }
//     } 

