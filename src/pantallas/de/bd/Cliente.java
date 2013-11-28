package pantallas.de.bd;

import DB.VistaPrendas;
import ObjetosDB.ConexionBD;
import java.awt.image.ImageObserver;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente extends javax.swing.JFrame {
    ConexionBD con = new ConexionBD();
    
    public Cliente() {
        initComponents();
        iniciarEscolar("Genero = 'Escolar'","9");
        iniciarDeVestir("Genero = 'De Vestir'","9");
        Bu_Cli_Es_Consu.setVisible(false);
        Bu_Cli_DV_Consu.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelEscolar = new javax.swing.JPanel();
        La_Cli_Es_TPren = new javax.swing.JLabel();
        La_Cli_Es_Color = new javax.swing.JLabel();
        La_Cli_Es_Talla = new javax.swing.JLabel();
        La_Cli_Es_Marca = new javax.swing.JLabel();
        La_Cli_Es_Tela = new javax.swing.JLabel();
        La_Cli_Es_Preci = new javax.swing.JLabel();
        La_Cli_Es_Comen = new javax.swing.JLabel();
        Ch_Cli_Es_TPren = new java.awt.Choice();
        Ch_Cli_Es_Color = new java.awt.Choice();
        Ch_Cli_Es_Talla = new java.awt.Choice();
        Ch_Cli_Es_Marca = new java.awt.Choice();
        Ch_Cli_Es_Tela = new java.awt.Choice();
        Bu_Cli_Es_Consu = new javax.swing.JButton();
        TF_Cli_Es_Preci = new javax.swing.JTextField();
        TF_Cli_Es_Comen = new javax.swing.JTextField();
        PanelConjuntos = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        choice13 = new java.awt.Choice();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        choice16 = new java.awt.Choice();
        jLabel29 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        choice22 = new java.awt.Choice();
        PanelDeVestir = new javax.swing.JPanel();
        La_Cli_DV_TPren = new javax.swing.JLabel();
        La_Cli_DV_Color = new javax.swing.JLabel();
        La_Cli_DV_Talla = new javax.swing.JLabel();
        La_Cli_DV_Marca = new javax.swing.JLabel();
        La_Cli_DV_Tela = new javax.swing.JLabel();
        La_Cli_DV_Preci = new javax.swing.JLabel();
        La_Cli_DV_Comen = new javax.swing.JLabel();
        Ch_Cli_DV_TPren = new java.awt.Choice();
        Ch_Cli_DV_Color = new java.awt.Choice();
        Ch_Cli_DV_Talla = new java.awt.Choice();
        Ch_Cli_DV_Marca = new java.awt.Choice();
        Ch_Cli_DV_Tela = new java.awt.Choice();
        Bu_Cli_DV_Consu = new javax.swing.JButton();
        TF_Cli_DV_Preci = new javax.swing.JTextField();
        TF_Cli_DV_Comen = new javax.swing.JTextField();
        PanelCerrarSesion = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        La_Cli_CS_NUsua = new javax.swing.JLabel();
        TF_Cli_CS_Usuar = new javax.swing.JTextField();
        La_Cli_CS_Categ = new javax.swing.JLabel();
        La_Cli_CS_Cliente = new javax.swing.JLabel();
        La_Cli_CS_FRegi = new javax.swing.JLabel();
        La_Cli_CS_Regis = new javax.swing.JLabel();
        Bu_Cli_CS_CSesi = new javax.swing.JButton();
        Cli_Fecha = new javax.swing.JLabel();
        Cli_Hora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");
        setBounds(new java.awt.Rectangle(400, 150, 0, 0));
        setMaximumSize(new java.awt.Dimension(388, 479));
        setMinimumSize(new java.awt.Dimension(388, 479));
        setPreferredSize(new java.awt.Dimension(388, 479));
        setResizable(false);
        getContentPane().setLayout(null);

        PanelEscolar.setLayout(null);

        La_Cli_Es_TPren.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_Es_TPren.setText("Tipo de Prenda");
        PanelEscolar.add(La_Cli_Es_TPren);
        La_Cli_Es_TPren.setBounds(35, 20, 116, 29);

        La_Cli_Es_Color.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_Es_Color.setText("Color");
        PanelEscolar.add(La_Cli_Es_Color);
        La_Cli_Es_Color.setBounds(35, 61, 40, 29);

        La_Cli_Es_Talla.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_Es_Talla.setText("Talla");
        PanelEscolar.add(La_Cli_Es_Talla);
        La_Cli_Es_Talla.setBounds(35, 102, 44, 29);

        La_Cli_Es_Marca.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_Es_Marca.setText("Marca");
        PanelEscolar.add(La_Cli_Es_Marca);
        La_Cli_Es_Marca.setBounds(35, 143, 56, 29);

        La_Cli_Es_Tela.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_Es_Tela.setText("Tela");
        PanelEscolar.add(La_Cli_Es_Tela);
        La_Cli_Es_Tela.setBounds(35, 184, 35, 29);

        La_Cli_Es_Preci.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_Es_Preci.setText("Precio");
        PanelEscolar.add(La_Cli_Es_Preci);
        La_Cli_Es_Preci.setBounds(35, 266, 46, 29);

        La_Cli_Es_Comen.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_Es_Comen.setText("Comentarios");
        PanelEscolar.add(La_Cli_Es_Comen);
        La_Cli_Es_Comen.setBounds(161, 266, 95, 29);

        Ch_Cli_Es_TPren.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Ch_Cli_Es_TPren.setName(""); // NOI18N
        Ch_Cli_Es_TPren.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ch_Cli_Es_TPrenItemStateChanged(evt);
            }
        });
        PanelEscolar.add(Ch_Cli_Es_TPren);
        Ch_Cli_Es_TPren.setBounds(190, 20, 150, 20);
        Ch_Cli_Es_TPren.getAccessibleContext().setAccessibleName("");

        Ch_Cli_Es_Color.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ch_Cli_Es_ColorItemStateChanged(evt);
            }
        });
        PanelEscolar.add(Ch_Cli_Es_Color);
        Ch_Cli_Es_Color.setBounds(190, 61, 150, 20);

        Ch_Cli_Es_Talla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ch_Cli_Es_TallaItemStateChanged(evt);
            }
        });
        PanelEscolar.add(Ch_Cli_Es_Talla);
        Ch_Cli_Es_Talla.setBounds(190, 102, 150, 20);

        Ch_Cli_Es_Marca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ch_Cli_Es_MarcaItemStateChanged(evt);
            }
        });
        PanelEscolar.add(Ch_Cli_Es_Marca);
        Ch_Cli_Es_Marca.setBounds(190, 143, 150, 20);

        Ch_Cli_Es_Tela.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ch_Cli_Es_TelaItemStateChanged(evt);
            }
        });
        PanelEscolar.add(Ch_Cli_Es_Tela);
        Ch_Cli_Es_Tela.setBounds(190, 184, 150, 20);

        Bu_Cli_Es_Consu.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_Cli_Es_Consu.setForeground(new java.awt.Color(255, 0, 0));
        Bu_Cli_Es_Consu.setText("Consultar");
        Bu_Cli_Es_Consu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bu_Cli_Es_ConsuActionPerformed(evt);
            }
        });
        PanelEscolar.add(Bu_Cli_Es_Consu);
        Bu_Cli_Es_Consu.setBounds(232, 225, 109, 27);

        TF_Cli_Es_Preci.setText(" $ ");
        TF_Cli_Es_Preci.setEnabled(false);
        PanelEscolar.add(TF_Cli_Es_Preci);
        TF_Cli_Es_Preci.setBounds(35, 296, 76, 30);

        TF_Cli_Es_Comen.setEditable(false);
        TF_Cli_Es_Comen.setEnabled(false);
        PanelEscolar.add(TF_Cli_Es_Comen);
        TF_Cli_Es_Comen.setBounds(161, 296, 180, 30);

        jTabbedPane1.addTab("Escolar", PanelEscolar);

        jLabel25.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel25.setText("Nombre de la escuela");

        jLabel26.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel26.setText("Tipo de Uniforme");

        jLabel28.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel28.setText(" + Escudo");

        jCheckBox4.setFont(new java.awt.Font("Pristina", 0, 18)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel29.setText("Talla");

        jButton4.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 0));
        jButton4.setText("Consultar");

        jLabel30.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel30.setText("Precio");

        jLabel31.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        jLabel31.setText("Comentarios");

        jTextField6.setEditable(false);
        jTextField6.setMaximumSize(new java.awt.Dimension(8, 25));
        jTextField6.setMinimumSize(new java.awt.Dimension(8, 25));
        jTextField6.setPreferredSize(new java.awt.Dimension(8, 25));

        jTextField1.setText(" $ ");
        jTextField1.setEnabled(false);

        javax.swing.GroupLayout PanelConjuntosLayout = new javax.swing.GroupLayout(PanelConjuntos);
        PanelConjuntos.setLayout(PanelConjuntosLayout);
        PanelConjuntosLayout.setHorizontalGroup(
            PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelConjuntosLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConjuntosLayout.createSequentialGroup()
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addGroup(PanelConjuntosLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelConjuntosLayout.createSequentialGroup()
                                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addGroup(PanelConjuntosLayout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox4))
                                    .addComponent(jLabel29))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConjuntosLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(10, 10, 10)))
                        .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choice13, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(choice16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(choice22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        PanelConjuntosLayout.setVerticalGroup(
            PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelConjuntosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choice13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(12, 12, 12)
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(choice16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton4)
                .addGap(47, 47, 47)
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5)
                .addGroup(PanelConjuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Conjuntos", PanelConjuntos);

        PanelDeVestir.setLayout(null);

        La_Cli_DV_TPren.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_DV_TPren.setText("Tipo de Prenda");
        PanelDeVestir.add(La_Cli_DV_TPren);
        La_Cli_DV_TPren.setBounds(35, 20, 116, 29);

        La_Cli_DV_Color.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_DV_Color.setText("Color");
        PanelDeVestir.add(La_Cli_DV_Color);
        La_Cli_DV_Color.setBounds(35, 61, 40, 29);

        La_Cli_DV_Talla.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_DV_Talla.setText("Talla");
        PanelDeVestir.add(La_Cli_DV_Talla);
        La_Cli_DV_Talla.setBounds(35, 102, 44, 29);

        La_Cli_DV_Marca.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_DV_Marca.setText("Marca");
        PanelDeVestir.add(La_Cli_DV_Marca);
        La_Cli_DV_Marca.setBounds(35, 143, 56, 29);

        La_Cli_DV_Tela.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_DV_Tela.setText("Tela");
        PanelDeVestir.add(La_Cli_DV_Tela);
        La_Cli_DV_Tela.setBounds(35, 184, 35, 29);

        La_Cli_DV_Preci.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_DV_Preci.setText("Precio");
        PanelDeVestir.add(La_Cli_DV_Preci);
        La_Cli_DV_Preci.setBounds(35, 266, 46, 29);

        La_Cli_DV_Comen.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_DV_Comen.setText("Comentarios");
        PanelDeVestir.add(La_Cli_DV_Comen);
        La_Cli_DV_Comen.setBounds(161, 266, 95, 29);

        Ch_Cli_DV_TPren.setForeground(new java.awt.Color(0, 153, 0));
        Ch_Cli_DV_TPren.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ch_Cli_DV_TPrenItemStateChanged(evt);
            }
        });
        PanelDeVestir.add(Ch_Cli_DV_TPren);
        Ch_Cli_DV_TPren.setBounds(190, 20, 150, 20);

        Ch_Cli_DV_Color.setForeground(new java.awt.Color(0, 153, 0));
        Ch_Cli_DV_Color.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ch_Cli_DV_ColorItemStateChanged(evt);
            }
        });
        PanelDeVestir.add(Ch_Cli_DV_Color);
        Ch_Cli_DV_Color.setBounds(190, 61, 150, 20);

        Ch_Cli_DV_Talla.setForeground(new java.awt.Color(0, 153, 0));
        Ch_Cli_DV_Talla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ch_Cli_DV_TallaItemStateChanged(evt);
            }
        });
        PanelDeVestir.add(Ch_Cli_DV_Talla);
        Ch_Cli_DV_Talla.setBounds(190, 102, 150, 20);

        Ch_Cli_DV_Marca.setForeground(new java.awt.Color(0, 153, 0));
        Ch_Cli_DV_Marca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ch_Cli_DV_MarcaItemStateChanged(evt);
            }
        });
        PanelDeVestir.add(Ch_Cli_DV_Marca);
        Ch_Cli_DV_Marca.setBounds(190, 143, 150, 20);

        Ch_Cli_DV_Tela.setForeground(new java.awt.Color(0, 153, 0));
        Ch_Cli_DV_Tela.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ch_Cli_DV_TelaItemStateChanged(evt);
            }
        });
        PanelDeVestir.add(Ch_Cli_DV_Tela);
        Ch_Cli_DV_Tela.setBounds(190, 184, 150, 20);

        Bu_Cli_DV_Consu.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_Cli_DV_Consu.setForeground(new java.awt.Color(255, 0, 0));
        Bu_Cli_DV_Consu.setText("Consultar");
        Bu_Cli_DV_Consu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bu_Cli_DV_ConsuActionPerformed(evt);
            }
        });
        PanelDeVestir.add(Bu_Cli_DV_Consu);
        Bu_Cli_DV_Consu.setBounds(232, 225, 109, 27);

        TF_Cli_DV_Preci.setForeground(new java.awt.Color(0, 153, 0));
        TF_Cli_DV_Preci.setText(" $ ");
        TF_Cli_DV_Preci.setEnabled(false);
        PanelDeVestir.add(TF_Cli_DV_Preci);
        TF_Cli_DV_Preci.setBounds(35, 296, 76, 30);

        TF_Cli_DV_Comen.setEditable(false);
        TF_Cli_DV_Comen.setForeground(new java.awt.Color(0, 153, 0));
        TF_Cli_DV_Comen.setEnabled(false);
        PanelDeVestir.add(TF_Cli_DV_Comen);
        TF_Cli_DV_Comen.setBounds(161, 296, 180, 30);

        jTabbedPane1.addTab("De Vestir", null, PanelDeVestir, "");

        PanelCerrarSesion.setBackground(new java.awt.Color(205, 218, 230));

        La_Cli_CS_NUsua.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_CS_NUsua.setText("Nombre del Usuario: ");

        TF_Cli_CS_Usuar.setEditable(false);
        TF_Cli_CS_Usuar.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        TF_Cli_CS_Usuar.setText("Frias Perez Osvaldo Uriel");

        La_Cli_CS_Categ.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_CS_Categ.setText("Categoria:");

        La_Cli_CS_Cliente.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_CS_Cliente.setText("Cliente");

        La_Cli_CS_FRegi.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_CS_FRegi.setText("Fecha de Registro:");

        La_Cli_CS_Regis.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        La_Cli_CS_Regis.setText("01/01/2012");

        Bu_Cli_CS_CSesi.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        Bu_Cli_CS_CSesi.setForeground(new java.awt.Color(255, 0, 0));
        Bu_Cli_CS_CSesi.setText("Cerrar Cesion");
        Bu_Cli_CS_CSesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bu_Cli_CS_CSesiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(La_Cli_CS_NUsua)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(La_Cli_CS_Categ)
                        .addGap(10, 10, 10)
                        .addComponent(La_Cli_CS_Cliente))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TF_Cli_CS_Usuar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(La_Cli_CS_FRegi)
                            .addGap(20, 20, 20)
                            .addComponent(La_Cli_CS_Regis)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bu_Cli_CS_CSesi)
                .addGap(36, 36, 36))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(La_Cli_CS_NUsua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TF_Cli_CS_Usuar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(La_Cli_CS_Categ)
                    .addComponent(La_Cli_CS_Cliente))
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(La_Cli_CS_FRegi)
                    .addComponent(La_Cli_CS_Regis))
                .addGap(20, 20, 20)
                .addComponent(Bu_Cli_CS_CSesi))
        );

        javax.swing.GroupLayout PanelCerrarSesionLayout = new javax.swing.GroupLayout(PanelCerrarSesion);
        PanelCerrarSesion.setLayout(PanelCerrarSesionLayout);
        PanelCerrarSesionLayout.setHorizontalGroup(
            PanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCerrarSesionLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        PanelCerrarSesionLayout.setVerticalGroup(
            PanelCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCerrarSesionLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Cerrar Sesion", PanelCerrarSesion);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 28, 365, 415);
        jTabbedPane1.getAccessibleContext().setAccessibleName("Conjuntos");

        Cli_Fecha.setText("01/08/2013");
        getContentPane().add(Cli_Fecha);
        Cli_Fecha.setBounds(10, 0, 70, 22);

        Cli_Hora.setText("12:23");
        getContentPane().add(Cli_Hora);
        Cli_Hora.setBounds(94, 0, 40, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void iniciarEscolar(String condiciones,String excepciones){
        try {
            ArrayList<VistaPrendas> pren = consultar(condiciones);
            String[] excep = {"1","2","3","4","5"};
            if(!excepciones.contains(excep[0])){
                System.out.println("Entro 1");
                Ch_Cli_Es_TPren.removeAll();
                Ch_Cli_Es_TPren.add("");
            }
            if(!excepciones.contains(excep[1])){
                System.out.println("Entro 2");
                Ch_Cli_Es_Color.removeAll();
                Ch_Cli_Es_Color.add("");
            }
            if(!excepciones.contains(excep[2])){
                System.out.println("Entro 3");
                Ch_Cli_Es_Talla.removeAll();
                Ch_Cli_Es_Talla.add("");
            }
            if(!excepciones.contains(excep[3])){
                System.out.println("Entro 4");
                Ch_Cli_Es_Marca.removeAll();
                Ch_Cli_Es_Marca.add("");
            }
            if(!excepciones.contains(excep[4])){
                System.out.println("Entro 5");
                Ch_Cli_Es_Tela.removeAll();
                Ch_Cli_Es_Tela.add("");
            }
            String[] check = new String[] {"","","","",""};
            for(VistaPrendas p : pren){
                if(!check[0].contains(p.tipoPrenda) && !excepciones.contains(excep[0])){
                    Ch_Cli_Es_TPren.add(p.tipoPrenda);
                    check[0] += p.tipoPrenda;
                }
                if(!check[1].contains(p.color) && !excepciones.contains(excep[1])){
                    Ch_Cli_Es_Color.add(p.color);
                    check[1] += p.color;
                }
                if(!check[2].contains(p.talla) && !excepciones.contains(excep[2])){
                    Ch_Cli_Es_Talla.add(p.talla);
                    check[2] += p.talla;
                }
                if(!check[3].contains(p.marca) && !excepciones.contains(excep[3])){
                    Ch_Cli_Es_Marca.add(p.marca);
                    check[3] += p.marca;
                }
                if(!check[4].contains(p.tela) && !excepciones.contains(excep[4])){
                    Ch_Cli_Es_Tela.add(p.tela);
                    check[4] += p.tela;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Vendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void iniciarDeVestir(String condiciones,String excepciones){
        try {
            ArrayList<VistaPrendas> pren = consultar(condiciones);
            String[] excep = {"1","2","3","4","5"};
            if(!excepciones.contains(excep[0])){
                Ch_Cli_DV_TPren.removeAll();
                Ch_Cli_DV_TPren.add("");
            }
            if(!excepciones.contains(excep[1])){
                Ch_Cli_DV_Color.removeAll();
                Ch_Cli_DV_Color.add("");
            }
            if(!excepciones.contains(excep[2])){
                Ch_Cli_DV_Talla.removeAll();
                Ch_Cli_DV_Talla.add("");
            }
            if(!excepciones.contains(excep[3])){
                Ch_Cli_DV_Marca.removeAll();
                Ch_Cli_DV_Marca.add("");
            }
            if(!excepciones.contains(excep[4])){
                Ch_Cli_DV_Tela.removeAll();
                Ch_Cli_DV_Tela.add("");
            }
            String[] check = new String[] {"","","","",""};
            for(VistaPrendas p : pren){
                if(!check[0].contains(p.tipoPrenda) && !excepciones.contains(excep[0])){
                    Ch_Cli_DV_TPren.add(p.tipoPrenda);
                    check[0] += p.tipoPrenda;
                }
                if(!check[1].contains(p.color) && !excepciones.contains(excep[1])){
                    Ch_Cli_DV_Color.add(p.color);
                    check[1] += p.color;
                }
                if(!check[2].contains(p.talla) && !excepciones.contains(excep[2])){
                    Ch_Cli_DV_Talla.add(p.talla);
                    check[2] += p.talla;
                }
                if(!check[3].contains(p.marca) && !excepciones.contains(excep[3])){
                    Ch_Cli_DV_Marca.add(p.marca);
                    check[3] += p.marca;
                }
                if(!check[4].contains(p.tela) && !excepciones.contains(excep[4])){
                    Ch_Cli_DV_Tela.add(p.tela);
                    check[4] += p.tela;
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Vendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String[] crearConsulta(String genero,String tPrenda,String color,String talla,String marca,String tela){        
        String[] query = new String[] {genero,"9"};
        if(!tPrenda.equals("")){
            query[0] += " and tipo_de_prenda = '"+tPrenda+"'";
            query[1] += "1";
        }
        if(!color.equals("")){
            query[0] += " and color = '"+color+"'";
            query[1] += "2";
        }
        if(!talla.equals("")){
            query[0] += " and talla = '"+talla+"'";
            query[1] += "3";
        }
        if(!marca.equals("")){
            query[0] += " and marca = '"+marca+"'";
            query[1] += "4";
        }
        if(!tela.equals("")){
            query[0] += " and tela = '"+tela+"'";
            query[1] += "5";
        }
        return query;
    }
    
    public ArrayList<VistaPrendas> consultar(String cond){
        ArrayList<VistaPrendas> res = new ArrayList<>();
        String query = "";
        if(cond.equals("")){
            query = "select * from prendas";
        }else{
            query = "select * from prendas where "+cond;
        }
        try {
            con.iniciar();
            con.consultar(query);
            ResultSet rsPrenda = con.resultado;
            while(rsPrenda.next())
            {
                VistaPrendas aux = new VistaPrendas();
                aux.tipoPrenda = rsPrenda.getString("Tipo_de_Prenda");
                aux.color = rsPrenda.getString("Color");
                aux.talla = rsPrenda.getString("Talla");
                aux.marca = rsPrenda.getString("Marca");
                aux.tela = rsPrenda.getString("Tela");
                aux.precio = rsPrenda.getFloat("Precio");
                aux.id = rsPrenda.getInt("ID");
                res.add(aux);
            }
            con.detener();
        } catch (SQLException ex) {
            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    


    private void Bu_Cli_CS_CSesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bu_Cli_CS_CSesiActionPerformed
        this.setVisible(false);
        LogIn Log = new LogIn();
        Log.setVisible(true);
        this.dispose();
        /*Connection conexion = null;
        conexion=ConexionMySQL.conectar();
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            // Insertar un nuevo dato en una tabla de la base de datos
            String insertCatalogoSQLinicio = "insert into catalogo_prendas (Tipo_de_prenda,Color,Marca,Tela) values (";
            String insertCatalogoSQLfin = ")";
            String insertSQL = insertCatalogoSQLinicio+"'Sueter2','Azul Marino2','Pedrito2','Punto de Roma2'"+insertCatalogoSQLfin;
            int insertado = consulta.executeUpdate(insertSQL);
            System.out.println(insertado);
            if(insertado == 1){
                System.out.println("Se ha eliminado una prenda del catalogo");
            }else{
                System.out.println("hubo un error al eliminar el registro");
            }
            // Borrar un nuevo dato de una tabla de la base de datos
            String deleteSQL = "delete from catalogo_prendas where Tipo_de_prenda='Sueter2'";
            int eliminado = consulta.executeUpdate(deleteSQL);
            System.out.println(eliminado);
            // Consulta simple de una tabla de la base de datos
            ResultSet resultado =consulta.executeQuery("select * from Catalogo_prendas"); 
            // Mostrar en consola los valores obtenidos de la consulta
            ArrayList<String> OL = new ArrayList<>();
            while(resultado.next())
            {
                OL.add(resultado.getString("Tipo_de_prenda"));
            }
            for(int i = 0; i<OL.size(); i++)
            {
                System.out.println(OL.get(i));
            }
            
            consulta.close();
            conexion.close();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_Bu_Cli_CS_CSesiActionPerformed

    private void Ch_Cli_Es_TPrenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ch_Cli_Es_TPrenItemStateChanged
        String[] consulta = crearConsulta("Genero = 'Escolar'",Ch_Cli_Es_TPren.getSelectedItem(),Ch_Cli_Es_Color.getSelectedItem(),Ch_Cli_Es_Talla.getSelectedItem(),Ch_Cli_Es_Marca.getSelectedItem(),Ch_Cli_Es_Tela.getSelectedItem());
        iniciarEscolar(consulta[0],consulta[1]);
        System.out.println(consulta[1]);
        if(consulta[1].contains("12345")){
            Bu_Cli_Es_Consu.setVisible(true);
        }else{
            Bu_Cli_Es_Consu.setVisible(false);
        }
        //System.out.println(consulta[0]+consulta[1]);
    }//GEN-LAST:event_Ch_Cli_Es_TPrenItemStateChanged

    private void Ch_Cli_Es_ColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ch_Cli_Es_ColorItemStateChanged
        String[] consulta = crearConsulta("Genero = 'Escolar'",Ch_Cli_Es_TPren.getSelectedItem(),Ch_Cli_Es_Color.getSelectedItem(),Ch_Cli_Es_Talla.getSelectedItem(),Ch_Cli_Es_Marca.getSelectedItem(),Ch_Cli_Es_Tela.getSelectedItem());
        iniciarEscolar(consulta[0],consulta[1]);
        System.out.println(consulta[1]);
        if(consulta[1].contains("12345")){
            Bu_Cli_Es_Consu.setVisible(true);
        }else{
            Bu_Cli_Es_Consu.setVisible(false);
        }
        //System.out.println(consulta[0]+consulta[1]);
    }//GEN-LAST:event_Ch_Cli_Es_ColorItemStateChanged

    private void Ch_Cli_Es_TallaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ch_Cli_Es_TallaItemStateChanged
        String[] consulta = crearConsulta("Genero = 'Escolar'",Ch_Cli_Es_TPren.getSelectedItem(),Ch_Cli_Es_Color.getSelectedItem(),Ch_Cli_Es_Talla.getSelectedItem(),Ch_Cli_Es_Marca.getSelectedItem(),Ch_Cli_Es_Tela.getSelectedItem());
        iniciarEscolar(consulta[0],consulta[1]);
        System.out.println(consulta[1]);
        if(consulta[1].contains("12345")){
            Bu_Cli_Es_Consu.setVisible(true);
        }else{
            Bu_Cli_Es_Consu.setVisible(false);
        }
        //System.out.println(consulta[0]+consulta[1]);
    }//GEN-LAST:event_Ch_Cli_Es_TallaItemStateChanged

    private void Ch_Cli_Es_MarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ch_Cli_Es_MarcaItemStateChanged
        String[] consulta = crearConsulta("Genero = 'Escolar'",Ch_Cli_Es_TPren.getSelectedItem(),Ch_Cli_Es_Color.getSelectedItem(),Ch_Cli_Es_Talla.getSelectedItem(),Ch_Cli_Es_Marca.getSelectedItem(),Ch_Cli_Es_Tela.getSelectedItem());
        iniciarEscolar(consulta[0],consulta[1]);
        System.out.println(consulta[1]);
        if(consulta[1].contains("12345")){
            Bu_Cli_Es_Consu.setVisible(true);
        }else{
            Bu_Cli_Es_Consu.setVisible(false);
        }
        //System.out.println(consulta[0]+consulta[1]);
    }//GEN-LAST:event_Ch_Cli_Es_MarcaItemStateChanged

    private void Ch_Cli_Es_TelaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ch_Cli_Es_TelaItemStateChanged
        String[] consulta = crearConsulta("Genero = 'Escolar'",Ch_Cli_Es_TPren.getSelectedItem(),Ch_Cli_Es_Color.getSelectedItem(),Ch_Cli_Es_Talla.getSelectedItem(),Ch_Cli_Es_Marca.getSelectedItem(),Ch_Cli_Es_Tela.getSelectedItem());
        iniciarEscolar(consulta[0],consulta[1]);
        System.out.println(consulta[1]);
        if(consulta[1].contains("12345")){
            Bu_Cli_Es_Consu.setVisible(true);
        }else{
            Bu_Cli_Es_Consu.setVisible(false);
        }
        //System.out.println(consulta[0]+consulta[1]);
    }//GEN-LAST:event_Ch_Cli_Es_TelaItemStateChanged

    private void Ch_Cli_DV_TPrenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ch_Cli_DV_TPrenItemStateChanged
        String[] consulta = crearConsulta("Genero = 'De Vestir'",Ch_Cli_DV_TPren.getSelectedItem(),Ch_Cli_DV_Color.getSelectedItem(),Ch_Cli_DV_Talla.getSelectedItem(),Ch_Cli_DV_Marca.getSelectedItem(),Ch_Cli_DV_Tela.getSelectedItem());
        iniciarDeVestir(consulta[0],consulta[1]);
        if(consulta[1].contains("12345")){
            Bu_Cli_DV_Consu.setVisible(true);
        }else{
            Bu_Cli_DV_Consu.setVisible(false);
        }
        //System.out.println(consulta[0]+consulta[1]);
    }//GEN-LAST:event_Ch_Cli_DV_TPrenItemStateChanged

    private void Ch_Cli_DV_ColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ch_Cli_DV_ColorItemStateChanged
        String[] consulta = crearConsulta("Genero = 'De Vestir'",Ch_Cli_DV_TPren.getSelectedItem(),Ch_Cli_DV_Color.getSelectedItem(),Ch_Cli_DV_Talla.getSelectedItem(),Ch_Cli_DV_Marca.getSelectedItem(),Ch_Cli_DV_Tela.getSelectedItem());
        iniciarDeVestir(consulta[0],consulta[1]);
        if(consulta[1].contains("12345")){
            Bu_Cli_DV_Consu.setVisible(true);
        }else{
            Bu_Cli_DV_Consu.setVisible(false);
        }
        //System.out.println(consulta[0]+consulta[1]);
    }//GEN-LAST:event_Ch_Cli_DV_ColorItemStateChanged

    private void Ch_Cli_DV_TallaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ch_Cli_DV_TallaItemStateChanged
        String[] consulta = crearConsulta("Genero = 'De Vestir'",Ch_Cli_DV_TPren.getSelectedItem(),Ch_Cli_DV_Color.getSelectedItem(),Ch_Cli_DV_Talla.getSelectedItem(),Ch_Cli_DV_Marca.getSelectedItem(),Ch_Cli_DV_Tela.getSelectedItem());
        iniciarDeVestir(consulta[0],consulta[1]);
        if(consulta[1].contains("12345")){
            Bu_Cli_DV_Consu.setVisible(true);
        }else{
            Bu_Cli_DV_Consu.setVisible(false);
        }
        //System.out.println(consulta[0]+consulta[1]);
    }//GEN-LAST:event_Ch_Cli_DV_TallaItemStateChanged

    private void Ch_Cli_DV_MarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ch_Cli_DV_MarcaItemStateChanged
        String[] consulta = crearConsulta("Genero = 'De Vestir'",Ch_Cli_DV_TPren.getSelectedItem(),Ch_Cli_DV_Color.getSelectedItem(),Ch_Cli_DV_Talla.getSelectedItem(),Ch_Cli_DV_Marca.getSelectedItem(),Ch_Cli_DV_Tela.getSelectedItem());
        iniciarDeVestir(consulta[0],consulta[1]);
        if(consulta[1].contains("12345")){
            Bu_Cli_DV_Consu.setVisible(true);
        }else{
            Bu_Cli_DV_Consu.setVisible(false);
        }
        //System.out.println(consulta[0]+consulta[1]);
    }//GEN-LAST:event_Ch_Cli_DV_MarcaItemStateChanged

    private void Ch_Cli_DV_TelaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ch_Cli_DV_TelaItemStateChanged
        String[] consulta = crearConsulta("Genero = 'De Vestir'",Ch_Cli_DV_TPren.getSelectedItem(),Ch_Cli_DV_Color.getSelectedItem(),Ch_Cli_DV_Talla.getSelectedItem(),Ch_Cli_DV_Marca.getSelectedItem(),Ch_Cli_DV_Tela.getSelectedItem());
        iniciarDeVestir(consulta[0],consulta[1]);
        if(consulta[1].contains("12345")){
            Bu_Cli_DV_Consu.setVisible(true);
        }else{
            Bu_Cli_DV_Consu.setVisible(false);
        }
        //System.out.println(consulta[0]+consulta[1]);
    }//GEN-LAST:event_Ch_Cli_DV_TelaItemStateChanged

    private void Bu_Cli_Es_ConsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bu_Cli_Es_ConsuActionPerformed
        if(!TF_Cli_Es_Preci.getText().equals(" $ ")){
            System.out.println("Limpiar");
            new Cliente().setVisible(true);
            iniciarEscolar("Genero = 'Escolar'","");
            
            Bu_Cli_Es_Consu.setText("Consultar");
            Bu_Cli_Es_Consu.setVisible(false);
            TF_Cli_Es_Preci.setText(" $ ");
            
        }else{
            String[] consulta = crearConsulta("Genero = 'Escolar'",Ch_Cli_Es_TPren.getSelectedItem(),Ch_Cli_Es_Color.getSelectedItem(),Ch_Cli_Es_Talla.getSelectedItem(),Ch_Cli_Es_Marca.getSelectedItem(),Ch_Cli_Es_Tela.getSelectedItem());
            ArrayList<VistaPrendas> busqueda = consultar(consulta[0]);
            TF_Cli_Es_Preci.setText("$ "+Float.toString(busqueda.get(0).precio));
            Bu_Cli_Es_Consu.setText("Limpiar");
        }
    }//GEN-LAST:event_Bu_Cli_Es_ConsuActionPerformed

    private void Bu_Cli_DV_ConsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bu_Cli_DV_ConsuActionPerformed
        String[] consulta = crearConsulta("Genero = 'De Vestir'",Ch_Cli_DV_TPren.getSelectedItem(),Ch_Cli_DV_Color.getSelectedItem(),Ch_Cli_DV_Talla.getSelectedItem(),Ch_Cli_DV_Marca.getSelectedItem(),Ch_Cli_DV_Tela.getSelectedItem());
        ArrayList<VistaPrendas> busqueda = consultar(consulta[0]);
        TF_Cli_DV_Preci.setText("$ "+Float.toString(busqueda.get(0).precio));
    }//GEN-LAST:event_Bu_Cli_DV_ConsuActionPerformed
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
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bu_Cli_CS_CSesi;
    private javax.swing.JButton Bu_Cli_DV_Consu;
    private javax.swing.JButton Bu_Cli_Es_Consu;
    private java.awt.Choice Ch_Cli_DV_Color;
    private java.awt.Choice Ch_Cli_DV_Marca;
    private java.awt.Choice Ch_Cli_DV_TPren;
    private java.awt.Choice Ch_Cli_DV_Talla;
    private java.awt.Choice Ch_Cli_DV_Tela;
    private java.awt.Choice Ch_Cli_Es_Color;
    private java.awt.Choice Ch_Cli_Es_Marca;
    private java.awt.Choice Ch_Cli_Es_TPren;
    private java.awt.Choice Ch_Cli_Es_Talla;
    private java.awt.Choice Ch_Cli_Es_Tela;
    private javax.swing.JLabel Cli_Fecha;
    private javax.swing.JLabel Cli_Hora;
    private javax.swing.JLabel La_Cli_CS_Categ;
    private javax.swing.JLabel La_Cli_CS_Cliente;
    private javax.swing.JLabel La_Cli_CS_FRegi;
    private javax.swing.JLabel La_Cli_CS_NUsua;
    private javax.swing.JLabel La_Cli_CS_Regis;
    private javax.swing.JLabel La_Cli_DV_Color;
    private javax.swing.JLabel La_Cli_DV_Comen;
    private javax.swing.JLabel La_Cli_DV_Marca;
    private javax.swing.JLabel La_Cli_DV_Preci;
    private javax.swing.JLabel La_Cli_DV_TPren;
    private javax.swing.JLabel La_Cli_DV_Talla;
    private javax.swing.JLabel La_Cli_DV_Tela;
    private javax.swing.JLabel La_Cli_Es_Color;
    private javax.swing.JLabel La_Cli_Es_Comen;
    private javax.swing.JLabel La_Cli_Es_Marca;
    private javax.swing.JLabel La_Cli_Es_Preci;
    private javax.swing.JLabel La_Cli_Es_TPren;
    private javax.swing.JLabel La_Cli_Es_Talla;
    private javax.swing.JLabel La_Cli_Es_Tela;
    private javax.swing.JPanel PanelCerrarSesion;
    private javax.swing.JPanel PanelConjuntos;
    private javax.swing.JPanel PanelDeVestir;
    private javax.swing.JPanel PanelEscolar;
    private javax.swing.JTextField TF_Cli_CS_Usuar;
    private javax.swing.JTextField TF_Cli_DV_Comen;
    private javax.swing.JTextField TF_Cli_DV_Preci;
    private javax.swing.JTextField TF_Cli_Es_Comen;
    private javax.swing.JTextField TF_Cli_Es_Preci;
    private java.awt.Choice choice13;
    private java.awt.Choice choice16;
    private java.awt.Choice choice22;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
