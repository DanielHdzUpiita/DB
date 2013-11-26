package pantallas.de.bd;

import DB.Generica;
import DB.VistaPrendas;
import DB.VistaPrendasConjunto;
import ObjetosDB.ConexionBD;
import Tablas.ModeloTabla1;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Administrador extends javax.swing.JFrame {
    ConexionBD con = new ConexionBD();
    ModeloTabla1 modeloEditarArticulo = new ModeloTabla1(new String[] {"Tipo de Prenda","Genero","Color","Tela","Marca","Talla","Cantidad","Precio","Costo","Eliminar"});
    ModeloTabla1 modeloCrearConjunto = new ModeloTabla1(new String[] {"Tipo de Prenda","Color","Tela","Marca","Talla","Eliminar"});
    
    public Administrador() {
        con.iniciar();
        initComponents();
        iniciarEscolar(0,"","");
        iniciarConjunto();
        La_AD_AA_Error.setVisible(false);
        Ch_AD_EA_Color.setEnabled(false);
        Bu_AD_EA_Edita.setVisible(false);
        Bu_AD_EA_Cance.setVisible(false);
        Bu_AD_EA_Elimi.setVisible(false);
        LimpiarTicks();
    }
    
    public void LimpiarTicks (){
        La_AD_AA_Tick1.setVisible(false);
        La_AD_AA_Tick2.setVisible(false);
        La_AD_AA_Tick3.setVisible(false);
        La_AD_AA_Tick4.setVisible(false);
        La_AD_AA_Tick5.setVisible(false);
        La_AD_AA_Tick6.setVisible(false);
        La_AD_AA_Tick7.setVisible(false);
        La_AD_AA_Tick8.setVisible(false);
    }
    public void iniciarEscolar(int genero, String TPren, String Color)
    {
        try {
            String query= "";
            if(!TPren.equals("") && !Color.equals("")){
                query = " where Tipo_de_prenda ='"+TPren+"' and Color = '"+Color+"'";
            }else if (!TPren.equals(""))
            {
                query = " where Tipo_de_prenda = '"+TPren+"'";
            }
            else if (!Color.equals("")){
                query = " where Color = '"+Color+"'";
            }
            if(TPren.equals("")){
                Ch_AD_EA_TPren.removeAll();
                Ch_AD_EA_TPren.add("");
            }
            if(Color.equals("")){
                Ch_AD_EA_Color.removeAll();
                Ch_AD_EA_Color.add("");
            }
            if(genero == 0)
                con.consultar("SELECT * FROM prendas "+query);
            else{
                String gen="";
                if(genero == 1){
                    gen = "'Escolar'";
                }
                else if(genero == 2){
                    gen = "'De Vestir'";
                }
                if(!query.equals(""))
                {
                    con.consultar("SELECT * FROM prendas "+query+" and genero="+gen);
                }
                else
                {
                    con.consultar("SELECT * FROM prendas where genero = "+gen);
                }
            }
            ResultSet rsPrenda = con.resultado;
            ArrayList<VistaPrendas> pren = new ArrayList<>();
            while(rsPrenda.next())
            {
                VistaPrendas aux = new VistaPrendas();
                aux.tipoPrenda = rsPrenda.getString("Tipo_de_Prenda");
                aux.color = rsPrenda.getString("Color");
                pren.add(aux);
            }
            int cont = 0,flag1 =0,flag2 = 0;
            for(VistaPrendas p : pren){
                // Para el choice de Tipo de prenda
                if(TPren.equals("")){
                    for(int tpcont=0;tpcont<=cont;tpcont++){
                        flag1 = 0;
                        if(Ch_AD_EA_TPren.getItemCount() == tpcont){
                            break;
                        }
                        if(Ch_AD_EA_TPren.getItem(tpcont).equals(p.tipoPrenda)){
                            flag1 = 1;
                            break;
                        }
                    }
                    if(flag1 == 0){
                        Ch_AD_EA_TPren.add(p.tipoPrenda);
                    }
                }
                // Para el choice de color
                if(Color.equals("")){
                    for(int colcont=0;colcont<=cont;colcont++){
                        flag2 = 0;
                        if(Ch_AD_EA_Color.getItemCount() == colcont){
                            break;
                        }
                        if(Ch_AD_EA_Color.getItem(colcont).equals(p.color)){
                            flag2 = 1;
                            break;
                        }
                    }
                    if(flag2 == 0){
                        Ch_AD_EA_Color.add(p.color);
                    }
                }
                cont = cont + 1;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Vendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void iniciarConjunto()
    {
        try {
            ArrayList<VistaPrendas> pren = consultar("Genero = 'Escolar'");
            choice1.add("");
            String check = "";
            for(VistaPrendas p : pren){
                if(!check.contains(p.tipoPrenda)){
                    choice1.add(p.tipoPrenda);
                    check += p.tipoPrenda;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Vendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getDatos(){
        String nEscuela = TF_AD_FC_NEscu.getText();
        String tUniforme = TF_AD_FC_TUnif.getText();
        String talla = TF_AD_FC_TConj.getText();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelAñadirArticulo = new javax.swing.JPanel();
        La_AD_AA_TPren = new javax.swing.JLabel();
        La_AD_AA_Color = new javax.swing.JLabel();
        La_AD_AA_Tela = new javax.swing.JLabel();
        La_AD_AA_Marca = new javax.swing.JLabel();
        La_AD_AA_Talla = new javax.swing.JLabel();
        La_AD_AA_Costo = new javax.swing.JLabel();
        La_AD_AA_Preci = new javax.swing.JLabel();
        La_AD_AA_Gener = new javax.swing.JLabel();
        La_AD_AA_Canti = new javax.swing.JLabel();
        La_AD_AA_Error = new javax.swing.JLabel();
        La_AD_AA_Tick1 = new javax.swing.JLabel();
        La_AD_AA_Tick2 = new javax.swing.JLabel();
        La_AD_AA_Tick3 = new javax.swing.JLabel();
        La_AD_AA_Tick4 = new javax.swing.JLabel();
        La_AD_AA_Tick5 = new javax.swing.JLabel();
        La_AD_AA_Tick6 = new javax.swing.JLabel();
        La_AD_AA_Tick7 = new javax.swing.JLabel();
        La_AD_AA_Tick8 = new javax.swing.JLabel();
        Bu_AD_AA_AaCat = new javax.swing.JButton();
        TF_AD_AA_TPren = new javax.swing.JTextField();
        TF_AD_AA_Color = new javax.swing.JTextField();
        TF_AD_AA_Tela = new javax.swing.JTextField();
        TF_AD_AA_Marca = new javax.swing.JTextField();
        TF_AD_AA_Talla = new javax.swing.JTextField();
        TF_AD_AA_Costo = new javax.swing.JTextField();
        TF_AD_AA_Preci = new javax.swing.JTextField();
        TF_AD_AA_Canti = new javax.swing.JTextField();
        CB_AD_AA_Gener = new javax.swing.JComboBox();
        PanelFormarConjunto = new javax.swing.JPanel();
        La_AD_FC_NEscu = new javax.swing.JLabel();
        La_AD_FC_TUnif = new javax.swing.JLabel();
        La_AD_FC_TConj = new javax.swing.JLabel();
        La_AD_FC_TPren = new javax.swing.JLabel();
        La_AD_FC_Color = new javax.swing.JLabel();
        La_AD_FC_Talla = new javax.swing.JLabel();
        La_AD_FC_Tela = new javax.swing.JLabel();
        La_AD_FC_Marca = new javax.swing.JLabel();
        La_AD_FC_AConj = new javax.swing.JLabel();
        La_AD_FC_PTota = new javax.swing.JLabel();
        TF_AD_FC_NEscu = new javax.swing.JTextField();
        TF_AD_FC_TUnif = new javax.swing.JTextField();
        TF_AD_FC_TConj = new javax.swing.JTextField();
        TF_AD_FC_PTota = new javax.swing.JTextField();
        SP_AD_FC_AConj = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Bu_AD_FC_AArti = new javax.swing.JButton();
        Bu_AD_FC_QArti = new javax.swing.JButton();
        Bu_AD_FC_AConj = new javax.swing.JButton();
        choice1 = new java.awt.Choice();
        choice2 = new java.awt.Choice();
        choice3 = new java.awt.Choice();
        choice4 = new java.awt.Choice();
        choice5 = new java.awt.Choice();
        PanelEditarArticulo = new javax.swing.JPanel();
        La_AD_EA_Gener = new javax.swing.JLabel();
        La_AD_EA_TPren = new javax.swing.JLabel();
        La_AD_EA_Color = new javax.swing.JLabel();
        CB_AD_EA_Gener = new javax.swing.JComboBox();
        Ch_AD_EA_TPren = new java.awt.Choice();
        Ch_AD_EA_Color = new java.awt.Choice();
        Bu_AD_EA_Busca = new javax.swing.JButton();
        Bu_AD_EA_Edita = new javax.swing.JButton();
        Bu_AD_EA_Cance = new javax.swing.JButton();
        Bu_AD_EA_Elimi = new javax.swing.JButton();
        SP_AD_EA_Tabla = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        PanelProveedores = new javax.swing.JPanel();
        PanelCerrarSesion = new javax.swing.JPanel();
        PanelCerrarSesionInterno = new javax.swing.JPanel();
        La_AD_CS_NUsua = new javax.swing.JLabel();
        La_AD_CS_Usuario = new javax.swing.JLabel();
        La_AD_CS_Categ = new javax.swing.JLabel();
        La_AD_CS_ADMON = new javax.swing.JLabel();
        La_AD_CS_FRegi = new javax.swing.JLabel();
        La_AD_CS_Regis = new javax.swing.JLabel();
        Bu_AD_CS_CSesi = new javax.swing.JButton();
        PanelUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        choice22 = new java.awt.Choice();
        jButton5 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        TF_AD_FC_NEscu2 = new javax.swing.JTextField();
        TF_AD_FC_NEscu3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setBounds(new java.awt.Rectangle(325, 50, 0, 0));
        setMinimumSize(new java.awt.Dimension(700, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(390, 506));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(390, 506));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(373, 473));

        PanelAñadirArticulo.setMaximumSize(new java.awt.Dimension(385, 512));
        PanelAñadirArticulo.setMinimumSize(new java.awt.Dimension(385, 512));
        PanelAñadirArticulo.setPreferredSize(new java.awt.Dimension(385, 512));
        PanelAñadirArticulo.setLayout(null);

        La_AD_AA_TPren.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_AA_TPren.setText("Tipo de Prenda");
        PanelAñadirArticulo.add(La_AD_AA_TPren);
        La_AD_AA_TPren.setBounds(155, 70, 116, 29);

        La_AD_AA_Color.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_AA_Color.setText("Color");
        PanelAñadirArticulo.add(La_AD_AA_Color);
        La_AD_AA_Color.setBounds(155, 111, 40, 29);

        La_AD_AA_Tela.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_AA_Tela.setText("Tela");
        PanelAñadirArticulo.add(La_AD_AA_Tela);
        La_AD_AA_Tela.setBounds(155, 152, 35, 29);

        La_AD_AA_Marca.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_AA_Marca.setText("Marca");
        PanelAñadirArticulo.add(La_AD_AA_Marca);
        La_AD_AA_Marca.setBounds(155, 193, 56, 29);

        La_AD_AA_Talla.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_AA_Talla.setText("Talla");
        PanelAñadirArticulo.add(La_AD_AA_Talla);
        La_AD_AA_Talla.setBounds(155, 234, 44, 29);

        La_AD_AA_Costo.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_AA_Costo.setText("Costo");
        PanelAñadirArticulo.add(La_AD_AA_Costo);
        La_AD_AA_Costo.setBounds(155, 275, 41, 29);

        La_AD_AA_Preci.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_AA_Preci.setText("Precio");
        PanelAñadirArticulo.add(La_AD_AA_Preci);
        La_AD_AA_Preci.setBounds(155, 316, 46, 29);

        La_AD_AA_Gener.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_AA_Gener.setText("Genero");
        La_AD_AA_Gener.setToolTipText("");
        PanelAñadirArticulo.add(La_AD_AA_Gener);
        La_AD_AA_Gener.setBounds(155, 350, 51, 29);

        La_AD_AA_Canti.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_AA_Canti.setText("Cantidad");
        La_AD_AA_Canti.setToolTipText("");
        PanelAñadirArticulo.add(La_AD_AA_Canti);
        La_AD_AA_Canti.setBounds(330, 350, 73, 29);

        La_AD_AA_Error.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        La_AD_AA_Error.setForeground(new java.awt.Color(255, 0, 0));
        La_AD_AA_Error.setText("Error, los campos no pueden estar vacios");
        PanelAñadirArticulo.add(La_AD_AA_Error);
        La_AD_AA_Error.setBounds(195, 425, 250, 17);

        La_AD_AA_Tick1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tick.png"))); // NOI18N
        PanelAñadirArticulo.add(La_AD_AA_Tick1);
        La_AD_AA_Tick1.setBounds(500, 70, 29, 29);

        La_AD_AA_Tick2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tick.png"))); // NOI18N
        PanelAñadirArticulo.add(La_AD_AA_Tick2);
        La_AD_AA_Tick2.setBounds(500, 110, 29, 29);

        La_AD_AA_Tick3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tick.png"))); // NOI18N
        PanelAñadirArticulo.add(La_AD_AA_Tick3);
        La_AD_AA_Tick3.setBounds(500, 150, 29, 29);

        La_AD_AA_Tick4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tick.png"))); // NOI18N
        PanelAñadirArticulo.add(La_AD_AA_Tick4);
        La_AD_AA_Tick4.setBounds(500, 190, 29, 29);

        La_AD_AA_Tick5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tick.png"))); // NOI18N
        PanelAñadirArticulo.add(La_AD_AA_Tick5);
        La_AD_AA_Tick5.setBounds(500, 230, 29, 29);

        La_AD_AA_Tick6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tick.png"))); // NOI18N
        PanelAñadirArticulo.add(La_AD_AA_Tick6);
        La_AD_AA_Tick6.setBounds(500, 270, 29, 29);

        La_AD_AA_Tick7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tick.png"))); // NOI18N
        PanelAñadirArticulo.add(La_AD_AA_Tick7);
        La_AD_AA_Tick7.setBounds(500, 310, 29, 29);

        La_AD_AA_Tick8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tick.png"))); // NOI18N
        PanelAñadirArticulo.add(La_AD_AA_Tick8);
        La_AD_AA_Tick8.setBounds(500, 350, 29, 29);

        Bu_AD_AA_AaCat.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_AD_AA_AaCat.setForeground(new java.awt.Color(255, 0, 0));
        Bu_AD_AA_AaCat.setText("Añadir al Catalogo");
        Bu_AD_AA_AaCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bu_AD_AA_AaCatActionPerformed(evt);
            }
        });
        PanelAñadirArticulo.add(Bu_AD_AA_AaCat);
        Bu_AD_AA_AaCat.setBounds(230, 390, 179, 27);

        TF_AD_AA_TPren.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_AD_AA_TPrenFocusLost(evt);
            }
        });
        PanelAñadirArticulo.add(TF_AD_AA_TPren);
        TF_AD_AA_TPren.setBounds(330, 70, 150, 30);

        TF_AD_AA_Color.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_AD_AA_ColorFocusLost(evt);
            }
        });
        PanelAñadirArticulo.add(TF_AD_AA_Color);
        TF_AD_AA_Color.setBounds(330, 110, 150, 30);

        TF_AD_AA_Tela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_AD_AA_TelaFocusLost(evt);
            }
        });
        PanelAñadirArticulo.add(TF_AD_AA_Tela);
        TF_AD_AA_Tela.setBounds(330, 150, 150, 30);

        TF_AD_AA_Marca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_AD_AA_MarcaFocusLost(evt);
            }
        });
        PanelAñadirArticulo.add(TF_AD_AA_Marca);
        TF_AD_AA_Marca.setBounds(330, 190, 150, 30);

        TF_AD_AA_Talla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_AD_AA_TallaFocusLost(evt);
            }
        });
        PanelAñadirArticulo.add(TF_AD_AA_Talla);
        TF_AD_AA_Talla.setBounds(330, 230, 150, 30);

        TF_AD_AA_Costo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_AD_AA_CostoFocusLost(evt);
            }
        });
        PanelAñadirArticulo.add(TF_AD_AA_Costo);
        TF_AD_AA_Costo.setBounds(330, 270, 150, 30);

        TF_AD_AA_Preci.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_AD_AA_PreciFocusLost(evt);
            }
        });
        PanelAñadirArticulo.add(TF_AD_AA_Preci);
        TF_AD_AA_Preci.setBounds(330, 310, 150, 30);

        TF_AD_AA_Canti.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TF_AD_AA_CantiFocusLost(evt);
            }
        });
        PanelAñadirArticulo.add(TF_AD_AA_Canti);
        TF_AD_AA_Canti.setBounds(410, 350, 75, 30);

        CB_AD_AA_Gener.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Escolar", "De Vestir" }));
        PanelAñadirArticulo.add(CB_AD_AA_Gener);
        CB_AD_AA_Gener.setBounds(220, 350, 90, 25);

        jTabbedPane1.addTab("Añadir Articulo", PanelAñadirArticulo);

        PanelFormarConjunto.setLayout(null);

        La_AD_FC_NEscu.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_FC_NEscu.setText("Nombre de la escuela");
        PanelFormarConjunto.add(La_AD_FC_NEscu);
        La_AD_FC_NEscu.setBounds(130, 40, 158, 29);

        La_AD_FC_TUnif.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_FC_TUnif.setText("Tipo de Uniforme");
        PanelFormarConjunto.add(La_AD_FC_TUnif);
        La_AD_FC_TUnif.setBounds(130, 81, 135, 29);

        La_AD_FC_TConj.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_FC_TConj.setText("Talla del conjunto");
        PanelFormarConjunto.add(La_AD_FC_TConj);
        La_AD_FC_TConj.setBounds(130, 122, 137, 29);

        La_AD_FC_TPren.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        La_AD_FC_TPren.setText("Tipo de prenda");
        PanelFormarConjunto.add(La_AD_FC_TPren);
        La_AD_FC_TPren.setBounds(25, 169, 98, 13);

        La_AD_FC_Color.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        La_AD_FC_Color.setText("Color");
        PanelFormarConjunto.add(La_AD_FC_Color);
        La_AD_FC_Color.setBounds(155, 169, 35, 13);

        La_AD_FC_Talla.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        La_AD_FC_Talla.setText("Talla");
        PanelFormarConjunto.add(La_AD_FC_Talla);
        La_AD_FC_Talla.setBounds(285, 169, 35, 13);

        La_AD_FC_Tela.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        La_AD_FC_Tela.setText("Tela");
        PanelFormarConjunto.add(La_AD_FC_Tela);
        La_AD_FC_Tela.setBounds(415, 169, 28, 13);

        La_AD_FC_Marca.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        La_AD_FC_Marca.setText("Marca");
        PanelFormarConjunto.add(La_AD_FC_Marca);
        La_AD_FC_Marca.setBounds(545, 169, 35, 13);

        La_AD_FC_AConj.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_FC_AConj.setText("Articulos del Conjunto");
        PanelFormarConjunto.add(La_AD_FC_AConj);
        La_AD_FC_AConj.setBounds(30, 250, 170, 29);

        La_AD_FC_PTota.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_FC_PTota.setText("Precio Total");
        La_AD_FC_PTota.setEnabled(false);
        La_AD_FC_PTota.setOpaque(true);
        PanelFormarConjunto.add(La_AD_FC_PTota);
        La_AD_FC_PTota.setBounds(278, 485, 100, 29);
        PanelFormarConjunto.add(TF_AD_FC_NEscu);
        TF_AD_FC_NEscu.setBounds(298, 40, 157, 25);
        PanelFormarConjunto.add(TF_AD_FC_TUnif);
        TF_AD_FC_TUnif.setBounds(298, 81, 157, 25);
        PanelFormarConjunto.add(TF_AD_FC_TConj);
        TF_AD_FC_TConj.setBounds(298, 122, 157, 25);

        TF_AD_FC_PTota.setEnabled(false);
        PanelFormarConjunto.add(TF_AD_FC_PTota);
        TF_AD_FC_PTota.setBounds(396, 485, 70, 25);

        jTable2.setModel(modeloCrearConjunto);
        SP_AD_FC_AConj.setViewportView(jTable2);

        PanelFormarConjunto.add(SP_AD_FC_AConj);
        SP_AD_FC_AConj.setBounds(30, 280, 630, 180);

        Bu_AD_FC_AArti.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_AD_FC_AArti.setForeground(new java.awt.Color(255, 0, 0));
        Bu_AD_FC_AArti.setText("Agregar Articulo");
        Bu_AD_FC_AArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bu_AD_FC_AArtiActionPerformed(evt);
            }
        });
        PanelFormarConjunto.add(Bu_AD_FC_AArti);
        Bu_AD_FC_AArti.setBounds(490, 220, 167, 27);

        Bu_AD_FC_QArti.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_AD_FC_QArti.setForeground(new java.awt.Color(255, 0, 0));
        Bu_AD_FC_QArti.setText("Quitar Articulo");
        Bu_AD_FC_QArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bu_AD_FC_QArtiActionPerformed(evt);
            }
        });
        PanelFormarConjunto.add(Bu_AD_FC_QArti);
        Bu_AD_FC_QArti.setBounds(50, 480, 157, 27);

        Bu_AD_FC_AConj.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_AD_FC_AConj.setForeground(new java.awt.Color(255, 0, 0));
        Bu_AD_FC_AConj.setText("Agregar Conjunto");
        Bu_AD_FC_AConj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bu_AD_FC_AConjActionPerformed(evt);
            }
        });
        PanelFormarConjunto.add(Bu_AD_FC_AConj);
        Bu_AD_FC_AConj.setBounds(490, 480, 171, 27);

        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });
        choice1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                choice1PropertyChange(evt);
            }
        });
        PanelFormarConjunto.add(choice1);
        choice1.setBounds(30, 190, 120, 20);

        choice2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice2ItemStateChanged(evt);
            }
        });
        PanelFormarConjunto.add(choice2);
        choice2.setBounds(160, 190, 120, 20);

        choice3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice3ItemStateChanged(evt);
            }
        });
        PanelFormarConjunto.add(choice3);
        choice3.setBounds(290, 190, 120, 20);

        choice4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice4ItemStateChanged(evt);
            }
        });
        PanelFormarConjunto.add(choice4);
        choice4.setBounds(420, 190, 120, 20);
        PanelFormarConjunto.add(choice5);
        choice5.setBounds(550, 190, 110, 20);

        jTabbedPane1.addTab("Formar Conjunto", PanelFormarConjunto);

        PanelEditarArticulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        La_AD_EA_Gener.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_EA_Gener.setText("Genero");
        La_AD_EA_Gener.setToolTipText("");
        PanelEditarArticulo.add(La_AD_EA_Gener, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        La_AD_EA_TPren.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_EA_TPren.setText("Tipo de Prenda");
        PanelEditarArticulo.add(La_AD_EA_TPren, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 111, -1, -1));

        La_AD_EA_Color.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_EA_Color.setText("Color");
        PanelEditarArticulo.add(La_AD_EA_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 152, -1, -1));

        CB_AD_EA_Gener.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Escolar", "De Vestir" }));
        CB_AD_EA_Gener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_AD_EA_GenerActionPerformed(evt);
            }
        });
        PanelEditarArticulo.add(CB_AD_EA_Gener, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 70, -1, -1));

        Ch_AD_EA_TPren.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ch_AD_EA_TPrenItemStateChanged(evt);
            }
        });
        PanelEditarArticulo.add(Ch_AD_EA_TPren, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 111, 150, -1));

        Ch_AD_EA_Color.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ch_AD_EA_ColorItemStateChanged(evt);
            }
        });
        PanelEditarArticulo.add(Ch_AD_EA_Color, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 152, 150, 29));

        Bu_AD_EA_Busca.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_AD_EA_Busca.setForeground(new java.awt.Color(255, 0, 0));
        Bu_AD_EA_Busca.setText("Buscar");
        Bu_AD_EA_Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bu_AD_EA_BuscaActionPerformed(evt);
            }
        });
        PanelEditarArticulo.add(Bu_AD_EA_Busca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        Bu_AD_EA_Edita.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_AD_EA_Edita.setForeground(new java.awt.Color(255, 0, 0));
        Bu_AD_EA_Edita.setText("Editar");
        PanelEditarArticulo.add(Bu_AD_EA_Edita, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 450, -1, -1));

        Bu_AD_EA_Cance.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_AD_EA_Cance.setForeground(new java.awt.Color(255, 0, 0));
        Bu_AD_EA_Cance.setText("Cancelar");
        Bu_AD_EA_Cance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bu_AD_EA_CanceActionPerformed(evt);
            }
        });
        PanelEditarArticulo.add(Bu_AD_EA_Cance, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        Bu_AD_EA_Elimi.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_AD_EA_Elimi.setForeground(new java.awt.Color(255, 0, 0));
        Bu_AD_EA_Elimi.setText("Eliminar");
        Bu_AD_EA_Elimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bu_AD_EA_ElimiActionPerformed(evt);
            }
        });
        PanelEditarArticulo.add(Bu_AD_EA_Elimi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));

        jTable3.setModel(modeloEditarArticulo);
        jTable3.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable3PropertyChange(evt);
            }
        });
        SP_AD_EA_Tabla.setViewportView(jTable3);

        PanelEditarArticulo.add(SP_AD_EA_Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 650, 200));

        jTabbedPane1.addTab("Editar Articulo", PanelEditarArticulo);

        javax.swing.GroupLayout PanelProveedoresLayout = new javax.swing.GroupLayout(PanelProveedores);
        PanelProveedores.setLayout(PanelProveedoresLayout);
        PanelProveedoresLayout.setHorizontalGroup(
            PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
        );
        PanelProveedoresLayout.setVerticalGroup(
            PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Proveedores", PanelProveedores);

        PanelCerrarSesion.setBackground(new java.awt.Color(205, 218, 230));
        PanelCerrarSesion.setLayout(null);

        La_AD_CS_NUsua.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_CS_NUsua.setText("Nombre del Usuario: ");

        La_AD_CS_Usuario.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_CS_Usuario.setText("Son Goku");

        La_AD_CS_Categ.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_CS_Categ.setText("Categoria:");

        La_AD_CS_ADMON.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_CS_ADMON.setText("Administrador");

        La_AD_CS_FRegi.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_CS_FRegi.setText("Fecha de Registro:");

        La_AD_CS_Regis.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_AD_CS_Regis.setText("01/01/2012");

        Bu_AD_CS_CSesi.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_AD_CS_CSesi.setForeground(new java.awt.Color(255, 0, 0));
        Bu_AD_CS_CSesi.setText("Cerrar Cesion");
        Bu_AD_CS_CSesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bu_AD_CS_CSesiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCerrarSesionInternoLayout = new javax.swing.GroupLayout(PanelCerrarSesionInterno);
        PanelCerrarSesionInterno.setLayout(PanelCerrarSesionInternoLayout);
        PanelCerrarSesionInternoLayout.setHorizontalGroup(
            PanelCerrarSesionInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCerrarSesionInternoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(La_AD_CS_NUsua))
            .addGroup(PanelCerrarSesionInternoLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(La_AD_CS_Usuario))
            .addGroup(PanelCerrarSesionInternoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(La_AD_CS_Categ)
                .addGap(10, 10, 10)
                .addComponent(La_AD_CS_ADMON))
            .addGroup(PanelCerrarSesionInternoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(La_AD_CS_FRegi)
                .addGap(19, 19, 19)
                .addComponent(La_AD_CS_Regis))
            .addGroup(PanelCerrarSesionInternoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Bu_AD_CS_CSesi))
        );
        PanelCerrarSesionInternoLayout.setVerticalGroup(
            PanelCerrarSesionInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCerrarSesionInternoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(La_AD_CS_NUsua)
                .addGap(10, 10, 10)
                .addComponent(La_AD_CS_Usuario)
                .addGap(30, 30, 30)
                .addGroup(PanelCerrarSesionInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(La_AD_CS_Categ)
                    .addComponent(La_AD_CS_ADMON))
                .addGap(30, 30, 30)
                .addGroup(PanelCerrarSesionInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(La_AD_CS_FRegi)
                    .addComponent(La_AD_CS_Regis))
                .addGap(14, 14, 14)
                .addComponent(Bu_AD_CS_CSesi))
        );

        PanelCerrarSesion.add(PanelCerrarSesionInterno);
        PanelCerrarSesionInterno.setBounds(200, 130, 270, 270);

        jTabbedPane1.addTab("Cerrar Sesion", PanelCerrarSesion);

        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");

        jButton5.setText("Agregar Usuario");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton11.setText("jButton11");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel45.setText("Password:");

        jLabel46.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel46.setText("Privilegio");

        jLabel47.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel47.setText("Nombre:");
        jLabel47.setToolTipText("");

        javax.swing.GroupLayout PanelUsuariosLayout = new javax.swing.GroupLayout(PanelUsuarios);
        PanelUsuarios.setLayout(PanelUsuariosLayout);
        PanelUsuariosLayout.setHorizontalGroup(
            PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuariosLayout.createSequentialGroup()
                .addContainerGap(27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuariosLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuariosLayout.createSequentialGroup()
                        .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                            .addGroup(PanelUsuariosLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(29, 29, 29)
                                .addComponent(jButton11)))
                        .addGap(24, 24, 24))))
            .addGroup(PanelUsuariosLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45)
                    .addComponent(jLabel47))
                .addGap(29, 29, 29)
                .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_AD_FC_NEscu3)
                    .addComponent(TF_AD_FC_NEscu2)
                    .addComponent(choice22, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelUsuariosLayout.setVerticalGroup(
            PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuariosLayout.createSequentialGroup()
                .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelUsuariosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelUsuariosLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel47))
                            .addComponent(TF_AD_FC_NEscu2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TF_AD_FC_NEscu3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46)
                            .addComponent(choice22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(PanelUsuariosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119)
                .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton11))
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Usuarios", PanelUsuarios);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 30, 680, 560);
        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        jLabel12.setText("01/08/2013");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 0, 66, 22);

        jLabel15.setText("12:23");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(94, 0, 60, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public LinkedList consultaEditP(String Gener,String TPren,String Color)
    {
        LinkedList res = new LinkedList();
        try {
            String query = "";
            if(!TPren.equals("") && !Color.equals("") && !Gener.equals("")){
                query = " where Tipo_de_prenda ='"+TPren+"' and Color = '"+Color+"' and Genero = '"+Gener+"'";
            }else if (!TPren.equals("") && !Color.equals("")){
                query = " where Tipo_de_prenda ='"+TPren+"' and Color = '"+Color+"'";
            }else if (!TPren.equals("") && !Gener.equals("")){
                query = " where Tipo_de_prenda ='"+TPren+"' and Genero = '"+Gener+"'";
            }else if (!Color.equals("") && !Gener.equals("")){
                query = " where Color ='"+Color+"' and Genero = '"+Gener+"'";
            }else if (!Gener.equals("")){
                query = " where Genero = '"+Gener+"'";
            }else if (!TPren.equals("")){
                query = " where Tipo_de_prenda ='"+TPren+"'";
            }else if (!Color.equals("")){
                query = " where Color = '"+Color+"'";
            }
            con.consultar("select * from prendas"+query);            
            while(con.resultado.next())
            {
                VistaPrendas aux = new VistaPrendas();
                aux.cantidad = con.resultado.getInt("Cantidad");
                aux.tipoPrenda = con.resultado.getString("Tipo_de_prenda");
                aux.color = con.resultado.getString("Color");
                aux.marca = con.resultado.getString("Marca");
                aux.tela = con.resultado.getString("Tela");
                aux.genero = con.resultado.getString("Genero");
                aux.precio = con.resultado.getFloat("Precio");
                aux.costo = con.resultado.getFloat("Costo");
                aux.talla = con.resultado.getString("Talla");
                aux.id = con.resultado.getInt("ID");
                res.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    private void Bu_AD_AA_AaCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bu_AD_AA_AaCatActionPerformed
        String tipodeprenda = TF_AD_AA_TPren.getText();
        String color = TF_AD_AA_Color.getText();
        String tela = TF_AD_AA_Tela.getText();
        String marca = TF_AD_AA_Marca.getText();
        String talla = TF_AD_AA_Talla.getText();
        String costo = TF_AD_AA_Costo.getText();
        String precio = TF_AD_AA_Preci.getText();
        String cantidad = TF_AD_AA_Canti.getText();
        int genero = CB_AD_AA_Gener.getSelectedIndex();
        ArrayList<String> IDcatalogo = new ArrayList<>();
        if(tipodeprenda.equals("") || color.equals("") || tela.equals("") || marca.equals("") || talla.equals("")
                || costo.equals("") || precio.equals("") || cantidad.equals("") || genero == 0)
        {
            La_AD_AA_Error.setVisible(true);
        }else{
            La_AD_AA_Error.setVisible(false);
            String insertCatalogo;
            String genero1;
            if(genero == 1)
            {
                insertCatalogo = "insert into catalogo_prendas (Genero,Tipo_de_prenda,Color,Marca,Tela) values ('escolar','";
                genero1 = "escolar";
            }
            else
            {
                insertCatalogo = "insert into catalogo_prendas (Genero,Tipo_de_prenda,Color,Marca,Tela) values ('de vestir','";
                genero1 = "de vestir";
            }
            String ArtCatalogo = insertCatalogo+tipodeprenda+"',"+"'"+color+"',"+"'"+marca+"','"+tela+"');";
            String insertPrenda = "insert into prenda (Talla,Cantidad,Precio,Costo,ID_catalogo) values ('";
            
            Connection conexion = null;
            conexion=ConexionMySQL.conectar();
            Statement consulta;
            try {
                consulta = conexion.createStatement();
                // Analizar si el articulo no existe en el catalogo aun
                ResultSet comprobacion =consulta.executeQuery("select * from Catalogo_prendas where genero='"+genero1+"' and Tipo_de_prenda='"+tipodeprenda+"' and color='"+color+"' and marca='"+marca+"' and tela='"+tela+"'");
                int flag = 0;
                while(comprobacion.next()){
                    flag = flag + 1;
                }
                // Insertar un nuevo dato en una tabla de la base de datos
                if (flag == 0){
                    int insertado = consulta.executeUpdate(ArtCatalogo);
                    if(insertado == 1){
                        La_AD_AA_Error.setText("Se ha insertado una prenda al catalogo");
                        La_AD_AA_Error.setForeground(Color.blue);
                        La_AD_AA_Error.setVisible(true);
                    }else{
                        La_AD_AA_Error.setText("hubo un error al insertar el registro");
                        La_AD_AA_Error.setVisible(true);
                    }
                }
                // Consulta simple de una tabla de la base de datos
                ResultSet ID =consulta.executeQuery("select * from Catalogo_prendas where genero='"+genero1+"' and Tipo_de_prenda='"+tipodeprenda+"' and color='"+color+"' and marca='"+marca+"' and tela='"+tela+"'");
                while(ID.next()){
                    IDcatalogo.add(ID.getString("ID"));
                }
                String ArtPrenda = insertPrenda+talla+"',"+cantidad+","+precio+","+costo+","+IDcatalogo.get(0) +");";                
                // Analizar si el articulo no existe en el catalogo aun
                ResultSet comprobacionprenda =consulta.executeQuery("select * from prenda where talla='"+talla+"' and cantidad="+cantidad+" and precio="+precio+" and costo="+costo+" and ID_catalogo="+IDcatalogo.get(0));
                int flag2 = 0;
                while(comprobacionprenda.next()){
                    flag2 = flag2 + 1;
                }
                if(flag2 == 0){
                    int insertadoPrenda = consulta.executeUpdate(ArtPrenda);
                    if(insertadoPrenda == 1){
                        La_AD_AA_Error.setText("Se ha insertado una prenda al catalogo");
                        La_AD_AA_Error.setForeground(Color.blue);
                        La_AD_AA_Error.setVisible(true);
                        TF_AD_AA_TPren.setText("");
                        TF_AD_AA_Color.setText("");
                        TF_AD_AA_Tela.setText("");
                        TF_AD_AA_Marca.setText("");
                        TF_AD_AA_Talla.setText("");
                        TF_AD_AA_Costo.setText("");
                        TF_AD_AA_Preci.setText("");
                        TF_AD_AA_Canti.setText("");
                        CB_AD_AA_Gener.setSelectedIndex(0);
                    }else{
                        La_AD_AA_Error.setText("hubo un error al insertar la prenda");
                        La_AD_AA_Error.setVisible(true);
                    }
                }
                
                ResultSet prenda =consulta.executeQuery("select * from prenda");
                ArrayList<String> P1 = new ArrayList<>();
                ArrayList<String> P2 = new ArrayList<>();
                ArrayList<String> P3 = new ArrayList<>();
                ArrayList<String> P4 = new ArrayList<>();
                ArrayList<String> P5 = new ArrayList<>();
                while(prenda.next())
                {
                    P1.add(prenda.getString("Talla"));
                    P2.add(prenda.getString("Cantidad"));
                    P3.add(prenda.getString("Precio"));
                    P4.add(prenda.getString("Costo"));
                    P5.add(prenda.getString("ID_catalogo"));
                }
                System.out.println("Talla   Cantidad    Precio  Costo   ID_catalogo");
                for(int i = 0; i<P1.size(); i++)
                {
                    System.out.println(P1.get(i)+"  "+P2.get(i)+"  "+P3.get(i)+"  "+P4.get(i)+"  "+P5.get(i));
                }
                
                ResultSet catalogo =consulta.executeQuery("select * from Catalogo_prendas"); 
                ArrayList<String> CP1 = new ArrayList<>();
                ArrayList<String> CP2 = new ArrayList<>();
                ArrayList<String> CP3 = new ArrayList<>();
                ArrayList<String> CP4 = new ArrayList<>();
                ArrayList<String> CP5 = new ArrayList<>();
                ArrayList<String> CP6 = new ArrayList<>();
                while(catalogo.next())
                {
                    CP1.add(catalogo.getString("Genero"));
                    CP2.add(catalogo.getString("Tipo_de_prenda"));
                    CP3.add(catalogo.getString("Color"));
                    CP4.add(catalogo.getString("Marca"));
                    CP5.add(catalogo.getString("Tela"));
                    CP6.add(catalogo.getString("ID"));
                }
                System.out.println("Genero  Tipo_de_prenda  Color   Marca   Tela    ID");
                for(int i = 0; i<CP1.size(); i++)
                {
                    System.out.println(CP1.get(i)+"  "+CP2.get(i)+"  "+CP3.get(i)+"  "+CP4.get(i)+"  "+CP5.get(i)+"  "+CP6.get(i));
                }
                consulta.close();
                conexion.close();
                //this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_Bu_AD_AA_AaCatActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String a = JOptionPane.showInputDialog("Mensaje lol cococococ");
        String[] b = new String[] {"a","b"};
        int c = JOptionPane.showOptionDialog(null, "a", a, 0, 0, null, b, this);
        System.out.println(a);
        System.out.println(c);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        LinkedList m = modeloEditarArticulo.datos;
        VistaPrendas v = new VistaPrendas();
        
        for(Object obj: m)
        {
            v = (VistaPrendas)obj;
            System.out.println(v.tipoPrenda+" , "+v.cantidad+" , "+v.color+" , "+v.costo+" , "+v.genero+" , "+v.id);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void Bu_AD_CS_CSesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bu_AD_CS_CSesiActionPerformed
        this.setVisible(false);
        LogIn Log = new LogIn();
        Log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Bu_AD_CS_CSesiActionPerformed

    private void TF_AD_AA_TPrenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_AD_AA_TPrenFocusLost
        if(TF_AD_AA_TPren.getText().equals("")){
            La_AD_AA_Tick1.setVisible(false);
        }else {
            La_AD_AA_Error.setVisible(false);
            La_AD_AA_Tick1.setVisible(true);
        }    
    }//GEN-LAST:event_TF_AD_AA_TPrenFocusLost

    private void TF_AD_AA_ColorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_AD_AA_ColorFocusLost
        if(TF_AD_AA_Color.getText().equals("")){
            La_AD_AA_Tick2.setVisible(false);
        }else {
            La_AD_AA_Error.setVisible(false);
            La_AD_AA_Tick2.setVisible(true);
        }
    }//GEN-LAST:event_TF_AD_AA_ColorFocusLost

    private void TF_AD_AA_TelaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_AD_AA_TelaFocusLost
        if(TF_AD_AA_Tela.getText().equals("")){
            La_AD_AA_Tick3.setVisible(false);
        }else {
            La_AD_AA_Error.setVisible(false);
            La_AD_AA_Tick3.setVisible(true);
        }
    }//GEN-LAST:event_TF_AD_AA_TelaFocusLost

    private void TF_AD_AA_MarcaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_AD_AA_MarcaFocusLost
        if(TF_AD_AA_Marca.getText().equals("")){
            La_AD_AA_Tick4.setVisible(false);
        }else {
            La_AD_AA_Error.setVisible(false);
            La_AD_AA_Tick4.setVisible(true);
        }
    }//GEN-LAST:event_TF_AD_AA_MarcaFocusLost

    private void TF_AD_AA_TallaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_AD_AA_TallaFocusLost
        if(TF_AD_AA_Talla.getText().equals("")){
            La_AD_AA_Tick5.setVisible(false);
        }else {
            La_AD_AA_Error.setVisible(false);
            La_AD_AA_Tick5.setVisible(true);
        }
    }//GEN-LAST:event_TF_AD_AA_TallaFocusLost

    private void TF_AD_AA_CostoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_AD_AA_CostoFocusLost
        if(TF_AD_AA_Costo.getText().equals("")){
            La_AD_AA_Tick6.setVisible(false);
        }else {
            La_AD_AA_Error.setVisible(false);
            La_AD_AA_Tick6.setVisible(true);
        }
    }//GEN-LAST:event_TF_AD_AA_CostoFocusLost

    private void TF_AD_AA_PreciFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_AD_AA_PreciFocusLost
        if(TF_AD_AA_Preci.getText().equals("")){
            La_AD_AA_Tick7.setVisible(false);
        }else {
            La_AD_AA_Error.setVisible(false);
            La_AD_AA_Tick7.setVisible(true);
        }
    }//GEN-LAST:event_TF_AD_AA_PreciFocusLost

    private void TF_AD_AA_CantiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TF_AD_AA_CantiFocusLost
        if(TF_AD_AA_Canti.getText().equals("")){
            La_AD_AA_Tick8.setVisible(false);
        }else {
            La_AD_AA_Error.setVisible(false);
            La_AD_AA_Tick8.setVisible(true);
        }
    }//GEN-LAST:event_TF_AD_AA_CantiFocusLost

    private void Bu_AD_EA_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bu_AD_EA_BuscaActionPerformed
        LinkedList datos1 = consultaEditP(CB_AD_EA_Gener.getSelectedItem().toString(),Ch_AD_EA_TPren.getSelectedItem(),Ch_AD_EA_Color.getSelectedItem());
        
        for(Object v : datos1){
            modeloEditarArticulo.addObject((Generica)v);
        }
        CB_AD_EA_Gener.setEnabled(false);
        Ch_AD_EA_TPren.setEnabled(false);
        Ch_AD_EA_Color.setEnabled(false);
        Bu_AD_EA_Busca.setVisible(false);
        Bu_AD_EA_Edita.setVisible(true);
        Bu_AD_EA_Cance.setVisible(true);
    }//GEN-LAST:event_Bu_AD_EA_BuscaActionPerformed

    private void Bu_AD_EA_CanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bu_AD_EA_CanceActionPerformed
        LinkedList old = modeloEditarArticulo.datos;
        int a = old.size();
        a--;
        for(int i = a; i >= 0; i--){
            modeloEditarArticulo.removeObject(i);
        }
        
        CB_AD_EA_Gener.setEnabled(true);
        Ch_AD_EA_TPren.setEnabled(true);
        if(Ch_AD_EA_Color.getSelectedItem().equals("") && !Ch_AD_EA_TPren.getSelectedItem().equals("")){
            Ch_AD_EA_Color.setEnabled(true);
        }
        Bu_AD_EA_Busca.setVisible(true);
        Bu_AD_EA_Edita.setVisible(false);
        Bu_AD_EA_Cance.setVisible(false);
        Bu_AD_EA_Elimi.setVisible(false);
    }//GEN-LAST:event_Bu_AD_EA_CanceActionPerformed

    private void CB_AD_EA_GenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_AD_EA_GenerActionPerformed
        iniciarEscolar(CB_AD_EA_Gener.getSelectedIndex(),"","");
        if(CB_AD_EA_Gener.getSelectedIndex()!=0){
            Ch_AD_EA_Color.setEnabled(false);
        }
    }//GEN-LAST:event_CB_AD_EA_GenerActionPerformed

    private void Ch_AD_EA_TPrenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ch_AD_EA_TPrenItemStateChanged
        iniciarEscolar(CB_AD_EA_Gener.getSelectedIndex(),Ch_AD_EA_TPren.getSelectedItem(),"");
        if(Ch_AD_EA_TPren.getSelectedItem().equals("")){
            Ch_AD_EA_Color.setEnabled(false);
        }else{
            Ch_AD_EA_Color.setEnabled(true);
        }
    }//GEN-LAST:event_Ch_AD_EA_TPrenItemStateChanged

    private void Ch_AD_EA_ColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ch_AD_EA_ColorItemStateChanged
        iniciarEscolar(CB_AD_EA_Gener.getSelectedIndex(),Ch_AD_EA_TPren.getSelectedItem(),Ch_AD_EA_Color.getSelectedItem());
    }//GEN-LAST:event_Ch_AD_EA_ColorItemStateChanged

    private void jTable3PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable3PropertyChange
        for(Object obj : modeloEditarArticulo.datos){
            VistaPrendas obj2 = (VistaPrendas)obj;
            if(obj2.Eliminar){
                Bu_AD_EA_Elimi.setVisible(true);
                break;
            }else{
                Bu_AD_EA_Elimi.setVisible(false);
            }
        }
    }//GEN-LAST:event_jTable3PropertyChange

    private void Bu_AD_EA_ElimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bu_AD_EA_ElimiActionPerformed
        //System.out.println("Obtencion de ID Completada");
        for(Object obj : modeloEditarArticulo.datos){
            VistaPrendas obj2 = (VistaPrendas)obj;
            if(obj2.Eliminar){
                Bu_AD_EA_Elimi.setVisible(true);
                String borrar = "ID_catalogo="+obj2.id+" and cantidad="+obj2.cantidad+" and costo="+obj2.costo+" and precio="+obj2.precio;
               // System.out.println(borrar);
                con.eliminar("prenda", borrar);
                con.eliminar("catalogo_prendas", "ID = "+obj2.id);
            }
        }
        LinkedList old = modeloEditarArticulo.datos;
        int a = old.size();
        a--;
        for(int i = a; i >= 0; i--){
            modeloEditarArticulo.removeObject(i);
        }
        LinkedList datos1 = consultaEditP(CB_AD_EA_Gener.getSelectedItem().toString(),Ch_AD_EA_TPren.getSelectedItem(),Ch_AD_EA_Color.getSelectedItem());
        for(Object v : datos1){
            modeloEditarArticulo.addObject((Generica)v);
        }
        Bu_AD_EA_Elimi.setVisible(false);
    }//GEN-LAST:event_Bu_AD_EA_ElimiActionPerformed

    private void choice1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_choice1PropertyChange
        /*con.iniciar();
        String data = choice1.getSelectedItem();
        ArrayList<VistaPrendas> prendas = consultar(" Tipo_de_prenda = '"+data+"'");
        enabledChoices1(false);
        limpiarChoices1();
        iniciarChoices1();
        enabledChoices1(true);
        for(VistaPrendas vp : prendas){
            choice2.add(vp.color);
            choice3.add(vp.talla);
            choice4.add(vp.tela);
            choice5.add(vp.marca);
        }
        con.detener();*/
    }//GEN-LAST:event_choice1PropertyChange

    private void choice1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice1ItemStateChanged
        String data = choice1.getSelectedItem();
        ArrayList<VistaPrendas> prendas = consultar(" Tipo_de_prenda = '" + data + "'");
        enabledChoices1(false);
        limpiarChoices1();
        iniciarChoices1();
        enabledChoices1(true);
        String check = "";
        for (VistaPrendas vp : prendas) {
            String aux = vp.color+vp.talla+vp.tela+vp.marca;
            if(!check.contains(aux))
            {
                choice2.add(vp.color);
                choice3.add(vp.talla);
                choice4.add(vp.tela);
                choice5.add(vp.marca);
                check += aux;
            }
        }
    }//GEN-LAST:event_choice1ItemStateChanged

    private void Bu_AD_FC_AArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bu_AD_FC_AArtiActionPerformed
        VistaPrendasConjunto vp = new VistaPrendasConjunto();
        vp.tipoPrenda = choice1.getSelectedItem();
        vp.color = choice2.getSelectedItem();
        vp.talla = choice3.getSelectedItem();
        vp.tela = choice4.getSelectedItem();
        vp.marca = choice5.getSelectedItem();
        Boolean cond = 
                !vp.tipoPrenda.equals("") && 
                !vp.color.equals("") && 
                !vp.talla.equals("") && 
                !vp.tela.equals("") && 
                !vp.marca.equals("");
        if(cond){
            insertarConjunto(vp);
        }
        if(vp.tipoPrenda.equals("")){
            choice1.select(0);
        }
        if(vp.color.equals("")){
            choice2.select(0);
        }
        if(vp.talla.equals("")){
            choice3.select(0);
        }
        if(vp.tela.equals("")){
            choice4.select(0);
        }
        if(vp.marca.equals("")){
            choice5.select(0);
        }
    }//GEN-LAST:event_Bu_AD_FC_AArtiActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        con.detener();
    }//GEN-LAST:event_formWindowClosed

    private void Bu_AD_FC_QArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bu_AD_FC_QArtiActionPerformed
        int tamDatos = modeloCrearConjunto.datos.size();
        tamDatos--;
        //ArrayList<Integer> eliminar = new ArrayList<>();
        VistaPrendasConjunto aux;
        for(int i = tamDatos; i >= 0 ; i--)
        {
            aux = (VistaPrendasConjunto)modeloCrearConjunto.datos.get(i);
            if(aux.delete){
                modeloCrearConjunto.removeObject(i);
            }
        }
    }//GEN-LAST:event_Bu_AD_FC_QArtiActionPerformed

    private void Bu_AD_FC_AConjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bu_AD_FC_AConjActionPerformed
        LinkedList data = modeloCrearConjunto.datos;
        VistaPrendasConjunto aux;
        String color = "",marca = "",talla = "",tela = "",tipo = "";
        String nEsc = TF_AD_FC_NEscu.getText();
        String typUnif = TF_AD_FC_TUnif.getText();
        String tallaUnif = TF_AD_FC_TConj.getText();
        String query = "";
        query += "'"+nEsc+"',";
        query += "'"+typUnif+"',";
        query += "'"+tallaUnif+"',";
        System.out.println(nEsc + " -> " + typUnif + " -> " + tallaUnif);
        for(Object obj:data){
            String query1 = query;
            aux = (VistaPrendasConjunto)obj;
            query1 += "'"+aux.tipoPrenda+"',";
            query1 += "'"+aux.color+"',";
            query1 += "'"+aux.marca+"',";
            query1 += "'"+aux.tela+"',";
            query1 += "'"+aux.talla+"'";
            if(!con.consultar("call sp_insert_conjunto ("+query1+")"))
            {
                System.out.println("xoxox");
            }
            System.out.println(query1);
        }
    }//GEN-LAST:event_Bu_AD_FC_AConjActionPerformed

    private void choice2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice2ItemStateChanged
        String data = choice2.getSelectedItem();
        ArrayList<VistaPrendas> prendas = consultar(" Color = '" + data + "'");
        enabledChoices2(false);
        limpiarChoices2();
        iniciarChoices2();
        enabledChoices2(true);
        String check = "";
        for (VistaPrendas vp : prendas) {
            String aux = vp.talla+vp.tela+vp.marca;
            if(!check.contains(aux))
            {
                choice3.add(vp.talla);
                choice4.add(vp.tela);
                choice5.add(vp.marca);
                check += aux;
            }
        }
    }//GEN-LAST:event_choice2ItemStateChanged

    private void choice3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice3ItemStateChanged
        String data = choice3.getSelectedItem();
        ArrayList<VistaPrendas> prendas = consultar(" Talla = '" + data + "'");
        enabledChoices3(false);
        limpiarChoices3();
        iniciarChoices3();
        enabledChoices3(true);
        String check = "";
        for (VistaPrendas vp : prendas) {
            String aux = vp.tela+vp.marca;
            if(!check.contains(aux))
            {
                choice4.add(vp.tela);
                choice5.add(vp.marca);
                check += aux;
            }
        }
    }//GEN-LAST:event_choice3ItemStateChanged

    private void choice4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice4ItemStateChanged
        String data = choice4.getSelectedItem();
        ArrayList<VistaPrendas> prendas = consultar(" Tela = '" + data + "'");
        enabledChoices4(false);
        limpiarChoices4();
        iniciarChoices4();
        enabledChoices4(true);
        String check = "";
        for (VistaPrendas vp : prendas) {
            String aux = vp.tela+vp.marca;
            if(!check.contains(aux))
            {
                choice5.add(vp.marca);
                check += aux;
            }
        }
    }//GEN-LAST:event_choice4ItemStateChanged
    public void insertarConjunto(VistaPrendasConjunto vp){
        String query="";
        query += " Color = '"+vp.color+"'";
        query += " Tela = '"+vp.tela+"'";
        query += " Talla = '"+vp.talla+"'";
        query += " Marca = '"+vp.marca+"'";
        query += " Tipo_de_Prenda = '"+vp.tipoPrenda+"'";
        
        if(!listaConiente(modeloCrearConjunto.datos,vp)){
            modeloCrearConjunto.addObject(vp);
        }
        
        /*ArrayList<VistaPrendasConjunto> insert = consultar1(query);*/
    }
    public Boolean listaConiente(LinkedList data, VistaPrendasConjunto vp){
        Boolean cond, cond1, cond2, cond3, cond4, cond5;
        VistaPrendasConjunto aux;
        for(Object obj : data){
            aux = ((VistaPrendasConjunto)obj);
            cond1 = vp.color.equals(aux.color);
            cond2 = vp.marca.equals(aux.marca);
            cond3 = vp.talla.equals(aux.talla);
            cond4 = vp.tela.equals(aux.tela);
            cond5 = vp.tipoPrenda.equals(aux.tipoPrenda);
            cond = cond1 && cond2 && cond3 && cond4 && cond5;
            if(cond){
                return cond;
            }
        }
        return false;
    }
    public void iniciarChoices1()
    {
        choice2.add("");
        choice3.add("");
        choice4.add("");
        choice5.add("");
    }
    public void limpiarChoices1()
    {
        choice2.removeAll();
        choice3.removeAll();
        choice4.removeAll();
        choice5.removeAll();
    }
    public void enabledChoices1(Boolean b)
    {
        choice2.setEnabled(b);
        choice3.setEnabled(b);
        choice4.setEnabled(b);
        choice5.setEnabled(b);
    }
    public void iniciarChoices2()
    {
        choice3.add("");
        choice4.add("");
        choice5.add("");
    }
    public void limpiarChoices2()
    {
        choice3.removeAll();
        choice4.removeAll();
        choice5.removeAll();
    }
    public void enabledChoices2(Boolean b)
    {
        choice3.setEnabled(b);
        choice4.setEnabled(b);
        choice5.setEnabled(b);
    }
    public void iniciarChoices3()
    {
        choice4.add("");
        choice5.add("");
    }
    public void limpiarChoices3()
    {
        choice4.removeAll();
        choice5.removeAll();
    }
    public void enabledChoices3(Boolean b)
    {
        choice4.setEnabled(b);
        choice5.setEnabled(b);
    }
    public void iniciarChoices4()
    {
        choice5.add("");
    }
    public void limpiarChoices4()
    {
        choice5.removeAll();
    }
    public void enabledChoices4(Boolean b)
    {
        choice5.setEnabled(b);
    }
    public ArrayList<VistaPrendasConjunto> consultar1(String cond)
    {
        ArrayList<VistaPrendasConjunto> res = new ArrayList<>();
        
        String query = "";
        if(cond.equals(""))
        {
            query = "select * from prendas";
        }
        else
        {
            query = "select * from prendas where "+cond;
        }
        try {
            con.consultar(query);
            ResultSet rsPrenda = con.resultado;
            while(rsPrenda.next())
            {
                VistaPrendasConjunto aux = new VistaPrendasConjunto();
                aux.tipoPrenda = rsPrenda.getString("Tipo_de_Prenda");
                aux.color = rsPrenda.getString("Color");
                aux.talla = rsPrenda.getString("Talla");
                aux.tela = rsPrenda.getString("Tela");
                aux.marca = rsPrenda.getString("Marca");
                aux.id = rsPrenda.getInt("ID");
                res.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    public ArrayList<VistaPrendas> consultar(String cond)
    {
        ArrayList<VistaPrendas> res = new ArrayList<>();
        
        String query = "";
        if(cond.equals(""))
        {
            query = "select * from prendas";
        }
        else
        {
            query = "select * from prendas where "+cond;
        }
        try {
            con.consultar(query);
            ResultSet rsPrenda = con.resultado;
            while(rsPrenda.next())
            {
                VistaPrendas aux = new VistaPrendas();
                aux.tipoPrenda = rsPrenda.getString("Tipo_de_Prenda");
                aux.color = rsPrenda.getString("Color");
                aux.talla = rsPrenda.getString("Talla");
                aux.tela = rsPrenda.getString("Tela");
                aux.marca = rsPrenda.getString("Marca");
                aux.id = rsPrenda.getInt("ID");
                res.add(aux);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bu_AD_AA_AaCat;
    private javax.swing.JButton Bu_AD_CS_CSesi;
    private javax.swing.JButton Bu_AD_EA_Busca;
    private javax.swing.JButton Bu_AD_EA_Cance;
    private javax.swing.JButton Bu_AD_EA_Edita;
    private javax.swing.JButton Bu_AD_EA_Elimi;
    private javax.swing.JButton Bu_AD_FC_AArti;
    private javax.swing.JButton Bu_AD_FC_AConj;
    private javax.swing.JButton Bu_AD_FC_QArti;
    private javax.swing.JComboBox CB_AD_AA_Gener;
    private javax.swing.JComboBox CB_AD_EA_Gener;
    private java.awt.Choice Ch_AD_EA_Color;
    private java.awt.Choice Ch_AD_EA_TPren;
    private javax.swing.JLabel La_AD_AA_Canti;
    private javax.swing.JLabel La_AD_AA_Color;
    private javax.swing.JLabel La_AD_AA_Costo;
    private javax.swing.JLabel La_AD_AA_Error;
    private javax.swing.JLabel La_AD_AA_Gener;
    private javax.swing.JLabel La_AD_AA_Marca;
    private javax.swing.JLabel La_AD_AA_Preci;
    private javax.swing.JLabel La_AD_AA_TPren;
    private javax.swing.JLabel La_AD_AA_Talla;
    private javax.swing.JLabel La_AD_AA_Tela;
    private javax.swing.JLabel La_AD_AA_Tick1;
    private javax.swing.JLabel La_AD_AA_Tick2;
    private javax.swing.JLabel La_AD_AA_Tick3;
    private javax.swing.JLabel La_AD_AA_Tick4;
    private javax.swing.JLabel La_AD_AA_Tick5;
    private javax.swing.JLabel La_AD_AA_Tick6;
    private javax.swing.JLabel La_AD_AA_Tick7;
    private javax.swing.JLabel La_AD_AA_Tick8;
    private javax.swing.JLabel La_AD_CS_ADMON;
    private javax.swing.JLabel La_AD_CS_Categ;
    private javax.swing.JLabel La_AD_CS_FRegi;
    private javax.swing.JLabel La_AD_CS_NUsua;
    private javax.swing.JLabel La_AD_CS_Regis;
    private javax.swing.JLabel La_AD_CS_Usuario;
    private javax.swing.JLabel La_AD_EA_Color;
    private javax.swing.JLabel La_AD_EA_Gener;
    private javax.swing.JLabel La_AD_EA_TPren;
    private javax.swing.JLabel La_AD_FC_AConj;
    private javax.swing.JLabel La_AD_FC_Color;
    private javax.swing.JLabel La_AD_FC_Marca;
    private javax.swing.JLabel La_AD_FC_NEscu;
    private javax.swing.JLabel La_AD_FC_PTota;
    private javax.swing.JLabel La_AD_FC_TConj;
    private javax.swing.JLabel La_AD_FC_TPren;
    private javax.swing.JLabel La_AD_FC_TUnif;
    private javax.swing.JLabel La_AD_FC_Talla;
    private javax.swing.JLabel La_AD_FC_Tela;
    private javax.swing.JPanel PanelAñadirArticulo;
    private javax.swing.JPanel PanelCerrarSesion;
    private javax.swing.JPanel PanelCerrarSesionInterno;
    private javax.swing.JPanel PanelEditarArticulo;
    private javax.swing.JPanel PanelFormarConjunto;
    private javax.swing.JPanel PanelProveedores;
    private javax.swing.JPanel PanelUsuarios;
    private javax.swing.JScrollPane SP_AD_EA_Tabla;
    private javax.swing.JScrollPane SP_AD_FC_AConj;
    private javax.swing.JTextField TF_AD_AA_Canti;
    private javax.swing.JTextField TF_AD_AA_Color;
    private javax.swing.JTextField TF_AD_AA_Costo;
    private javax.swing.JTextField TF_AD_AA_Marca;
    private javax.swing.JTextField TF_AD_AA_Preci;
    private javax.swing.JTextField TF_AD_AA_TPren;
    private javax.swing.JTextField TF_AD_AA_Talla;
    private javax.swing.JTextField TF_AD_AA_Tela;
    private javax.swing.JTextField TF_AD_FC_NEscu;
    private javax.swing.JTextField TF_AD_FC_NEscu2;
    private javax.swing.JTextField TF_AD_FC_NEscu3;
    private javax.swing.JTextField TF_AD_FC_PTota;
    private javax.swing.JTextField TF_AD_FC_TConj;
    private javax.swing.JTextField TF_AD_FC_TUnif;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private java.awt.Choice choice1;
    private java.awt.Choice choice2;
    private java.awt.Choice choice22;
    private java.awt.Choice choice3;
    private java.awt.Choice choice4;
    private java.awt.Choice choice5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
