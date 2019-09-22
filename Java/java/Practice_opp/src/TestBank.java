
public class TestBank {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		b.account = 123;
		b.password = 456;
		b.balance = 1000;
		b.bank = "中国建设银行";
		System.out.println("账号"+b.account);
		System.out.println("密码"+b.password);
		System.out.println("余额"+b.balance);
		System.out.println("银行名称:"+b.bank);
		
		b.deposit(500);
		b.withdrawal(300);
		b.inquire();
	}

}
