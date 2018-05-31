package kr.java.coffee;

import kr.java.coffee.dto.Product;

public class Main {

	public static void main(String[] args) {
		System.out.println("¸śÄĽ1˝Ă°Ł");
		
		Product p1 = new Product("A001");
		Product p2 = new Product("A001");
		
		System.out.println(p1);
		System.out.println(p2);
				
		if(p1.equals(p2)) {
			System.out.println("°°Ŕ˝");
		}else {
			System.out.println("´Ů¸§");
		}
		//이 문장은 깃허브에서 
	}

}
