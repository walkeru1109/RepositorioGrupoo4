
package proyecto20;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Proyecto20 {

    
    public static void main(String[] args) {
        ArrayList<AUTOS> arAutos = new ArrayList();
        ArrayList<PERSONAS> arPersonas = new ArrayList();
        JOptionPane.showMessageDialog(null, "Bienvenido al inventario de vehiculos");
        int opcion;
        
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu principal\n"
                    + "1- Registro de autos\n"
                    + "2- Registro de personas\n"
                    + "3- Registro de ventas\n"
                    + "4- Salir\n"
                    + "\nDigite la opcion que desea ejecutar: "));
            
            switch (opcion) {
                case 1:
                    boolean VolverMenu = true;
                    while (VolverMenu == true){
                        int opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null, "REGISTRO DE AUTOS////" + "\n"+
                                    "1- Agregar un auto\n"+
                                    "2- Consultar un auto\n"+
                                    "3- Editar informacion de un auto\n"+
                                    "4- Eliminar un auto\n" +
                                    "5- Regresar el menu principal"));
                        if (opcion >= 1 && opcion1 <=4) {
                            if (opcion1 == 1) {
                                //AGREGAR
                                AUTOS a = new AUTOS();
                                a.setNumeroChasis(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de chasis: ")));
                                a.setMarca(JOptionPane.showInputDialog("Ingrese la marca del auto: "));
                                a.setEstilo(JOptionPane.showInputDialog("Ingrese el estilo del auto: "));
                                a.setModelo(JOptionPane.showInputDialog("Ingrese el modelo del auto: "));
                                a.setColor(JOptionPane.showInputDialog("Ingrese el color del auto: "));
                                a.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del auto: ")));
                                arAutos.add(a);
                                JOptionPane.showMessageDialog(null, "Numero de chasis: " + a.getNumeroChasis()+ "\n"+ "Marca del auto" + a.getMarca()+ "\n"+"Estilo del auto: " + a.getEstilo()+ "\n"+"Modelo del auto: " + a.getModelo()+ "\n"+
                                        "Color del auto: " + a.getColor()+ "\n"+"Precio del auto: " + a.getPrecio()+ "\n");
                                VolverMenu = true;
                                
                                
                            }
                            if (opcion1 ==2) {
                                //CONSULTAR
                                int x;
                                boolean proximo = true;
                                AUTOS e = new AUTOS();
                                for ( x = 0; x< arAutos.size(); x++) {
                                    e.setNumeroChasis(arAutos.get(x).getNumeroChasis());
                                    e.setMarca(arAutos.get(x).getMarca());
                                    e.setEstilo(arAutos.get(x).getEstilo());
                                    e.setModelo(arAutos.get(x).getModelo());
                                    e.setColor(arAutos.get(x).getColor());
                                    e.setPrecio(arAutos.get(x).getPrecio());
                                    int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del chasis del auto que desea consultar: "));
                                    if (buscar == e.getNumeroChasis()) {
                                        JOptionPane.showMessageDialog(null, "Numero de chasis: "+e.getNumeroChasis()+"\n"+
                                                "Marca del auto: "+ e.getMarca()+"\n"+
                                                "Estilo del auto: "+ e.getEstilo()+"\n"+
                                                "Modelo del auto: "+ e.getModelo()+"\n"+
                                                "Precio del auto: "+ e.getPrecio());
                                        proximo = false;
                                    }else{
                                        JOptionPane.showMessageDialog(null, "No se pudo encontrar los datos que desea");
                                    }
                                    
                                }
                                VolverMenu = true;

                            }
                            if (opcion1 == 3) {
                                //MODIFICAR
                                int x;
                                boolean proximo = true;
                                for (x = 0; x < arAutos.size(); x++) {
                                    int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de chasis del auto que desea modificar: "));
                                            if (buscar == arAutos.get(x).getNumeroChasis()) {
                                                JOptionPane.showMessageDialog(null, "Numero de chasis: "+ arAutos.get(x).getNumeroChasis()+"\n"+
                                                        "Marca del auto: "+arAutos.get(x).getMarca()+ "\n"+
                                                        "Estilo del auto: "+ arAutos.get(x).getEstilo()+ "\n"+
                                                        "Modelo del auto: "+ arAutos.get(x).getModelo()+ " \n"+
                                                        "Precio del auto: "+ arAutos.get(x).getPrecio());
                                                arAutos.get(x).setNumeroChasis(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de chasis: ")));
                                                arAutos.get(x).setMarca(JOptionPane.showInputDialog("Ingrese la nueva marca del auto: "));
                                                arAutos.get(x).setEstilo(JOptionPane.showInputDialog("Ingrese el nuevo estilo del auto: "));
                                                arAutos.get(x).setModelo(JOptionPane.showInputDialog("Ingrese el nuevo modelo del auto: "));
                                                arAutos.get(x).setColor(JOptionPane.showInputDialog("Ingrese el nuevo color del auto: "));
                                                arAutos.get(x).setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio del auto: ")));
                                                JOptionPane.showMessageDialog(null, "Informacion actualizada");
                                                proximo = false;
                                            }else{
                                                JOptionPane.showMessageDialog(null, "Informacion no encontrada");
                                            }
                                                       
                                    }
                                VolverMenu = true;
                                    
                                }
                            if (opcion1 == 4) {
                                //ELIMINAR
                               int x;
                               boolean proximo = true;
                               AUTOS r = new AUTOS();
                               for ( x = 0; x< arAutos.size(); x++) {
                                    r.setNumeroChasis(arAutos.get(x).getNumeroChasis());
                                    r.setMarca(arAutos.get(x).getMarca());
                                    r.setEstilo(arAutos.get(x).getEstilo());
                                    r.setModelo(arAutos.get(x).getModelo());
                                    r.setColor(arAutos.get(x).getColor());
                                    r.setPrecio(arAutos.get(x).getNumeroChasis());
                                    int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de chasis del auto que desea eliminar"));
                                    if (buscar == r.getNumeroChasis()) {
                                        arAutos.remove(r);
                                        JOptionPane.showMessageDialog(null, "Informacion eliminada");
                                        proximo = false;
                                    
                                    } else { 
                                        JOptionPane.showMessageDialog(null,"Informacion no encontrada");
                                    }

                                }
                                VolverMenu = true;   
                                }
                            if (opcion1 == 5) {
                                break;
                                
                            }
                                
                            }
                              
                        
                    }
                    break;
                case 2:
                    boolean volverMenu = true;
                    while (volverMenu == true){
                        int opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "REGISTRO DE PERSONAS////" + "\n"+
                                    "1- Agregar una persona\n"+
                                    "2- Consultar una persona\n"+
                                    "3- Editar informacion de una persona\n"+
                                    "4- Eliminar una persona\n" +
                                    "5- Regresar el menu principal"));
                        if (opcion >= 1 && opcion2 <=4) {
                            if (opcion2 == 1) {
                                //AGREGAR
                                PERSONAS a = new PERSONAS();
                                a.setNumeroId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ID: ")));
                                a.setNombre(JOptionPane.showInputDialog("Ingrese el nombre de la persona: "));
                                a.setCorreo(JOptionPane.showInputDialog("Ingrese el correo de la persona: "));
                                a.setNumeroTel(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de telefono: ")));
                                arPersonas.add(a);
                                JOptionPane.showMessageDialog(null, "Numero de ID: " + a.getNumeroId()+ "\n"+ "Nombre: " + a.getNombre()+ "\n"+"Correo: " + a.getCorreo()+ "\n"+"Numero de telefono:" + a.getNumeroTel());
                                volverMenu = true; 
                            }
                            if (opcion2 ==2) {
                                //CONSULTAR
                                int x;
                                boolean proximo = true;
                                PERSONAS e = new PERSONAS();
                                for ( x = 0; x< arPersonas.size(); x++) {
                                    e.setNumeroId(arPersonas.get(x).getNumeroId());
                                    e.setNombre(arPersonas.get(x).getNombre());
                                    e.setCorreo(arPersonas.get(x).getCorreo());
                                    e.setNumeroTel(arPersonas.get(x).getNumeroTel());
                                    int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ID de la persona que desea consultar: "));
                                    if (buscar == e.getNumeroId()) {
                                        JOptionPane.showMessageDialog(null, "Numero de ID: "+e.getNumeroId()+"\n"+
                                                "Nombre: "+ e.getNombre()+"\n"+
                                                "Coreo: "+ e.getCorreo()+"\n"+
                                                "Numero de telefono: "+ e.getNumeroTel());
                                        proximo = false;
                                    }else{
                                        JOptionPane.showMessageDialog(null, "No se pudo encontrar los datos que desea");
                                    }
                                    
                                }
                                VolverMenu = true;

                            }
                            if (opcion2 == 3) {
                                //MODIFICAR
                                int x;
                                boolean proximo = true;
                                for (x = 0; x < arPersonas.size(); x++) {
                                    int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ID de la persona que desea modificar: "));
                                            if (buscar == arPersonas.get(x).getNumeroId()) {
                                                JOptionPane.showMessageDialog(null, "Numero de ID: "+ arPersonas.get(x).getNumeroId()+"\n"+
                                                        "Nombre: "+arPersonas.get(x).getNombre()+ "\n"+
                                                        "Correo "+ arPersonas.get(x).getCorreo()+ "\n"+
                                                        "Numero de telefono "+ arPersonas.get(x).getNumeroTel());
                                                arPersonas.get(x).setNumeroId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de ID: ")));
                                                arPersonas.get(x).setNombre(JOptionPane.showInputDialog("Ingrese el nuevo nombre: "));
                                                arPersonas.get(x).setCorreo(JOptionPane.showInputDialog("Ingrese el nuevo correo: "));
                                                arPersonas.get(x).setNumeroTel(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de telefono: "))); 
                                                JOptionPane.showMessageDialog(null, "Informacion actualizada");
                                                proximo = false;
                                            }else{
                                                JOptionPane.showMessageDialog(null, "Informacion no encontrada");
                                            }
                                                       
                                    }
                                volverMenu = true;
                                    
                                }
                            if (opcion2 == 4) {
                                //ELIMINAR
                               int x;
                               boolean proximo = true;
                               PERSONAS r = new PERSONAS();
                               for ( x = 0; x< arAutos.size(); x++) {
                                    r.setNumeroId(arPersonas.get(x).getNumeroId());
                                    r.setNombre(arPersonas.get(x).getNombre());
                                    r.setCorreo(arPersonas.get(x).getCorreo());
                                    r.setNumeroTel(arPersonas.get(x).getNumeroTel());
                                    int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ID de la persona que desea eliminar"));
                                    if (buscar == r.getNumeroId()) {
                                        arPersonas.remove(r.getNumeroId());
                                        arPersonas.remove(r.getNombre());
                                        arPersonas.remove(r.getCorreo());
                                        arPersonas.remove(r.getNumeroTel());
                                        JOptionPane.showMessageDialog(null, "Informacion eliminada");
                                        proximo = false;
                                    
                                    } else { 
                                        JOptionPane.showMessageDialog(null,"Informacion no encontrada");
                                    }

                                }
                                volverMenu = true;   
                                }
                                
                            }
                              
                        
                    }
                    break;
                 default:
                    throw new AssertionError();
            }
        
       } while (opcion >= 4);
        
    }
}

        