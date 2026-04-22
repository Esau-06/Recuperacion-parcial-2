import java.util.Scanner;
import java.util.Stack;

public class MetodosPilas {
    public Stack<ObjPaginaWeb> visitarPagina(Stack<ObjPaginaWeb> p, Scanner sc) {
        
        ObjPaginaWeb i = new ObjPaginaWeb();

        System.out.println("Ingrese la url de la pagina");
        String url = sc.nextLine();
        i.setUrl(url);
        

        System.out.println("Ingrese titulo de la pagina");
        String titulo = sc.nextLine();
        i.setTitulo(titulo);
        
        System.out.println("Ingrese la fecha");
        String fecha = sc.nextLine();
        i.setFechaAcceso(fecha);

        p.push(i);

        return p;
    }

    public void verActual(Stack<ObjPaginaWeb> p) {
        if (p.isEmpty()) {
            System.out.println("No hay paginas abiertas");
        } else {
            ObjPaginaWeb i = p.peek();
            System.out.println("pagina actual: " + i.getTitulo());
        }
    }

    public Stack<ObjPaginaWeb> retroceder(Stack<ObjPaginaWeb> p) {
        
        if (p.isEmpty()) {
            System.out.println("No hay paginas");
        } else {
            ObjPaginaWeb i = p.pop();
            System.out.println("Regresaste de: " + i.getTitulo());       
        }
    
        return p;
    }

    public void mostrarHistorial(Stack<ObjPaginaWeb> p){
        
        if (p.isEmpty()) {
            System.out.println("No hay historial");
        } else {
            for(ObjPaginaWeb i : p){
                System.out.println(i.getTitulo() + " - " + i.getUrl());
            }
        }

    }
    
}
