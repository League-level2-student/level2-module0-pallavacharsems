package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {

		// 1. make an array of 5 Strings
		String[] names = { "Bob", "Jeff", "Josh", "Noah", "Jack" };
		// 2. print the third element in the array
		System.out.println(names[2]);
		// 3. set the third element to a different value

		// 4. print the third element again
		System.out.println(names[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);

		}

		// 6. make an array of 50 integers
		int[] num = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		int h = 0;
		Random rand = new Random();

		for (int i = 0; i < num.length; i++) {

			h = rand.nextInt(10000);
			num[i] = h;
			System.out.println(num[i]);
		}
		int small = num[0];
		int large = num[0];
		for (int x = 0; x < num.length; x++) {
			if (num[x] < small) {
				small = num[x];
			} if (num[x] > large) {
				large = num[x];
			}
			
		}
		System.out.println("The smallest number is " + small);
		System.out.println("The largest number is " + large);

		// 8. without printing the entire array, print only the smallest number in the
		// array
		// Done
		// 9 print the entire array to see if step 8 was correct
		// Done
		// 10. print the largest number in the array.
		// Done	
	}
}
