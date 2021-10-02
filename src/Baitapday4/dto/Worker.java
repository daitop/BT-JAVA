package Baitapday4.dto;

import java.util.Scanner;

import Baitapday4.Person;

public class Worker extends Person {
	private String position;
	private int numberProduct;
	
	public Worker() {
		super();
	}
	
	public Worker(String id, String name, int age, String address) {
		super(id, name, age, address);
	}
	
	public Worker(String position, int numberProduct) {
		this.position = position;
		this.numberProduct = numberProduct;
	}
	
	public Worker(String id, String name, int age, String address, String position, int numberProduct) {
		super(id, name, age, address);
		this.position = position;
		this.numberProduct = numberProduct;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getNumberProduct() {
		return numberProduct;
	}

	public void setNumberProduct(int numberProduct) {
		this.numberProduct = numberProduct;
	}
	
	public int money() {
		return this.numberProduct * 120;
	}
	
	public void input(Scanner scanner, int index) {
		System.out.println("=== Cong nhan thu "+(index + 1)+": ===");
		System.out.print("Nhap ID: ");
		this.setId(scanner.nextLine());
		System.out.print("Nhap ten: ");
		this.setName(scanner.nextLine());
		int age;
		do {			
			System.out.print("Nhap tuoi: ");
			age = scanner.nextInt();
			if (age <= 0) {
				System.out.println("Tuoi khong hop le!");
			}
		} while (age <= 0);
		this.setAge(age);
		scanner.nextLine();
		System.out.print("Nhap dia chi: ");
		this.setAddress(scanner.nextLine());
		System.out.print("Nhap chuc vu: ");
		this.setPosition(scanner.nextLine());
		int numberProduct;
		do {			
			System.out.print("Nhap so luong san pham: ");
			numberProduct = scanner.nextInt();
			if (numberProduct <= 0) {
				System.out.println("So luong san pham khong hop le!");
			}
		} while (numberProduct <= 0);
		this.setNumberProduct(numberProduct);
		scanner.nextLine();
	}

	public void output(int index) {
		System.out.println("=== Cong nhan thu "+(index + 1)+": ===");
		System.out.println("ID: " + this.getId());
		System.out.println("Ten: " + this.getName());
		System.out.println("Tuoi: " + this.getAge());
		System.out.println("Dia chi: " + this.getAddress());
		System.out.println("Chuc vu: " + this.getPosition());
		System.out.println("So luong san pham: " + this.getNumberProduct());
		System.out.println("Tien: " + this.money());
	}

}