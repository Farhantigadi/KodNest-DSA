package Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {

        int[] array1 = {1, 5, 7, 8, 9};
        int[] array2 = {2, 3, 4, 7, 8};
        mergedArray(array1,array2);
    }
    public static void  mergedArray(int [] arr1,int []arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int [] newMergedArray = new int[n1+n2];
        int k=0,j=0,i=0;

        while (i<n1 && j<n2) {
            if (arr1[i] < arr2[j]) {
                newMergedArray[k++] = arr1[i++];

            } else if (arr1[i] > arr2[j]) {
                newMergedArray[k++] = arr2[j++];

            } else {
                newMergedArray[k++] = arr2[j];
                j++;
                i++;
            }
        }
         while (i<n1){
             newMergedArray[k++]=arr1[i++];
         }
            while (j<n2){
                newMergedArray[k++]=arr1[j++];
            }
            for (int l = 0; l < k; l++) {
                System.out.print(newMergedArray[l] + " ");
            }
        }
    }


