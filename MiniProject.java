import java.util.*;

public class MiniProject {
   
    public static void main(String[] args){
        
Scanner sc = new Scanner(System.in);             //This will help in taking input from the user.
int number=(int)(Math.random()*100);            //Taking a random number, and  storing it in nummber variable.

int usernum;
do {
    System.out.println("Guess My Number(1-100): ");
     usernum= sc.nextInt();
    if (usernum == number) {
        System.out.println("WOHOOO:) YOU GUESSED IT RIGHT...");
        break;
    }

    else if (usernum > number) {
            System.out.println("Come Lower a bit...");
    }
    else System.out.println("Go Higher a bit...");

} while (usernum>=0);
System.out.println("My number was: "+number);
        sc.close();
        
    }
}
