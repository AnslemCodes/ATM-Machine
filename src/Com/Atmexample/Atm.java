package Com.Atmexample;

import java.util.Scanner;

public class Atm
{
        private static Scanner in; //allows the program to interact with the user

        //declare the variables private to avoid been accessed by other users
        private static int password;
        private static float deposit;
        private static int withdraw;
        private static float balance;
        private static float transfer;
        private static int account_number;
        private static int amount;
        private static int another_transaction;
        private static int exit;



        private static void another_transaction()
        {
            System.out.println("Do you want to perform another transaction? \n \n press 1 for another transaction \n5 To exit");
            another_transaction = in.nextInt();
            if (another_transaction ==1)
            {
                another_transaction();
            }else if ( another_transaction == 5)
            {
                System.out.println("Thank you for Banking with us !");
            }else
            {
                System.out.println("Invalid option \n \n ");
                another_transaction();
            }


        }


        public static void main(String[] args)
        {
            String name;
            name= "Anslem Edozie Emeshindu";
            System.out.println("Welcome , Anslem Edozie Emeshindu ");





            in = new Scanner(System.in);


            System.out.println("please choose enter your password");
            int password = in.nextInt();
            if (password >=0);
            else
                System.out.println("your password is incorrect");
            another_transaction();


           //declare the option as integer
            int option;

            System.out.println("please select an option");
            System.out.println("1. deposit");
            System.out.println("2. withdraw");
            System.out.println("3. balance");
            System.out.println("4. transfer");
            System.out.println("5. exit");

            option= in.nextInt(); //allows the user to choose from the options

        /*
        the switch is used to allow user perform different options or task
        the choice is called the expression you want the switch to perform
         */


            switch (option)
            {
                case 1:
                    float deposit = 0;
                    System.out.println("please enter amount to deposit");
                    deposit = in.nextFloat();
                    balance = deposit + balance;
                    System.out.println("you have successfully deposited :" + deposit + " new balance is:" + balance + "\n");

                    another_transaction ();

                    break;

                case 2:
                    int withdraw = 0;
                    System.out.println("please enter amount you wish to withdraw");
                    withdraw = in.nextInt();
                    if (withdraw > balance || withdraw == 0) {

                        System.out.println("insufficient funds");
                    }else {
                        balance = balance - withdraw;
                        System.out.println("please take cash: " +withdraw+" your new balance is: "+balance);

                    }
                    another_transaction();
                    break;

                case 3:
                    System.out.println("your balance is: " +balance);
                    another_transaction();
                    break;

                case 4:
                    amount = 0;
                    System.out.println("please enter the account_number to transfer funds: ");
                    account_number= in.nextInt();
                    System.out.println("please enter the amount to transfer ");
                    amount=in.nextInt();
                    if (amount > balance || amount ==0 ) {
                        System.out.println(" insufficient funds \n \n ");

                    }else {
                        transfer = (int) (transfer - balance);
                        System.out.println("successfully transferred ");

                    }
                    another_transaction();
                    break;

                case 5 :
                    exit = 0;
                    System.out.println("Thank you for banking with us ! ");



                default:
                    System.out.println(" Good bye ! ");


















            }

















        }



}
