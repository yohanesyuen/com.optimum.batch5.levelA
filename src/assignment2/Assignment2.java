package assignment2;

public class Assignment2 {

	static void printStaircase(int levels, int option) {
		switch(option) {
			case 1:
				for (int i=1; i <= levels; i++) { // outer loop, keeps track of row
					for (int j = 1; j <= i; j++) {  // inner loop, keeps track of column
						System.out.print('*');
						System.out.print(' ');
					}
					System.out.println();
				}
				break;
			case 2:
				for (int i=1; i <= levels; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print(j);
						System.out.print(' ');
					}
					System.out.println();
				}
				break;
			case 3:
				for (int i=1; i <= levels; i++) {
					for (int j=0; j < levels-i; j++) {
						System.out.print(' ');
					}
					for (int k = 1; k <= i; k++) {
						System.out.print('X');
						System.out.print(' ');
					}
					System.out.println();
				}
				break;
			case 4:
				for (int i=1; i <= levels; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print(i);
						System.out.print(' ');
					}
					System.out.println();
				}
				break;
			case 5:
				for (int i=1; i <= levels; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print(levels - j + 1);
						System.out.print(' ');
					}
					System.out.println();
				}
				break;	
			case 6:
				for (int i=1; i <= levels; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print(j);
						System.out.print(' ');
					}
					for (int k = i-1; k >= 1; k--) {
						System.out.print(k);
						System.out.print(' ');
					}
					System.out.println();
				}
				break;
			default:
				break;
		}
		
	}
	
	static int findMissingNumber(int min, int max, int[] arr) {
		int answer = -1;
		boolean found = false;
		for (int i = min; i <= max; i++) {
			found = false;
			for (int j=0; j < arr.length; j++) {
				if (i == arr[j]) { // if value is found in the array, it's not missing
					found = true;    // so we set found to true and proceed to test the 
					break;           // next value
				}
			}
			if (!found) {
				answer = i;
			}
		}
		return answer;
	}
	
	static int findFirstNonRepeating(int[] arr) {
		for (int i=0; i < arr.length; i++) {
			for (int j = i+1; i < arr.length; j++) {
				if (arr[i] == arr[j]) {
					break;
				}
				if (j == arr.length-1 && arr[i] != arr[j]) {
					return arr[i];
				}
			}
		}
		return 0;
	}

	static String displayArray(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i : arr) {
			sb.append(i + ", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append("}");
		return sb.toString();
	}

	static String displayArray(String[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (String i : arr) {
			sb.append(i + ", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append("}");
		return sb.toString();
	}
	
	static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	static int[] sortArray(int[] arr) {
//		int[] sorted = arr;
		do {
//			System.out.println(displayArray(arr));
			for (int i=0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		} while(!isSorted(arr));
		return arr;
	}
	
	static int findDuplicate(int[] arr) {
		for (int i=0; i < arr.length; i++) {
			for (int j=i+1; j < arr.length; j++ ) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}
	
	static int min(int a, int b) {
		return a < b ? a : b;
	}
	
	static int min(int[] arr) {
		int min = arr[0];
		for (int v : arr) {
			min(v, min);
		}
		return min;
	}
	
	static int max(int[] arr) {
		int max = arr[0];
		for (int v : arr) {
			if (v > max) {
				max = v;
			}
		}
		return max;
	}
	
	static int indexOf(int value, int[] arr, int start, int end) {
		int index = -1;
		for (int i = start; i <= end; i++) {
			if (arr[i] == value) {
				index = i;
			}
		}
		return index;
	}
	
	static int indexOf(int value, int[] arr, int end) {
		return indexOf(value, arr, 0, end);
	}
	
	static int[] removeDuplicates(int[] arr) {
		int[] new_array = new int[arr.length - 1];
		int i_idx = 0; // iterator to mark position in new array
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				new_array[i_idx] = arr[i];
				i_idx++;
			} else if (indexOf(arr[i], arr, i-1) >=0 ) {
				continue;
			} else {
				new_array[i_idx] = arr[i];
				i_idx++;
			}
		}
		return new_array;
	}
	
	static void reverseArray(String[] arr) {
		int length = arr.length;
		int max = length - 1;
		for (int i = 0; i < length / 2; i++) {
			String temp = arr[i];
			arr[i] = arr[max - i];
			arr[max - i] = temp;
		}
	}
	
	static void reverseArray(char[] arr) {
		int length = arr.length;
		int max = length - 1;
		for (int i = 0; i < length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[max - i];
			arr[max - i] = temp;
		}
	}
	
	static String reverseString(String str) {
		char[] characters = new char[str.length()];
		characters = str.toCharArray();
		reverseArray(characters);
		return new String(characters);
	}
	
	static int indexOf(String value, String[] arr, int start, int end) {
		int index = -1;
		for (int i = start; i <= end; i++) {
			if (arr[i].equals(value)) {
				index = i;
			}
		}
		return index;
	}
	
	static int indexOf(String value, String[] arr, int end) {
		return indexOf(value, arr, 0, end);
	}
	
	static String[] removeDuplicates(String[] arr) {
		String[] new_array = new String[arr.length - 1];
		int i_idx = 0; // iterator to mark position in new array
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				new_array[i_idx] = arr[i];
				i_idx++;
			} else if (indexOf(arr[i], arr, i-1) >=0 ) {
				continue;
			} else {
				new_array[i_idx] = arr[i];
				i_idx++;
			}
		}
		return new_array;
	}
	
	static int cube(int x) {
		return x * x * x;
	}
	
	static boolean test_armstrong(int number) {
		String str = String.valueOf(number);
		char[] arr = str.toCharArray();
		int sum = 0;
		for (char c : arr) {
			int cubed = cube(Character.getNumericValue(c));
			sum += cubed ;
		}
		return sum == number;
	}
	
	static int[] common_elements(int[] first, int[] second) {
		int[] base = (first.length < second.length) ? first : second;
		int[] other = (second.length <= first.length) ? first : second;
		int[] newArray = new int[base.length - 1];
		int   i_idx    = 0;
		
		for (int value : base) {
			int idxInOther = indexOf(value, other, 0, other.length-1);
			if (idxInOther >= 0) {
				newArray[i_idx] = value;
				i_idx++;
			}
		}
		return newArray;
	}
	
	public static void main(String[] args) {
		printStaircase(5, 1);
		printStaircase(5, 2);
		printStaircase(5, 3);
		printStaircase(5, 4);
		printStaircase(5, 5);
		printStaircase(5, 6);
		
		int[] arrA = {1,2,4,6,3,7,8,9,10,11};
		System.out.println(findMissingNumber(1, 11, arrA));
		
		int[] arrB = {5,2,9,15,2,7,7,18,15,5};
		System.out.println(findFirstNonRepeating(arrB));
		
		int[] arrC = {5,2,9,15,2,7,7,18,15,5};
		System.out.println(displayArray(sortArray(arrC)));
		
		int[] argD = {16,7,89,20,7,99,21,56,12,10};
		System.out.println(findDuplicate(argD));
		
		int[] argE = {16,4,89,20,7,99,21,56,12,10};
		System.out.println(min(argE) + ", " + max(argE));
		
		int[] argF = {16,4,20,20,7,99,21,56,12,10};
		argF = removeDuplicates(argF);
		System.out.println(displayArray(argF));

		String[] strA = {"java", "oracle", "python", "scala", "hibernate"};
		reverseArray(strA);
		System.out.println(displayArray(strA));

		String strB = "oracle";
		System.out.println(reverseString(strB));
		
		String[] strC = {"java", "hibernate", "python", "scala", "hibernate"};
		System.out.println(displayArray(removeDuplicates(strC)));
		
		int armstrong_test = 153;
		System.out.println(test_armstrong(armstrong_test));
		
		int[] arrI  = {4, 7, 3, 9, 2};
		int[] arrII = {3, 2, 12, 9, 40, 32, 4};
		int[] common = common_elements(arrI, arrII);
		System.out.println(displayArray(common));
	}

}