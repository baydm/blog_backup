package cn.yshye.adt;

import java.util.ArrayList;
import java.util.Date;

public class Test {
	private final static int NUM_SIZE = 600;

	public static void main(String[] args) {
//		testArrayList();
//		testLinkedList();
		long start = System.currentTimeMillis();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < Integer.MAX_VALUE/200; i++) {
			list.add(i);
			list.trimToSize();
		}
		long end  = System.currentTimeMillis();
	System.out.printf("��ʱ%f",(end - start)/1000.0);
	}


	public static void testArrayList() {
		System.out.println("����ArrayList");
		long start = new Date().getTime();
		MyArrayList<Integer> list = new MyArrayList<>();
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}
		long end = new Date().getTime();
		System.out.printf("���1��������ʱ%f��", (end - start) / 1000.0);
		System.out.println();

		start = System.currentTimeMillis();
		for (int i = 0; i < NUM_SIZE; i++) {
			list.remove(i * 10);
		}
		end = System.currentTimeMillis();
		System.out.printf("�Ƴ�%d��Ԫ����ʱ%f��",NUM_SIZE, (end - start) / 1000.0);
		System.out.println();

		start = System.currentTimeMillis();
		for (int i = 0; i < NUM_SIZE; i++) {
			list.get(i * 10 + 2);
		}
		end = System.currentTimeMillis();
		System.out.printf("����%d��Ԫ����ʱ%f��", NUM_SIZE, (end - start) / 1000.0);
		System.out.println();

		start = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		end = System.currentTimeMillis();
		System.out.printf("1���������ݱ�����ʱ%f��", (end - start) / 1000.0);
		System.out.println();
	}

	public static void testLinkedList() {
		System.out.println("����LinkedList");
		long start = new Date().getTime();
		MyLinkedList<Integer> list = new MyLinkedList<>();
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}
		long end = new Date().getTime();
		System.out.printf("���1��������ʱ%f��", (end - start) / 1000.0);
		System.out.println();

		start = System.currentTimeMillis();
		for (int i = 0; i < NUM_SIZE; i++) {
			list.remove(i * 10);
		}
		end = System.currentTimeMillis();
		System.out.printf("�Ƴ�%d��Ԫ����ʱ%f��", NUM_SIZE, (end - start) / 1000.0);
		System.out.println();

		start = System.currentTimeMillis();
		for (int i = 0; i < NUM_SIZE; i++) {
			list.get(i * 10 + 2);
		}
		end = System.currentTimeMillis();
		System.out.printf("����%d��Ԫ����ʱ%f��", NUM_SIZE, (end - start) / 1000.0);
		System.out.println();
		
//		start = System.currentTimeMillis();
//		for (int i = 0; i < list.size()/2; i++) {
//			list.get(i);
//		}
//		end = System.currentTimeMillis();
//		System.out.printf("1���������ݱ�����ʱ%f��", (end - start) / 1000.0);
//		System.out.println();
		
	}
}
