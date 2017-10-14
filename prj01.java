# java-homework
2017/10/14 java homework
package prj01;
import java.util.*;
public class prj {
	
	public static void main(String[] args){
		 DepositAccount sever=new DepositAccount();
		 sever.newAccount();//创立新账号
		 sever.Deposit();//存款
		 sever.Query();//查询
		 sever.CountInterest();//查利息
	}
}
