package day11_12_p2;

// don't use import p1.* as if u have classes with same name, it will create error
import static day11_p3.Util.*;

import day11_12_p1.Test;
import day11_p3.Util;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Test obj= new Test();
    obj.add();  // you can also write new Test().add();
    
    day11_12_p2.Test t= new day11_12_p2.Test();  //always have unique class names in your project in order to avoid this problem
    //by default it will take Test from p1 package so u have to mention p2
   t.show();// remember show method is in p2
   
   m2(); // dont use day11_p3.Util  // import static day11_p3.Util.*;
   Util obj1= new Util();  //import day11_p3.Util;
   obj1.m1();
   
	}

}
