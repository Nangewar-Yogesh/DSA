public class Main{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 13;
        int i=0;
        int j = arr.length-1;
       while(i<j){
           if(arr[i] + arr[j] == target){
               System.out.print(i+","+j);
               break;
           }else if(arr[i]+arr[j]>target){
            j--;
           }else{
               i++;
           }
       }
    }
}
