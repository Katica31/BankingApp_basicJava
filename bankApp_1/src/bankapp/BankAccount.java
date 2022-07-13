
package bankapp;


import java.util.Scanner;


public class BankAccount {
    
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;
    
    public BankAccount(String customerName, String customerID){
        this.customerName = customerName;
        this.customerID = customerID;
    }
    
    
    void deposit (int amount){
        if (amount != 0){
            balance += amount;
            previousTransaction = +amount;
        }
    }
    
    void withdraw (int amount){
        if(amount != 0){
            balance -= amount;
           previousTransaction =-amount;

        }
    }
    
    void getPreviousTranslation(){
        if (previousTransaction < 0) {
            System.out.println("Withdrawn: "+Math.abs(previousTransaction));
        } else if (previousTransaction > 0) {
            System.out.println("Deposited: "+previousTransaction);
        }
        
    }
    
    void showMenu(){
        char option ='\0';
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome"+ customerName);
        System.out.println("Your ID is "+customerID);
        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");
        
        do {
            System.out.println("=========================================");
            System.out.println("Enter an option");
            System.out.println("----------------");
            option = scanner.next().charAt(0);
            System.out.println("\n");
            
            
            switch(option){
                
                case 'A' :
            System.out.println("=========================================");
            System.out.println("Balance = "+balance);
            System.out.println("-----------------------------------------");
            break;
            
            case 'B' :
            System.out.println("=========================================");
            System.out.println("Enter an amount to deposit");
            System.out.println("-----------------------------------------");
            int amount = scanner.nextInt();
            deposit(amount);
                System.out.println("\n");
            break;
            
            case 'C' :
            System.out.println("=========================================");
            System.out.println("Enter an amount to  withdraw");
            System.out.println("-----------------------------------------");
            int amount2 = scanner.nextInt();
            withdraw(amount2);
                System.out.println("\n");
            break;
            
            case 'D' :
            System.out.println("=========================================");
            getPreviousTranslation();
            System.out.println("-----------------------------------------");
            System.out.println("\n");
            break;
            
            case 'E' :
            System.out.println("*************************************");
            break;
                        
            default:
                System.out.println("Invalid Option! Please enter a valid character.");
            }
            
        } while (option != 'E');
        System.out.println("Thank You for using our services");
        
    }
    
}
