package com.question2;

public class Main extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] a=new Animal[3];
		a[0]=new Dog();
		a[1]=new Cat();
		a[2]=new Tiger();
		
		for(int i=0;i<a.length;i++)
		{
			a[i].makeNoise();
			System.out.println();
			a[i].eat();
			System.out.println();
			a[i].walk();
			System.out.println();
		}

	}

}
