import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        System.out.println("Welcome to Reckon");
    System.out.println("May I have your name : ");

    try (Scanner scanner = new Scanner(System.in)) {
        String name= scanner.next();
        System.out.println("Hello "+name);

        System.out.println("Shall we start ?");
        System.out.println("\t1.YES");
        System.out.println("\t2.NO");

        int beginAnswer = scanner.nextInt();
        while(beginAnswer !=1){
             System.out.println("Shall we start ?");
             System.out.println("\t1.YES");
            System.out.println("\t2.NO");

            beginAnswer = scanner.nextInt();
        }
        Random random=new Random();
        int x = random.nextInt(20)+1;
        System.out.println("Please Guess a Number :");
        int userInput = scanner.nextInt();

        int timesTired = 0;
        boolean hasWon = false;
        boolean shouldFinish =false;

        while(!shouldFinish){
            timesTired++;
            if(timesTired<5){
                 if(timesTired == x){
                hasWon = true ;
                shouldFinish = true;

                 }
                  else if (userInput >x){
                System.out.println("guess lower number ");
                userInput = scanner.nextInt();
                 }
                 else{
                System.out.println("Guess hihger number");
                userInput = scanner.nextInt();
                }
            } else{
                shouldFinish =true;
            }
        }
        if (hasWon){
            System.out.println("Congratulations ! you have guessed in your"+ timesTired +"guess");
        }else {
            System.out.println("Game Over!");
            System.out.println("The number was :"+ x);
        }
    }

    }
    
}
