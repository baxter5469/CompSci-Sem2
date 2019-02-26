/*
 * GuessWithFileInput.java
 *
 *   A program that plays simple word guessing game.  In this game the user provides a list of
 *   words to the program.  The program randomly selects one of the words to be guessed from
 *   this list.  The player then guesses letters in an attempt to figure out what the hidden
 *   word might be.  The number of guesses that the user takes are tracked and reported at the
 *   end of the game.
 *
 *   See the write-up for GuessWithFileInput for more details.
 *
 * @author ENTER YOUR NAME HERE
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class GuessWithFileInput {


	public static void main(String[] args) throws Exception{
		// COMPLETE THE HELPER METHODS BELOW then fill in the main method
		File file = new File("words.txt");
		Scanner input = new Scanner(file);
		Scanner input1 = new Scanner(System.in);
		ArrayList<String> wordList = getList(input);
		String[][] wordArray = makeTwoDimList(wordList);
		boolean checkLevel = false;
		String ranWord;
		String currentGuess;
		char charGuess;
		int charCounter;
		ranWord = getRandomWord(wordArray[0]);
		currentGuess = starWord(ranWord);
		do{
		System.out.print("Level 1: ");
		System.out.println(currentGuess);
		charGuess = getCharacterGuess(input1);
		charCounter = checkChar(charGuess, ranWord);
		currentGuess = modifyGuess(charGuess, ranWord, currentGuess);
		checkLevel = checkWord(currentGuess, ranWord);
		} while(checkLevel == false);
		ranWord = getRandomWord(wordArray[1]);
		currentGuess = starWord(ranWord);
		checkLevel = false;
		do{
		System.out.print("Level 2: ");
		System.out.println(currentGuess);
		charGuess = getCharacterGuess(input1);
		charCounter = checkChar(charGuess, ranWord);
		currentGuess = modifyGuess(charGuess, ranWord, currentGuess);
		} while(checkLevel == false);
		ranWord = getRandomWord(wordArray[2]);
		currentGuess = starWord(ranWord);
		checkLevel = false;
		do{
			System.out.print("Level 3: ");
			System.out.println(currentGuess);
			charGuess = getCharacterGuess(input1);
			charCounter = checkChar(charGuess, ranWord);
			currentGuess = modifyGuess(charGuess, ranWord, currentGuess);
		} while(checkLevel == false);
	}


	// Given a Scanner as input, returns a List<String> of strings read from the Scanner.
	// The method should read words from the Scanner until there are no more words in the file
	// (i.e. inScanner.hasNext() is false).  The list of strings should be returned to the calling program.
	public static ArrayList<String> getList(Scanner input) {
		// Fill in the body
		ArrayList<String> mylist = new ArrayList<String>();
		String tempIn;
		input.useDelimiter("[^A-Za-z]+");
		while (input.hasNext()){
			tempIn = input.next().toLowerCase();
			mylist.add(tempIn);
		}
		return mylist;
	}

	// Sort ArrayList into a 2D Array. Takes the ArrayList<String> as parameter. Returns a
	// 2D Array with 3-4 character words in row 0, 5-6 character words in row 1, 7+ character
	// words in row 2, and ignores all words with less than 3 characters.
	public static String[][] makeTwoDimList(ArrayList<String> allWords){
		// Count the number of level #0 3-4 char words in allWords
		// Count the number of level #1 5-6 char words in allWords
		// Count the number of level #2 7+ char words in allWords
		int fiveUnder = 0; int sevenUnder = 0; int sevenPlus = 0;
		for (String i : allWords){
			if (i.length() < 5 && i.length() > 2){
				fiveUnder++;
			}
			else if(i.length() < 7){
				sevenUnder++;
			}
			else if(i.length() > 7){
				sevenPlus++;
			}
		}

		// Declare your 2D array
		String[][] myArray = new String[3][];
		myArray[0] = new String[fiveUnder];
		myArray[1] = new String[sevenUnder];
		myArray[2] = new String[sevenPlus];
		// Fill in the body
		fiveUnder = 0;
		sevenUnder = 0;
		sevenPlus = 0;
		for (String i : allWords){
			if (i.length() < 5 && i.length() > 2){
				myArray[0][fiveUnder] = i;
				fiveUnder++;
			}
			else if(i.length() < 7){
				myArray[1][sevenUnder] = i;
				sevenUnder++;
			}
			else if(i.length() > 7){
				myArray[2][sevenPlus] = i;
				sevenPlus++;
			}
		}
		return myArray;
	}

	// Given two strings as input, compares the first string (guess) to the second
	// (solution) character by character.  If the two strings are not exactly the same,
	// return false.  Otherwise return true.
	public static boolean checkWord(String guess, String solution) {
		// Fill in the body
		// char[] guessIn = guess.toLowerCase().toCharArray();
		// char[] solutionIn = solution.toLowerCase().toCharArray();
		// int minLng = Math.min(guessIn.length, solutionIn.length);
		// boolean checker = true;
		// if (guessIn.length == solutionIn.length){
		// 	checker = false;
		// }
		// else {
		// 	for (int i = 0; i < minLng; i++){
		// 	if (guessIn[i] != solutionIn[i]){
		// 		checker = false;
		// 	}
		// }

	
		return guess.equals(solution);
	}


	// Given a ArrayList<String> list of strings as input, randomly selects one of the strings
	// in the list and returns it to the calling program.
	public static String getRandomWord(String[] inList) {
		// Fill in the body
		Random random = new Random();
		int listSize = inList.length;
		int randomLoc = random.nextInt(listSize);
		return inList[randomLoc];
	}


	// Given a Scanner as input, prompt the user to enter a character.  If the character
	// enters anything other than a single character provide an error message and ask
	// the user to input a single character.  Otherwise return the single character to
	// the calling program.
	public static char getCharacterGuess(Scanner input) {
		// Fill in the body
		System.out.print("Enter a single character: ");
		String tempIn;
		char singleChar = '0';
		boolean checker = true;
		while (checker == true){
		if (input.hasNext()){
			tempIn = input.nextLine();
				singleChar = tempIn.charAt(0);
				checker = false;
		}
		else {
			System.out.println("Invalid Input!");
			input.next();
			break;
		}
	}
		return singleChar;
	}

	// Given a character inChar and a ArrayList<Character> list of characters, check to see if the
	// character inChar is in the list.  If it is, return true.  Otherwise, return false.
	public static boolean checkInList(char inChar, ArrayList<Character> inList) {
		// Fill in the body
		char tempIn = inChar;
		boolean charChecker = false;
		for (int i = 0; i < inList.size(); i++){
			if (inList.get(i) == tempIn){
				charChecker = true;
			}
		}
		return charChecker;
	}

	// Given a String, return a String that is the exact same length but consists of
	// nothing but '*' characters.  For example, given the String DOG as input, return
	// the string ***
	public static String starWord(String inWord) {
		// Fill in the body
		String starWord = inWord.replaceAll(".", "*");
		return starWord;
	}

	// Given a character and a String, return the count of the number of times the
	// character occurs in that String.
	public static int checkChar(char guessChar, String guessWord) {
		// Fill in the body
		int counter = 0;
		for (int i = 0; i < guessWord.length(); i++){
			if (guessWord.charAt(i) == guessChar){
				counter++;
			}
		}
		return counter;
	}

	// Given a character, a String containing a word, and a String containing a 'guess'
	// for that word, return a new String that is a modified version of the 'guess'
	// string where characters equal to the character inChar are uncovered.
	// For example, given the following call:
	//   modfiyGuess('G',"GEOLOGY", "**O*O*Y")
	// This functions should return the String "G*O*OGY".
	public static String modifyGuess(char inChar, String word, String currentGuess) {
		// Fill in the body
		String result = "";
		word = word.toLowerCase();
		inChar = Character.toLowerCase(inChar);
		for (int i = 0; i < word.length(); i++){
			if (inChar == word.charAt(i)){
				result += inChar;
			}
			else {
				result += currentGuess.charAt(i);
			}
		}
		return result;
	}
}
