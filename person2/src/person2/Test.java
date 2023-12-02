package person2;

public class Test {
	public static void main(String[]args) {
		Person taro = new Person();
		
		taro.name = "taro";
		taro.age = 18;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		Person jiro = new Person("jiro",20);
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		
		
		//演習⑤ (saburo と 0)
		Person saburo = new Person("saburo");
		
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		
		//演習⑤ (名前なし と 25)
		Person nameless = new Person(25);
		
		System.out.println(nameless.name);
		System.out.println(nameless.age);
		
		
		//演習⑤ (hanako と 17)
		Person hanako = new Person("hanako",17);
		
		System.out.println(hanako.age);
		System.out.println(hanako.name);
	}

}
