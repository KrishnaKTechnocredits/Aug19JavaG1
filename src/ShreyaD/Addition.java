package ShreyaD;

public class Addition {

 void addinteger()
 {
	 int x = 10;
	 int y = 20;
	 int z;
	 z=x+y;
	System.out.println(z); 
 }
 void adddecimal()
 {
	 double x=  2.4;
	 double y = 1.2;
	 double z = 0;
	 z=x+y+z;
	 System.out.println(z); 
 }
 void addString(){
	 String x = "shreya";
	 String y = "dubey";
	 String z ;
	 z = x+y;
	 System.out.println(z);
 }
 public static void main(String[] args) {
	 Addition add= new Addition();
	 add.addinteger();
	 add.adddecimal();
	 add.addString();
}
}
