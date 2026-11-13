public class Main{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int target = 13;
        Outer:
        for(int i =0; i<arr.length-1; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i+" "+j);
                    break Outer;
                }
            }
        }
    }
}
