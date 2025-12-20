import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int user=0;
        String choice;

        do{
        int comp=(int)(Math.random()*3)+1;
        System.out.println("enter your choice : rock=1, paper=2, scissor=3");
        user=sc.nextInt();
        
        if(user==1 && comp==3 || user==2 && comp==1 || user==3 && comp==2){
            System.out.println("user wins!!");
        }
        else if(user==comp){
            System.out.println("its a tie");
        }
        else{
            System.out.println("computer Wins!!");
        }  

        System.out.println("computer choice was: " + comp); 
        System.out.println("want to play again? yes or no");
        choice=sc.next();
    }
    while(choice.equals("yes"));
    System.out.println("Thanks for playing...keep exploring!!");
       
sc.close();
    }
}
