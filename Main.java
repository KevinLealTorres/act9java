import java.util.Scanner;

class Main {

    public static Deck deck = new Deck();

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        var salir = false;
        var scan = new Scanner(System.in);
        short option;

        while(!salir) {
            //se que está salido, pero en mi pantalla se ve bien
            System.out.printf("""
                🃑🂾🃝🂻🃊🃟🃑🂾🃝🂻🃊🃟🃑🂾🃝🂻🃊🃟🃑🂾🃝🂻🃊🃟🃑🂾🃝🂻🃑🂾🃝🂻🃊🃟🃑🂾🃝🂻🃊🃟🃑🂾🃝🂻🃊🃟
                🃑                                            🃟
                🃑           Bienvenido a Poker!              🃑
                🂾          Selecciona una opción:            🂾
                🃝             1 Mezclar deck                 🃝
                🃊           2 Sacar una carta                🃊
                🃟            3 Carta al azar                 🃟
                🃑      4 Generar una mano de 5 cartas        🃑
                🂾               0 Salir                      🂾
                🂾                                            🂾
                🃑🂾🃝🂻🃊🃟🃑🂾🃝🂻🃊🃟🃑🂾🃝🂻🃊🃟🃑🂾🃝🂻🃊🃟🃑🂾🃝🂻🃑🂾🃝🂻🃊🃟🃑🂾🃝🂻🃊🃟🃑🂾🃝🂻🃊🃟
                >>>\s""");

            try {
                scan = scan.reset(); // Aunque esta vacio en el inicio, cuando vuelves a esta parte queda en un bucle
                option = Short.parseShort(scan.nextLine().trim());
            } catch (Exception e) { 
                System.err.println("Eso no fue un número, intentalo otra vez");
                System.out.println("Presione Enter para continuar...");
                scan.nextLine();
                continue;
            }

            switch (option) {
                case 0 -> {
                    salir = true;
                    System.out.println("¡Hasta pronto!");
                }
                case 1 -> deck.shuffle();
                case 2 -> deck.head();
                case 3 -> deck.pick();
                case 4 -> deck.hand();
                default -> System.err.println("Opción no válida");
            }
            System.out.println("Presione Enter para continuar...");
            scan.nextLine();
        }
        scan.close();
    }
}