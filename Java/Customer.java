
/**
 * class customer models a bank customer with an id ,an account and a name
 *
 * @author)
 * @version 
 */
public class Customer
{
    // instance variables 
    private int id;
    private String  name;
    private String surname;
    private Account account;
    

    /**
     * default Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables to defaults
       this.id = 0;
       this. name = "";
       this.surname="";
       this.account=null;
    }
    /**
     * class constructer for customer
     * @param int id, string name
     */
    public Customer(String name,String surname,int id)
    {
        // initialise instance variables to given values
        this. name =name;
        this.surname=surname;
        this.id = id;
        this.account=null;
    }

    /**
     * mutator methods
     * @param  value to mutate current value to
     * @return    void
     */
     //set the name
    public void setName(String name)
    {
      this.name=name;  
    }
    
    //set the surname
    public void setSurName(String Sname)
    {
      this.surname=Sname;  
    }
    
    //set the id
    public void setId(int id)
    {
      this.id=id;  
    }
    
    //set/assign account
    public void setAccount(Account account)
    {
      this.account=account;  
    }
    
    /**
     * retrievers -returns values of the class instances
     * @param none
     * @return value-type
     */
     //get the name
     public String getName(){
		 return this.name;
		 } 
	//get the surname	 
     public String getSurName(){
		 return this.surname;
		 }
	//get the id	 
    public int getId(){
		 return this.id;
		 }
		 
	//get the account	 
	public Account getAccount(){
		 return this.account;
		 }	  
		 
 /**
  * returns the string representation of the class variable values	
  * Return String
  */
  public String toString(){
	  return "Names : "+this.name + " "+this.surname + "id: " +this.id + "\nAccount :" +this.account;
	  }	 
}
