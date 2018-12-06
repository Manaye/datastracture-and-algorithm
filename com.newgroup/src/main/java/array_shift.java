import java.util.Arrays;

 import java.util.Arrays;

public class array_shift {

        public static void main(String[] args) {
            int myarr1[] = new int []{2,4,6,8};

            int myarr2[] = new int []{4,8,15,23,42};

            System.out.println(Arrays.toString(shiftArr(myarr2,16)));
        }


        public static int [] shiftArr(int arr[],int value){
            int[] temp = new int[arr.length+1];

            int index = 0;
            int middle = (int)Math.round(arr.length/2);
            for(int i = 0; i<= middle; i++){
                temp[index] = arr[i];
                index++;
            }
            temp[index] = value;
            for(int j = index; j<arr.length; j++){
                temp[j+1] = arr[j];
            }
            return  temp;
        }
    }




