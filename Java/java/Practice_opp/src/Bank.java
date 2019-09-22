//定义一个银行类，
//  属性:账号、密码、存款余额,银行名称。
//  方法:存款、取款、查询。
//  创建该类对象并测试
public class Bank {
	
	int account;
	int password;
	int balance;
	String bank;
	
	//存款
	public void deposit(int x){
		System.out.println("存款金额为："+x+"元,余额为:"+(balance+x));
		balance += x;
	}
	//取款
	public void withdrawal(int y){
		if(y<=balance){
			System.out.println("取款金额："+y+"元，账户余额："+(balance-y)+"元");
			balance-=y;
		}else{
			System.out.println("您的账户余额不足，取款失败");
		}
	}
	//查询
	public void inquire(){
		System.out.println("当前账户余额为"+balance+"元");
	}

}
