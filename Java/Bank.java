
/**
 * class Bank 
 * @author 
 * @version 
 */


public class Bank
{
    // Bank instances
    private String bankName;
    private int bankNumber;
    private Account[] bank;
    private final  int customers=5;
    private int index;
    
    /**
     * Constructor for objects of class Bank
     */
    public Bank(String name, int bankNumber)
    {
        // initialise instance variables to given values 
        this.bankName       = name;
        this.bankNumber = bankNumber;
       bank = new Account[this.customers];
       index=0;
       
    }
    
    /**
     * Constructor for objects of class Bank default 
     */
    public Bank()
    {
        // initialise instance variables to default values
        this.bankName       = "";
        this.bankNumber = 0;
       bank = new Account[this.customers];
       index=0;
    }

    /**
     * mutators -> mutate the instance values to given values
     * @return void
     * @param new Values
     */
     //set the bank name
     public void setBankName(String name){
         
         this.bankName=name;
         
         }
         
    //set the bank NUmber
    public void setBankNumber(int bankNumber){
        
        this.bankNumber=bankNumber;
        
        }
    //add an account to the bank
    public void addAccount(Account customer){
        
        if(index < this.customers){
        bank[index++]=customer;
        System.out.println("Account added successfully");
        }
        else{
            System.out.println("Bank is full cannot add any more customers");
            }
    }
                
  /**
   *retrievers -get the values in the class instances 
   * @param none
   * @return value-type
   */
   
   //get the customer accounts in the bank
    public Account[]  getAccountObjects(){
        return this.bank;
    }
    
    //get the name of the bank
    public String getBankName(){
        return this.bankName;
        }
        
    //get the bank number   
     public int getBankNumber(){
         
         return this.bankNumber;
         
         }
    //get the customers in a bank as a string
    public String getAccounts(){
        
        String list=""; 
        for(Account cust :bank ){
            list= list + cust;
            }
            return list; 
        }
        
        /**
	 *Returns total amount in the bank
	 */	
    public double getTotal(){
        
	double sum=0.0;
	   for (Account acc :bank){
		sum+= acc.getBalance();
		}
			
	return sum;
	
		}
    
    /**
    *returns the string representation of the class variable values  
     *Return String
     */
    public String toString(){
        return "Bank Number: "+this.bankNumber+ " Name: "+bankName +" customerAccounts: "+this.getAccounts();
        }
    }
 
    

