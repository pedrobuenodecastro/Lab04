import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form extends JFrame {

	public JPanel contentPane;
	public JTextField textfirstName;
	public JTextField textlastName;
	public JTextField textDataNascimento;
	public JTextField textEmail;
	public JTextField textCPF;
	public JTextField textTelefone;
	public JTextField textEndereco1;
	public JTextField textEndereco2;
	public JTextField textCEP;
	public JTextField textCidade;
	public JTextField textEstado;
	public JTextField textPais;
	boolean i = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private boolean cep_validate(){
		if(textCEP.getText().length() != 8){
			JOptionPane.showMessageDialog(null, "CEP inválido");
			return false;
		}
		else{
			return true;
		}
	}
	
	//verifica os dois ultimos digitos e numero de digitos
	private boolean cpf_validate(){
		if(textCPF.getText().length() != 11){
			JOptionPane.showMessageDialog(null, "CPF não contém 11 dígitos");
			return false;
		}
		else{
			int[] values = new int[11];
			int dig = 10, sum = 0, i;
			for(i = 0; i < 11; i ++){
				values[i] = Character.getNumericValue(textCPF.getText().charAt(i));
			}
			i = 0;
			while(dig >= 2){
				sum += values[i] * dig;
				i ++;
				dig --;
			}
			if(((sum % 11) > 2 && values[9] == (11 - (sum % 11)) || ((sum % 11) < 2 && values[9] == 0))){
				i = 0;
				sum = 0;
				dig = 11;
				while(dig >= 2){
					sum += values[i] * dig;
					i ++;
					dig --;
				}
				if(((sum % 11) > 2 && values[10] == (11 - (sum % 11)) || ((sum % 11) < 2 && values[10] == 0))){
					return true;
				}
				else{
					JOptionPane.showMessageDialog(null, "CPF inválido");
					return false;
				}
			}
			else{
				JOptionPane.showMessageDialog(null, "CPF inválido");
				return false;
			}
		}
	}
	
	private boolean verify(){
		if(textfirstName.getText().equals("") || textlastName.getText().equals("")
			|| textDataNascimento.getText().equals("") || textEmail.getText().equals("")
			|| textCPF.getText().equals("") || textCEP.getText().equals("")){
			JOptionPane.showMessageDialog(null, "entre com seus dados em todos os campos marcados com asterisco");
			return false;
		}
		else{
			return true;
		}
	}
	
	/**
	 * Create the frame.
	 */
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 100, 350, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textfirstName = new JTextField();
		textfirstName.setBounds(135, 58, 114, 19);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
		
		textlastName = new JTextField();
		textlastName.setBounds(135, 89, 114, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
		textDataNascimento = new JTextField();
		textDataNascimento.setBounds(135, 120, 114, 19);
		contentPane.add(textDataNascimento);
		textDataNascimento.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(135, 151, 114, 19);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textCPF = new JTextField();
		textCPF.setBounds(135, 182, 114, 19);
		contentPane.add(textCPF);
		textCPF.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(135, 213, 114, 19);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		textEndereco1 = new JTextField();
		textEndereco1.setBounds(135, 244, 114, 19);
		contentPane.add(textEndereco1);
		textEndereco1.setColumns(10);
		
		textEndereco2 = new JTextField();
		textEndereco2.setBounds(135, 275, 114, 19);
		contentPane.add(textEndereco2);
		textEndereco2.setColumns(10);
		
		textCEP = new JTextField();
		textCEP.setBounds(135, 306, 114, 19);
		contentPane.add(textCEP);
		textCEP.setColumns(10);
		
		textCidade = new JTextField();
		textCidade.setBounds(135, 337, 114, 19);
		contentPane.add(textCidade);
		textCidade.setColumns(10);
		
		textEstado = new JTextField();
		textEstado.setBounds(135, 368, 114, 19);
		contentPane.add(textEstado);
		textEstado.setColumns(10);
		
		textPais = new JTextField();
		textPais.setBounds(135, 399, 114, 19);
		contentPane.add(textPais);
		textPais.setColumns(10);
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"Sr.", "Sra.", "Srta.", "Dr.", "Outro"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(135, 12, 114, 24);
		contentPane.add(comboTitle);
		
		JLabel lblFirstName = new JLabel("Nome*:");
		lblFirstName.setBounds(12, 60, 90, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Sobrenome*:");
		lblLastName.setBounds(12, 91, 90, 15);
		contentPane.add(lblLastName);
		
		JLabel lblDataNascimento = new JLabel("Data de Nascimento*:");
		lblDataNascimento.setBounds(12, 122, 150, 15);
		contentPane.add(lblDataNascimento);
		
		JLabel lblEmail = new JLabel("Email*:");
		lblEmail.setBounds(12, 153, 150, 15);
		contentPane.add(lblEmail);
		
		JLabel lblCPF = new JLabel("CPF*:");
		lblCPF.setBounds(12, 184, 150, 15);
		contentPane.add(lblCPF);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(12, 215, 150, 15);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereco1 = new JLabel("Endereco 1:");
		lblEndereco1.setBounds(12, 246, 150, 15);
		contentPane.add(lblEndereco1);
		
		JLabel lblEndereco2 = new JLabel("Endereco 2:");
		lblEndereco2.setBounds(12, 277, 150, 15);
		contentPane.add(lblEndereco2);
		
		JLabel lblCEP = new JLabel("CEP*:");
		lblCEP.setBounds(12, 308, 150, 15);
		contentPane.add(lblCEP);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(12, 339, 150, 15);
		contentPane.add(lblCidade);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(12, 370, 150, 15);
		contentPane.add(lblEstado);
		
		JLabel lblPais = new JLabel("País:");
		lblPais.setBounds(12, 401, 150, 15);
		contentPane.add(lblPais);
		
		JLabel lblTitle = new JLabel("Título:");
		lblTitle.setBounds(12, 17, 90, 15);
		contentPane.add(lblTitle);
		
		
		JButton btnPrint = new JButton("Print");
		
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {		
				//contentPane.setVisible(false);	
					if(verify() && cpf_validate() && cep_validate()){	//so imprime o formulario se as condicoes forem satisfeitas
					print printForm = new print();
					printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
					printForm.firstNameLabel.setText(textfirstName.getText());
					printForm.lastNameLabel.setText(textlastName.getText());
					printForm.dataNascimentoLabel.setText(textDataNascimento.getText());
					printForm.emailLabel.setText(textEmail.getText());
					printForm.cpfLabel.setText(textCPF.getText());
					printForm.telefoneLabel.setText(textTelefone.getText());
					printForm.end1Label.setText(textEndereco1.getText());
					printForm.end2Label.setText(textEndereco2.getText());
					printForm.cepLabel.setText(textCEP.getText());
					printForm.cidadeLabel.setText(textCidade.getText());
					printForm.estadoLabel.setText(textEstado.getText());
					printForm.paisLabel.setText(textPais.getText());
					//printForm.contentPane.setVisible(true);
					printForm.show();
					}
			}
				
		});
		btnPrint.setBounds(12, 432, 74, 25);
		contentPane.add(btnPrint);
	}
}
