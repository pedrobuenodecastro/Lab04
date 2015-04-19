
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class print extends JFrame {

	public JPanel contentPane;
	JLabel titleLabel = new JLabel("");
	JLabel firstNameLabel = new JLabel("");
	JLabel lastNameLabel = new JLabel("");
	JLabel dataNascimentoLabel = new JLabel("");
	JLabel emailLabel = new JLabel("");
	JLabel cpfLabel = new JLabel("");
	JLabel telefoneLabel = new JLabel("");
	JLabel end1Label = new JLabel("");
	JLabel end2Label = new JLabel("");
	JLabel cepLabel = new JLabel("");
	JLabel cidadeLabel = new JLabel("");
	JLabel estadoLabel = new JLabel("");
	JLabel paisLabel = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					print frame = new print();					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public print() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 100, 350, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		firstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		firstNameLabel.setBounds(135, 78, 216, 15);
		contentPane.add(firstNameLabel);		
		
		lastNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lastNameLabel.setBounds(135, 109, 216, 15);
		contentPane.add(lastNameLabel);
		
		dataNascimentoLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		dataNascimentoLabel.setBounds(135, 140, 216, 15);
		contentPane.add(dataNascimentoLabel);
		
		emailLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		emailLabel.setBounds(135, 171, 216, 15);
		contentPane.add(emailLabel);
		
		cpfLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		cpfLabel.setBounds(135, 202, 216, 15);
		contentPane.add(cpfLabel);
		
		telefoneLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		telefoneLabel.setBounds(135, 233, 216, 15);
		contentPane.add(telefoneLabel);
		
		end1Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		end1Label.setBounds(135, 264, 216, 15);
		contentPane.add(end1Label);
		
		end2Label.setFont(new Font("Dialog", Font.PLAIN, 12));
		end2Label.setBounds(135, 295, 216, 15);
		contentPane.add(end2Label);
		
		cepLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		cepLabel.setBounds(135, 326, 216, 15);
		contentPane.add(cepLabel);
		
		cidadeLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		cidadeLabel.setBounds(135, 357, 216, 15);
		contentPane.add(cidadeLabel);
		
		estadoLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		estadoLabel.setBounds(135, 388, 216, 15);
		contentPane.add(estadoLabel);
		
		paisLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		paisLabel.setBounds(135, 419, 216, 15);
		contentPane.add(paisLabel);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(12, 78, 106, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sobrenome:");
		lblNewLabel_1.setBounds(12, 109, 98, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewdata = new JLabel("Data de Nascimento:");
		lblNewdata.setBounds(12, 140, 150, 15);
		contentPane.add(lblNewdata);
		
		JLabel lblNewEmail = new JLabel("Email:");
		lblNewEmail.setBounds(12, 171, 98, 15);
		contentPane.add(lblNewEmail);
		
		JLabel lblNewCPF = new JLabel("CPF:");
		lblNewCPF.setBounds(12, 202, 98, 15);
		contentPane.add(lblNewCPF);
		
		JLabel lblNewTel = new JLabel("Telefone:");
		lblNewTel.setBounds(12, 233, 98, 15);
		contentPane.add(lblNewTel);
		
		JLabel lblNewEnd1 = new JLabel("Endereco 1:");
		lblNewEnd1.setBounds(12, 264, 98, 15);
		contentPane.add(lblNewEnd1);
		
		JLabel lblNewEnd2 = new JLabel("Endereco 2:");
		lblNewEnd2.setBounds(12, 295, 98, 15);
		contentPane.add(lblNewEnd2);
		
		JLabel lblNewCEP = new JLabel("CEP:");
		lblNewCEP.setBounds(12, 326, 98, 15);
		contentPane.add(lblNewCEP);
		
		JLabel lblNewCidade = new JLabel("Cidade:");
		lblNewCidade.setBounds(12, 357, 98, 15);
		contentPane.add(lblNewCidade);
		
		JLabel lblNewEstado = new JLabel("Estado:");
		lblNewEstado.setBounds(12, 388, 98, 15);
		contentPane.add(lblNewEstado);
		
		JLabel lblNewPais = new JLabel("País:");
		lblNewPais.setBounds(12, 419, 98, 15);
		contentPane.add(lblNewPais);
		
		JLabel lblNewLabel_2 = new JLabel("Título:");
		lblNewLabel_2.setBounds(12, 47, 98, 15);
		contentPane.add(lblNewLabel_2);
		
		
		titleLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		titleLabel.setBounds(135, 47, 216, 15);
		contentPane.add(titleLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Formulário");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_3.setBounds(120, 12, 159, 31);
		contentPane.add(lblNewLabel_3);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(12, 450, 117, 25);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
