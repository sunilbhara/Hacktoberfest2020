

/**
 * @author 
 * @version 
 */

  import java.util.*;
 public class BankTester{
     
public static void main(String args[]){
    //Scanner object to navigate user input
    Scanner scanner=new Scanner(System.in);
 
    //Create bank Object using Bank class construtor
    Bank bank=new Bank("Silhoute",248137);
    
     //Constructors for class Account
     Account account1=new Account();
     Account account2=new Account(); 
     
     //Object account1( set AccNo,Balance ,pin)
      account1.setAccountNo(123456789);
      account1.setBalance(200.0);
      account1.setPin(9876);
      
     //Object account2( set AccNo,Balance ,pin)
      account2.setAccountNo(867413125);
      account2.setBalance(0.00);
      account2.setPin(2359);
      
      //Add accounts to the bank
      bank.addAccount(account1);
      bank.addAccount(account2);
      
       //Create menu for user Interaction with the System
       boolean Input=true;
       while(Input ){
         System.out.println("*****************************************************");
         System.out.println("CHOOSE AN OPTION BELOW");
         System.out.println("INPUT 1. Account 1");
         System.out.println("INPUT 2. Account 2");
         System.out.println("INPUT 3. quit");
         int answer=scanner.nextInt();
        
         switch(answer){
             case 1 :
                 while(Input){
                    System.out.println("*****************************************************");
                    System.out.println("CHOOSE AN OPTION BELOW");
                    System.out.println("INPUT 1. Deposit money");
                    System.out.println("INPUT 2. Withdraw cash");
                    System.out.println("INPUT 3. quit"); 
                    int input=scanner.nextInt();
                    
                    if(input==1){
                        
                        System.out.println("*****************************************************");
                        System.out.println("Enter amount to deposit");
                        double amount=scanner.nextDouble();
                        account1.cashDeposit(amount);
                        }
                        
                    else if(input==2){
                        
                        System.out.println("Enter amount to withdraw");
                        double amount=scanner.nextDouble();
                        if(account1.getBalance() >=amount){
                        account1.withdraw(amount); }
                        
                        else{
                            System.out.println("You Balance is insufficient,Please adjust your withdrawal ammount");
                            
                            }
                        }
                        
                    else if(input==3){
                         break;
                        }
                        
                    else{
                        System.out.println("Invalid Input");
                        }           
                     
                     }
                 break;
             case 2:
                 while(true){
                     
                    System.out.println("*****************************************************");
                    System.out.println("CHOOSE AN OPTION BELOW");
                    System.out.println("INPUT 1. Deposit money");
                    System.out.println("INPUT 2. Withdraw cash");
                    System.out.println("INPUT 3. quit"); 
                    int input=scanner.nextInt();
                    
                    if(input==1){
                        
                        System.out.println("Enter amount to deposit");
                        double amount=scanner.nextDouble();
                        account2.cashDeposit(amount);
                        }
                        
                    else if(input==2){
                        
                        System.out.println("Enter amount to withdraw");
                        double amount=scanner.nextDouble();
                        
                        if(account2.getBalance() >= amount){
                        account2.withdraw(amount); }
                        
                        else{
                            System.out.println("You Balance is insufficient,Please adjust your withdrawal ammount");
                            
                            }
                        }
                    else if(input==3){
                         break;
                        }
                        
                    else{
                        System.out.println("Invalid Input");
                        }           
                     }
                 break; 
              case 3:
               Input=false;  
              break;
                
              default:
                 System.out.print("Input wrong value, retry");          
             }   
           } 
           
           //Use customer class construtor to create customer objects:
           Customer customer1=new Customer("Tearz","Lookout",123456789);
           Customer customer2=new Customer("Wandipa","Wandipa",987654321);
           customer1.setAccount(account1);
           customer2.setAccount(account2);
           
           //Output customers
           System.out.println("Customer: "+customer1);
           System.out.println("Customer : "+customer2);
           
           
           while(true){
               System.out.println("*****************************************************");
               System.out.println("Choose an Input");
               System.out.println("INPUT 1: Add account");
               System.out.println("INPUT 2: exit");
               int scan=scanner.nextInt();
               
               if(scan==1){
                   
                  System.out.println("Enter Account Number: "); 
                  int accNo=scanner.nextInt();
                  
                  System.out.println("Enter pin number : "); 
                  int pin=scanner.nextInt();
                  
                  System.out.println("Enter First Deposit: ");
                  double amount=scanner.nextDouble();
                  
                  Account account=new Account(accNo,amount,pin);
                  bank.addAccount(account);
                  
                   }
               else if(scan==2){
                   break;
                   }
            else{
                System.out.println("Invalid Input");
                }      
               }
           
      
    }
}
