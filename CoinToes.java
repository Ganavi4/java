import java.util.Scanner;

public class CoinToes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int userguess;
System.out.println("Toesing a Coin");
do{
int coin=(int)(Math.random()*2);
System.out.println("Enter your choice: head=1 or tail=0");
userguess=sc.nextInt();
if(coin==userguess){
    System.out.println("you win!");

}else{
    System.out.println("you lose!");
}

    }while(userguess==0 || userguess==1);{
    System.out.println("Thanks for playing!");
    }
    sc.close();
} 
}
