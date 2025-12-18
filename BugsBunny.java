import java.util.Scanner;

public class BugsBunny{   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tell me a Number:");
        int x=sc.nextInt();

        int bugs=x % 2; //even
        int bunny= x % 3;   //odd
        int ans=0;
        
        if(bugs==ans && bunny==ans){
            System.out.println("Hyyy!!...its a tie");
        }
        else if(ans==bugs){
            System.out.println("Hyyy!!...Bugs Winner!!");
        }else if(ans==bunny){
            System.out.println("Hyyy!!...Bunny Winner!!");
        }else{
            System.out.println("guess your luck number again.");
        }
         sc.close();
}
}
