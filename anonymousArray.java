public class anonymousArray {

    static void harry(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        // int a[]={10,20,30,};
        harry(new int []{10,20,30});//passing anonymous array to method  
    }
    
}
