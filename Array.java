public class Array {

    public static void main(String[] args) {
        

        // int [] arr;   //declaration
        // arr = new int[5] ;

        // for (int i :arr){
        //     System.out.println(i);
        // }
        // // System.out.println(arr);
        
        // arr[1] = 69;
        // arr[2] = 45;
        // arr[3] = 66;
        
        
        // for(int i=0 ; i< arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        int [] arr2 = {1,5,3,2,5,7,6} ;
        int arr3[] = new int[8] ;

        for(int i:arr2){
            System.out.println( i);
        }
        for(int i=0 ; i< arr2.length; i++){
            System.out.println(i + " " + arr2[i]);
        }

        
        for(int i=0 ; i< arr3.length; i++){
            
            arr3[i] = (int) (Math.random() * 10 ) ;
            System.out.println(arr3[i]);
        }

        

    }
}