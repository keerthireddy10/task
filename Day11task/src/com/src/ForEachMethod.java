
	package com.src;

	import java.util.TreeSet;

	public class ForEachMethod {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TreeSet<Integer> ts=new TreeSet<Integer>();
			ts.add(12);
			ts.add(11);
			ts.add(9);
			ts.add(100);
			ts.add(1);
			ts.add(50);
			//ts.forEach((s)->System.out.print(s+ " "));
		ts.forEach(System.out::print);
		}

	}


