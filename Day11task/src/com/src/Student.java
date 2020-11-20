
	package com.src;

	public class Student {
		int id;
		String name;
		int m;
		int s;
		int so;
		int total;
		float per;
		public Student(int id, String name, int m, int s, int so, int total, float per) {
			super();
			this.id = id;
			this.name = name;
			this.m = m;
			this.s = s;
			this.so = so;
			this.total = total;
			this.per = per;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", m=" + m + ", s=" + s + ", so=" + so + ", total=" + total
					+ ", per=" + per + "]";
		}
		
		
		

	}


