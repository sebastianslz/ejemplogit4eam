/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.universidad.vista.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JOptionPane;

import co.edu.eam.ingesoft.desarrollo.universidad.logica.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.definiciones.IDAOEstudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jdbc.DAOEstudianteJDBC;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.jpa.DAOEstudianteJPA;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.dao.implementacion.txt.DAOEstudianteTXT;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Docente;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Estudiante;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Profesion;
import co.edu.eam.ingesoft.desarrollo.universidad.vista.controladores.ControladorAdminEstudiante;




/**
 * 
 * @author dir_software
 */
public class VentanaAdminEstudiante extends javax.swing.JInternalFrame
		implements ActionListener {

	private ControladorAdminEstudiante controlador;
	private IDAOEstudiante dao;
	
	

	/**
	 * Creates new form VentanaAdminEstudiante
	 */
	public VentanaAdminEstudiante() {
		
		controlador = new ControladorAdminEstudiante();
		dao = new DAOEstudianteJPA();
		
		
		initComponents();
		setVisible(true);
		setMaximizable(false);
		setIconifiable(true);
		setClosable(true);
		setResizable(false);
		btnCrear.addActionListener(this);
		btnBuscar.addActionListener(this);
		brtnEditar.addActionListener(this);
		btnEliminar.addActionListener(this);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfCEdula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        tfApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        brtnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setMaximizable(true);
        setResizable(true);
        setTitle("Administrar Estudiantes");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/student6.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));

        jLabel6.setText("Telefono");

        jLabel2.setText("Nombre");

        jLabel1.setText("Cedula");

        jLabel5.setText("Direccion");

        jLabel4.setText("Correo Electronico");

        jLabel3.setText("Apellido");

        jLabel7.setText("Fecha Nacimiento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(25, 25, 25)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfCEdula)
                    .addComponent(tfNombre)
                    .addComponent(tfApellido)
                    .addComponent(tfCorreo)
                    .addComponent(tfDireccion)
                    .addComponent(tfTelefono)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCEdula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculation1.png"))); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom37.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        brtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pen38.png"))); // NOI18N

        btnEliminar.setText("ELIMINAR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(brtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(brtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brtnEditar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfApellido;
    private javax.swing.JTextField tfCEdula;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==brtnEditar){
			try {
			
				String cedula=tfCEdula.getText();
    			String apellido=tfApellido.getText();
    			String correo=tfCorreo.getText();
    			String direccion=tfDireccion.getText();
    			String nombre=tfNombre.getText();
    			String telefono=tfTelefono.getText();
    			Date fechaNacimiento=jDateChooser1.getDate();
    			
    			Estudiante est = new Estudiante(nombre, apellido, cedula, correo, direccion, telefono, fechaNacimiento);
    			controlador.editarEstudiante(est);
				
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
		}if(e.getSource()==btnEliminar){
			try{
				String cedula = tfCEdula.getText();
				
				Estudiante est = new Estudiante("", "", cedula, "", "", "", null);
				controlador.eliminarEstudiante(cedula);
			}catch(Exception e1){
    			e1.printStackTrace();
    		}
		}
		
		if(e.getSource()==btnBuscar){
			try {
				
				String cedula = tfCEdula.getText();
    			Estudiante est = controlador.buscarEstudiante(cedula);
	
    				tfApellido.setText(est.getApellido());
    				tfCorreo.setText(est.getCorreo());
    				tfDireccion.setText(est.getDireccion());
    				tfNombre.setText(est.getNombre());
    				tfTelefono.setText(est.getTelefono());
    				jDateChooser1.setDate(est.getFechaNacimiento());

    			}catch(ExcepcionNegocio e1){
    				JOptionPane.showMessageDialog(null, e1.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
    				e1.printStackTrace();
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Error","Error inesperado",JOptionPane.ERROR_MESSAGE);
				e2.printStackTrace();
			}
			
			
		}
		
		if(e.getSource()==btnCrear){
			try {
				
				String cedula=tfCEdula.getText();
    			String apellido=tfApellido.getText();
    			String correo=tfCorreo.getText();
    			String direccion=tfDireccion.getText();
    			String nombre=tfNombre.getText();
    			String telefono=tfTelefono.getText();
    			Date fechaNacimiento=jDateChooser1.getDate();
    			
    			Estudiante est = new Estudiante(nombre, apellido, cedula, correo, direccion, telefono, fechaNacimiento);
    			controlador.crearEstudiante(est);
    			JOptionPane.showMessageDialog(null, "Estudiante creado con �xito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
			
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
				ex.printStackTrace();
			}
			
		}
		
		

	}
}
