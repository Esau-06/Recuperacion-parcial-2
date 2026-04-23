import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodosCola mc = new MetodosCola();
        MetodosPilas mp = new MetodosPilas();
        Stack<ObjPaginaWeb> Pila = new Stack<>();
        Queue<ObjCliente> Cola = new LinkedList<>();
        LinkedList<ObjCliente> atendidos = new LinkedList<>();


        int opcionPrincipal = 0;

        while (opcionPrincipal != 3) {
            System.out.println("1) Navegador Web");
            System.out.println("2) Banco");
            System.out.println("3) Salir");
            opcionPrincipal = sc.nextInt();
            sc.nextLine();

            switch (opcionPrincipal) {
                case 1:
                    int opcionPila = 0;

                    while (opcionPila != 5) {
                        System.out.println("1) Visitar pagina");
                        System.out.println("2) Retroceder");
                        System.out.println("3) Ver pagina actual");
                        System.out.println("4) Mostrar historial");
                        System.out.println("5) Volver");
                        opcionPila = sc.nextInt();
                        sc.nextLine();

                        switch (opcionPila) {
                            case 1:
                                Pila = mp.visitarPagina(Pila, sc);
                                break;

                            case 2:
                                Pila = mp.retroceder(Pila);
                                break;
                            
                            case 3:
                                mp.verActual(Pila);
                                break;
                            case 4:
                                mp.mostrarHistorial(Pila);
                                break;
                            case 5:
                                break;
                        
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }

                    break;
                case 2:
                    int opcionCola = 0;

                    while (opcionCola != 6) {
                        System.out.println("1) Llegada cliente");
                        System.out.println("2) Atender cliente");
                        System.out.println("3) Ver siguiente cliente");
                        System.out.println("4) Mostrar cola");
                        System.out.println("5) Mostrar Turnos");
                        System.out.println("6) volver");
                        opcionCola = sc.nextInt();
                        sc.nextLine();

                        switch (opcionCola) {
                            case 1:
                                Cola = mc.LlegadaCliente(Cola, sc);
                                break;
                            
                             case 2:
                                Cola = mc.AtenderCliente(Cola, atendidos);
                                break;

                             case 3:
                                mc.VerSiguienteCliente(Cola);
                                break;
                            
                             case 4:
                                mc.MostrarCola(Cola);
                                break;

                             case 5:
                                mc.MostrarTurnos(Cola, atendidos);
                                break;

                             case 6:
                                break;

                            default:
                                System.out.println("Opcion invalida");
                                
                        }
                    }
                    break;
                
                case 3:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        }

    }
}
