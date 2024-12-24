package br.fosge.editor;

import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Arvore {

    // Declara componentes
    JLabel rotulo;
    JLabel rodape;
    JTree disco;
    DefaultTreeModel modelo;
    DefaultMutableTreeNode titulo;

    // Declara variaveis e Arrays
    String albumB = "Please, Please Me";

    String[] MusicaB = {  "I Saw Her Standing There",  "Misery",  "Anna (Go to Him)",
            "Chains" ,  "Boys" , "Ask Me Why",  "Please Please Me",  "Love Me Do" ,
            "P.S. I Love You",  "Baby It's You",  "Do You Want To Know A Secret?",
            "A Taste of Honey",  "There's A Place",  "Twist and Shout"  };

    String albumR = "The Rolling Stones";

    String [] MusicaR ={ "Route 66", "I Just Want to Make Love to You", "Honest I Do",
            "Mona (I Need You Baby)",  "You Can Make It If You Try", "Little by Little",
            "I\'m a King Bee", "Carol", "Tell Me (You \'re Coming Back)", "Can I Get a Witness",
            "Tell Me (You\'re Coming Back)",  "Walking the Dog" };

    public Container criaPainel()
    {
        // Cria painel
        JPanel painel = new JPanel();

        // Define laylout
        painel.setLayout(new BoxLayout(painel, BoxLayout.PAGE_AXIS));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Cria componentes
        rotulo = new JLabel("Duplo clique em um nó da arvore:");
        rodape = new JLabel("Evento do mouse");

        titulo = new DefaultMutableTreeNode("Discografia");
        modelo = new DefaultTreeModel(titulo);
        disco = new JTree(modelo);

        // Alinha componente4s
        rotulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        rodape.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Cria evento do mouse
        disco.addMouseListener(new MouseAdapter()
        {
            // Duplo clique do mouse
            public void mouseClicked(MouseEvent e)
            {
                if (e.getClickCount() == 2 )
                {
                    // retorna texto da arvore
                    rodape.setText(disco.getLastSelectedPathComponent().toString());
                }

            }
        });

        // Define propriedades da arvore
        disco.setEditable(true);
        disco.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        disco.setShowsRootHandles(true);

        // Cria painel de rolagem
        ScrollPane barra = new ScrollPane();

        // Define tamanho do painel
        barra.setPreferredSize(new Dimension(300, 500));

        // Cria Nodes da arvore
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("Beatles");
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("Rolling Stones");

        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode(albumB);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode(albumR);

        DefaultMutableTreeNode m1;
        DefaultMutableTreeNode m2;

        // Adiciona nodes na arvore
        titulo.add(b1);
        titulo.add(b2);

        b1.add(a1);
        b2.add(a2);

        // Adicina lista de musicas
        for (int i = 0; i < MusicaB.length; i++)
        {
            m1 = new DefaultMutableTreeNode (MusicaB[i]);
            a1.add(m1);
        }

        for (int i = 0; i < MusicaR.length; i++)
        {
            m2 = new DefaultMutableTreeNode (MusicaR[i]);
            a2.add(m2);
        }

        // Adiciona arvore ao painel de rolagem
        barra.add(disco);

        // Adiciona componentes ao painel
        painel.add(rotulo);
        painel.add(Box.createVerticalStrut(10));
        painel.add(barra);
        painel.add(Box.createVerticalStrut(10));
        painel.add(rodape);

        return painel;

    }

    public static void criaGUI()
    {
        // Cria formulario
        JFrame formulario = new JFrame("DA - JTree");
        formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria classe arvore
        Arvore arvore = new Arvore();

        formulario.setContentPane(arvore.criaPainel());

        formulario.pack();

        formulario.setVisible(true);

    }

    public static void main(String[] args) {

        // Thread do swing
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                // Chama a GUI
                criaGUI();
            }
        });

    }

}
