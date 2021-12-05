public class Label {
    public static void main(String[] args) {
        
        boolean matriz[][] = {
            {false, false, true, false},
            {false, false, false}
        };


        um:
        for(int i=0; i<=5; i++){
            dois:
            for(int j=0; j<=5; j++){

                if(j==3){
                    break um;
                }

                System.out.print("["+i+"]["+j+"]");
            }
            System.out.println(" ");
        }

    }
}