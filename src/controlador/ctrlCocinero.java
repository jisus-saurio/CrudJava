package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import modelo.AgregarCocinero;
import vista.AgrgarCocinero;

public class ctrlCocinero  implements MouseListener{
        //1-Mandar a llamar a las otras capas
    private AgregarCocinero modelo;
    private AgrgarCocinero vista;
 
 
       //2- crear el constructor 
    public ctrlCocinero(AgregarCocinero modelo, AgrgarCocinero vista){
        this.modelo = modelo;
        this.vista = vista;
        
        vista.btnAgregar.addMouseListener(this);
        modelo.Mostrar(vista.jtCocinero);
        vista.btnActualizar.addMouseListener(this);
        vista.jtCocinero.addMouseListener(this);
        vista.btnEliminar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource() == vista.btnAgregar){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
            modelo.setPeso(Integer.parseInt(vista.txtPeso.getText()));
            modelo.setCorreo(vista.txtCorreo.getText());

            
            modelo.GuardarCo();
            modelo.Mostrar(vista.jtCocinero);
        }
        
        if(e.getSource() == vista.btnEliminar){
            modelo.Eliminar(vista.jtCocinero);
            modelo.Mostrar(vista.jtCocinero);
        }
        
        if(e.getSource() == vista.jtCocinero){
            modelo.cargarDatosTabla(vista);
        }
        
        if(e.getSource() == vista.btnActualizar){
            modelo.setNombre(vista.txtNombre.getText());
            modelo.setEdad(Integer.parseInt(vista.txtEdad.getText()));
            modelo.setPeso(Integer.parseInt(vista.txtPeso.getText()));
            modelo.setCorreo(vista.txtCorreo.getText());

            
           modelo.Actualizar(vista.jtCocinero);
            modelo.Mostrar(vista.jtCocinero);
        }
    }
    

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
