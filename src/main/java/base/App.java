package base;

import java.util.Scanner;

/**
 Exercise 23 - Troubleshooting Car Issues
 An expert system is a type of artificial intelligence program that uses a knowledge base and a set of rules to perform a task that a human expert might do.
 Many websites are available that will help you self-diagnose a medical issue by answering a series of questions.
 And many hardware and software companies offer online troubleshooting tools to help people solve simple technical issues before calling a human.

 Create a program that walks the user through troubleshooting issues with a car. Use the following decision tree to build the system:

 Example Output
 Is the car silent when you turn the key? y
 Are the battery terminals corroded? n
 The battery cables may be damaged.
 Replace cables and try again.

 Constraint
 Ask only questions that are relevant to the situation and to the previous answers.
 Don’t ask for all inputs at once.

 Challenge
 Investigate rules engines and inference engines.
 These are powerful ways to solve complex problems that are based on rules and facts.
 Identify a rules engine for your programming language and use it to solve this problem
 */
public class App 
{
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        App myApp = new App();

        String msg = myApp.getresult();
        myApp.output(msg);
    }

    public String getresult()
    {
        System.out.print("Is the car silent when you turn the key? ");
        String choice = in.nextLine();
        String msg;

        if(choice.equals("y") || choice.equals("Y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            String choice2 = in.nextLine();

            if(choice2.equals("y") || choice2.equals("Y"))
            {
                msg = "Clean terminals and try starting again.";
            }
            else
            {
                msg = "Replace cables and try again.";
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            String choice2 = in.nextLine();

            if(choice2.equals("y") || choice2.equals("Y"))
            {
                msg = "Replace the battery.";
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                String choice3 = in.nextLine();

                if(choice3.equals("y") || choice3.equals("Y"))
                {
                    msg = "Check spark plug connections.";
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    String choice4 = in.nextLine();

                    if(choice4.equals("y") || choice4.equals("Y"))
                    {
                        System.out.print("Does your car have fuel injection? ");
                        String choice5 = in.nextLine();

                        if(choice5.equals("y") || choice5.equals("Y"))
                        {
                            msg = "Get it in for service.";
                        }
                        else
                        {
                            msg = "Check to ensure the choke is opening and closing.";
                        }
                    }
                    else
                    {
                        msg = "This should not be possible.";
                    }
                }
            }
        }
        return msg;
    }

    public void output(String msg)
    {
        System.out.println(msg);
    }
}
