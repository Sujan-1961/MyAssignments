package week3.day1.task;

public class CharOccurance {
	          public static void main(String[] args) {
	        	//declare a string input
	              String input = "Malware";
	              //covert the string into characters
	              char[] characterLength = input.toCharArray();
	              //initialize a count variable as 0
	              int count = 0;
	            //iterate the characters
	              for (int i = 0; i < characterLength.length; i++) {
	            	  //check the condition if it match and increase the count
					if(characterLength[i]=='a')
						count++;
					//print the count
				}
	              System.out.println(count);
	              
			}
              
}
