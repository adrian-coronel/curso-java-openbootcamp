package javaBasico.EjercicioFINAL.view;

import javaBasico.EjercicioFINAL.dao.AlumnoDAO;
import javaBasico.EjercicioFINAL.entities.Alumno;
import javaBasico.EjercicioFINAL.interfaces.DaoCRUD;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class FormAlumnos {
    private JButton CALCULARButton;
    private JPanel MainAlumnos;
    private JTextField txtPromTeo;
    private JTextField txtPromLab;
    private JTextField txtPromFinal;
    private JList list1;
    private JTable table1;

    private Object[] row = new Object[6];
    private DaoCRUD alumnoDao = new AlumnoDAO();
    private HashMap<String,Alumno> alumnos = alumnoDao.reader();

    public FormAlumnos() {
        listarLista();

        CALCULARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = table1.getSelectedRow();
                int column = 0;
                String key = String.valueOf(table1.getValueAt(row,column));
                Alumno alumno = alumnos.get(key);
                txtPromTeo.setText(String.valueOf(alumno.getAverageTeoria()));
                txtPromLab.setText(String.valueOf(alumno.getAverageLaboratorio()));
                txtPromFinal.setText(String.valueOf(alumno.getFinalAverage()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FormAlumnos");
        frame.setContentPane(new FormAlumnos().MainAlumnos);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }



    public void listarLista(){
        DefaultListModel datos = new DefaultListModel(); //LISTA
        DefaultTableModel datosTabla = new DefaultTableModel(); //TABLA
        //COLUMNAS TABLA
        datosTabla.addColumn("Codigo");
        datosTabla.addColumn("Nombres");
        datosTabla.addColumn("Apellidos");
        datosTabla.addColumn("edad");
        datosTabla.addColumn("Nota Teo");
        datosTabla.addColumn("Nota Lab");
        for (Map.Entry<String, Alumno> element : alumnos.entrySet()){
            Alumno alumno = element.getValue();
            //FILAS TABLA
            row[0] = alumno.getCodigo();
            row[1] = alumno.getNombre();
            row[2] = alumno.getApellido();
            row[3] = alumno.getEdad();
            row[4] = alumno.getAverageTeoria();
            row[5] = alumno.getAverageLaboratorio();

            //LINEAS LISTA
            String cadenaDatos = alumno.getCodigo()+", "+alumno.getNombre()+", "+alumno.getApellido()+", "+
                                 alumno.getEdad()+", "+alumno.getAverageTeoria()+" "+alumno.getAverageLaboratorio();

            //AGREGANDO LOS DATOS
            datos.addElement(cadenaDatos);
            datosTabla.addRow(row);
        }
        //INGRESANDO EL MODELO
        list1.setModel(datos);
        table1.setModel(datosTabla);


    }


}
