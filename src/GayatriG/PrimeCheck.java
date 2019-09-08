//to find out prime number from 1 to 100
package GayatriG;

public class PrimeCheck {
	//static void isPrime(int number){
	//static void isPrime(){
	static void isPrime(int start, int end){
		//for(int number=2;number<=100;number++){
		for(int number=start;number<=end;number++){
		int count=0;
		for(int i=2;i<=number/2;i++) {    //to decrease the time and space complexity we used (i<=number/2)
			if(number%i==0){
				count=1;
				//System.out.println(number+" not prime ");
				break;                //break always terminate loop not the condition, here it will go out of for loop
			}
		}
		if(count==0){
			System.out.println(number+" is prime ");
		}
		}
	}
	public static void main(String[] args) {
		//for(int i=2;i<=100;i++){
		//	isPrime(i);
		//}
		//isPrime();
		isPrime(200,300);
	}

}
