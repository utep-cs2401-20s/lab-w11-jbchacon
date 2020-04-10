import java.util.Arrays;

public class newSorting {
    public  void newSort(int[] a, int size){
        if(a.length <= size) {//check if length is less than or equal to size
            quickSort(a,0,a.length-1);
        }
        else {
            int mid = (a.length/2);// gets the mid
            int[] left = new int[mid];// sets mid as left
            int[] right = new int[a.length - mid];// sets the rest as right
            for (int i = 0; i < left.length; i++) {
                left[i] = a[i];
            }//copys new arrays
            for (int j = 0; j < right.length; j++) {
                right[j] = a[j + mid];
            }
            newSort(left, size);
            newSort(right, size);
            merge(a, left, right);
        }
    }
    public  void merge(int []a,int[] left, int[] right) {
        int i = 0;//left index
        int j = 0;//right index
        int index = 0;//array index
        while(index < a.length) {
            if(i < left.length) {// checks if in bounds
                if(j < right.length) {
                    if(left[i] < right[j]) {// if left half is less than right
                        a[index] = left[i];
                        index++;// increase counters
                        i++;
                    }
                    else {
                        a[index] = right[j];
                        index++;
                        j++;
                    }
                }
                else {//if out of bounds
                    a[index] = left[i];
                    index++;
                    i++;
                }
            }
            else if(j < right.length) {
                a[index] = right[j];
                index++;
                j++;
            }
        }
    }

    public  void quickSort(int[] a, int left, int right) {
        if (left < right) {// if left is less than right
            int pivotIndex = partArray(a,left,right);//get pivot index
            quickSort(a, left, pivotIndex - 1);//sort left
            quickSort(a, pivotIndex + 1, right);//sort right
        }
    }

    public  int partArray(int[] a, int left, int right) {
        int pivot = a[left];//sets pivot
        int i = left;
        int j = left + 1;
        // starts to separate
        while(j <= right){
            //if  element is less than pivot
            if(a[j] < pivot){//if less than pivot
                i++;// increase first counter
                //swap
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            j++;
        }
        //swap pivot at given index
        int temp = a[i];
        a[i] = a[left];
        a[left] = temp;
        return i;
    }
}
