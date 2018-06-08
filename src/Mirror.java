import java.util.Random;

public class Mirror {
    public static void main(String[] args) {

        int[] tab = new int[10];
        Random random = new Random();

        for (int i = 0; i <tab.length; i++) {
            tab[i] = random.nextInt(10);
        }


        int x = 1;

        for (int i = 0; i <tab.length*2; i++) {
            if (i <tab.length) {
                System.out.print(tab[i]);
            } else {
                System.out.print(tab[i-x]);
                x = x+2;
            }
        }

    }
}

