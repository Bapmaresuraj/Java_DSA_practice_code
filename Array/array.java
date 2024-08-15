public class array {
    public static void main(String[] args) {
        int arr[]=new int[10]; // it is empty array  its deacleard the size of array
        int arr1[]={1,2,3,4,5}; // without declearing size java atomatic detect the size of array

        // print the array using loop
        arrayprint(arr1);// array pass as refrence value any changed in function on array orignal array will be changed 
    }

    public static void arrayprint(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
