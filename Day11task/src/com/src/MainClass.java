package com.src;
public class MainClass {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			FucntInterface len=(a,b)->
			{
				System.out.println(a.length());
				System.out.println(b.length());
			};
			len.string("keerthi", "abc");
			len=(a,b)->
			{
				System.out.println(a.concat(b));
			};
			len.string("keerthi", "abc");
			len=(a,b)->
			{
				System.out.println(a.compareTo(b));
			};
			len.string("keer", "abc");
		}

	}


