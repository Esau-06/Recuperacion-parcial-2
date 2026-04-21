import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MetodosCola {
    public Queue<ObjCliente> LlegadaCliente(Queue<ObjCliente> c, Scanner sc){
        ObjCliente o = new ObjCliente();

        System.out.println("Ingrese el id");
        int ID = sc.nextInt();
        sc.nextLine();
        o.setId(ID);

        System.out.println("Ingrese el nombre");
        String Nombre = sc.nextLine();
        o.setNombre(Nombre);    

        System.out.println("Ingrese el tipo de servicio");
        String tipoServicio = sc.nextLine();
        o.setTipoServicio(tipoServicio);

        System.out.println("Ingrese hora de llegada");
        String horaLlegada = sc.nextLine();
        o.setHoraLlegada(horaLlegada);

        o.setAtendido(false);

        c.offer(o); 

        return c;
    }

    public Queue<ObjCliente> AtenderCliente(Queue<ObjCliente> c, LinkedList<ObjCliente> atendidos) {
        if (c.isEmpty()) {
            System.out.println("No hay clientes en la cola");
        } else {
            ObjCliente o = c.remove();
            o.setAtendido(true);
            atendidos.add(o);
            System.out.println("Cliente atendido: " + o.getNombre());
        }

        return c;
    }   

    public void VerSiguienteCliente(Queue<ObjCliente> c) {
        
        if (c.isEmpty()) {
            System.out.println("No hay mas clientes");
        } else {
            ObjCliente o = c.peek();
            System.out.println("Siguiente cliente: " + o.getNombre());
        }
    }

    public void MostrarCola(Queue<ObjCliente> c) {
        if (c.isEmpty()) {
            System.out.println("No hay clientes en la cola");
        } else {
            for(ObjCliente o : c){
                System.out.println(o.getNombre() + "-" + o.getTipoServicio());
            }
        }
    }

    public void MostrarTurnos(Queue<ObjCliente> c) {

    }
}
