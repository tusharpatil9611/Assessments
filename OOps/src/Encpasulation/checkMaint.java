package Encpasulation;

public class checkMaint {

	public static void main(String[] args) {
		int amt=0;
		check obj=new check();
		obj.setAmount(200);
		amt=obj.getAmount();
		System.out.println("Your current amount is:"+amt);
	}

}
