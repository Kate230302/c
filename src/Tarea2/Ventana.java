package Tarea2;

import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import Tarea2.cEmpleado;

public class Ventana extends javax.swing.JFrame {

    // Creo mi objeto cSalario_Deducciones_Voluntarias al igual que un Arraylist para los elementos
    private static cSalario_Deducciones_Voluntarias elSalario;
    private static ArrayList<cSalario_Deducciones_Voluntarias> losSalarios;

    // Creo un modelo para mostrar datos en una tabla
    DefaultTableModel miTabla = new DefaultTableModel();
   

    public Ventana() {
        initComponents();
        // Instancio mi Arraylist para agregar elementos
        losSalarios = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CheckAsocia = new javax.swing.JCheckBox();
        CheckCoope = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jBAceptar = new javax.swing.JButton();
        jlSalario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSalario = new javax.swing.JFormattedTextField();
        jAhorro = new javax.swing.JFormattedTextField();
        jFotros = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Calculadora de Salarios");

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTabla);

        jBAceptar.setText("Agregar Salario a Lista");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        jlSalario.setText("ID del empleado:");

        jLabel1.setText("Asociación Solidarista 3% :");

        jLabel3.setText("Cooperativa 1 % :");

        jLabel4.setText("Porcentaje para Ahorro Navideño:");

        jLabel5.setText("Otros Rebajos:");

        jSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jAhorro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jFotros.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Totales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 13))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTextArea1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("%");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1149, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSalario)
                                .addGap(18, 18, 18)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(135, 135, 135)
                                .addComponent(jSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckAsocia)
                                    .addComponent(CheckCoope))
                                .addGap(189, 189, 189)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFotros, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)))
                                .addGap(90, 90, 90)
                                .addComponent(jBAceptar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlSalario)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jAhorro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jFotros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CheckAsocia)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckCoope)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jBAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        try {

            // Primero valido que el usuario no me deje el salario vacio
            if ("".equals(this.jSalario.getText())) {
                JOptionPane.showMessageDialog(null, "El Salario no puede quedar en blanco");;
                return;
            }
            
            // Mis variables de control
            double miSalario;
            int miAsocia;
            int miCoope;
            double miAhorro;
            double miRebajo;

            // Asigno el valor de mis componentes a mis variables de control
            miSalario = Double.parseDouble(jSalario.getText());
            if ("".equals(jAhorro.getText())) {
                miAhorro = 0;
            } else {
                miAhorro = Double.parseDouble(jAhorro.getText());
            }
            if ("".equals(jFotros.getText())) {
                miRebajo = 0;
            } else {
                miRebajo = Double.parseDouble(jFotros.getText());
            }
            if (CheckAsocia.isSelected()) {
                miAsocia = 1;
            } else {
                miAsocia = 0;
            }
            if (CheckCoope.isSelected()) {
                miCoope = 1;
            } else {
                miCoope = 0;
            }

            // Creo un objeto llamando a la clase respectiva y pasandole los parametros recien adquiridos
            elSalario = new cSalario_Deducciones_Voluntarias(miAsocia, miCoope, miAhorro, miRebajo, miSalario);

            // Lo agrego a mi lista tipo ArrayList declarado con anterioridad
            losSalarios.add(elSalario);

            // Creo una nueva instancia de Tabla para que no me este duplicando datos
            miTabla = new DefaultTableModel();
            // Establezco el nombre de las columnas que necesito para mi Tabla
            String[] columnas = {"Salario", "CCSS 5.5%", "Pension 4.17%", "Bco Pop 1%", "Imp Renta",
                "Asociacion 3%", "Coope 1%", "Ahorro Nav.", "Rebajo Extra", "Neto"};
            // Coloco los identificadores de Columna en mi modeloTabla
            miTabla.setColumnIdentifiers(columnas);
            // Establezco el modelo de la tabla identificada como jTabla con el modelo recien creado
            jTabla.setModel(miTabla);
           
            // Imprimo las lineas en mi tabla con el metodo addrow de DefaultTableModel
            losSalarios.forEach((listaSalario) -> {
                miTabla.addRow(new Object[]{
                    listaSalario.getMiSalario(),
                    listaSalario.ccss(),
                    listaSalario.pension(),
                    listaSalario.popular(),
                    listaSalario.renta(),
                    listaSalario.calculoAsocia(),
                    listaSalario.calculoCoope(),
                    listaSalario.calculoAhorro(),
                    listaSalario.getOtros(),
                    listaSalario.neto()
                });
            });
            
            // Llamo a mi metodo para imprimir un reporte final en mi area de texto
            miReporte();

            // Si todo salio bien se lo indico al usuario
            JOptionPane.showMessageDialog(null, "agregado exitosamente");

            // Limpio mis campos para siguientes datos
            jSalario.setText("");
            jAhorro.setText("");
            jFotros.setText("");
            CheckAsocia.setSelected(false);
            CheckCoope.setSelected(false);

        } catch (HeadlessException | NumberFormatException e) {
            // Si hubo un error se lo indico al usuario
            JOptionPane.showMessageDialog(null, "sucedio un error, intente de nuevo");
        }
    }//GEN-LAST:event_jBAceptarActionPerformed

    // Cambio las propiedades de mi area de texto para que no pueda ser editable
    private void jTextArea1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTextArea1PropertyChange
        jTextArea1.setEnabled(false);
    }//GEN-LAST:event_jTextArea1PropertyChange

    @SuppressWarnings("empty-statement")
    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        Formatter salariosRealizados = null;
        
        
        if ("".equals(this.id.getText())) {
                JOptionPane.showMessageDialog(null, "El ID del empleado no puede quedar en blanco");;
            }
        else{
            try {
                salariosRealizados = new Formatter("Escritorio.txt");
                salariosRealizados.format("%d","%s",id.getText(), "");
                     
               
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally{
                salariosRealizados.close();
            }
        }
    }//GEN-LAST:event_idActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckAsocia;
    private javax.swing.JCheckBox CheckCoope;
    private javax.swing.JTextField id;
    private javax.swing.JFormattedTextField jAhorro;
    private javax.swing.JButton jBAceptar;
    private javax.swing.JFormattedTextField jFotros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JFormattedTextField jSalario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlSalario;
    // End of variables declaration//GEN-END:variables

   // Metodo para obtener los detalles finales en la GUI 
    public void miReporte() {
        double totalBruto = 0;
        double totalCCSS = 0;
        double totalPension = 0;
        double totalBcoPop = 0;
        double totalRenta = 0;
        double totalAsociacion = 0;
        double totalCooperativa = 0;
        double totalAhorroNavidad = 0;
        double totalRebajo = 0;
        double totalNeto = 0;
        // Obtengo la cantidad de elementos de mi lista del metodo size de ArrayList
        int cantidad = losSalarios.size();
        double salarioMayor = 0;
        double salarioMenor = 999999999;

        // Recorro mi lista para obtener totales y calcular menor y mayor
        for (cSalario_Deducciones_Voluntarias listaSalario : losSalarios) {
            totalBruto += listaSalario.getMiSalario();
            totalCCSS += listaSalario.ccss();
            totalPension += listaSalario.pension();
            totalBcoPop += listaSalario.popular();
            totalRenta += listaSalario.renta();
            totalAsociacion += listaSalario.calculoAsocia();
            totalCooperativa += listaSalario.calculoCoope();
            totalAhorroNavidad += listaSalario.calculoAhorro();
            totalRebajo += listaSalario.getOtros();
            totalNeto += listaSalario.neto();
            // Mientras recorre la lista para impresion aprovecho para sacarle el mayor y menor elemento
            if (salarioMayor < listaSalario.getMiSalario()) {
                salarioMayor = listaSalario.getMiSalario();
            }
            if (salarioMenor > listaSalario.getMiSalario()) {
                salarioMenor = listaSalario.getMiSalario();
            }
        }
        
        // Calculo mi promedio
        double promedio = (totalBruto / cantidad);

        // Creo un string para meter todos los datos
        String datos = "Total Salarios Brutos: " + totalBruto + "\nCantidad de Salarios Ingresados: " + cantidad +
                "\nTotal CCSS: " + totalCCSS + "\nTotal Pension: " + totalPension + "\nTotal BcoPop: " + totalBcoPop + 
                "\nTotal Renta: " + totalRenta + "\nTotal Asociacion: " + totalAsociacion + "\nTotal Cooperativa: " +
                totalCooperativa + "\nTotal Ahorro Navidad: " + totalAhorroNavidad + "\nTotal Otros Rebajos: " +
                totalRebajo + "\nTotal Salarios Netos: " + totalNeto + "\nPromedio Salarios Brutos: " + 
                promedio + "\nSalario Mayor: " + salarioMayor + "\nSalario Menor: " + salarioMenor;
        
        // Paso todos los datos a mi TextArea
        jTextArea1.setText(datos);

    }

}
