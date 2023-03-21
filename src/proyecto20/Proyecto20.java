
package proyecto20;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Proyecto20 {

    
    public static void main(String[] args) {
        ArrayList<AUTOS> arAutos = new ArrayList();
        ArrayList<PERSONAS> arPersonas = new ArrayList();
        JOptionPane.showMessageDialog(null, "Bienvenido al inventario de vehiculos");
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU//// INVENTARIO DE VEHICULOS "+ "\n"+ "1- Registro de autos" + "\n"+
                "2- Registro de usuarios" + "\n" + "3- Registro de venta")); 
        do {            
            if (opcion == 1) {
                int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("MENU////REGISTRO DE AUTOS"+ "\n" + "1- Registro de un nuevo auto" + "\n"+
                        "2- Consultar un auto" + "\n" + "3- Editar informacion de un auto" + "\n" + "4- Eliminar un auto"));
                boolean volverMenu = true;
                while (volverMenu == true) {
                     }
                if (opcion1 == 1) {
                    AUTOS a = new AUTOS();
                    a.setNumeroChasis(JOptionPane.showInputDialog("Ingrese el numero de chasis: "));
                    a.setMarca(JOptionPane.showInputDialog("Ingrese la marca del auto: "));
                    a.setEstilo(JOptionPane.showInputDialog("Ingrese el estilo del auto: "));
                    a.setModelo(JOptionPane.showInputDialog("Ingrese el modelo del auto: "));
                    a.setColor(JOptionPane.showInputDialog("Ingrese el color del auto: "));
                    a.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del auto: ")));
                    arAutos.add(a);
                    JOptionPane.showMessageDialog(null, "Numero de chasis: " + a.getNumeroChasis()+ "\n"+ "Marca del auto" + a.getMarca()+ "\n"+"Estilo del auto: " + a.getEstilo()+ "\n"+"Modelo del auto: " + a.getModelo()+ "\n"+
                            "Color del auto: " + a.getColor()+ "\n"+"Precio del auto: " + a.getPrecio()+ "\n");
                    volverMenu = false;
                }
                if (opcion1 == 2) {
                    int i;
                    for ( i = 0; i < arAutos.size(); i++) {
                        int buscar = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el numero de chasis: "));
                        if (buscar == arAutos.get(i).getNumeroChasis()) {
                            
                            
                        }
                        
                        
                        
                        
                    }
                    
                    
                }     
                
               
            }
            if (opcion == 2) {
                int opcion2 = Integer.parseInt(JOptionPane.showInputDialog("MENU////REGISTRO DE USUARIOS"+ "\n" + "1- Registro de un nuevo usuario" + "\n"+
                        "2- Consultar un usuario" + "\n" + "3- Editar informacion de un usuario" + "\n" + "4- Eliminar un usuario"));
            }
            if (opcion == 3) {
                int opcion3 = Integer.parseInt(JOptionPane.showInputDialog("MENU////REGISTRO DE AUTOS"+ "\n" + "1- Registro de una nueva venta" + "\n"+
                        "2- Consultar una venta" + "\n" + "3- Editar informacion de una venta" + "\n" + "4- Eliminar una venta"));
                
            }
            if (opcion == 4) {
                JOptionPane.showMessageDialog(null, "Gracias por elegirnos");
            }
                
        } while (opcion >= 4);
    }   
}                
  
   
    

