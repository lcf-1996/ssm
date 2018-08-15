package com.lcf.pojo;

import java.io.Serializable;

public class Product implements Serializable {
	private Integer id; //��Ʒ���
	private String name; //��Ʒ����
	private Integer price; //��Ʒ��ַ
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price
				+ "]";
	}
}
