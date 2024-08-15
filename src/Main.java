

import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


public class Main  extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4648172894076113183L;


	public Main() {
		super("Lecteur multimedia VLC");
//		this.setIconImage(favicon.ico);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//instanciation de la barre
		this.setJMenuBar(myBar());
		
	}
	private JMenuBar myBar() {
		JMenuBar menuBar = new JMenuBar();
		
		// premier enfant 1/8
		JMenu mediaMenu = new JMenu("Média");
		mediaMenu.setMnemonic('M');
		
		JMenuItem mediaChild1 = new JMenuItem("Ouvrir un fichier");
		mediaChild1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
		mediaMenu.add(mediaChild1);
		
		JMenuItem mediaChild3 = new JMenuItem("ouvrir plusieurs fichiers");
		mediaMenu.add(mediaChild3);
		JMenuItem mediaChild4 = new JMenuItem("Ouvrir un dossier");
		mediaMenu.add(mediaChild4);
		JMenuItem mediaChild5 = new JMenuItem("Ouvrir disque");
		mediaMenu.add(mediaChild5);
		JMenuItem mediaChild6 = new JMenuItem("Ouvrir un flux réseau");
		mediaMenu.add(mediaChild6);
		JMenuItem mediaChild7 = new JMenuItem("Ouvrir un periphérique de capture ");
		mediaMenu.add(mediaChild7);
		JMenuItem mediaChild8 = new JMenuItem("Ouvrir un emplacement depuis le papier presse");
		mediaMenu.add(mediaChild8);
		mediaMenu.addSeparator();
		JMenuItem mediaChild9 =  new JMenuItem("Enregistrer la liste de lecture");
		mediaMenu.add(mediaChild9);
		JMenuItem mediaChild10 =  new JMenuItem("Convertir/Enregistrer");
		mediaMenu.add(mediaChild10);
		JMenuItem mediaChild11 =  new JMenuItem("Diffuser");
		mediaMenu.add(mediaChild11);
		mediaMenu.addSeparator();
		JMenuItem mediaChild12 =  new JMenuItem("Quitter à la fin de la liste de lecture");
		mediaMenu.add(mediaChild12);
		JMenuItem mediaChild13 =  new JMenuItem("Quitter");
//		mediaChild13.addActionListener(this::destroyWindow());
		mediaMenu.add(mediaChild13);

		
		// premier enfant 2/8
		JMenu readMenu = new JMenu("Lecture");
		readMenu.setMnemonic('L');
		JMenuItem readChild1 = new JMenuItem("Titre disabled");
		readMenu.add(readChild1);
		JMenuItem readChild2 = new JMenuItem("Chapitre disabled");
		readMenu.add(readChild2);
		JMenuItem readChild3 = new JMenuItem("Programme disabled");
		readMenu.add(readChild3);
		JMenuItem readChild4 = new JMenuItem("Signets Personnalisés disabled");
		readMenu.add(readChild4);
		JMenuItem readChild5 = new JMenuItem("Rendu");
		readMenu.add(readChild5);
		JMenuItem readChild6 = new JMenuItem("Vitesse disabled");
		readMenu.add(readChild6);
		readMenu.addSeparator();
		JMenuItem readChild7 = new JMenuItem("Avancer disabled");
		readMenu.add(readChild7);
		JMenuItem readChild8 = new JMenuItem("Reculer disabled");
		readMenu.add(readChild8);
		JMenuItem readChild9 = new JMenuItem("Aller à un temps spécifié");
		readMenu.add(readChild9);
		readMenu.addSeparator();
		JMenuItem readChild10 = new JMenuItem("Lire");
		readMenu.add(readChild10);
		JMenuItem readChild11 = new JMenuItem("Arrêter disabled");
		readMenu.add(readChild11);
		JMenuItem readChild12 = new JMenuItem("Précédent state disabled");
		readMenu.add(readChild12);
		JMenuItem readChild13 = new JMenuItem("Suivant disabled");
		readMenu.add(readChild13);
		JMenuItem readChild14 = new JMenuItem("Enregistrer disabled");
		readMenu.add(readChild14);


		// premier enfant 3/8
		JMenu audioMenu = new JMenu("Audio");	
		audioMenu.setMnemonic('A');

		JMenuItem audioChild1 = new JMenuItem("Piste audio disabled");
		audioMenu.add(audioChild1);
		JMenuItem audioChild2 = new JMenuItem("Périphérique audio");
		audioMenu.add(audioChild2);
		JMenuItem audioChild3 = new JMenuItem("Mode stéréo disabled");
		audioMenu.add(audioChild3);
		audioMenu.addSeparator();
		JMenuItem audioChild4 = new JMenuItem("Visualisation disabled");
		audioMenu.add(audioChild4);
		audioMenu.addSeparator();
		JMenuItem audioChild5 = new JMenuItem("Augmenter le volume");
		audioMenu.add(audioChild5);
		JMenuItem audioChild6 = new JMenuItem("Diminuer le volume");
		audioMenu.add(audioChild6);
		JMenuItem audioChild7 = new JMenuItem("Couper le son");
		audioMenu.add(audioChild7);

		
		// premier enfant 4/8
		JMenu videoMenu = new JMenu("Vidéo");
		videoMenu.setMnemonic('V');
		JMenuItem videoChild1 = new JMenuItem ("Piste video disabled");
		videoMenu.add(videoChild1);
		videoMenu.addSeparator();
		JMenuItem videoChild2 = new JMenuItem ("Plein écran");
		videoMenu.add(videoChild2);
		JMenuItem videoChild3 = new JMenuItem ("Toujours adapter à la fenêtre disabled");
		videoMenu.add(videoChild3);
		JMenuItem videoChild4 = new JMenuItem ("Definir comme papier peint");
		videoMenu.add(videoChild4);
		videoMenu.addSeparator();

		JMenuItem videoChild5 = new JMenuItem ("Zoom disabled");
		videoMenu.add(videoChild5);

		JMenuItem videoChild6 = new JMenuItem ("Rapport de cadre disabled");
		videoMenu.add(videoChild6);
		JMenuItem videoChild7 = new JMenuItem ("Rogner disabled");
		videoMenu.add(videoChild7);
		videoMenu.addSeparator();
		JMenuItem videoChild8 = new JMenuItem ("Desentrelacer disabled");
		videoMenu.add(videoChild8);
		JMenuItem videoChild9 = new JMenuItem ("Mode Desentrelacement disabled");
		videoMenu.add(videoChild9);
		videoMenu.addSeparator();
		JMenuItem videoChild10 = new JMenuItem ("Prendre un capture d'écran disabled");
		videoMenu.add(videoChild10);
		
		// premier enfant 5/8
		JMenu subtitleMenu = new JMenu("Sous-titres");
		subtitleMenu.setMnemonic('T');
		JMenuItem subtitleChild1 = new JMenuItem("Ajouter un fichier de sous titres");
		subtitleMenu.add(subtitleChild1);
		JMenuItem subtitleChild2 = new JMenuItem("Piste de sous-titres disabled");
		subtitleChild2.setEnabled(false);
		subtitleMenu.add(subtitleChild2);

		// premier enfant 6/8
		JMenu toolMenu = new JMenu("Outils");
		toolMenu.setMnemonic('O');	
		JMenuItem toolChild1 = new JMenuItem("Effets et Filtres");
		toolMenu.add(toolChild1);
		JMenuItem toolChild2 = new JMenuItem("Synchronisation des pistes");
		toolMenu.add(toolChild2);
		JMenuItem toolChild3 = new JMenuItem("Informations sur le médio");
		toolMenu.add(toolChild3);
		JMenuItem toolChild4 = new JMenuItem("Informations sur le codecs");
		toolMenu.add(toolChild4);
		JMenuItem toolChild5 = new JMenuItem("Configuration VLM");
		toolMenu.add(toolChild5);
		JMenuItem toolChild6 = new JMenuItem("Guides des programmes");
		toolMenu.add(toolChild6);
		JMenuItem toolChild7 = new JMenuItem("Messages");
		toolMenu.add(toolChild7);
		JMenuItem toolChild8 = new JMenuItem("Extensions et greffons");
		toolMenu.add(toolChild8);
		toolMenu.addSeparator();
		JMenuItem toolChild9 = new JMenuItem("Personnaliser l'interfaces");
		toolMenu.add(toolChild9);
		JMenuItem toolChild10 = new JMenuItem("Preferences");
		toolMenu.add(toolChild10);
				
		// premier enfant 8/8
		JMenu viewMenu = new JMenu("Vue");
		viewMenu.setMnemonic('U');
		JMenuItem viewChild1 = new JMenuItem("Listes de lecture");
		viewMenu.add(viewChild1);
		JCheckBoxMenuItem viewChild2 = new JCheckBoxMenuItem("Liste de lecture integrée");
		viewMenu.add(viewChild2);
		viewMenu.addSeparator();
		JMenuItem viewChild3 = new JMenuItem("Toujours au dessus");
		viewMenu.add(viewChild3);
		viewMenu.addSeparator();
		JMenuItem viewChild4 = new JMenuItem("Interface minimales");
		viewMenu.add(viewChild4);
		JMenuItem viewChild5 = new JMenuItem("Interfaces plein écran");
		viewMenu.add(viewChild5);
		JCheckBoxMenuItem viewChild6 = new JCheckBoxMenuItem("Controle avancés");
		viewMenu.add(viewChild6);
		JCheckBoxMenuItem viewChild7 = new JCheckBoxMenuItem("Barre d'état");
		viewMenu.add(viewChild7);
		viewMenu.addSeparator();
		JMenuItem viewChild8 = new JMenuItem("Ajouter une interface");
		viewMenu.add(viewChild8);
		JMenuItem viewChild9 = new JMenuItem("VLsub");
		viewMenu.add(viewChild9);
		
		// premier enfant 9/8
		JMenu helpMenu = new JMenu("Aide");
		helpMenu.setMnemonic('I');
		JMenuItem helpChild1 = new JMenuItem("Aide ");
		helpMenu.add(helpChild1);
		JMenuItem helpChild2 = new JMenuItem("Verifié les mises à jour");
		helpMenu.add(helpChild2);
		helpMenu.addSeparator();
		JMenuItem helpChild3 = new JMenuItem("A propos");
		helpMenu.add(helpChild3);
		
		
//		Ajout des premiers enfants
		menuBar.add(mediaMenu);
		menuBar.add(readMenu);
		menuBar.add(audioMenu);
		menuBar.add(videoMenu);
		menuBar.add(subtitleMenu);	
		menuBar.add(toolMenu);	
		menuBar.add(viewMenu);	
		menuBar.add(helpMenu);	
		
		return menuBar;
		
	}

//	public void destroyWindow() {
//		this.rp
//	}

	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		Main App = new Main();
		App.setVisible(true);
	}

}
