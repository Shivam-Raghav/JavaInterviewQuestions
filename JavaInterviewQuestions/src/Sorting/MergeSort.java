package Sorting;

public class MergeSort {

	int[] Array;
	int[] tempMergeArr;
	int length;

	public static void main(String[] args) {

		int[] inputArr = { 48, 36, 13, 52, 19, 21 };
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);

		for (int i : inputArr) {
			System.out.print(i + " ");
		}
	}

	public void sort(int inputArr[]) {
		this.Array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[length];
		divideArray(0, length - 1);
	}

	public void divideArray(int lowerindex, int higherindex) {
		if (lowerindex < higherindex) {
			int middle = lowerindex + (higherindex - lowerindex) / 2;

			// it will sort the left side of an array
			divideArray(lowerindex, middle);

			// it will sort the right side of an array
			divideArray(middle + 1, higherindex);

			mergeArray(lowerindex, middle, higherindex);
		}
	}

	public void mergeArray(int lowerindex, int middle, int higherindex) {
		for (int i = lowerindex; i <= higherindex; i++) {
			tempMergeArr[i] = Array[i];
		}
		int i = lowerindex;
		int j = middle + 1;
		int k = lowerindex;
		while (i <= middle && j <= higherindex) {
			if (tempMergeArr[i] <= tempMergeArr[j]) {
				Array[k] = tempMergeArr[i];
				i++;
			} else {
				Array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			Array[k] = tempMergeArr[i];
			k++;
			i++;

		}
	}
}
