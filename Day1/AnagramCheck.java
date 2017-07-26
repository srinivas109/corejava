package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AnagramCheck{
	public static boolean iAnagram(String word, String anagram){
		char[] charFromWord=word.toCharArray();
		char[] charFromAnagram=anagram.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord,charFromAnagram);
	}

public static void main(String[] args) throws IOException{
	AnagramCheck Anacheck=new AnagramCheck();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter First String");
	String Str1=br.readLine();
	System.out.println("Enter Second String");
	String Str2=br.readLine();
	if(Anacheck.iAnagram(Str1, Str2))
		System.out.println("Strings Are Anagram");
	else
		System.out.println("Strings Are Not Anagram");
}
}