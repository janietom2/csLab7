/****************************************************
 * In this lab, you will work on:
 * ** Arrays
 * ** Strings
 * ** Methods
 * and you will start working on testing (white box)
 * @author mceberio
 ****************************************************/

public class lab7Fall15 {

	/********************************************************************
	 * ACTIVITY 1.1
	 * Method called closest
	 * 1. This method takes an array A of integers (of any size) as a parameter
	 * 		Array A contains integers that can be positive, negative, both
	 * 2. It prints the indices of the two closest numbers along with their values
	 * 3. and returns an array of integers of size 2 that contains the values
	 * 		of the two closest numbers
	 ********************************************************************/
	public static int[] closest(int[] numbersArray) {
		int minDif = Math.abs(numbersArray[0] - numbersArray[1]);
		int valueOne = numbersArray[0];
		int valueTwo = numbersArray[1];
		int getIndex;
		int testVar = 0;

		for(int counterIndex = 0; counterIndex  < numbersArray.length - 1 ; counterIndex++){
			test = Math.abs(numbersArray[i]-numbersArray[counterIndex+1]);
			if(testVar < minDif){
					minDif = testVar;
					valueOne = numbersArray[counterIndex];
					valueTwo = numbersArray[counterIndex+1];
					getIndex = counterIndex;
			}
		}
	}


	/********************************************************************
	 * ACTIVITY 1.2
	 * Method called prefix
	 * 1. This method takes two strings str1 and str2 as parameters
	 * 2. and returns:
	 * 		- true if str1 is the start of str2 (i.e., str1 is a prefix of str2)
	 * 		- true if str2 is the start of str1 (i.e., str2 is a prefix of str1)
	 *  	- false otherwise
	 *  NOTE 1: you should not use the method subString
	 *  NOTE 2: you will get extra credit if you manage to break your code
	 *  		into two methods to make it easier to read
	 ********************************************************************/
	public static boolean prefix(String str1, String str2) {
		boolean isPrefix = false;

		// the rest of your code goes here

		return isPrefix;
	}


	/********************************************************************
	 * ACTIVITY 2
	 * Write a White-Box testing strategy for Method Closest
	 * To be done in the docx file only
	 ********************************************************************/


	/***********************************************************************************/
	/************* MAIN METHOD *********************************************************/
	/************* This is where you write the name ************************************/
	/************* of the code you want to execute  ************************************/
	public static void main(String[] args) {
		int[] A = {1,-3, 4, -19, 35};
		int[] result = closest(A);
		System.out.println("The closest values in A are: " + result[0] + " and " + result[1] + ".");

		// here plan to include code so that you can run Method Prefix

	}

}
