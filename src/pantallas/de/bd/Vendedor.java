package pantallas.de.bd;

import DB.Generica;
import DB.Prenda;
import DB.Uniforme;
import DB.VistaPrendas;
import ObjetosDB.ConexionBD;
import Tablas.ModeloTabla1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Vendedor extends javax.swing.JFrame {
    ConexionBD conexion = new ConexionBD();
    //ModeloTabla1 modeloEscolar
    ModeloTabla1 modelo1 = new ModeloTabla1(new String[] {"Genero","Marca","Tela"});
    public Vendedor() {
        initComponents();
        iniciarEscolar();
        iniciar();
        /*LinkedList a = new LinkedList();
        a = consultaPrendas();
        modelo1.datos = a;*/
        //conjuntosNE.add("xoxoxo");
        //conjuntosNE.addItem("xoxoxox");
        //jComboBox1.addItem("xoxoxox");
        //jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
    }
    
    public LinkedList consultaPrendas()
    {
        try
        {
            String ne;
            ne = Ch_Ve_Co_NEscu.getSelectedItem().toString();
            //ne = Ch_Ve_Co_NEscu.getSelectedItem().toString();
            //SP 
            conexion.iniciar();
            conexion.consultar("SELECT * FROM catalogo_prendas");
            
            LinkedList datos = new LinkedList();
            
            while(conexion.resultado.next())
            {
                Prenda p = new Prenda();
                p.genero = conexion.resultado.getString("Genero");
                p.marca = conexion.resultado.getString("Marca");
                p.tela = conexion.resultado.getString("Tela");
                
                datos.add(p);
            }
            conexion.detener();
            return datos;
       }catch(Exception e)
        {
            
        }
        return null;
    }
    
    public void iniciar()
    {
        try {
            conexion.iniciar();
            conexion.consultar("SELECT * FROM uniforme");
            
            ResultSet rs = conexion.resultado;
            
            ArrayList<Uniforme> uni = new ArrayList<>();
            
            while(rs.next())
            {
                Uniforme aux = new Uniforme();
                aux.NombreEscuela = rs.getString("Nombre_escuela");
                aux.TipoDeUniforme = rs.getString("Tipo_de_uniforme");
                uni.add(aux);
            }
            conexion.detener();
            /*Ch_Ve_Co_NEscu.add("");
            Ch_Ve_Co_TdUni.add("");*/
            for(Uniforme u : uni)
            {
                //System.out.println(u.NombreEscuela+" -> "+u.TipoDeUniforme);
                Ch_Ve_Co_NEscu.add(u.NombreEscuela);
                Ch_Ve_Co_TdUni.add(u.TipoDeUniforme);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Vendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    public void iniciarEscolar()
    {
        try {
            conexion.iniciar();
            conexion.consultar("SELECT * FROM catalogo_prendas,prenda where ID=ID_catalogo");
            ResultSet rsPrenda = conexion.resultado;
            ArrayList<VistaPrendas> pren = new ArrayList<>();
            while(rsPrenda.next())
            {
                VistaPrendas aux = new VistaPrendas();
                aux.tipoPrenda = rsPrenda.getString("Tipo_de_Prenda");
                aux.color = rsPrenda.getString("Color");
/*                aux.genero = rsPrenda.getString("Genero");
                aux.marca = rsPrenda.getString("Marca");
                aux.tela = rsPrenda.getString("Tela");
*/                pren.add(aux);
            }
            conexion.detener();
            int cont = 0,flag1 =0,flag2 = 0;
            Ch_Ve_Es_TPren.add("");
            Ch_Ve_Es_Color.add("");
            for(VistaPrendas p : pren){
                // Para el choice de Tipo de prenda
                for(int tpcont=0;tpcont<=cont;tpcont++){
                    flag1 = 0;
                    if(Ch_Ve_Es_TPren.getItemCount() == tpcont){
                        break;
                    }
                    if(Ch_Ve_Es_TPren.getItem(tpcont).equals(p.tipoPrenda)){
                        flag1 = 1;
                        break;
                    }
                }
                if(flag1 == 0){
                    Ch_Ve_Es_TPren.add(p.tipoPrenda);
                }
                // Para el choice de color
                for(int colcont=0;colcont<=cont;colcont++){
                    flag2 = 0;
                    if(Ch_Ve_Es_Color.getItemCount() == colcont){
                        break;
                    }
                    if(Ch_Ve_Es_Color.getItem(colcont).equals(p.color)){
                        flag2 = 1;
                        break;
                    }
                }
                if(flag2 == 0){
                    Ch_Ve_Es_Color.add(p.color);
                }
                cont = cont + 1;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Vendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Ve = new javax.swing.JPanel();
        La_Ve_Es_TPren = new javax.swing.JLabel();
        La_Ve_Es_Color = new javax.swing.JLabel();
        Ch_Ve_Es_TPren = new java.awt.Choice();
        Ch_Ve_Es_Color = new java.awt.Choice();
        Bu_Ve_Es_Busca = new javax.swing.JButton();
        ScrollPane_Ve_Es = new javax.swing.JScrollPane();
        Table_Ve_Es = new javax.swing.JTable();
        La_Ve_Es_Canti = new javax.swing.JLabel();
        Ch_Ve_Es_Canti = new java.awt.Choice();
        Bu_Ve_Es_Agreg = new javax.swing.JButton();
        PanelConjuntos = new javax.swing.JPanel();
        La_Ve_Co_NEscu = new javax.swing.JLabel();
        La_Ve_Co_TdUni = new javax.swing.JLabel();
        Ch_Ve_Co_NEscu = new java.awt.Choice();
        Ch_Ve_Co_TdUni = new java.awt.Choice();
        La_Ve_Co_Escud = new javax.swing.JLabel();
        CB_Ve_Co_Escud = new javax.swing.JCheckBox();
        Bu_Ve_Co_Busca = new javax.swing.JButton();
        ScrollPane_Vo_Co = new javax.swing.JScrollPane();
        Table_Ve_Co = new javax.swing.JTable();
        La_Ve_Co_Numer = new javax.swing.JLabel();
        La_Ve_Co_Canti = new javax.swing.JLabel();
        Ch_Ve_Co_Numer = new java.awt.Choice();
        Ch_Ve_Co_Canti = new java.awt.Choice();
        Bu_Vo_Co_Agreg = new javax.swing.JButton();
        PanelDeVestir = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        choice17 = new java.awt.Choice();
        jLabel36 = new javax.swing.JLabel();
        choice18 = new java.awt.Choice();
        jButton7 = new javax.swing.JButton();
        ScrollPane_Ve_Es1 = new javax.swing.JScrollPane();
        Table_Ve_Es1 = new javax.swing.JTable();
        La_Ve_Es_Canti1 = new javax.swing.JLabel();
        Ch_Ve_Es_Canti1 = new java.awt.Choice();
        Bu_Ve_Es_Agreg1 = new javax.swing.JButton();
        PanelVentaEnProgreso = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        choice21 = new java.awt.Choice();
        choice22 = new java.awt.Choice();
        jButton8 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        PanelPedido = new javax.swing.JPanel();
        PanelCerrarSesion = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        La_Fecha = new javax.swing.JLabel();
        La_Hora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vendedor");
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        setMinimumSize(new java.awt.Dimension(385, 502));
        setResizable(false);
        getContentPane().setLayout(null);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(373, 453));

        La_Ve_Es_TPren.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Ve_Es_TPren.setText("Tipo de Prenda");

        La_Ve_Es_Color.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Ve_Es_Color.setText("Color");

        Bu_Ve_Es_Busca.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_Ve_Es_Busca.setForeground(new java.awt.Color(255, 0, 0));
        Bu_Ve_Es_Busca.setText("Buscar");

        Table_Ve_Es.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero", "Talla", "Marca", "Precio", "Cantidad"
            }
        ));
        ScrollPane_Ve_Es.setViewportView(Table_Ve_Es);

        La_Ve_Es_Canti.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Ve_Es_Canti.setText("Cantidad");

        Bu_Ve_Es_Agreg.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_Ve_Es_Agreg.setForeground(new java.awt.Color(255, 0, 0));
        Bu_Ve_Es_Agreg.setText("Agregar a venta");
        Bu_Ve_Es_Agreg.setToolTipText("");
        Bu_Ve_Es_Agreg.setBorder(null);
        Bu_Ve_Es_Agreg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout VeLayout = new javax.swing.GroupLayout(Ve);
        Ve.setLayout(VeLayout);
        VeLayout.setHorizontalGroup(
            VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VeLayout.createSequentialGroup()
                .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(VeLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(La_Ve_Es_TPren)
                            .addComponent(La_Ve_Es_Color))
                        .addGap(40, 40, 40)
                        .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Ch_Ve_Es_TPren, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(Ch_Ve_Es_Color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Bu_Ve_Es_Busca, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VeLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VeLayout.createSequentialGroup()
                                .addComponent(La_Ve_Es_Canti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ch_Ve_Es_Canti, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(Bu_Ve_Es_Agreg, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ScrollPane_Ve_Es, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        VeLayout.setVerticalGroup(
            VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(La_Ve_Es_TPren)
                    .addComponent(Ch_Ve_Es_TPren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(La_Ve_Es_Color)
                    .addComponent(Ch_Ve_Es_Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(Bu_Ve_Es_Busca)
                .addGap(12, 12, 12)
                .addComponent(ScrollPane_Ve_Es, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VeLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(VeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(La_Ve_Es_Canti)
                            .addComponent(Ch_Ve_Es_Canti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(VeLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Bu_Ve_Es_Agreg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane1.addTab("Escolar", Ve);

        La_Ve_Co_NEscu.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Ve_Co_NEscu.setText("Nombre de la escuela");

        La_Ve_Co_TdUni.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Ve_Co_TdUni.setText("Tipo de Uniforme");

        Ch_Ve_Co_NEscu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        La_Ve_Co_Escud.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Ve_Co_Escud.setText(" + Escudo");

        CB_Ve_Co_Escud.setFont(new java.awt.Font("Pristina", 0, 18)); // NOI18N

        Bu_Ve_Co_Busca.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_Ve_Co_Busca.setForeground(new java.awt.Color(255, 0, 0));
        Bu_Ve_Co_Busca.setText("Buscar");
        Bu_Ve_Co_Busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bu_Ve_Co_BuscaActionPerformed(evt);
            }
        });

        Table_Ve_Co.setModel(modelo1);
        ScrollPane_Vo_Co.setViewportView(Table_Ve_Co);

        La_Ve_Co_Numer.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Ve_Co_Numer.setText("Número");

        La_Ve_Co_Canti.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Ve_Co_Canti.setText("Cantidad");

        Bu_Vo_Co_Agreg.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_Vo_Co_Agreg.setForeground(new java.awt.Color(255, 0, 0));
        Bu_Vo_Co_Agreg.setText("Agregar a venta");
        Bu_Vo_Co_Agreg.setToolTipText("");
        Bu_Vo_Co_Agreg.setBorder(null);
        Bu_Vo_Co_Agreg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelConjuntosLayout = new javax.swing.GroupLayout(PanelConjuntos);
        PanelConjuntos.setLayout(PanelConjuntosLayout);
        PanelConjuntosLayout.setHorizontalGroup(
            PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConjuntosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConjuntosLayout.createSequentialGroup()
                        .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ScrollPane_Vo_Co, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(PanelConjuntosLayout.createSequentialGroup()
                                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(La_Ve_Co_NEscu)
                                    .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelConjuntosLayout.createSequentialGroup()
                                            .addComponent(La_Ve_Co_Escud)
                                            .addGap(18, 18, 18)
                                            .addComponent(CB_Ve_Co_Escud))
                                        .addComponent(La_Ve_Co_TdUni)))
                                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelConjuntosLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Ch_Ve_Co_NEscu, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                            .addComponent(Ch_Ve_Co_TdUni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(PanelConjuntosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Bu_Ve_Co_Busca)))))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConjuntosLayout.createSequentialGroup()
                        .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(La_Ve_Co_Canti)
                            .addComponent(La_Ve_Co_Numer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ch_Ve_Co_Numer, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ch_Ve_Co_Canti, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bu_Vo_Co_Agreg, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelConjuntosLayout.setVerticalGroup(
            PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConjuntosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConjuntosLayout.createSequentialGroup()
                        .addComponent(La_Ve_Co_NEscu)
                        .addGap(12, 12, 12))
                    .addComponent(Ch_Ve_Co_NEscu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(La_Ve_Co_TdUni)
                    .addComponent(Ch_Ve_Co_TdUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(La_Ve_Co_Escud)
                    .addComponent(CB_Ve_Co_Escud)
                    .addComponent(Bu_Ve_Co_Busca))
                .addGap(12, 12, 12)
                .addComponent(ScrollPane_Vo_Co, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelConjuntosLayout.createSequentialGroup()
                        .addComponent(La_Ve_Co_Numer)
                        .addGap(12, 12, 12)
                        .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(La_Ve_Co_Canti)
                            .addComponent(Ch_Ve_Co_Canti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Ch_Ve_Co_Numer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConjuntosLayout.createSequentialGroup()
                        .addComponent(Bu_Vo_Co_Agreg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Conjuntos", PanelConjuntos);

        jLabel35.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel35.setText("Tipo de Prenda");

        jLabel36.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel36.setText("Color");

        jButton7.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 0));
        jButton7.setText("Buscar");

        Table_Ve_Es1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero", "Talla", "Marca", "Precio", "Cantidad"
            }
        ));
        ScrollPane_Ve_Es1.setViewportView(Table_Ve_Es1);

        La_Ve_Es_Canti1.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Ve_Es_Canti1.setText("Cantidad");

        Bu_Ve_Es_Agreg1.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_Ve_Es_Agreg1.setForeground(new java.awt.Color(255, 0, 0));
        Bu_Ve_Es_Agreg1.setText("Agregar a venta");
        Bu_Ve_Es_Agreg1.setToolTipText("");
        Bu_Ve_Es_Agreg1.setBorder(null);
        Bu_Ve_Es_Agreg1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PanelDeVestirLayout = new javax.swing.GroupLayout(PanelDeVestir);
        PanelDeVestir.setLayout(PanelDeVestirLayout);
        PanelDeVestirLayout.setHorizontalGroup(
            PanelDeVestirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeVestirLayout.createSequentialGroup()
                .addGroup(PanelDeVestirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelDeVestirLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(PanelDeVestirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36))
                        .addGap(40, 40, 40)
                        .addGroup(PanelDeVestirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choice18, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(choice17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PanelDeVestirLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ScrollPane_Ve_Es1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(PanelDeVestirLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelDeVestirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelDeVestirLayout.createSequentialGroup()
                                .addComponent(La_Ve_Es_Canti1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ch_Ve_Es_Canti1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(Bu_Ve_Es_Agreg1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7))))
                .addGap(19, 19, 19))
        );
        PanelDeVestirLayout.setVerticalGroup(
            PanelDeVestirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeVestirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelDeVestirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choice17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(12, 12, 12)
                .addGroup(PanelDeVestirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(choice18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton7)
                .addGap(12, 12, 12)
                .addComponent(ScrollPane_Ve_Es1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelDeVestirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDeVestirLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(PanelDeVestirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(La_Ve_Es_Canti1)
                            .addComponent(Ch_Ve_Es_Canti1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelDeVestirLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Bu_Ve_Es_Agreg1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("De Vestir", PanelDeVestir);

        PanelVentaEnProgreso.setLayout(null);

        jLabel27.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel27.setText("Iniciar Nueva Venta");
        PanelVentaEnProgreso.add(jLabel27);
        jLabel27.setBounds(35, 21, 161, 29);

        jButton5.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("Iniciar");
        PanelVentaEnProgreso.add(jButton5);
        jButton5.setBounds(245, 20, 87, 27);

        jLabel32.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel32.setText("Nuemro del Cliente");
        PanelVentaEnProgreso.add(jLabel32);
        jLabel32.setBounds(35, 80, 143, 29);

        jTextField3.setText("1234");
        PanelVentaEnProgreso.add(jTextField3);
        jTextField3.setBounds(198, 84, 140, 20);

        jButton6.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 0, 0));
        jButton6.setText("Validar Cliente");
        jButton6.setToolTipText("");
        PanelVentaEnProgreso.add(jButton6);
        jButton6.setBounds(185, 114, 153, 27);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Numero", "Descripcion Articulo", "Talla", "Cantidad", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        PanelVentaEnProgreso.add(jScrollPane1);
        jScrollPane1.setBounds(35, 178, 305, 98);

        jLabel33.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel33.setText("Número");
        PanelVentaEnProgreso.add(jLabel33);
        jLabel33.setBounds(35, 288, 64, 29);

        jLabel40.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel40.setText("Cantidad");
        PanelVentaEnProgreso.add(jLabel40);
        jLabel40.setBounds(35, 328, 73, 29);
        PanelVentaEnProgreso.add(choice21);
        choice21.setBounds(118, 328, 63, 20);
        PanelVentaEnProgreso.add(choice22);
        choice22.setBounds(118, 288, 63, 20);

        jButton8.setFont(new java.awt.Font("Snap ITC", 0, 13)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 0, 0));
        jButton8.setText("Quitar de la venta");
        jButton8.setToolTipText("");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelVentaEnProgreso.add(jButton8);
        jButton8.setBounds(191, 288, 150, 60);

        jLabel8.setText("Agregar Nuevo Cliente");
        jLabel8.setToolTipText("");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        PanelVentaEnProgreso.add(jLabel8);
        jLabel8.setBounds(210, 50, 140, 20);

        jLabel45.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel45.setText("Articulos de la venta en progreso");
        PanelVentaEnProgreso.add(jLabel45);
        jLabel45.setBounds(65, 147, 238, 29);

        jButton11.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 0, 0));
        jButton11.setText("Finalizar Venta");
        PanelVentaEnProgreso.add(jButton11);
        jButton11.setBounds(110, 357, 157, 27);

        jTabbedPane1.addTab("Venta en Progreso", PanelVentaEnProgreso);

        javax.swing.GroupLayout PanelPedidoLayout = new javax.swing.GroupLayout(PanelPedido);
        PanelPedido.setLayout(PanelPedidoLayout);
        PanelPedidoLayout.setHorizontalGroup(
            PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PanelPedidoLayout.setVerticalGroup(
            PanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Pedido", PanelPedido);

        jLabel9.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel9.setText("Nombre del Usuario: ");

        jLabel10.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel10.setText("Vendedor");

        jLabel13.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel13.setText("Fecha de Registro:");

        jLabel14.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel14.setText("01/01/2012");

        jButton2.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Cerrar Cesion");

        jLabel20.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel20.setText("Categoria:");

        jLabel11.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel11.setText("Mata Alba Adrian");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel10))
                                    .addComponent(jLabel13))
                                .addGap(0, 0, 0)
                                .addComponent(jLabel14)))
                        .addGap(20, 20, 20))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel10))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(20, 20, 20)
                .addComponent(jButton2)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout PanelCerrarSesionLayout = new javax.swing.GroupLayout(PanelCerrarSesion);
        PanelCerrarSesion.setLayout(PanelCerrarSesionLayout);
        PanelCerrarSesionLayout.setHorizontalGroup(
            PanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCerrarSesionLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        PanelCerrarSesionLayout.setVerticalGroup(
            PanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCerrarSesionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Cerrar Sesion", PanelCerrarSesion);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 27, 365, 435);
        jTabbedPane1.getAccessibleContext().setAccessibleName("Conjuntos");

        La_Fecha.setText("01/08/2013");
        getContentPane().add(La_Fecha);
        La_Fecha.setBounds(10, 0, 66, 22);

        La_Hora.setText("12:23");
        getContentPane().add(La_Hora);
        La_Hora.setBounds(94, 0, 60, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bu_Ve_Co_BuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bu_Ve_Co_BuscaActionPerformed
        LinkedList old = modelo1.datos;
        int a = old.size();
        a--;
        for(int i = a; i >= 0; i--)
        {
            modelo1.removeObject(i);
        }
        
        LinkedList datos1 = consultaPrendas();
        
        for(Object p : datos1)
        {
            modelo1.addObject((Generica)p);
        }
        
        //modelo1.getNewData(consultaPrendas());
    }//GEN-LAST:event_Bu_Ve_Co_BuscaActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Mensaje");
    }//GEN-LAST:event_jLabel8MouseClicked
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
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendedor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bu_Ve_Co_Busca;
    private javax.swing.JButton Bu_Ve_Es_Agreg;
    private javax.swing.JButton Bu_Ve_Es_Agreg1;
    private javax.swing.JButton Bu_Ve_Es_Busca;
    private javax.swing.JButton Bu_Vo_Co_Agreg;
    private javax.swing.JCheckBox CB_Ve_Co_Escud;
    private java.awt.Choice Ch_Ve_Co_Canti;
    private java.awt.Choice Ch_Ve_Co_NEscu;
    private java.awt.Choice Ch_Ve_Co_Numer;
    private java.awt.Choice Ch_Ve_Co_TdUni;
    private java.awt.Choice Ch_Ve_Es_Canti;
    private java.awt.Choice Ch_Ve_Es_Canti1;
    private java.awt.Choice Ch_Ve_Es_Color;
    private java.awt.Choice Ch_Ve_Es_TPren;
    private javax.swing.JLabel La_Fecha;
    private javax.swing.JLabel La_Hora;
    private javax.swing.JLabel La_Ve_Co_Canti;
    private javax.swing.JLabel La_Ve_Co_Escud;
    private javax.swing.JLabel La_Ve_Co_NEscu;
    private javax.swing.JLabel La_Ve_Co_Numer;
    private javax.swing.JLabel La_Ve_Co_TdUni;
    private javax.swing.JLabel La_Ve_Es_Canti;
    private javax.swing.JLabel La_Ve_Es_Canti1;
    private javax.swing.JLabel La_Ve_Es_Color;
    private javax.swing.JLabel La_Ve_Es_TPren;
    private javax.swing.JPanel PanelCerrarSesion;
    private javax.swing.JPanel PanelConjuntos;
    private javax.swing.JPanel PanelDeVestir;
    private javax.swing.JPanel PanelPedido;
    private javax.swing.JPanel PanelVentaEnProgreso;
    private javax.swing.JScrollPane ScrollPane_Ve_Es;
    private javax.swing.JScrollPane ScrollPane_Ve_Es1;
    private javax.swing.JScrollPane ScrollPane_Vo_Co;
    private javax.swing.JTable Table_Ve_Co;
    private javax.swing.JTable Table_Ve_Es;
    private javax.swing.JTable Table_Ve_Es1;
    private javax.swing.JPanel Ve;
    private java.awt.Choice choice17;
    private java.awt.Choice choice18;
    private java.awt.Choice choice21;
    private java.awt.Choice choice22;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
