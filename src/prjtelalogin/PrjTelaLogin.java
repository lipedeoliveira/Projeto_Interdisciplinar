
package prjtelalogin;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
//import conexao.Conexao;   

public class PrjTelaLogin extends JFrame{
    //Conexao con_cliente;
    JLabel lImagem,lUsu,lSenha;
    JTextField txtUsuario;
    JPasswordField txtpSenha;
    JButton btnEnviar;
    
    public  PrjTelaLogin() {

        //con_cliente = new Conexao();
        //con_cliente.conecta();



        super("Login");
        Container tela = getContentPane();
        setLayout(null);

        //JLabel e suas definições de posições
        lUsu = new JLabel("Usuário: ",SwingConstants.CENTER);
        lUsu.setBounds(90,100,100,20);
        lSenha = new JLabel("Senha: ",SwingConstants.CENTER);
        lSenha.setBounds(90,200,100,20);
        //
        
        //JTextField e a definição de suas posições
        txtUsuario = new JTextField(SwingConstants.CENTER);
        txtUsuario.setBounds(190,100,130,20);
        txtpSenha = new JPasswordField(SwingConstants.CENTER);
        txtpSenha.setBounds(190,200,130,20);
        //
        
        //Botões e a definição de seus locais
        btnEnviar = new JButton("ENTRAR");
        btnEnviar.setBounds(205,250,100,20);
        //Ação responsável pelo login
        /*btnEnviar.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {

                try {
                    String pesquisa = "select * from usuarioscadastrados where usuario like '"+txtUsuario.getText()+"'&&senha = "+txtpSenha.getText();
                    //con_cliente.executaSQL(pesquisa);

                    if(con_cliente.resultset.first()) {
                      
                      TelaMenu mostrar = new TelaMenu();
                      mostrar.setVisible(true);
                      dispose();
                      
                    }else {
                        JOptionPane.showMessageDialog(null,"\nUsuário não cadastrado!!!","Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
                        con_cliente.desconecta();
                        System.exit(0);
                    }
                }catch(SQLException erro) {
                    JOptionPane.showMessageDialog(null,"Erro ao realizar o Login"+erro,"Mensagem do programa",JOptionPane.INFORMATION_MESSAGE);
                }
                    
             }

        });
        */
        ImageIcon icone = new ImageIcon("src/iconUser.jpg");
        setIconImage(icone.getImage());

/*      ImageIcon imagem = new ImageIcon("src/iconUsuario.png");
        lImagem = new JLabel(imagem);
        lImagem.setBounds(100,100,100,100);
        tela.add(lImagem); 
        
*/

        tela.add(lUsu);
        tela.add(lSenha);
        tela.add(txtUsuario);
        tela.add(txtpSenha);    
        tela.add(btnEnviar);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setSize(500,400);
    }
    
    public static void main(String[]args) {
        PrjTelaLogin tela = new PrjTelaLogin();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    }
;
