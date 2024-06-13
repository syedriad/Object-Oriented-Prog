public class TwoDArray {
        public static void main(String[] args) {
            


            int [][] arr = new int[2][3] ;

            // arr[0][0] = 3;
            // arr[0][1] = 3;
            // arr[0][2] = 3;
            // arr[1][0] = 3;
            // arr[1][1] = 3;
            // arr[1][2] = 3;
            // arr[1][3] = 9;




            for(int i=0 ; i< 2; i++){

                for(int j=0; j< 3 ; j++ ){
                    arr[i][j] =  (int) (Math.random() * 10) ;
                    System.out.print(arr[i][j] + " " );
                }
            System.out.println();
        }

        // int [][] arr2 = {{21, 22, 23 ,43,33},{65,34,76,46,99}} ;
        int [][] arr2 = new int [3][3] ;

        for(int[] i:arr2){

            for( int j: i ){
                // arr2[i][j] = (int)(Math.random()*10) ;
                System.out.println(j);
            }
            System.out.println();
        }

        String[] copyFrom = { "1", "2" , "3" , "4 " ,"5", "6" , "7" , "8 " ,"9","10"};
    
        String[] copyTo = new String[7];
        
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);   //if length=6 , in output last index would be null.
        for (String drink : copyTo) {
        System.out.print(drink + " ");



        }


    }
}
