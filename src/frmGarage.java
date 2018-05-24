import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Component;

public class frmGarage extends JFrame {

	private JPanel panelRoot;
	private JLabel lblTitolo;
	private JLabel lblErrore;
	private JPanel panel_Y;
	private JPanel panelOpzioniVeicoli;
	private JRadioButton rdbtnAuto;
	private JRadioButton rdbtnFurgone;
	private JRadioButton rdbtnMoto;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel panelDatiAuto;
	private JPanel panelDatiMoto;
	private JPanel panelDatiGenerali;
	private JTextField textTarga;
	private JTextField textMarca;
	private JLabel lblMarca;
	private JTextField textAnno;
	private JLabel lblAnno;
	private JTextField textCilindrata;
	private JLabel lblCilindrata;
	private JLabel lblNPorte;
	private JComboBox comboBoxNPorte;
	private JLabel lblAlimentazione;
	private JComboBox comboBoxAlimentazione;
	private JTextField textCapacita;
	private JLabel lblCapacita;
	private JTextField textTempi;
	private JLabel lblTempi;
	private JPanel panelPulsanti;
	private JPanel panelListe;
	private JButton btnNuovoVeicolo;
	private JButton btnAddParcoVeicoli;
	private JList list;
	private JPanel panel;
	private JList list_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmGarage frame = new frmGarage();
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
	public frmGarage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 398);
		panelRoot = new JPanel();
		panelRoot.setBorder(new EmptyBorder(5, 5, 5, 5));
		panelRoot.setLayout(new BorderLayout(0, 0));
		setContentPane(panelRoot);
		
		lblTitolo = new JLabel("Gestione Garage");
		panelRoot.add(lblTitolo, BorderLayout.NORTH);
		
		lblErrore = new JLabel("");
		panelRoot.add(lblErrore, BorderLayout.SOUTH);
		
		panel_Y = new JPanel();
		panelRoot.add(panel_Y, BorderLayout.WEST);
		panel_Y.setLayout(new BoxLayout(panel_Y, BoxLayout.Y_AXIS));
		
		panelOpzioniVeicoli = new JPanel();
		panel_Y.add(panelOpzioniVeicoli);
		
		rdbtnAuto = new JRadioButton("Auto");
		rdbtnAuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textCapacita.setEnabled(false);
				String s = (String)comboBoxAlimentazione.getSelectedItem();
				lblErrore.setText(s);
			}
		});
		buttonGroup.add(rdbtnAuto);
		panelOpzioniVeicoli.add(rdbtnAuto);
		
		rdbtnFurgone = new JRadioButton("Furgone");
		buttonGroup.add(rdbtnFurgone);
		panelOpzioniVeicoli.add(rdbtnFurgone);
		
		rdbtnMoto = new JRadioButton("Moto");
		buttonGroup.add(rdbtnMoto);
		panelOpzioniVeicoli.add(rdbtnMoto);
		
		panelDatiGenerali = new JPanel();
		panelDatiGenerali.setBorder(new TitledBorder(null, "Dati generali", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_Y.add(panelDatiGenerali);
		
		JLabel lblTarga = new JLabel("Targa");
		panelDatiGenerali.add(lblTarga);
		
		textTarga = new JTextField();
		panelDatiGenerali.add(textTarga);
		textTarga.setColumns(10);
		
		lblMarca = new JLabel("Marca:");
		panelDatiGenerali.add(lblMarca);
		
		textMarca = new JTextField();
		panelDatiGenerali.add(textMarca);
		textMarca.setColumns(10);
		
		lblAnno = new JLabel("Anno:");
		panelDatiGenerali.add(lblAnno);
		
		textAnno = new JTextField();
		panelDatiGenerali.add(textAnno);
		textAnno.setColumns(10);
		
		lblCilindrata = new JLabel("Cilindrata");
		panelDatiGenerali.add(lblCilindrata);
		
		textCilindrata = new JTextField();
		panelDatiGenerali.add(textCilindrata);
		textCilindrata.setColumns(10);
		
		panelDatiAuto = new JPanel();
		panelDatiAuto.setBorder(new TitledBorder(null, "Dati Auto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_Y.add(panelDatiAuto);
		
		lblNPorte = new JLabel("Numero Porte");
		panelDatiAuto.add(lblNPorte);
		
		comboBoxNPorte = new JComboBox();
		comboBoxNPorte.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5"}));
		comboBoxNPorte.setEditable(true);
		panelDatiAuto.add(comboBoxNPorte);
		
		lblAlimentazione = new JLabel("Alimentazione");
		panelDatiAuto.add(lblAlimentazione);
		
		comboBoxAlimentazione = new JComboBox();
		comboBoxAlimentazione.setModel(new DefaultComboBoxModel(new String[] {"Benzina", "Diesel"}));
		panelDatiAuto.add(comboBoxAlimentazione);
		
		JPanel panelDatiFurgone = new JPanel();
		panelDatiFurgone.setBorder(new TitledBorder(null, "Dati Furgone", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_Y.add(panelDatiFurgone);
		
		lblCapacita = new JLabel("Capacit\u00E0:");
		panelDatiFurgone.add(lblCapacita);
		
		textCapacita = new JTextField();
		panelDatiFurgone.add(textCapacita);
		textCapacita.setColumns(10);
		
		panelDatiMoto = new JPanel();
		panelDatiMoto.setBorder(new TitledBorder(null, "Dati Moto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_Y.add(panelDatiMoto);
		
		lblTempi = new JLabel("Tempi:");
		panelDatiMoto.add(lblTempi);
		
		textTempi = new JTextField();
		panelDatiMoto.add(textTempi);
		textTempi.setColumns(10);
		
		panelPulsanti = new JPanel();
		panel_Y.add(panelPulsanti);
		
		btnNuovoVeicolo = new JButton("Nuovo Veicolo");
		panelPulsanti.add(btnNuovoVeicolo);
		
		btnAddParcoVeicoli = new JButton("Add Parco Veicoli");
		panelPulsanti.add(btnAddParcoVeicoli);
		
		panelListe = new JPanel();
		panel_Y.add(panelListe);
		panelListe.setLayout(new GridLayout(1, 3, 2, 2));
		
		list_1 = new JList();
		panelListe.add(list_1);
		
		panel = new JPanel();
		panelListe.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		btnNewButton_1 = new JButton("-->");
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(btnNewButton_1);
		
		btnNewButton = new JButton("<--");
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(btnNewButton);
		
		list = new JList();
		panelListe.add(list);
	}

}
