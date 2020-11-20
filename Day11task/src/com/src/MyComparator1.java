package com.src;


	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.TreeSet;

	public interface MyComparator1{
		public void compare(Object o1,Object o2);
		public void display();
		public static void dis() {
			TreeSet<String> ts1=new TreeSet<String>((o1,o2)->{
				String i=(String)o1;
				String j=(String)o2;
				if(i.length()>j.length())
					return -1;
				else if(i.length()<j.length())
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
			String s=ts1.toString();
			char c=s.charAt(4);
			System.out.println(c);
		}

	}


