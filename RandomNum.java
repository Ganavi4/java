import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int myNum=(int)(Math.random()*100);
        int myGuess=0;
        do{
            System.out.println("guess number:");
             myGuess=sc.nextInt();

            if(myGuess==myNum){
                System.out.println("correct guess");
            break;
            }
            else if(myGuess>myNum){
                System.out.println("guess is too high");
            }
            else{
                System.out.println("guess is low");
            }

        }while(myGuess>=0);{
            System.out.println("myNum was " + myNum);
        }


    }
    
}
