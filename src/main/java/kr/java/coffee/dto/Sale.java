package kr.java.coffee.dto;

public class Sale {
	private int no;
	private Product product; // ��ǰ
	private int saleCnt; // �Ǹż���
	private int marginRate; // ������

	public Sale() {
	}

	public Sale(int no) {
		this.no = no;
	}
	public Sale(int no, Product product, int saleCnt, int marginRate) {
		super();
		this.no = no;
		this.product = product;
		this.saleCnt = saleCnt;
		this.marginRate = marginRate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getSaleCnt() {
		return saleCnt;
	}

	public void setSaleCnt(int saleCnt) {
		this.saleCnt = saleCnt;
	}

	public int getMarginRate() {
		return marginRate;
	}

	public void setMarginRate(int marginRate) {
		this.marginRate = marginRate;
	}

	@Override
	public String toString() {
		return String.format("Sale [no=%s, product=%s, saleCnt=%s, marginRate=%s]", no, product, saleCnt, marginRate);
	}
	
}
