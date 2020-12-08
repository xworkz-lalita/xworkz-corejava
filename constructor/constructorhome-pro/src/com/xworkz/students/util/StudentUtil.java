package com.xworkz.students.util;

import com.xworkz.students.students.Student;

public class StudentUtil {
	public static void main(String[] args) {
		Student st=new Student("asha",98 ,"dayanand");
		Student su=new Student("hema",76,"RR");
		//Student sd=new Student("gowri",45);
		//Student se=new Student("sana",45);
		//st.details();
	//su.details();
		//sd.details();
		//se.details();
		System.out.println(st.name+" "+st.id +" " + st.college);
		System.out.println(su.name+" "+su.id +" " + su.college);
       
	}

}
