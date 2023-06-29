package view;

import dao.*;
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
import javax.swing.table.TableColumn;

import dto.AlunoDTO;
import dto.CursoDTO;
import dto.ProfessorDTO;
import dto.SalaDTO;
import dto.TurmaDTO;

import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JComboBox;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtAsdas;
	private JTextField txtNomeAluno;
	private JTextField txtSobrenomeAluno;
	private JTextField txtCpfAluno;
	private JTextField txtCelularAluno;
	private JTextField txtEmailAluno;
	private JTextField txtBairroAluno;
	private JTextField txtRuaAluno;
	private JTextField txtNumeroAluno;
	private JLabel lblSobrenome;
	private JLabel lblCpf;
	private JLabel lblCelular;
	private JLabel lblEmail;
	private JLabel lblBairro;
	private JLabel lblRua;
	private JLabel lblNumero;
	private JButton btnCadastrarAluno;
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
	private JButton btnCadastrarProfessor;
	private JLabel lblNewLabel_2;
	private JTextField textFCurso_nome;
	private JTextField textFCurso_duracao;
	private JLabel lblDescrio;
	private JButton btnCadastrarCurso;
	private JLabel lblNewLabel_2_2;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JScrollPane scrollPane_3;
	private JTable table;
	private JLabel lblSelecioneOCurso_2;
	private JScrollPane scrollPane_5;
	private JLabel lblSelecioneOCurso_3;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane_1;
	private JLabel lblNewLabel_7;
	private JTable table_1;
	private JComboBox comboCursoAluno;
	private JComboBox comboBoxProfessor;
	private JLabel lblNumero_2;
	private JLabel lblNumero_3;
	private JComboBox comboBoxSala;
	private JComboBox comboBoxCurso;
	private JTable table_cursos;
	private JButton btnListarCurso;

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
		
		txtNomeAluno = new JTextField();
		txtNomeAluno.setBounds(86, 96, 170, 20);
		panel_aluno.add(txtNomeAluno);
		txtNomeAluno.setColumns(10);
		
		txtSobrenomeAluno = new JTextField();
		txtSobrenomeAluno.setColumns(10);
		txtSobrenomeAluno.setBounds(86, 127, 170, 20);
		panel_aluno.add(txtSobrenomeAluno);
		
		txtCpfAluno = new JTextField();
		txtCpfAluno.setColumns(10);
		txtCpfAluno.setBounds(86, 158, 170, 20);
		panel_aluno.add(txtCpfAluno);
		
		txtCelularAluno = new JTextField();
		txtCelularAluno.setColumns(10);
		txtCelularAluno.setBounds(86, 189, 170, 20);
		panel_aluno.add(txtCelularAluno);
		
		txtEmailAluno = new JTextField();
		txtEmailAluno.setColumns(10);
		txtEmailAluno.setBounds(86, 220, 170, 20);
		panel_aluno.add(txtEmailAluno);
		
		txtBairroAluno = new JTextField();
		txtBairroAluno.setColumns(10);
		txtBairroAluno.setBounds(86, 251, 170, 20);
		panel_aluno.add(txtBairroAluno);
		
		txtRuaAluno = new JTextField();
		txtRuaAluno.setColumns(10);
		txtRuaAluno.setBounds(86, 282, 170, 20);
		panel_aluno.add(txtRuaAluno);
		
		txtNumeroAluno = new JTextField();
		txtNumeroAluno.setColumns(10);
		txtNumeroAluno.setBounds(86, 313, 170, 20);
		panel_aluno.add(txtNumeroAluno);
		
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
		
		btnCadastrarAluno = new JButton("Cadastrar");
		btnCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtNomeAluno.getText();
			    String sobrenome = txtSobrenomeAluno.getText();
			    String cpf = txtCpfAluno.getText();
			    String celular = txtCelularAluno.getText();
			    String email = txtEmailAluno.getText();
			    String bairro = txtBairroAluno.getText();
			    String rua = txtRuaAluno.getText();
			    String numero = txtNumeroAluno.getText();
			
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
		            AlunoDTO objalunoodto = new AlunoDTO();
		            objalunoodto.setNome(nome);
		            objalunoodto.setSobrenome(sobrenome);
		            objalunoodto.setCpf(cpf);
		            objalunoodto.setCelular(celular);
		            objalunoodto.setEmail(email);
		            objalunoodto.setBairro(bairro);
		            objalunoodto.setRua(rua);
		            objalunoodto.setNumeroCasa(numero);
		            
		            
		            // Código para cadastrar o aluno

		            JOptionPane.showMessageDialog(TelaPrincipal.this, "Aluno cadastrado com sucesso!");
		        }
		        
		     // Limpa os campos após o cadastro
	            txtNomeAluno.setText("");
	            txtSobrenomeAluno.setText("");
	            txtCpfAluno.setText("");
	            txtCelularAluno.setText("");
	            txtEmailAluno.setText("");
	            txtBairroAluno.setText("");
	            txtRuaAluno.setText("");
	            txtNumeroAluno.setText("");
	        
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
		btnCadastrarAluno.setBounds(102, 429, 116, 23);
		panel_aluno.add(btnCadastrarAluno); 
		
		JLabel lblNewLabel_1 = new JLabel("Cadastrar Aluno");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(86, 55, 170, 14);
		panel_aluno.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(278, 0, 2, 463);
		panel_aluno.add(separator);
		
		lblSelecioneOCurso_3 = new JLabel("Selecione");
		lblSelecioneOCurso_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblSelecioneOCurso_3.setBounds(10, 344, 167, 14);
		panel_aluno.add(lblSelecioneOCurso_3);
		
		lblNewLabel = new JLabel("o Curso:");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(10, 361, 167, 14);
		panel_aluno.add(lblNewLabel);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(290, 103, 410, 349);
		panel_aluno.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setEnabled(false);
		table_1.setRowSelectionAllowed(false);
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
		
		comboCursoAluno = new JComboBox();
		comboCursoAluno.setBounds(86, 357, 170, 22);
		panel_aluno.add(comboCursoAluno);
		
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
		
		btnCadastrarProfessor = new JButton("Cadastrar");
		btnCadastrarProfessor.addActionListener(new ActionListener() {
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
		            ProfessorDTO professor = new ProfessorDTO(nome, sobrenome, cpf, celular, email, bairro, rua, numero);
		            // Código para cadastrar o professor

		            JOptionPane.showMessageDialog(TelaPrincipal.this, "Professor cadastrado com sucesso!");
		            
		            textField_15.setText("");
		            textField_14.setText("");
		            textField_13.setText("");
		            textField_12.setText("");
		            textField_11.setText("");
		            textField_10.setText("");
		            textField_9.setText("");
		            textField_8.setText("");
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
		
	
		btnCadastrarProfessor.setBounds(114, 413, 116, 23);
		panel_professor.add(btnCadastrarProfessor);
		
		lblNewLabel_2 = new JLabel("Cadastrar Professor");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(86, 54, 170, 14);
		panel_professor.add(lblNewLabel_2);
		
		comboBoxProfessor = new JComboBox();
		comboBoxProfessor.setBounds(86, 354, 170, 29);
		panel_professor.add(comboBoxProfessor);
		
		lblNumero_2 = new JLabel("Selecione");
		lblNumero_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumero_2.setBounds(10, 354, 66, 14);
		panel_professor.add(lblNumero_2);
		
		lblNumero_3 = new JLabel("o Curso:");
		lblNumero_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumero_3.setBounds(10, 369, 66, 14);
		panel_professor.add(lblNumero_3);
		
		JPanel panel_curso = new JPanel();
		tabbedPane.addTab("Cursos", null, panel_curso, null);
		panel_curso.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cadastrar Curso");
		lblNewLabel_2_1.setBounds(71, 63, 202, 19);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_curso.add(lblNewLabel_2_1);
		
		textFCurso_nome = new JTextField();
		textFCurso_nome.setBounds(71, 106, 202, 20);
		panel_curso.add(textFCurso_nome);
		textFCurso_nome.setColumns(10);
		
		textFCurso_duracao = new JTextField();
		textFCurso_duracao.setColumns(10);
		textFCurso_duracao.setBounds(71, 137, 202, 20);
		panel_curso.add(textFCurso_duracao);
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setBounds(10, 109, 46, 14);
		panel_curso.add(lblNewLabel_3);
		
		JLabel lblDurao = new JLabel("Duração:");
		lblDurao.setBounds(10, 140, 58, 14);
		panel_curso.add(lblDurao);
		
		lblDescrio = new JLabel("Descrição:");
		lblDescrio.setBounds(10, 171, 58, 14);
		panel_curso.add(lblDescrio);
		
		JTextPane textPaneCurso = new JTextPane();
		textPaneCurso.setBounds(71, 168, 202, 72);
		panel_curso.add(textPaneCurso);
		
		btnCadastrarCurso = new JButton("Cadastrar");
		btnCadastrarCurso.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
					 String nome = textFCurso_nome.getText();
				        String duracao = textFCurso_duracao.getText();
				        String descricao = textPaneCurso.getText();
				    
				        
				        if (nome.isEmpty() || duracao.isEmpty() || descricao.isEmpty()) {
				            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!");
				        } else {
				            // Aqui você pode realizar a lógica de cadastro do curso
				            CursoDTO curso = new CursoDTO(nome, duracao, descricao);
				            // Código adicional para salvar o curso ou realizar outras operações necessárias
				            
				            JOptionPane.showMessageDialog(null, "Curso cadastrado com sucesso!");
				            
				            // Limpa os campos após o cadastro
				            textFCurso_nome.setText("");
				            textFCurso_duracao.setText("");
				            textPaneCurso.setText("");
				            
				        }
				    }
			
				});
				
				
				
				
			
		btnCadastrarCurso.setBounds(122, 251, 106, 23);
		panel_curso.add(btnCadastrarCurso);
		
		scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(312, 60, 124, 225);
		panel_curso.add(scrollPane_5);
		
		table_cursos = new JTable();
		table_cursos.setModel(new DefaultTableModel(
			new Object[][] {
				{"1"},
				{"2"},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Cursos"
			}
		));
		scrollPane_5.setViewportView(table_cursos);
		
		btnListarCurso = new JButton("Listar");
		btnListarCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CursoDAO objlistarcurso = new CursoDAO();

				
				
			}
		});
		btnListarCurso.setBounds(322, 299, 89, 23);
		panel_curso.add(btnListarCurso);
		
		JPanel panel_turma = new JPanel();
		tabbedPane.addTab("Turmas", null, panel_turma, null);
		panel_turma.setLayout(null);
		
		lblNewLabel_2_2 = new JLabel("Cadastrar Turma");
		lblNewLabel_2_2.setBounds(113, 11, 160, 19);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_turma.add(lblNewLabel_2_2);
		
		JLabel lblSelecioneOCurso_1 = new JLabel("Selecione o Curso");
		lblSelecioneOCurso_1.setVerticalAlignment(SwingConstants.TOP);
		lblSelecioneOCurso_1.setToolTipText("");
		lblSelecioneOCurso_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecioneOCurso_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSelecioneOCurso_1.setBounds(217, 107, 132, 20);
		panel_turma.add(lblSelecioneOCurso_1);
		
		JButton btnCadastrarTurma = new JButton("Cadastrar");
		btnCadastrarTurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String nrAlunos = textField_18.getText();
		        if (nrAlunos.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!");
		            return;
		        }

		    
		        

		    
		        

		        // Obtém o curso selecionado
		        String cursoSelecionado = comboBoxCurso.getSelectedItem().toString();

		        // Obtém a sala selecionada
		        String salaSelecionada = comboBoxSala.getSelectedItem().toString();

		        TurmaDTO turma = new TurmaDTO(nrAlunos, cursoSelecionado, salaSelecionada);
		        // Código adicional para salvar a turma ou realizar outras operações necessárias

		        // Exibe a mensagem de sucesso no cadastro da turma
		        JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso!\nCurso: " + cursoSelecionado + "\nSala: " + salaSelecionada);

		        // Limpa os campos de texto após o cadastro
		        textField_18.setText("");

		        
		    }
		});
		btnCadastrarTurma.setBounds(149, 209, 118, 23);
		panel_turma.add(btnCadastrarTurma);
		
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
		
		JButton btnCadastrarSala = new JButton("Cadastrar");
		btnCadastrarSala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			        String andar = textField_19.getText();
			        String corredor = textField_20.getText();
			        String sala = textField_21.getText();

			        // Validação dos campos de texto
			        if (andar.isEmpty() || corredor.isEmpty() || sala.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!");
			            return;
			        }

			        // Criação do objeto Sala com as informações fornecidas
			        SalaDTO novaSala = new SalaDTO(andar, corredor, sala);

			        // Operações adicionais, como salvar a sala em um banco de dados ou em uma estrutura de dados

			        // Exibe uma mensagem de sucesso no cadastro da sala
			        JOptionPane.showMessageDialog(null, "Sala cadastrada com sucesso!");

			        // Limpa os campos de texto após o cadastro
			        textField_19.setText("");
			        textField_20.setText("");
			        textField_21.setText("");
			    }
			});
			
		btnCadastrarSala.setBounds(502, 209, 118, 23);
		panel_turma.add(btnCadastrarSala);
		
		JButton btnListarTurmas = new JButton("Listar");
		btnListarTurmas.setBounds(103, 268, 96, 23);
		panel_turma.add(btnListarTurmas);
		
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
		
		lblSelecioneOCurso_2 = new JLabel("Selecione a Sala");
		lblSelecioneOCurso_2.setVerticalAlignment(SwingConstants.TOP);
		lblSelecioneOCurso_2.setToolTipText("");
		lblSelecioneOCurso_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecioneOCurso_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSelecioneOCurso_2.setBounds(42, 107, 132, 20);
		panel_turma.add(lblSelecioneOCurso_2);
		
		comboBoxSala = new JComboBox();
		comboBoxSala.setBounds(42, 124, 132, 22);
		panel_turma.add(comboBoxSala);
		
		comboBoxCurso = new JComboBox();
		comboBoxCurso.setBounds(217, 124, 132, 22);
		panel_turma.add(comboBoxCurso);
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
