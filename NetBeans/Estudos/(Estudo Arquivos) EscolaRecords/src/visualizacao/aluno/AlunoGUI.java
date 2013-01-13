

package visualizacao.aluno;

import controle.Ferramentas;
import controle.MyTableModel;
import controle.OperacaoTipo;
import controle.aluno.AlunoControl;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import modelo.Aluno;


public class AlunoGUI extends javax.swing.JFrame {

    private ListSelectionModel lsc;
    private AlunoControl control;
    private OperacaoTipo operacao;
    private boolean gravado;
    private int index;

    public AlunoGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        control = new AlunoControl();
        loadInitialData();
        concluirOperacao();
        gravado=true;
        index = tblAlunos.getSelectedRow();
     }
     private void loadInitialData(){
        tblAlunos.setModel(new MyTableModel(Aluno.class,control.getInitialLista(),tblAlunos));
     }
    private void refreshJTable(){
        tblAlunos.setModel(new MyTableModel(Aluno.class,control.getList(),tblAlunos));
    }
    
    private void getSelecionados(JTable t){
        if (operacao != OperacaoTipo.inativo) return;
        if (t.getSelectedRow() != -1) {
            index = t.getSelectedRow();
            txtcodigo.setText(String.valueOf(control.getList().get(index).getRa()));
            txtnome.setText(control.getList().get(index).getNome());
            txtdata.setText(control.getList().get(index).getDatanasc());
            txtcurso.setText(control.getList().get(index).getCurso());
            txtperiodo.setText(control.getList().get(index).getPeriodo());
            txtturma.setText(control.getList().get(index).getTurma());
            txtano.setText(String.valueOf(control.getList().get(index).getRa()));
        }
    }
    private void concluirOperacao(){
        Ferramentas.limparCampos(txtcodigo,txtnome,txtdata,txtcurso,txtperiodo,txtturma,txtano);
        Ferramentas.habilitarCampos(false,txtcodigo,txtnome,txtdata,txtcurso,txtperiodo,txtturma,txtano);
        operacao= OperacaoTipo.inativo;
        gravado =false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlunos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtdata = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtcurso = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtperiodo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtturma = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtano = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnalterar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btnnovo = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        btngravar = new javax.swing.JButton();
        btnhome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alunos");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alunos");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/onebit_18.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        tblAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblAlunos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsc = tblAlunos.getSelectionModel();
        lsc.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                if(!e.getValueIsAdjusting())getSelecionados(tblAlunos);
            }
        });
        jScrollPane1.setViewportView(tblAlunos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(90, 103, 110));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nome:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("RA:");

        txtcodigo.setBackground(new java.awt.Color(153, 153, 255));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Data Nasc.:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Curso:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Período:");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Turma:");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Ano:");

        jButton1.setText("Informações Escolares");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtnome)))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtturma, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtano, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtperiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtturma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jButton1))
                    .addComponent(txtano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(90, 103, 110));

        btnalterar.setBackground(new java.awt.Color(90, 103, 110));
        btnalterar.setForeground(new java.awt.Color(255, 255, 255));
        btnalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/alterarover.png"))); // NOI18N
        btnalterar.setText("Alterar");
        btnalterar.setBorder(null);
        btnalterar.setBorderPainted(false);
        btnalterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnalterar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/alterarnormal.png"))); // NOI18N
        btnalterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarActionPerformed(evt);
            }
        });

        btnexcluir.setBackground(new java.awt.Color(90, 103, 110));
        btnexcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/onebit_33over.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.setBorder(null);
        btnexcluir.setBorderPainted(false);
        btnexcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnexcluir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/onebit_33normal.png"))); // NOI18N
        btnexcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btnnovo.setBackground(new java.awt.Color(90, 103, 110));
        btnnovo.setForeground(new java.awt.Color(255, 255, 255));
        btnnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/onebit_31over.png"))); // NOI18N
        btnnovo.setText("Novo");
        btnnovo.setBorder(null);
        btnnovo.setBorderPainted(false);
        btnnovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnovo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/onebit_31normal.png"))); // NOI18N
        btnnovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoActionPerformed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(90, 103, 110));
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/onebit_36over.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.setBorder(null);
        btncancelar.setBorderPainted(false);
        btncancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btncancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/onebit_36normal.png"))); // NOI18N
        btncancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnok.setBackground(new java.awt.Color(90, 103, 110));
        btnok.setForeground(new java.awt.Color(255, 255, 255));
        btnok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/onebit_34over.png"))); // NOI18N
        btnok.setText("OK");
        btnok.setBorder(null);
        btnok.setBorderPainted(false);
        btnok.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnok.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/onebit_34normal.png"))); // NOI18N
        btnok.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        btngravar.setBackground(new java.awt.Color(90, 103, 110));
        btngravar.setForeground(new java.awt.Color(255, 255, 255));
        btngravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/onebit_12over.png"))); // NOI18N
        btngravar.setText("Gravar");
        btngravar.setBorder(null);
        btngravar.setBorderPainted(false);
        btngravar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btngravar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/onebit_12normal.png"))); // NOI18N
        btngravar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btngravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngravarActionPerformed(evt);
            }
        });

        btnhome.setBackground(new java.awt.Color(90, 103, 110));
        btnhome.setForeground(new java.awt.Color(255, 255, 255));
        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/home48over.png"))); // NOI18N
        btnhome.setText("Home");
        btnhome.setBorder(null);
        btnhome.setBorderPainted(false);
        btnhome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/visualizacao/icons/home48normal.png"))); // NOI18N
        btnhome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnnovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnalterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnexcluir)
                .addGap(33, 33, 33)
                .addComponent(btnok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addComponent(btngravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnhome)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btngravar, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnhome, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnok, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnexcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnalterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                    .addComponent(btnnovo, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoActionPerformed
        Ferramentas.limparCampos(txtcodigo,txtnome,txtdata,txtcurso,txtperiodo,txtturma,txtano);
        Ferramentas.habilitarCampos(true,txtcodigo,txtnome,txtdata,txtcurso,txtperiodo,txtturma,txtano);
        operacao = OperacaoTipo.novo;
    }//GEN-LAST:event_btnnovoActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        if (operacao == OperacaoTipo.inativo) return; //caso não seje nem alterar nem novo, não faz nada

        if(!Ferramentas.isCompleteFields(txtcodigo,txtnome,txtdata,txtcurso,txtperiodo,txtturma,txtano))return;

        boolean op;
        if (operacao == OperacaoTipo.novo) {
            op= control.add(
                    Integer.parseInt(txtcodigo.getText()),
                    txtnome.getText(),
                    txtdata.getText(),
                    Integer.parseInt(txtano.getText()),
                    txtcurso.getText(),
                    txtperiodo.getText(),
                    txtturma.getText());
        }else{
            op= control.up(
                    Integer.parseInt(txtcodigo.getText()),
                    txtnome.getText(),
                    txtdata.getText(),
                    Integer.parseInt(txtano.getText()),
                    txtcurso.getText(),
                    txtperiodo.getText(),
                    txtturma.getText(),
                    index);
        }
        if(op){
            Ferramentas.showMensagem("Operação realizada com sucesso.","Informe");
            concluirOperacao();
            refreshJTable();
        }
    }//GEN-LAST:event_btnokActionPerformed

    private void btnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarActionPerformed
        if(!Ferramentas.showPergunta("Realmente deseja alterar esse aluno?","Atenção")) return;
        Ferramentas.habilitarCampos(true,txtcodigo,txtnome,txtdata,txtcurso,txtperiodo,txtturma,txtano);
        operacao = OperacaoTipo.alterar;
    }//GEN-LAST:event_btnalterarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        if (operacao != OperacaoTipo.inativo) return; //não pode estar numa operação.
        if (index == -1){
            Ferramentas.showErro("Selecione pelo menos um aluno a ser excluido.","Erro");
            return;
        }
        if(!Ferramentas.showPergunta("Realmente deseja remover esse aluno?","Atenção")) return;
        control.del(Integer.parseInt(txtcodigo.getText()));
        Ferramentas.showMensagem("Excluido com sucesso.","Informe");
        refreshJTable();
        gravado = false;
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        if (operacao == OperacaoTipo.inativo) return; //caso não seje nem alterar nem novo, não faz nada
        if(!Ferramentas.showPergunta("Realmente deseja cancelar a operação?","Atenção")) return;
        Ferramentas.showMensagem("Operação cancelada com sucesso.","Informe");
        concluirOperacao();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btngravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngravarActionPerformed
        if (operacao != OperacaoTipo.inativo) return; //não pode estar numa operação.
        if (index == -1){
            Ferramentas.showErro("Selecione pelo menos um aluno a ser alterado","Erro");
            return;
        }
        if(!Ferramentas.showPergunta("Realmente deseja gravar os dados?\nAo confirmar, não haverá volta.","Atenção")) return;
        control.salvar();
        gravado = true;
        Ferramentas.showMensagem("Dados Gravados com sucesso.","Informe");
    }//GEN-LAST:event_btngravarActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        if(!gravado)
             if(!Ferramentas.showPergunta("Deseja sair da janela sem gravar os dados?\nOs dados não gravados serão perdidos.","Atenção")) return;

        this.setVisible(false);
    }//GEN-LAST:event_btnhomeActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlunoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnalterar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btngravar;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnnovo;
    private javax.swing.JButton btnok;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAlunos;
    private javax.swing.JTextField txtano;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcurso;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtperiodo;
    private javax.swing.JTextField txtturma;
    // End of variables declaration//GEN-END:variables

}
