package Algorithms;

public class BinarySearch {

	public static int binarySearch(int[] array, int target) {
		return binarySearchHelper(array, target, 0, array.length - 1);

	}

	//helper method taking in the array, target we are searching for and the first and last index of the array
	public static int binarySearchHelper(int[] array, int target, int first, int last) {

		//Check to see if the list is sorted
		while (first <= last) { 
			//Getting the middle index of the array and a potential match for the middle number
			int middle = (first + last) / 2; 
			int potentialMatch = array[middle];
			
			//Control flow if the "middle" value potential match is equal to the number we want
			if (potentialMatch == target) { 
				return middle;
			//If not we can cut the search in half by putting the first number equal to the middle + 1 
			} else if (target > potentialMatch) { // (right side)
				first = middle + 1;
			//and similarly we can do the same if the target we want is smaller by changing the last to the middle index - 1
			} else if (target < potentialMatch) { // (left side)
				last = middle - 1;
			}
		}
		
		//if the array is unsorted
		if (last > first) { 
			return -1;
		}
		//otherwise the number cannot be found and we return -1
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] { 11, 12, 13, 14, 15 }, 13));
	}

}
