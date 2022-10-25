public class App {
    public static void main(String[] args) throws Exception {
        
    char [][] letters =  { { 'A' , 'B' , 'C' },{ 'D', 'E' , 'F'},{'G' ,'H' ,'I'},{'J','K','L'}};

    // Outer Loop
    for(int rows = 0; rows < 4; rows++) {
        
        
        System.out.println("");


                // // Inner Loop
                // for (int column = 0; column < 3; column++){
                    
                //     // If row is even
                //     if (rows % 2 == 0 ){
                //         System.out.print(" ");
                //     } else {
                //         System.out.print( letters[rows][column]);
                //     }
                //  }

            // Inner Loop
        for (int column = 0; column < 3; column++){
            
            // If row is odd
            if (rows % 2 != 0 ){
                System.out.print(" ");
            } else {
                System.out.print( letters[rows][column]);
            }
         }

     }

    }

}
