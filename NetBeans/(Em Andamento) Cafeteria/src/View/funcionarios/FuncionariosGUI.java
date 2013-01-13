

package View.funcionarios;

import Controle.Ferramentas;
import Dao.FuncionariosDao;
import Dao.LoginDao;
import Modelo.Funcionario;
import Modelo.Login;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class FuncionariosGUI extends javax.swing.JFrame {

    private List<Funcionario> funcionarios = new LinkedList<Funcionario>();
    private List<Login> logins = new LinkedList<Login>();

    private FuncionariosDao daoF = new FuncionariosDao();
    private LoginDao daoL = new LoginDao();

    public FuncionariosGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadInitialData();
    }

    public void loadInitialData() { //atualiza as tabelas com que que está no banco.
        try {
            loadFuncionario();
            loadLogin();
            refreshTables();
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro ao carregar dados.", "Erro interno.");
        }
    }
    public void refreshTables(){ //atualiza as tabelas de acordo com a lista
        refreshFuncionarios();
        refreshLogin();
    }
    public void refreshTableLogin(){
        try {
            loadLogin();
            refreshLogin();
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro ao carregar dados.", "Erro interno.");
        }
    }
    public void refreshTableFuncionario(){
        try {
            loadFuncionario();
            refreshFuncionarios();
        } catch (SQLException ex) {
            Ferramentas.showErro("Erro ao carregar dados.", "Erro interno.");
        }
    }

    public void loadFuncionario() throws SQLException{funcionarios= daoF.getAllFuncionarios();}
    public void loadLogin() throws SQLException{logins = daoL.getAllLogin();}
    public void refreshFuncionarios(){Ferramentas.montaJTable(tableFuncionario, funcionarios, Funcionario.class);}
    public void refreshLogin(){Ferramentas.montaJTable(tableLogin, logins, Login.class);}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnnovo = new javax.swing.JLabel();
        btnexcluir = new javax.swing.JLabel();
        btnalterar = new javax.swing.JLabel();
        btnvoltar = new javax.swing.JLabel();
        btnview = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtdescricao = new javax.swing.JTextField();
        btnfiltrar = new javax.swing.JLabel();
        txtdescricao1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        txtdescricao2 = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFuncionario = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnnovo1 = new javax.swing.JLabel();
        btnalterar1 = new javax.swing.JLabel();
        btnexcluir1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableLogin = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionarios e Login");
        setResizable(false);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(90, 103, 110));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/close.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/minimizar.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Funcionários e Logins");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 651, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        btnnovo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnnovo.setForeground(new java.awt.Color(255, 255, 255));
        btnnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/novo.png"))); // NOI18N
        btnnovo.setText("Novo");
        btnnovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnovoMouseClicked(evt);
            }
        });

        btnexcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnexcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/excluir.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnexcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexcluirMouseClicked(evt);
            }
        });

        btnalterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnalterar.setForeground(new java.awt.Color(255, 255, 255));
        btnalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/alterar.png"))); // NOI18N
        btnalterar.setText("Alterar");
        btnalterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnalterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnalterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnalterarMouseClicked(evt);
            }
        });

        btnvoltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnvoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/home.png"))); // NOI18N
        btnvoltar.setText("Voltar");
        btnvoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnvoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnvoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnvoltarMouseClicked(evt);
            }
        });

        btnview.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnview.setForeground(new java.awt.Color(255, 255, 255));
        btnview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/pesquisar.png"))); // NOI18N
        btnview.setText("Visualizar");
        btnview.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnview.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnviewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnovo)
                    .addComponent(btnexcluir)
                    .addComponent(btnalterar)
                    .addComponent(btnview))
                .addGap(8, 8, 8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(btnvoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnnovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnalterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnview)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnvoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções de filtragem:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pesquisar nome:");

        btnfiltrar.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnfiltrar.setForeground(new java.awt.Color(255, 255, 255));
        btnfiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/pesquisar.png"))); // NOI18N
        btnfiltrar.setText("Filtrar");
        btnfiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnfiltrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnfiltrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfiltrarMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pesquisar cidade:");

        jCheckBox1.setOpaque(false);

        jCheckBox2.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pesquisar cargo:");

        jCheckBox3.setOpaque(false);

        jCheckBox4.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox4.setText("Apenas Funcionarios sem Login");
        jCheckBox4.setOpaque(false);

        jCheckBox5.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox5.setText("Apenas Funcionarios com Login");
        jCheckBox5.setOpaque(false);
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox6.setText("Todos (com ou sem Login)");
        jCheckBox6.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox5)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtdescricao2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox3))
                            .addComponent(jLabel9)))
                    .addComponent(jCheckBox6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnfiltrar)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jCheckBox1)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox2)
                                .addComponent(txtdescricao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdescricao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jCheckBox3)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnfiltrar)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        tableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableFuncionario);

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        btnnovo1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnnovo1.setForeground(new java.awt.Color(255, 255, 255));
        btnnovo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnnovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/novo.png"))); // NOI18N
        btnnovo1.setText("Adicionar Login");
        btnnovo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnovo1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnovo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnovo1MouseClicked(evt);
            }
        });

        btnalterar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnalterar1.setForeground(new java.awt.Color(255, 255, 255));
        btnalterar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/alterar.png"))); // NOI18N
        btnalterar1.setText("Alterar Login");
        btnalterar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnalterar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnalterar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnalterar1MouseClicked(evt);
            }
        });

        btnexcluir1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnexcluir1.setForeground(new java.awt.Color(255, 255, 255));
        btnexcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/excluir.png"))); // NOI18N
        btnexcluir1.setText("Excluir Login");
        btnexcluir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexcluir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnexcluir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexcluir1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnovo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexcluir1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnalterar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnovo1)
                    .addComponent(btnalterar1)
                    .addComponent(btnexcluir1))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));

        tableLogin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableLogin);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnfiltrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfiltrarMouseClicked
        
}//GEN-LAST:event_btnfiltrarMouseClicked

    private void btnalterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalterarMouseClicked
        if(tableFuncionario.getSelectedRow() == -1){
            Ferramentas.showErro("Selecione um funcionário da tabela para poder alterar","Erro");
            return;
        }
        if(!Ferramentas.showPergunta("Realmente deseja alterar esse registro?","Aviso!"))return;
        new EditFuncionarioGUI(this,daoF,funcionarios.get(tableFuncionario.getSelectedRow())).setVisible(true);
    }//GEN-LAST:event_btnalterarMouseClicked

    private void btnexcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexcluirMouseClicked
        try {
            if (tableFuncionario.getSelectedRow() == -1) {
                Ferramentas.showErro("Selecione um funcionario da tabela para poder excluir", "Erro");
                return;
            }
            if (!Ferramentas.showPergunta("Realmente deseja excluir esse registro?", "Aviso!")) {
                return;
            }
            Funcionario f = funcionarios.get(tableFuncionario.getSelectedRow());

            daoF.removeFuncionario(f.getId());
            daoL.removeLogin(f.getId());
            loadInitialData();
        } catch (SQLException ex) {
            Ferramentas.showErro("Não foi possível efetuar a operação.","Erro");
        }
    }//GEN-LAST:event_btnexcluirMouseClicked

    private void btnvoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnvoltarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnvoltarMouseClicked

    private void btnnovo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovo1MouseClicked
        if(tableFuncionario.getSelectedRow() == -1){
            Ferramentas.showErro("Selecione um funcionário da tabela para poder adicionar um login a ele.","Erro");
            return;
        }
        new EditLoginGUI(this,daoL,funcionarios.get(tableFuncionario.getSelectedRow())).setVisible(true);
    }//GEN-LAST:event_btnnovo1MouseClicked

    private void btnalterar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnalterar1MouseClicked
        if(tableLogin.getSelectedRow() == -1){
            Ferramentas.showErro("Selecione um login da tabela para poder alterar","Erro");
            return;
        }
        if(!Ferramentas.showPergunta("Realmente deseja alterar esse registro?","Aviso!"))return;
        Login l = logins.get(tableLogin.getSelectedRow());
        new EditLoginGUI(this,daoL,l.getFuncionario(),l).setVisible(true);
    }//GEN-LAST:event_btnalterar1MouseClicked

    private void btnexcluir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexcluir1MouseClicked
        try {
            if (tableLogin.getSelectedRow() == -1) {
                Ferramentas.showErro("Selecione um login da tabela para poder excluir", "Erro");
                return;
            }
            if (!Ferramentas.showPergunta("Realmente deseja excluir esse registro?", "Aviso!")) {
                return;
            }
            daoL.removeLoginById(logins.get(tableLogin.getSelectedRow()).getId());
            refreshLogin();
        } catch (SQLException ex) {
            Ferramentas.showErro("Não foi possível efetuar a operação.","Erro");
        }
    }//GEN-LAST:event_btnexcluir1MouseClicked

    private void btnviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnviewMouseClicked
        if(tableFuncionario.getSelectedRow() == -1){
            Ferramentas.showErro("Selecione um funcionário da tabela para poder visualizar.","Erro");
            return;
        }
        new EditFuncionarioGUI(funcionarios.get(tableFuncionario.getSelectedRow())).setVisible(true);
    }//GEN-LAST:event_btnviewMouseClicked

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void btnnovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnovoMouseClicked
        new EditFuncionarioGUI(this,daoF).setVisible(true);
    }//GEN-LAST:event_btnnovoMouseClicked
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionariosGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnalterar;
    private javax.swing.JLabel btnalterar1;
    private javax.swing.JLabel btnexcluir;
    private javax.swing.JLabel btnexcluir1;
    private javax.swing.JLabel btnfiltrar;
    private javax.swing.JLabel btnnovo;
    private javax.swing.JLabel btnnovo1;
    private javax.swing.JLabel btnview;
    private javax.swing.JLabel btnvoltar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableFuncionario;
    private javax.swing.JTable tableLogin;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtdescricao1;
    private javax.swing.JTextField txtdescricao2;
    // End of variables declaration//GEN-END:variables

}
