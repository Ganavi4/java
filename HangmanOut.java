import java.util.Scanner;

public class HangmanOut {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st name");
        String name1=sc.nextLine();
        System.out.println("enter 2nd name");
        String name2=sc.nextLine();
        
        for(int i=0;name1==name2;i++){
            System.out.println("common letters are " + name1);
        }

        int a=length.name1();
        int b=length.name2();
        int count=a+b;
        String[] Flame=FLAME;
 
        for(int j=1;j<=count;j++);{
            if(Flame[j]=='\0'){
                j++;
                if(j==5){
                    Flame[j]=Flame[0];

                }
            }

        }
            
            

        }

    }

    
}
