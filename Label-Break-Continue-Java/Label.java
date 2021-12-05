public class Label {
    public static void main(String[] args) {
        
        boolean matriz[][] = {
            {false, false, false, false},
            {false, false, false, false, false, true}
        };


        um:
        for(int i=0; i<matriz.length; i++){
            dois:
            for(int j=0; j<matriz[i].length; j++){

                if(matriz[i][j]){
                    System.out.print("Valor verdadeiro posição = ["+i+"]["+j+"] \n");
                    break um;
                }
            }
            System.out.println(" ");
        }

    }
}