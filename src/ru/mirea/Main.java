package ru.mirea;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MovableCircle c1=new MovableCircle(0,0,3,3,5);
        System.out.println(c1);
        c1.moveDown();
        System.out.println(c1);

    }
}
