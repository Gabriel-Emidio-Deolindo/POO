public class helloworld {
    public static void main(String[] args) {

        for (int i = 0; i <=5; i++) {
            System.out.println("O valor da minha variavel é: " + i);

            if (i == 4) {
                System.out.println("Parei, acabou");
                break;
            }
        }
    }
}