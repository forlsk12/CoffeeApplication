package kr.java.coffee;

import kr.java.coffee.dto.Product;

public class Main {

	public static void main(String[] args) {
		System.out.println("쨍힄횆캭1�씴궰거�");
		
		Product p1 = new Product("A001");
		Product p2 = new Product("A001");
		
		System.out.println(p1);
		System.out.println(p2);
				
		if(p1.equals(p2)) {
			System.out.println("째째흺��");
		}else {
			System.out.println("쨈큽쨍짠");
		}

		System.out.println("dkjdklsjlkfd");

		
	}

}
