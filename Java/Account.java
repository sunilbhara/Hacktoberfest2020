
/**
 *class Account - implements an account in a bank with the accountholder details(account number),balance and pin
 * @author  
 * @version 
 */
public  class Account 
{

    private int accountNo;
    protected double balance;
    private int pin;
    
    
    
    public Account (int accountNo,double balance,int pin){
        this.accountNo = accountNo;
        this.balance = balance;
        this.pin=pin;
              
    }
    
    //default constructor
    public Account(){
        this.accountNo = 000000000;
        this.balance = 0.00;
        this.pin=0000;
        
        }
    
    //mutators
    /**
     * set the pin 
     */
    public void setPin(int pin){
        
        this.pin=pin;
    }
    
    /**
     * set Account Number
     */
    public void setAccountNo(int accNo){
        
        this.accountNo=accNo;
    }
    
    /**
     * set balance
     */
    public void setBalance(double balance){
        this.balance=balance;
    }
    
    //retrievers
    /**
     * Get Account number
     */
    public int getAccountNumber(){
        
        return this.accountNo;
    }
    
    /**
     * Get pin
     */
    public int getPin(){
        
        return this.pin;
    }
    
    /**
     * Get the balance
     */
    public double getBalance(){
        
        return this.balance;
    }
    
    //misc methods
    /**
     * Deposit cash into user account
    */
    public void cashDeposit(double amount){
        
         this.balance+=amount;
         System.out.println(amount +" deposited to current account,new balance is : "+balance);
         
        }
   /**
    * Withdraw money wrt to the account balance
   */
    public void withdraw(double amount){
        
        this.balance-=amount;
        System.out.println(amount +" withdrawn from current account,remaining balance is : "+balance);
        
        }
    
    /**
     * returns the string representation of the class variable values   
     * Return String
     */
    public String toString(){
        return "Account Number: "+this.accountNo+ " Account Balance: "+this.balance +" PinNumber: "+this.pin;
    }    
    
    
}
