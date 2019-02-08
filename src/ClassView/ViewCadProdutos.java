/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassView;

import ClassBeans.tbl_CadProdutos;
import ClassDal.tbl_CadProdutosDal;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phelype
 */
public class ViewCadProdutos extends javax.swing.JFrame {

    public int ativo;

    /**
     * Creates new form ViewCadProdutos
     */
    public ViewCadProdutos() {
        initComponents();
        PainelAlterar.setVisible(false);
        textCodprod.setEnabled(false);
        textProduto.setEnabled(false);
        textData_ent.setEnabled(false);
        textData_sai.setEnabled(false);
        textQtnItens.setEnabled(false);
        textNumFiscal.setEnabled(false);
        btnCadastrar.setVisible(false);
        btnCancelar.setVisible(false);

        ReadList();
    }

    public void ReadList() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        tbl_CadProdutosDal _prod = new tbl_CadProdutosDal();
        modelo.setNumRows(0);
        for (tbl_CadProdutos prod : _prod.ListaProdutos()) {
            modelo.addRow(new Object[]{
                prod.getId_prod(),
                prod.getCod_produto(),
                prod.getNome_prod(),
                prod.getData_compra(),
                prod.getData_baixa(),
                prod.getQtn_itens(),
                prod.getNum_fFiscal(),});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textCodprod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textProduto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textQtnItens = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textNumFiscal = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        textData_ent = new javax.swing.JFormattedTextField();
        textData_sai = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnNewButton = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnlimpaCampos = new javax.swing.JButton();
        btnCancelNew = new javax.swing.JButton();
        PainelAlterar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        textCodProdutosUp = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        textProdutoUp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textDataSaidaUp = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        textDataEntradaUp = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        textItensUp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        textFiscalUp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Produtos.");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10))); // NOI18N

        jLabel1.setText("Cód. Produto.:");

        jLabel2.setText("Produto.:");

        jLabel3.setText("Data Compra.:");

        jLabel4.setText("Data Cadastro.:");

        jLabel5.setText("Qnt. Itens.:");

        jLabel6.setText("Num. Fiscal.:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        try {
            textData_ent.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            textData_sai.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textQtnItens, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCodprod, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textNumFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textData_ent, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(textData_sai))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCodprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textData_ent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textData_sai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textQtnItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textNumFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 10)))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID.:", "Código Produto.:", "Produto.:", "Data Compra.:", "Data Baixa.:", "Quantidade.:", "Número Fiscal.:"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Geral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        btnNewButton.setText("Novo Cadastro");
        btnNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewButtonActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnlimpaCampos.setText("Limpar Campos");
        btnlimpaCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpaCamposActionPerformed(evt);
            }
        });

        btnCancelNew.setText("Cancelar");
        btnCancelNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnNewButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnlimpaCampos)
                .addGap(18, 18, 18)
                .addComponent(btnCancelNew)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewButton)
                    .addComponent(btnAlterar)
                    .addComponent(btnlimpaCampos)
                    .addComponent(btnCancelNew))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PainelAlterar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        jLabel7.setText("ID.:");

        jLabel9.setText("Cod. Produto.:");

        jLabel10.setText("Produto.:");

        jLabel11.setText("Data Compra.:");

        try {
            textDataSaidaUp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("Data Baixa.:");

        try {
            textDataEntradaUp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel12.setText("Qtn Itens.:");

        jLabel13.setText("Num Fiscal.:");

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelAlterarLayout = new javax.swing.GroupLayout(PainelAlterar);
        PainelAlterar.setLayout(PainelAlterarLayout);
        PainelAlterarLayout.setHorizontalGroup(
            PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAlterarLayout.createSequentialGroup()
                .addGroup(PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PainelAlterarLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textCodProdutosUp, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PainelAlterarLayout.createSequentialGroup()
                            .addGroup(PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PainelAlterarLayout.createSequentialGroup()
                                    .addGroup(PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textDataSaidaUp, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textDataEntradaUp, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addGap(37, 37, 37))
                                .addGroup(PainelAlterarLayout.createSequentialGroup()
                                    .addComponent(textItensUp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFiscalUp))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelAlterarLayout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(textProdutoUp, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel8))
                    .addComponent(jLabel12))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PainelAlterarLayout.setVerticalGroup(
            PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelAlterarLayout.createSequentialGroup()
                .addGroup(PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(textCodProdutosUp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textProdutoUp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelAlterarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(textDataEntradaUp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(textDataSaidaUp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelAlterarLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelAlterarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(textItensUp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(textFiscalUp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PainelAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1144, 585));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        tbl_CadProdutos prod = new tbl_CadProdutos();
        tbl_CadProdutosDal _prod = new tbl_CadProdutosDal();

        prod.setCod_produto(Integer.parseInt(textCodprod.getText()));
        prod.setNome_prod(textProduto.getText());
        prod.setData_compra(textData_ent.getText());
        prod.setData_baixa(textData_sai.getText());
        prod.setQtn_itens(Integer.parseInt(textQtnItens.getText()));
        prod.setNum_fFiscal(Integer.parseInt(textNumFiscal.getText()));
        _prod.CadastroProdutos(prod);

        textCodprod.setText("");
        textProduto.setText("");
        textData_ent.setText("");
        textData_sai.setText("");
        textQtnItens.setText("");
        textNumFiscal.setText("");
        ReadList();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewButtonActionPerformed
        ativo = 1;
        if (ativo == 1) {
            textCodprod.setEnabled(true);
            textProduto.setEnabled(true);
            textData_ent.setEnabled(true);
            textData_sai.setEnabled(true);
            textQtnItens.setEnabled(true);
            textNumFiscal.setEnabled(true);
            btnCadastrar.setVisible(true);
            btnCancelar.setVisible(true);
            btnNewButton.setVisible(false);
            btnAlterar.setVisible(false);
        }


    }//GEN-LAST:event_btnNewButtonActionPerformed

    private void btnCancelNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelNewActionPerformed
        ativo = 2;
        if (ativo == 2) {
            
            textCodprod.setEnabled(false);
            textProduto.setEnabled(false);
            textData_ent.setEnabled(false);
            textData_sai.setEnabled(false);
            textQtnItens.setEnabled(false);
            textNumFiscal.setEnabled(false);
            btnCadastrar.setVisible(false);
            btnCancelar.setVisible(false);
            btnNewButton.setVisible(true);
            PainelAlterar.setVisible(false);
            btnAlterar.setVisible(true);
        }
    }//GEN-LAST:event_btnCancelNewActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       if(jTable1.getSelectedRow() != -1){
           textId.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
           textCodProdutosUp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
           textProdutoUp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
           textDataEntradaUp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
           textDataSaidaUp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
           textItensUp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
           textFiscalUp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
       }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        if(jTable1.getSelectedRow() != -1){
           textId.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
           textCodProdutosUp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
           textProdutoUp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString());
           textDataEntradaUp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString());
           textDataSaidaUp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString());
           textItensUp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString());
           textFiscalUp.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString());
       }
    }//GEN-LAST:event_jTable1KeyReleased

    private void btnlimpaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpaCamposActionPerformed
        textCodprod.setText("");
        textProduto.setText("");
        textData_ent.setText("");
        textData_sai.setText("");
        textQtnItens.setText("");
        textNumFiscal.setText("");
    }//GEN-LAST:event_btnlimpaCamposActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        PainelAlterar.setVisible(true);
        textId.setEnabled(false);
        btnAlterar.setVisible(false);
        btnNewButton.setVisible(false);
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTable1.getSelectedRow() != -1){
            tbl_CadProdutos prod = new tbl_CadProdutos();
            tbl_CadProdutosDal _prod = new tbl_CadProdutosDal();
            
            prod.setCod_produto(Integer.parseInt(textCodProdutosUp.getText()));
            prod.setNome_prod(textProdutoUp.getText());
            prod.setData_compra(textDataEntradaUp.getText());
            prod.setData_baixa(textDataSaidaUp.getText());
            prod.setQtn_itens(Integer.parseInt(textItensUp.getText()));
            prod.setNum_fFiscal(Integer.parseInt(textFiscalUp.getText()));
            
            prod.setId_prod((int) jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            _prod.Update(prod);
            ReadList();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ViewCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelAlterar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelNew;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNewButton;
    private javax.swing.JButton btnlimpaCampos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textCodProdutosUp;
    private javax.swing.JTextField textCodprod;
    private javax.swing.JFormattedTextField textDataEntradaUp;
    private javax.swing.JFormattedTextField textDataSaidaUp;
    private javax.swing.JFormattedTextField textData_ent;
    private javax.swing.JFormattedTextField textData_sai;
    private javax.swing.JTextField textFiscalUp;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textItensUp;
    private javax.swing.JTextField textNumFiscal;
    private javax.swing.JTextField textProduto;
    private javax.swing.JTextField textProdutoUp;
    private javax.swing.JTextField textQtnItens;
    // End of variables declaration//GEN-END:variables
}