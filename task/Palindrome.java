package week3.day1.task;

public class Palindrome {
           public static void main(String[] args) {
			//declare input
        	String input = "racecar";
        	//initialize another variable as empty string
        	String a = "";
        	//convert the string into character
        	char[] character = input.toCharArray();
        	//iterate the characters
        	for (int i = character.length-1; i >= 0; i--) {
        		//check the condition if it is a match and decrease a
				a = a+input.charAt(i);
			}
        	//check if it equals the input
        	if(input.equals(a)) {
        		//print if it is palindrome or not
				System.out.println("It is a Palindrome");
			} else {
				System.out.println("Not a Palindrome");
			}
		}
}
