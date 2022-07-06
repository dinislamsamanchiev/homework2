public class Main {
    public static void main(String[] args) {
        String  FovoratNamber;
        final int nam =-8;
        String WORLD = "this is my favorite number " ;
        FovoratNamber=nam+" " + WORLD;
        System.out.println(FovoratNamber);


        if (nam < 0){
            System.out.println("you saved negative h.." );

        } else if (nam>0){
            System.out.println("you saved a negative number");
        }else  {
            System.out.println("zero");
        }

    }
}