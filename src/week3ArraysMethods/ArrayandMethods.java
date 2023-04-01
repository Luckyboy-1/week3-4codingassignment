package week3ArraysMethods;

public class ArrayandMethods {
	public static void main(String[] args) {
		//Q1.array of int called ages 
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 97};
		//a.subtraction
		int subtraction = ages[ages.length-1] - ages[0];
		System.out.println(subtraction);
		//b.add new age to array then repeat a
		//b.done (added 97)
		int minus = ages[ages.length-1] - ages[0];
		System.out.println(minus);
		//c.Use a loop to iterate through the array and calculate the average age
		int totalAge = 0; //declares a variable totalAge and initializes it to 0.
		for (int i : ages) { //iterate through each element i in the ages array and adds the current element i to the totalAge.
			totalAge += i;
		}
		double averageAge = (double) totalAge / ages.length;
        System.out.println("The Average age is : " + averageAge);
        
        //Q2.array of String called names 
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        //a.calculate the average number of letters per name
        int totalLetters = 0;
        for (String name : names) {  //For iterate through each name, calculate the length of the name and adds it to the totalLetters variable.
        	totalLetters += name.length();
        }
        double averageLetter = (double) totalLetters / names.length;
        System.out.println("The Average Letters per name is : " + averageLetter);
        //b.concatenate all the names together
        String addNames = "";  //Initialize an empty string to hold the concatenated names
        for (String name : names) {  //Concatenate each name and a 'space' to the addNames string
        	addNames += name + " ";
        }
        System.out.println("Names are:" + addNames);
        
        //Q3. e.g String lastElement = names[names.length-1]; finding last element
        //Q4. e.g String firstElement = names[0];
        
        //Q5.new array of int called nameLengths & add the length of each name to the nameLengths array
        int[] nameLengths = new int [names.length];
        for (int i = 0; i < names.length; i++) {  //assigns the length of each name to the corresponding element of the nameLengths array.
            nameLengths[i] = names[i].length();
        }
        //Q6.calculate the sum of all the elements in the nameLengths array
        int totalelements = 0;
        for (int i = 0; i < nameLengths.length; i++) {
        	totalelements += nameLengths[i];   // adds the current element to the "totalelements" variable.
        }
        System.out.println("The sum is " + totalelements);
        
        //Q7.Write a method that takes a String, word, and an int, n, & returns the word concatenated to itself n number of times
      
	}
	 public static String concatenateWord(String word, int n) {
		 String result = "";
     	for (int i=0; i<n; i++) {
     		result += word;    //Each iteration of the loop will concatenate a copy of word onto the result String.
     	}
     	return result;
     }
	 
	 //Q8	Write a method that takes two Strings, firstName and lastName, and returns a full name 
	 public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	 }
	 
	 //Q9 Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
	 public static boolean intsArray(int[] nums) {
		 int sum = 0;
		 for (int num : nums) {
			 sum += num;   //adds each element to a variable called sum.
		 }
		 return sum >100;
	 }
	 
	 //Q10 Write a method that takes an array of double and returns the average of all the elements in the array.
	 public static double avgElements(double[] nums) {
		 double sum = 0;
		    for (double num : nums) {
		        sum += num;     ////adds each element to a variable called sum.
		    }
		    return sum / nums.length;    // average of all elements in the array
	 }
	 
	 //Q11 two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	 public static boolean doubleArray(double[] first, double[] second) {
		double totalfirst = 0;
		double totalsecond = 0;
		for (double i : first) {
			totalfirst += i;      //loops and add each element to the totalfirst variable
		}
		for (double i : second) {
			totalsecond += i;     //loops and add each element to the totalsecond variable
		}
		double averageFirst = (double) totalfirst/first.length;
		double averageSecond = (double)totalsecond/second.length;
		
		 return averageFirst > averageSecond;
	 }
	 
	 //Q12 method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50
	 public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		 if (isHotOutside && moneyInPocket > 10.50) {
			 return true;
		 } else {
			 return false;
		 }
	 }
	//Q13 method called premiumFuel that takes a double gas and returns true if gas is less than 3.90
	 public static boolean premiumFuel(double gas) {
		 if (gas < 3.90) {
			 return true;
		 } else {
			 return false;
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
}
