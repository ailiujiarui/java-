package arraysdemo;

import java.util.Arrays;

public class arraysdemo {
    public static  void main(String[] args) {
        int[] arr1 = {11, 22, 44, 33, 55, 99, 77, 88, 120, 110, 100};
        int[] arr2 = {22,55,11, 44, 33,0};
      /*  System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.equals(arr2,arr1));
        System.out.println(Arrays.binarySearch(arr2,33));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));*/
        System.out.println(Arrays.equals(arr2, arr1));


        //冒泡排序

        int b = 0;
        int[] arr3 = {22,55,11, 44, 33 };
        /*SA:
        while (true){
            int i;
            Arrays.sort(arr3);
            if(Arrays.equals(arr2,arr3)){
                break SA;
            }
            for ( i = 0; i <arr2.length-1; i++) {
            if (arr2[i]>arr2[i+1]){
                b=arr2[i];
                arr2[i]=arr2[i+1];
                arr2[i+1]=b;
                System.out.println(Arrays.toString(arr2));
            }
        }}*/

        /*for (int j = 0; j < arr2.length - 1; j++) {
            for (int i = 0; i <arr2.length- 1-j; i++) {
                if (arr2[i] > arr2[i + 1]) {
                    b = arr2[i];
                    arr2[i] = arr2[i + 1];
                    arr2[i + 1] = b;

                }

            }
            System.out.println(Arrays.toString(arr2));
        }*/
        System.out.println(erfen(99));
    }
static int  erfen(int a){
        int []arr={1,2,3,4,5,6};
        int left=0;
        int right=5;
        int mid=0;
    for (int i = 0; i <arr.length ; i++) {
        mid =(left+right)/2;
        if (arr[mid] == a) {
            return mid;
        } else if (a>arr[mid]) {
            left=mid+1;

        }
        else{
            right=mid-1;
        }

    }
    return -1;
}
}

