import org.junit.Test;

import static org.junit.Assert.*;

public class newSortingTester {

    @Test
    // tests method to see if it works at all
    // expected:{1,2,5,7}
        public void newSortingTester1(){
            int[] a = {2,1,7,5};// input
            newSorting ns = new newSorting();
            ns.newSort(a, 3);
            assertArrayEquals(a, new int[] {1,2,5,7});

        }
        //tests duplicates
        //expected: {1,2,3,3,5,6}
    @Test
    public void newSortingTester2(){
        int[] a = {2,1,3,5,6,3};//input
        newSorting ns = new newSorting();
        ns.newSort(a, 2);
        assertArrayEquals(a, new int[] {1,2,3,3,5,6});

    }
    //tests negative values
    //expected:{-2,1,3}
    @Test
    public void newSortingTester3(){
        int[] a = {1,-2,3};//input
        newSorting ns = new newSorting();
        ns.newSort(a, 1);
        assertArrayEquals(a, new int[] {-2,1,3});

    }
    //tests a sorted array
    @Test
    public void newSortingTester4(){
        int[] a = {-8,0};//original array
        int[]b= {-8,0};// expected
        newSorting ns = new newSorting();
        ns.newSort(a, 3);
        assertArrayEquals(a, b);

    }
    //tests array that is completely empty
    //expected to work
    @Test
    public void newSortingTester5() {
        int[] a = {};//original array
        int[] b = {};// expected
        newSorting ns = new newSorting();
        ns.newSort(a, 0);
        assertArrayEquals(a, b);
    }

    }

