package isTriangle;

import java.util.Scanner;

public class Main {
	public static int getTriangleStatus(double l1, double l2, double l3)
	{
		int s = -1;
		double temp = 0;
		
		//l1 > l2 > l3
		if (l2 > l1){
			temp = l2;
			l2 = l1;
			l1 = temp;
		}
		if (l3 > l1){
			temp = l3;
			l3 = l1;
			l1 = temp;
		}
		if (l3 > l2){
			temp = l3;
			l3 = l2;
			l2 = temp;
		}
		
		if(l3 > 0){
			if(l1 >= l2 + l3)
			{
				s = 0;
			}
			else if(l1 < l2 + l3){
				s = 1;
				if(l1 == l2 || l2 == l3)
				{
					s ++;
					if(l1 == l3)
					{
						s ++;
					}
				}
			}
		}
		return s;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner edges = new Scanner(System.in);
		System.out.println("���������ߵĳ��ȣ�"); 
		double l1 = edges.nextDouble();      
		double l2 = edges.nextDouble();
		double l3 = edges.nextDouble();
		int s = getTriangleStatus(l1, l2, l3);
		switch (s){
		case -1:
			System.out.println("���벻����Ҫ��"); 
			break;
		case 0:
			System.out.println("������������");
			break;
		case 1:
			System.out.println("һ��������");
			break;
		case 2:
			System.out.println("������������");
			break;
		case 3:
			System.out.println("�ȱ�������");
			break;
		}
		main(args);
	}
}