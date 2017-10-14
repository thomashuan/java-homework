# java-homework
2017/10/14 java homework
package prj01;

import java.util.Scanner;

class DepositAccount {
	Scanner sc=new Scanner(System.in);//导入输入类
	private String account;//账号
	private String userName;//储户姓名
	private double balance;//存款余额
	private double interestRate;//年利率
	public void newAccount(){//开户
		System.out.println("欢迎注册，请创建您的新账号！");
		System.out.println("请输入您的账号:");
		account=sc.nextLine();//输入账号
		System.out.println("请输入您的姓名:");
		userName=sc.nextLine();//输入姓名
		balance=5000;//起始存款5000元
		interestRate=2.3/100;//年利率为2.3%
	}
	public void Deposit(){//存款
		System.out.println("请输入要存入的金额:");
		balance+=sc.nextInt();//读取存款
		System.out.println("存入成功！当前余额为:"+balance+"元");
	}
	public void Query(){//查询
		System.out.println("正在为您查询，您的余额为:"+balance+"元");
	}
	public void CountInterest(){//计算利息
		System.out.println("请输入你的存款年数:");
		int years=sc.nextInt();//读取存款年数
		double inerest=balance*interestRate*years;//计算利息
		System.out.println(years+"年后您可收获的利息为:"+inerest+"年");
	}
}
