public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try{
            metodo2();
        } catch(ArithmeticException | NullPointerException ex) {
            String mensagem = ex.getMessage();
            System.out.println("Exception " + mensagem);
            ex.printStackTrace();
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do método 2");
        metodo2();
        System.out.println("Fim do método 2");
    }
}