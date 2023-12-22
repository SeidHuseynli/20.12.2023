package test;

import java.util.Arrays;

public class CustomString {

	 private final String value;

	    public CustomString(String value) {
	        this.value = value;
	    }

	    // Length methodu
	    public int customLength() {
	        return value.length();
	    }

	    // CharAt methodu
	    public char customCharAt(int index) {
	        return value.charAt(index);
	    }

	    // ToCharArray methodu
	    public char[] customToCharArry() {
	        return value.toCharArray();
	    }

	    // IsBlank methodu
	    public boolean customIsBlank() {
	        return value.trim().isEmpty();
	    }

	    // IsEmpty methodu
	    public boolean customIsEmpty() {
	        return value.isEmpty();
	    }

	    // Contains methodu
	    public boolean customContains(CharSequence sequence) {
	        return value.contains(sequence);
	    }

	    // ValueOf methodu
	    public static CustomString customValueOf(Object obj) {
	        return new CustomString(String.valueOf(obj));
	    }

	    public static void main(String[] args) {
	        
	        CustomString customStr = new CustomString("Home, Work!");

	        System.out.println("Length: " + customStr.customLength());
	        System.out.println("Character at index 4: " + customStr.customCharAt(4));

	        char[] charArray = customStr.customToCharArry();
	        System.out.println("Character array: " + Arrays.toString(charArray));

	        System.out.println("Is blank: " + customStr.customIsBlank());
	        System.out.println("Is empty: " + customStr.customIsEmpty());
	        System.out.println("Contains 'salam': " + customStr.customContains("salam"));

	        CustomString newValue = CustomString.customValueOf(345);
	        System.out.println("New value: " + newValue.customLength());
	    }
	}
