package com.src;
import java.util.Arrays;
	import java.util.TreeSet;

	
	public class Main {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TreeSet<Integer> ts=new TreeSet<Integer>((o1,o2)->{
				Integer i=(Integer)o1;
				Integer j=(Integer)o2;
				if(i<j)
					return -1;
				else if(i>j)
					return 1;
				else
					return 0;
				
			}
			
			);
			ts.add(12);
			ts.add(11);
			ts.add(9);
			ts.add(100);
			ts.add(1);
			ts.add(50);
			System.out.println(ts);
			System.out.println(Arrays.asList(ts));
			Main m=new Main();
			m.display();
			MyComparator1.dis();
		}
		public void display() {
			TreeSet<String> ts1=new TreeSet<String>((o1,o2)->{
				String i=(String)o1;
				String j=(String)o2;
				if(i.length()<j.length())
					return -1;
				else if(i.length()>j.length())
					return 1;
				else
					return 0;
				
			}
			
			);
			ts1.add("abc");
			ts1.add("ab");
			ts1.add("abcd");
			ts1.add("abcefgh");
			ts1.add("abcde");
			ts1.add("a");
			System.out.println(ts1);
		}

	}

