package jp.co.internous.action;

public class Test {
	public static void main(String[] args){
		Person taro=new Person();
		Person jiro=new Person();
		Person hanako=new Person();
		Person keika=new Person();
		Robot aibo=new Robot();
		Robot asimo=new Robot();
		Robot pepper=new Robot();
		taro.name="山田太郎";
		taro.age=20;
	    taro.phoneNumber="00-0000-0000";
	    taro.address="aaa@aaa";
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="11-1111-1111";
		jiro.address="bbb@bbb";
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="22-2222-2222";
		hanako.address="ccc@ccc";
		keika.name="尾身桂花";
		keika.age=22;
		keika.phoneNumber="33-3333-3333";
		keika.address="ddd@ddd";
		aibo.name="aibo";
		asimo.name="asimo";
		pepper.name="pepper";


		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(keika.name);
		System.out.println(keika.age);
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println(aibo.name);
		System.out.println(asimo.name);
		System.out.println(pepper.name);
		aibo.talk();
		asimo.walk();
		pepper.run();

	}
}