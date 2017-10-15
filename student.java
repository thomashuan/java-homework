# java-homework
2017/10/14 java homework
package prj01;

public class student {
	public String name;
	public byte age;
	public String education;
	public student(String name1,byte a1,String eduaction1) {
		name=name1;
		age=a1;
		education = eduaction1;
	}
	void Show(){
		System.out.println("姓名："+name+"\n年龄："+age+"\n学历："+education);
	}
	public static void main(String[] args) {
		 System.out.println("student类对象");
		 student student1 = new student("周欢",(byte)18,"高中");
		 student1.Show();
		 System.out.println("Undergraduate类对象");
		 Undergraduate Undergraduate1 = new Undergraduate("周欢",(byte)20,"本科","软件工程");
		 Undergraduate1.Show();
		 System.out.println("Graduate类对象");
		 Graduate Graduate1 = new Graduate("周欢",(byte)24,"研究生","大数据");
		 Graduate1.Show();
		 
	 }

}
class Undergraduate extends student{	
	public Undergraduate(String name1, byte age1, String eduaction1,String specialty1) {
		super(name1, age1, eduaction1);
		specialty=specialty1;
	}
	public String specialty;
	void Show(){
		System.out.println("姓名："+name+"\n年龄："+age+"\n学历："+education);
		System.out.println("专业："+specialty);
	}
}

 class Graduate extends student{
	public Graduate(String name1, byte age1, String eduaction1,String direction1) {
		super(name1, age1, eduaction1);
		direction=direction1;
	}
	public String direction;
	void Show(){
		System.out.println("姓名："+name+"\n年龄："+age+"\n学历："+education);
		System.out.println("研究方向："+direction);
	}

}
