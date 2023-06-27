package programa;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtAsdas;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblSobrenome;
	private JLabel lblCpf;
	private JLabel lblCelular;
	private JLabel lblEmail;
	private JLabel lblBairro;
	private JLabel lblRua;
	private JLabel lblNumero;
	private JButton btnNewButton;
	private JLabel lblNome_1;
	private JLabel lblSobrenome_1;
	private JLabel lblCpf_1;
	private JLabel lblCelular_1;
	private JLabel lblEmail_1;
	private JLabel lblBairro_1;
	private JLabel lblRua_1;
	private JLabel lblNumero_1;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JButton btnNewButton_1;
	private JLabel lblSelecioneOCurso;
	private JLabel lblNewLabel_2;
	private JTextField textField_16;
	private JTextField textField_17;
	private JLabel lblDescrio;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_2_2;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JScrollPane scrollPane_3;
	private JTable table;
	private JScrollPane scrollPane_4;
	private JLabel lblSelecioneOCurso_2;
	private JList list_3;
	private JScrollPane scrollPane_5;
	private JLabel lblSelecioneOCurso_3;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane_1;
	private JLabel lblNewLabel_7;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Escola de Cursos do Tio Sebas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 60, 715, 491);
		contentPane.add(tabbedPane);
		
		JPanel panel_aluno = new JPanel();
		tabbedPane.addTab("Aluno", null, panel_aluno, null);
		panel_aluno.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(86, 96, 170, 20);
		panel_aluno.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(86, 127, 170, 20);
		panel_aluno.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(86, 158, 170, 20);
		panel_aluno.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(86, 189, 170, 20);
		panel_aluno.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(86, 220, 170, 20);
		panel_aluno.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(86, 251, 170, 20);
		panel_aluno.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(86, 282, 170, 20);
		panel_aluno.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(86, 313, 170, 20);
		panel_aluno.add(textField_7);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setBounds(10, 99, 46, 14);
		panel_aluno.add(lblNome);
		
		lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setHorizontalAlignment(SwingConstants.LEFT);
		lblSobrenome.setBounds(10, 130, 73, 14);
		panel_aluno.add(lblSobrenome);
		
		lblCpf = new JLabel("CPF:");
		lblCpf.setHorizontalAlignment(SwingConstants.LEFT);
		lblCpf.setBounds(10, 161, 46, 14);
		panel_aluno.add(lblCpf);
		
		lblCelular = new JLabel("Celular:");
		lblCelular.setHorizontalAlignment(SwingConstants.LEFT);
		lblCelular.setBounds(10, 192, 66, 14);
		panel_aluno.add(lblCelular);
		
		lblEmail = new JLabel("E-mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setBounds(10, 223, 46, 14);
		panel_aluno.add(lblEmail);
		
		lblBairro = new JLabel("Bairro:");
		lblBairro.setHorizontalAlignment(SwingConstants.LEFT);
		lblBairro.setBounds(10, 254, 46, 14);
		panel_aluno.add(lblBairro);
		
		lblRua = new JLabel("Rua:");
		lblRua.setHorizontalAlignment(SwingConstants.LEFT);
		lblRua.setBounds(10, 285, 46, 14);
		panel_aluno.add(lblRua);
		
		lblNumero = new JLabel("Numero:");
		lblNumero.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumero.setBounds(10, 316, 66, 14);
		panel_aluno.add(lblNumero);
		
		btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = textField.getText();
			    String sobrenome = textField_1.getText();
			    String cpf = textField_2.getText();
			    String celular = textField_3.getText();
			    String email = textField_4.getText();
			    String bairro = textField_5.getText();
			    String rua = textField_6.getText();
			    String numero = textField_7.getText();
				
			 // Verificar se todos os campos estão preenchidos
		        if (nome.isBlank() || sobrenome.isBlank() || cpf.isBlank() || celular.isBlank() || email.isBlank()
		                || bairro.isBlank() || rua.isBlank() || numero.isBlank()) {
		            JOptionPane.showMessageDialog(TelaPrincipal.this, "Preencha todos os campos!");
		        } else if (!validarCPF(cpf)) { // Verificar formato do CPF
		            JOptionPane.showMessageDialog(TelaPrincipal.this, "CPF inválido!");
		        } else if (!validarEmail(email)) { // Verificar formato do email
		            JOptionPane.showMessageDialog(TelaPrincipal.this, "Email inválido!");
		        } else if (!validarCelular(celular)) { // Verificar formato do email
			            JOptionPane.showMessageDialog(TelaPrincipal.this, "Celular inválido!");
		        } else {
		            // Realizar o cadastro do aluno no sistema
		            Aluno aluno = new Aluno(nome, sobrenome, cpf, celular, email, bairro, rua, numero);
		            // Código para cadastrar o aluno

		            JOptionPane.showMessageDialog(TelaPrincipal.this, "Aluno cadastrado com sucesso!");
		        }
		    }

			private boolean validarCelular(String celular) {
				// Remover caracteres especiais e espaços em branco
			    celular = celular.replaceAll("[^0-9]", "");

			    // Verificar se o telefone tem 8 ou 9 dígitos
			    if (celular.length() != 8 && celular.length() != 9) {
			        return false;
			    }

			    // Verificar se todos os dígitos são iguais (telefone inválido)
			    if (celular.matches("(\\d)\\1{7,8}")) {
			        return false;
			    }

			    // Verificar o formato do telefone
			    return celular.matches("\\d{8,9}");
			
			}

			private boolean validarEmail(String email) {
			    // Verificar o formato do email usando expressão regular
			    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
			    return email.matches(regex);
			
			}

			private boolean validarCPF(String cpf) {
				// Remover caracteres especiais e espaços em branco
			    cpf = cpf.replaceAll("[^0-9]", "");

			    // Verificar se o CPF tem 11 dígitos
			    if (cpf.length() != 11) {
			        return false;
			    }

			    // Verificar se todos os dígitos são iguais (CPF inválido)
			    if (cpf.matches("(\\d)\\1{10}")) {
			        return false;
			    }
				return rootPaneCheckingEnabled;

			  
		}});
		btnNewButton.setBounds(102, 429, 116, 23);
		panel_aluno.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastrar Aluno");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(86, 55, 170, 14);
		panel_aluno.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 344, 168, 74);
		panel_aluno.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(278, 0, 2, 463);
		panel_aluno.add(separator);
		
		lblSelecioneOCurso_3 = new JLabel("Selecione");
		lblSelecioneOCurso_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelecioneOCurso_3.setBounds(10, 357, 143, 14);
		panel_aluno.add(lblSelecioneOCurso_3);
		
		lblNewLabel = new JLabel("o Curso:");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(10, 374, 46, 14);
		panel_aluno.add(lblNewLabel);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(290, 103, 410, 349);
		panel_aluno.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setShowHorizontalLines(false);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, "", null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Nome", "Sobrenome", "Curso", "Matricula", "CPF"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		lblNewLabel_7 = new JLabel("Tabela de Alunos");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(441, 57, 170, 14);
		panel_aluno.add(lblNewLabel_7);
		
		JPanel panel_professor = new JPanel();
		tabbedPane.addTab("Professor", null, panel_professor, null);
		panel_professor.setLayout(null);
		
		lblNome_1 = new JLabel("Nome:");
		lblNome_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome_1.setBounds(10, 96, 46, 14);
		panel_professor.add(lblNome_1);
		
		lblSobrenome_1 = new JLabel("Sobrenome:");
		lblSobrenome_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblSobrenome_1.setBounds(10, 127, 76, 14);
		panel_professor.add(lblSobrenome_1);
		
		lblCpf_1 = new JLabel("CPF:");
		lblCpf_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCpf_1.setBounds(10, 158, 46, 14);
		panel_professor.add(lblCpf_1);
		
		lblCelular_1 = new JLabel("Celular:");
		lblCelular_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblCelular_1.setBounds(10, 189, 66, 14);
		panel_professor.add(lblCelular_1);
		
		lblEmail_1 = new JLabel("E-mail:");
		lblEmail_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail_1.setBounds(10, 220, 46, 14);
		panel_professor.add(lblEmail_1);
		
		lblBairro_1 = new JLabel("Bairro:");
		lblBairro_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblBairro_1.setBounds(10, 251, 46, 14);
		panel_professor.add(lblBairro_1);
		
		lblRua_1 = new JLabel("Rua:");
		lblRua_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblRua_1.setBounds(10, 282, 66, 14);
		panel_professor.add(lblRua_1);
		
		lblNumero_1 = new JLabel("Numero:");
		lblNumero_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumero_1.setBounds(10, 313, 66, 14);
		panel_professor.add(lblNumero_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(86, 310, 170, 20);
		panel_professor.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(86, 279, 170, 20);
		panel_professor.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(86, 248, 170, 20);
		panel_professor.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(86, 217, 170, 20);
		panel_professor.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(86, 186, 170, 20);
		panel_professor.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(86, 155, 170, 20);
		panel_professor.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(86, 124, 170, 20);
		panel_professor.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(86, 93, 170, 20);
		panel_professor.add(textField_15);
		
		btnNewButton_1 = new JButton("Cadastrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textField_15.getText();
			    String sobrenome = textField_14.getText();
			    String cpf = textField_13.getText();
			    String celular = textField_12.getText();
			    String email = textField_11.getText();
			    String bairro = textField_10.getText();
			    String rua = textField_9.getText();
			    String numero = textField_8.getText();
				
			 // Verificar se todos os campos estão preenchidos
		        if (nome.isBlank() || sobrenome.isBlank() || cpf.isBlank() || celular.isBlank() || email.isBlank()
		                || bairro.isBlank() || rua.isBlank() || numero.isBlank()) {
		            JOptionPane.showMessageDialog(TelaPrincipal.this, "Preencha todos os campos!");
		        } else if (!validarCPF(cpf)) { // Verificar formato do CPF
		            JOptionPane.showMessageDialog(TelaPrincipal.this, "CPF inválido!");
		        } else if (!validarEmail(email)) { // Verificar formato do email
		            JOptionPane.showMessageDialog(TelaPrincipal.this, "Email inválido!");
		        } else if (!validarCelular(celular)) { // Verificar formato do email
			            JOptionPane.showMessageDialog(TelaPrincipal.this, "Celular inválido!");
		        } else {
		            // Realizar o cadastro do aluno no sistema
		            Professor professor = new Professor(nome, sobrenome, cpf, celular, email, bairro, rua, numero);
		            // Código para cadastrar o professor

		            JOptionPane.showMessageDialog(TelaPrincipal.this, "Professor cadastrado com sucesso!");
		        }
		    }

			private boolean validarCelular(String celular) {
				// Remover caracteres especiais e espaços em branco
			    celular = celular.replaceAll("[^0-9]", "");

			    // Verificar se o telefone tem 8 ou 9 dígitos
			    if (celular.length() != 8 && celular.length() != 9) {
			        return false;
			    }

			    // Verificar se todos os dígitos são iguais (telefone inválido)
			    if (celular.matches("(\\d)\\1{7,8}")) {
			        return false;
			    }

			    // Verificar o formato do telefone
			    return celular.matches("\\d{8,9}");
			
			}

			private boolean validarEmail(String email) {
			    // Verificar o formato do email usando expressão regular
			    String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
			    return email.matches(regex);
			
			}

			private boolean validarCPF(String cpf) {
				// Remover caracteres especiais e espaços em branco
			    cpf = cpf.replaceAll("[^0-9]", "");

			    // Verificar se o CPF tem 11 dígitos
			    if (cpf.length() != 11) {
			        return false;
			    }

			    // Verificar se todos os dígitos são iguais (CPF inválido)
			    if (cpf.matches("(\\d)\\1{10}")) {
			        return false;
			    }
				return rootPaneCheckingEnabled;

			  
		}});
			
	
		btnNewButton_1.setBounds(114, 389, 116, 23);
		panel_professor.add(btnNewButton_1);
		
		lblSelecioneOCurso = new JLabel("Selecione o Curso");
		lblSelecioneOCurso.setToolTipText("");
		lblSelecioneOCurso.setVerticalAlignment(SwingConstants.TOP);
		lblSelecioneOCurso.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecioneOCurso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSelecioneOCurso.setBounds(266, 75, 123, 20);
		panel_professor.add(lblSelecioneOCurso);
		
		lblNewLabel_2 = new JLabel("Cadastrar Professor");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(86, 54, 170, 14);
		panel_professor.add(lblNewLabel_2);
		
		JMenuItem menuItem = new JMenuItem("New menu item");
		menuItem.setBounds(96, 341, 137, 26);
		panel_professor.add(menuItem);
		
		JPanel panel_curso = new JPanel();
		tabbedPane.addTab("Cursos", null, panel_curso, null);
		panel_curso.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cadastrar Curso");
		lblNewLabel_2_1.setBounds(71, 63, 202, 19);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_curso.add(lblNewLabel_2_1);
		
		textField_16 = new JTextField();
		textField_16.setBounds(71, 106, 202, 20);
		panel_curso.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(71, 137, 202, 20);
		panel_curso.add(textField_17);
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setBounds(10, 109, 46, 14);
		panel_curso.add(lblNewLabel_3);
		
		JLabel lblDurao = new JLabel("Duração:");
		lblDurao.setBounds(10, 140, 58, 14);
		panel_curso.add(lblDurao);
		
		lblDescrio = new JLabel("Descrição:");
		lblDescrio.setBounds(10, 171, 58, 14);
		panel_curso.add(lblDescrio);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(71, 168, 202, 72);
		panel_curso.add(textPane);
		
		btnNewButton_2 = new JButton("Cadastrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
			}
		});
		btnNewButton_2.setBounds(122, 251, 106, 23);
		panel_curso.add(btnNewButton_2);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(343, 63, 263, 338);
		panel_curso.add(scrollPane_5);
		
		JPanel panel_turma = new JPanel();
		tabbedPane.addTab("Turmas", null, panel_turma, null);
		panel_turma.setLayout(null);
		
		lblNewLabel_2_2 = new JLabel("Cadastrar Turma");
		lblNewLabel_2_2.setBounds(113, 11, 160, 19);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_turma.add(lblNewLabel_2_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(235, 115, 132, 83);
		panel_turma.add(scrollPane_2);
		
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_2.setViewportView(list_2);
		
		JLabel lblSelecioneOCurso_1 = new JLabel("Selecione o Curso");
		lblSelecioneOCurso_1.setVerticalAlignment(SwingConstants.TOP);
		lblSelecioneOCurso_1.setToolTipText("");
		lblSelecioneOCurso_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecioneOCurso_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSelecioneOCurso_1.setBounds(235, 95, 132, 20);
		panel_turma.add(lblSelecioneOCurso_1);
		
		JButton btnNewButton_3 = new JButton("Cadastrar");
		btnNewButton_3.setBounds(149, 209, 118, 23);
		panel_turma.add(btnNewButton_3);
		
		textField_18 = new JTextField();
		textField_18.setBounds(88, 61, 86, 20);
		panel_turma.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("N° de Alunos:");
		lblNewLabel_4.setBounds(10, 61, 86, 17);
		panel_turma.add(lblNewLabel_4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(389, 0, 2, 243);
		panel_turma.add(separator_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Cadastrar Sala");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2_1.setBounds(478, 11, 160, 19);
		panel_turma.add(lblNewLabel_2_2_1);
		
		textField_19 = new JTextField();
		textField_19.setBounds(502, 94, 118, 20);
		panel_turma.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(502, 125, 118, 20);
		panel_turma.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(502, 156, 118, 20);
		panel_turma.add(textField_21);
		
		JLabel lblNewLabel_5 = new JLabel("Andar:");
		lblNewLabel_5.setBounds(421, 97, 71, 14);
		panel_turma.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Corredor:");
		lblNewLabel_5_1.setBounds(421, 128, 71, 14);
		panel_turma.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Sala:");
		lblNewLabel_5_2.setBounds(421, 159, 71, 14);
		panel_turma.add(lblNewLabel_5_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 242, 700, 14);
		panel_turma.add(separator_2);
		
		JButton btnNewButton_3_1 = new JButton("Cadastrar");
		btnNewButton_3_1.setBounds(502, 209, 118, 23);
		panel_turma.add(btnNewButton_3_1);
		
		JButton btnNewButton_4 = new JButton("Listar");
		btnNewButton_4.setBounds(103, 268, 96, 23);
		panel_turma.add(btnNewButton_4);
		
		JLabel lblNewLabel_6 = new JLabel("Listar Turmas >");
		lblNewLabel_6.setBounds(10, 272, 96, 14);
		panel_turma.add(lblNewLabel_6);
		
		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(229, 265, 327, 176);
		panel_turma.add(scrollPane_3);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Sala", "Qtd Alunos", "Curso", "Id Turma"
			}
		));
		scrollPane_3.setViewportView(table);
		
		scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(67, 115, 132, 83);
		panel_turma.add(scrollPane_4);
		
		list_3 = new JList();
		list_3.setModel(new AbstractListModel() {
			String[] values = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_4.setViewportView(list_3);
		
		lblSelecioneOCurso_2 = new JLabel("Selecione a Sala");
		lblSelecioneOCurso_2.setVerticalAlignment(SwingConstants.TOP);
		lblSelecioneOCurso_2.setToolTipText("");
		lblSelecioneOCurso_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecioneOCurso_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSelecioneOCurso_2.setBounds(67, 95, 132, 20);
		panel_turma.add(lblSelecioneOCurso_2);
		//painel aluno fim
		
		
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
