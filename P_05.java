public class Account {

	public static void main(String[] args) {
		
		 Create_Account[ ] accountHolder = new Create_Account[4];
		    
		    accountHolder[0]=new Create_Account("hanuman", 5000);
		    
		    accountHolder[0].addBalance(50000);
		    accountHolder[0].showBalance();
		    accountHolder[0].withdrawBalance(10000);
		    
		    
		    accountHolder[1]=new Create_Account("sugriv", 4000 );
		    
		    accountHolder[1].withdrawBalance(3500);
	}

}

class Create_Account{
	private String name;
	private int balance;
		
	public  Create_Account(String newName, int balance) {
		this.name = newName;
		this.balance = balance;
	}
	
	public void showBalance() {
		System.out.println(name + "'s balance is : " + balance);
	  }
	
	public void withdrawBalance(int newBalance) {
		if((balance-newBalance)>1000) {
			this.balance = balance-newBalance ;
			System.out.println(name + "'s updated balance is : " + balance);
		}else {
			System.out.println(name + "'s can't withdraw because it will lead to low balance");;
		}
	  }
	public void addBalance(int newBalance) {
		this.balance = balance+newBalance ;
		System.out.println(name + "'s updated balance is : " + balance);
	}
}
