package test;

public class test2 {

	public static void main(String[] args) {
		   String first = "hello, world!";
	        String second = "Java dilini oyrenirem.";

	        // concat() 
	        String concatString = first.concat(" ").concat(second);
	        System.out.println("concat(): " + concatString);

	        // copyValueOf() 
	        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
	        String copiedValue = String.copyValueOf(charArray);
	        System.out.println("copyValueOf(): " + copiedValue);

	        // charAt() 
	        char charAtIndex = first.charAt(4);
	        System.out.println("charAt(): " + charAtIndex);

	        // endsWith()
	        boolean endsWithString2 = second.endsWith("ruz.");
	        System.out.println("endsWith(): " + endsWithString2);

	        // equals() 
	        boolean areEqual = first.equals("Merhaba, Dünya!");
	        System.out.println("equals(): " + areEqual);

	        // getChars()
	        char[] targetArray = new char[7];
	        second.getChars(5, 12, targetArray, 0);
	        System.out.print("getChars(): ");
	        for (char c : targetArray) {
	            System.out.print(c);
	        }
	        System.out.println();

	        // indexOf() 
	        int indexOfA = first.indexOf('a');
	        System.out.println("indexOf(): " + indexOfA);

	        // matches() 
	        boolean matchesRegex = second.matches(".*programlama.*");
	        System.out.println("matches(): " + matchesRegex);

	        // toCharArray() 
	        char[] charArrayFromString = first.toCharArray();
	        System.out.print("toCharArray(): ");
	        for (char c : charArrayFromString) {
	            System.out.print(c + " ");
	        }
	        System.out.println();

	        // compareTo()
	        int compareToResult = first.compareTo("hello, world!");
	        System.out.println("compareTo(): " + compareToResult);

	        // compareToIgnoreCase() 
	        int compareToIgnoreCaseResult = first.compareToIgnoreCase("HelLo, WorLd!");
	        System.out.println("compareToIgnoreCase(): " + compareToIgnoreCaseResult);

	        // isBlank()
	        String blankString = "    ";
	        boolean isBlank = blankString.isBlank();
	        System.out.println("isBlank(): " + isBlank);

	        // isEmpty() 
	        boolean isEmpty = first.isEmpty();
	        System.out.println("isEmpty(): " + isEmpty);

	        // replace() 
	        String replacedString = second.replace("hello", "world");
	        System.out.println("replace(): " + replacedString);

	        // substring() 
	        String subString = first.substring(8);
	        System.out.println("substring(): " + subString);

	        // toLowerCase() 
	        String lowerCaseString = second.toLowerCase();
	        System.out.println("toLowerCase(): " + lowerCaseString);
	    }
	}