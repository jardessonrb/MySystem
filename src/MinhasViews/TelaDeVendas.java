/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinhasViews;

import Beans.ItensB;
import Beans.ProdutoB;
import Beans.VendasB;
import Dao.ClienteDao;
import Dao.FuncionarioDao;
import Dao.ItensDao;
import Dao.ProdutoDao;
import Dao.VendasDao;
import Utilitario.Corretores;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author járdesson
 */
public class TelaDeVendas extends javax.swing.JFrame {

    public double teste = 0;
    
    public TelaDeVendas() {
        initComponents();
        txtCodPro.setEnabled(false);
        BuscarProduto.setEnabled(false);
        txtNomePro.setEnabled(false);
        txtValor.setEnabled(false);
        txtQuantidade.setEnabled(false);
        ConfirmarPro.setEnabled(false);
        BotaoEncerrar.setEnabled(false);
        BotaoCancelarVenda.setEnabled(false);
        InicializaCompra.setEnabled(false);
        
         DefaultTableModel modelo = (DefaultTableModel) TabelaProdutos.getModel();
         TabelaProdutos.setRowSorter(new TableRowSorter(modelo));
        
        readJTable(0);
    }
    public void readJTable(int codvenda){
        DefaultTableModel modelo = (DefaultTableModel) TabelaProdutos.getModel();
        modelo.setNumRows(0);
        ItensDao dao = new ItensDao();
        
        for(ItensB itens: dao.buscarTabela(codvenda)){
            
            modelo.addRow(new Object[]{
                //itens.getCod_produto(),
                itens.getNome_produto(),
                itens.getCod_venda(),
                itens.getQuanti(),
                itens.getVal_por_pro()
                    
            
            });
            
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

        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        BotaoCodCliente = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        BotaoCodVendedor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtCodPro = new javax.swing.JTextField();
        BuscarProduto = new javax.swing.JButton();
        txtNomePro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        ConfirmarPro = new javax.swing.JButton();
        InicializaCompra = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        txtNomeVendedor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        BotaoEncerrar = new javax.swing.JButton();
        BotaoCancelarVenda = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        labelVendedor = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelCliente = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtValTotal = new javax.swing.JTextField();

        jButton3.setText("jButton3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("YOUNG -VENDAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Cliente:");

        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        BotaoCodCliente.setText("Buscar Cliente p/ Código");
        BotaoCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCodClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Vendedor:");

        BotaoCodVendedor.setText("Buscar Vendedor p/ Código");
        BotaoCodVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCodVendedorActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicialização da Compra"));

        BuscarProduto.setText("Buscar");
        BuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarProdutoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Produto:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Valor:");

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        ConfirmarPro.setText("Inserir Produto");
        ConfirmarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarProActionPerformed(evt);
            }
        });

        InicializaCompra.setText("Inicializar");
        InicializaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicializaCompraActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Quantidade:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel7.setText("Cod. Produto:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Status da Venda:");

        Status.setBackground(new java.awt.Color(255, 0, 0));
        Status.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Status.setForeground(new java.awt.Color(204, 0, 0));
        Status.setText("Venda Não Inicializada!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(37, 37, 37))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtQuantidade)
                                .addGap(125, 125, 125)))
                        .addComponent(ConfirmarPro)
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(InicializaCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BuscarProduto)
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Status)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Status))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarProduto)
                            .addComponent(jLabel7))
                        .addGap(114, 114, 114))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InicializaCompra)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmarPro))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BotaoEncerrar.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        BotaoEncerrar.setText("Concluir Venda");
        BotaoEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEncerrarActionPerformed(evt);
            }
        });

        BotaoCancelarVenda.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        BotaoCancelarVenda.setText("Cancelar Venda");
        BotaoCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCancelarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 4, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Produto", "Cod. Venda", "Quant", "SubTotal"
            }
        ));
        jScrollPane4.setViewportView(TabelaProdutos);

        jLabel9.setText("Vendedor:");

        labelVendedor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelVendedor.setForeground(new java.awt.Color(255, 0, 0));
        labelVendedor.setText(":");

        jLabel11.setText("Cliente:");

        labelCliente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        labelCliente.setForeground(new java.awt.Color(255, 0, 0));
        labelCliente.setText(":");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("Valor Total da Compra:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCliente)
                    .addComponent(labelVendedor))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtValTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(labelVendedor))
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtValTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labelCliente))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(BotaoCancelarVenda)
                            .addGap(169, 169, 169)
                            .addComponent(BotaoEncerrar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel2)))
                                    .addGap(4, 4, 4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BotaoCodCliente))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BotaoCodVendedor))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(txtNomeVendedor))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane4)
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotaoCodCliente)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoCodVendedor)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoEncerrar)
                    .addComponent(BotaoCancelarVenda))
                .addGap(16, 16, 16)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void BotaoCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCodClienteActionPerformed
        ClienteDao dao = new ClienteDao();
        String nome = dao.BuscarCliente(txtCliente.getText());
        if(nome.equals("invalido!")){
            JOptionPane.showMessageDialog(null, "Código do cliente não encontrado!");
            txtCodigo.setEnabled(false);
        }else{
            txtNomeCliente.setText(nome);
            txtCodigo.setEnabled(true);
        }
        
    }//GEN-LAST:event_BotaoCodClienteActionPerformed

    private void BotaoCodVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCodVendedorActionPerformed
        FuncionarioDao dao = new FuncionarioDao();
        if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Código Está vázio!");
        }else{
            String nome = dao.buscarVenda(Integer.parseInt(txtCodigo.getText()));
            if(nome.equals("invalido")){
               JOptionPane.showMessageDialog(null,"Código do Vendedor não encontrado!");
            }else{
                txtNomeVendedor.setText(nome);
                InicializaCompra.setEnabled(true);
            }
        }
        
            
       
    }//GEN-LAST:event_BotaoCodVendedorActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void BuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarProdutoActionPerformed
        ProdutoB pro = new ProdutoB();
        ProdutoDao dao = new ProdutoDao();
        if(txtCodPro.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nenhum código inserido no campo Cod. produto!");
        }else{
            pro = dao.buscapro(Integer.parseInt(txtCodPro.getText()));
            txtNomePro.setText(pro.getNome_produto());
            txtValor.setText(Double.toString(pro.getValor()));
            abilita2(true);
        }
       
        
    }//GEN-LAST:event_BuscarProdutoActionPerformed

    private void ConfirmarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarProActionPerformed
        ItensB itens = new ItensB();
        ItensDao dao = new ItensDao();
        VendasDao venda = new VendasDao();
        double val_por_pro=0;
        int cod_vend = Integer.parseInt(venda.UltiVenda());
        if(txtCodPro.getText().equals("") || txtQuantidade.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Código do produto ou Quantidade não definida!");
        }else{
            val_por_pro = ((Double.parseDouble(txtValor.getText())) * (Double.parseDouble(txtQuantidade.getText())));
            //JOptionPane.showMessageDialog(null, val_por_pro);
            itens.setCod_produto(Integer.parseInt(txtCodPro.getText()));
            itens.setCod_venda(cod_vend);
            itens.setQuanti(Integer.parseInt(txtQuantidade.getText()));
            itens.setVal_por_pro(val_por_pro);

            dao.inserirItens(itens);
            teste = teste + val_por_pro;
            txtValTotal.setText(Double.toString(teste));
            limpar();
            txtQuantidade.setEnabled(false);
            BotaoEncerrar.setEnabled(true);
            BotaoCancelarVenda.setEnabled(true);
        }
        readJTable(cod_vend);
    }//GEN-LAST:event_ConfirmarProActionPerformed

    private void InicializaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicializaCompraActionPerformed

        //JOptionPane.showMessageDialog(null, "Nome do cliente ou Vendedor inválido \n Insira códigos válidos");
        VendasDao dao =  new VendasDao();
        VendasB venda = new VendasB();
        Date d1 = new Date(); 
	SimpleDateFormat formataDatas = new SimpleDateFormat("dd/MM/yyyy");
	String data = formataDatas.format(d1);    
        
        venda.setCod_cliente(Integer.parseInt(txtCliente.getText()));
        venda.setCod_funci(Integer.parseInt(txtCodigo.getText()));
        venda.setData_compra(Corretores.ConverteSQL(data));
        venda.setValor_total(00);
	
        dao.criarvenda(venda);
        Status.setText("Venda Iniciada!");
        desabilita(false);
        abilita(true);
        labelCliente.setText(txtNomeCliente.getText());
        labelVendedor.setText(txtNomeVendedor.getText());
       
        
           
           
    }//GEN-LAST:event_InicializaCompraActionPerformed

    private void BotaoEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEncerrarActionPerformed
        VendasDao dao = new VendasDao();
        VendasDao venda = new VendasDao();
        double valor = Double.parseDouble(txtValTotal.getText());
        int codigo = Integer.parseInt(venda.UltiVenda());
        //JOptionPane.showMessageDialog(null, venda.UltiVenda());
        dao.EncerrarConta(valor,codigo );
        EncerrarVenda();
        BotaoEncerrar.setEnabled(false);
        teste = 0;
        txtValTotal.setText("");
        readJTable(0);
    }//GEN-LAST:event_BotaoEncerrarActionPerformed

    private void BotaoCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCancelarVendaActionPerformed
       ItensDao itensdao = new ItensDao();
       VendasDao vendadao = new VendasDao();
       int codigovenda = Integer.parseInt(vendadao.UltiVenda());
       int confirma = JOptionPane.showConfirmDialog(null,"Deseja realmente cancelar essa compra?","Atenção",JOptionPane.YES_NO_OPTION);
       if(confirma == JOptionPane.YES_OPTION){
            itensdao.CancelaVendaItens(codigovenda);
            vendadao.VancelarVendaVenda(codigovenda);
            readJTable(0);
       }
    }//GEN-LAST:event_BotaoCancelarVendaActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCancelarVenda;
    private javax.swing.JButton BotaoCodCliente;
    private javax.swing.JButton BotaoCodVendedor;
    private javax.swing.JButton BotaoEncerrar;
    private javax.swing.JButton BuscarProduto;
    private javax.swing.JButton ConfirmarPro;
    private javax.swing.JButton InicializaCompra;
    private javax.swing.JLabel Status;
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelCliente;
    private javax.swing.JLabel labelVendedor;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodPro;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNomePro;
    private javax.swing.JTextField txtNomeVendedor;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValTotal;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        txtCodPro.setText("");
        txtNomePro.setText("");
        txtQuantidade.setText("");
        txtValor.setText("");
    }

    private void desabilita(boolean t) {
        txtCliente.setEnabled(t);
        BotaoCodCliente.setEnabled(t);
        BotaoCodVendedor.setEnabled(t);
        txtNomeCliente.setEnabled(t);
        txtNomeVendedor.setEnabled(t);
        InicializaCompra.setEnabled(t);
        txtCodigo.setEnabled(t);
        
    }

    private void abilita(boolean b) {
        txtCodPro.setEnabled(b);
        BuscarProduto.setEnabled(b);
        txtNomePro.setEnabled(b);
        txtValor.setEnabled(b);
    }

    private void abilita2(boolean b) {
        txtQuantidade.setEnabled(b);
        ConfirmarPro.setEnabled(b);
                
    }

    private void EncerrarVenda() {
        txtCliente.setText("");
        txtCodigo.setText("");
        txtNomeCliente.setText("");
        txtNomeVendedor.setText("");
        desabilita(true);
        abilita(false);
        
    }
    
}
