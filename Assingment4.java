package cs205_Assingment4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Stack;

public class Assingment4 {

	public static void main(String[] args) {
		
		try {
			PrintStream newIO = new PrintStream("/Users/dannyfleming/eclipse-workspace/cs205_Assingment4/src/cs205_Assingment4/StackPalindromeLog.txt");
			System.setOut(newIO);
			System.setErr(newIO);
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage() + " Cannot redirect STDERR or STDOUT ");
			e.printStackTrace();
			System.exit(1);
		}
		
		if(args.length != 1) {
			System.err.println("Enter properties file name");
			System.exit(1);
		}
		
		Properties prop = new Properties();
		
		try {
			prop.load(new BufferedReader((new FileReader(args[0]))));
		}
		catch (IOException IOe) {
			IOe.printStackTrace();
			System.exit(1);
		}
		
		Stack <Character> stack = new Stack <Character>();
		
		String words [] = prop.getProperty("words").split(",");
		//System.out.println("1");
		
		//push each letter in the word to check onto the stack
		for(int i = 0; i < words.length; i++) {
			char[] l = words[i].toCharArray();
			//System.out.println("2");
			// StringBuilder to house letters 
			StringBuilder stringBuilder = new StringBuilder();
			
			//pop each letter off the stack, appending the character onto the StringBuilder
			for(int j = 0; j < l.length; j ++) {
				stack.push(l[j]);
				stringBuilder.append(stack.pop());
				//System.out.println("3");
			}
			
			System.out.println(stringBuilder);
			
			if(words[i].equalsIgnoreCase(stringBuilder.toString())) {
				System.out.println(words[i] + " is a palindrome");
				//System.out.println("4");
			}
			else {
				System.out.println(words[i] + "is not a palindrome");
			}
		}
			
	}

}
