
	package com.src;
	import java.util.ArrayList;
	import java.util.Scanner;
	import java.util.stream.Collectors;
	public class StudentMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number of students ");
			int n=sc.nextInt();
			ArrayList<Student> al=new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter the student id");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter the maths marks");
				int m=sc.nextInt();
				System.out.println("Enter the science marks");
				int s=sc.nextInt();
				System.out.println("Enter the social marks");
				int so=sc.nextInt();
				 int  total=m+s+so;
				 float per=(total/3)*100;
				 Student s1=new Student(id,name,m,s,so,total,per);
				// al.add(e)
				 if(per>90)
					 System.out.println("student "+i+"got A grade");
				 else if(per<90&&per>75)
					 System.out.println("student "+i+"got B grade");
				 else if(per<75&&per>65)
					 System.out.println("student "+i+"got C grade");
				 else if(per<50)
					 System.out.println("student "+i+"got D grade");
				 else
					 System.out.println("student "+i+" is fail");
				 al.add(s1);
			}
		System.out.println(al);
		ArrayList al1=(ArrayList)al.stream().filter(p->p.m<30)
				.filter(p->p.s<30)
				.filter(p->p.so<30)
				.map(p->p)
				.collect(Collectors.toList());
		System.out.println(al1);
		ArrayList al2=(ArrayList)al.stream().filter(p->p.m>30)
				.filter(p->p.s>30)
				.filter(p->p.so>30)
				.map(p->p)
				.collect(Collectors.toList());
		System.out.println(al2);

		}

	}


