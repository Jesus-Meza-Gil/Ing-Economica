package ing.economica;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class IngEconomica extends JFrame{
    
    private JPanel panel;
    private JLabel etiqueta1;
    private JLabel I;
    private JLabel i;
    private JLabel vp;
    private JLabel vf;
    private JLabel T;
    private JButton bot1;
    private ButtonGroup GrupoBot;
    private JRadioButton r1;
    private JRadioButton r2;
    private JRadioButton r3;
    private JRadioButton r4;
    private JRadioButton r5;
    
    public IngEconomica(){
            setSize(500, 500);
            setTitle("Formulas");
            setLocationRelativeTo(null);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            Metodos();
    }
    
    private void Metodos (){
        Panel();
        Etiquetas();
        RadioBotones();
        Botones();
        
    }
    
    
    private void Panel(){
        
        panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
    }    

    private void Etiquetas(){
            
        etiqueta1 =  new JLabel();
        panel.add(etiqueta1);
        etiqueta1.setText(" ¿QUE OPERACIÓN DESEA HACER?");
        etiqueta1.setOpaque(true);
        etiqueta1.setBounds(60, 20, 350, 20);
        etiqueta1.setForeground(Color.CYAN);
        etiqueta1.setFont(new Font("Arial",1,20));
        etiqueta1.setBackground(Color.GRAY);
        
        
        I = new JLabel();
        panel.add(I);
        I.setText( "Hallar el interés");
        I.setFont(new Font("System",1,16));
        I.setForeground(Color.CYAN);
        I.setBounds(45, 70, 300, 20);
        
        
        i = new JLabel();
        panel.add(i);
        i.setText( "Hallar la tasa de interes");
        i.setFont(new Font("System",1,16));
        i.setForeground(Color.CYAN);
        i.setBounds(45, 100, 300, 20);
        
        vf = new JLabel();
        panel.add(vf);
        vf.setText( "Hallar el valor final");
        vf.setFont(new Font("System",1,16));
        vf.setForeground(Color.CYAN);
        vf.setBounds(45, 130, 300, 20);
        
        vp = new JLabel();
        panel.add(vp);
        vp.setFont(new Font("System",1,16));
        vp.setForeground(Color.CYAN);
        vp.setText( "Hallar el valor presente");
        vp.setBounds(45, 160, 300, 20);
        
        T = new JLabel();
        panel.add(T);
        T.setText( "Hallar el tiempo");
        T.setFont(new Font("System",1,16));
        T.setForeground(Color.CYAN);
        T.setBounds(45, 190, 300, 20);
        
        
    }
    private void RadioBotones(){
        
        r1 = new JRadioButton();
        panel.add(r1);
        r1.setBounds(20, 70, 20, 20);
        r1.setBackground(Color.DARK_GRAY);
         
        r2 = new JRadioButton();
        panel.add(r2);
        r2.setBounds(20, 100, 20, 20);
        r2.setBackground(Color.DARK_GRAY);
        
        r3 = new JRadioButton();
        panel.add(r3);
        r3.setBounds(20, 130, 20, 20);
        r3.setBackground(Color.DARK_GRAY);
        
        r4 = new JRadioButton();
        panel.add(r4);
        r4.setBounds(20, 160, 20, 20);
        r4.setBackground(Color.DARK_GRAY);
        
        r5 = new JRadioButton();
        panel.add(r5);
        r5.setBounds(20, 190, 20, 20);
        r5.setBackground(Color.DARK_GRAY);
        
        GrupoBot = new ButtonGroup();
        GrupoBot.add(r1);
        GrupoBot.add(r2);
        GrupoBot.add(r3);
        GrupoBot.add(r4);
        GrupoBot.add(r5);
    }
    
    
    
    private void Botones(){
        bot1 = new JButton("SIGUIENTE");
        panel.add(bot1);
        bot1.setFont(new Font("System",1,12));
        bot1.setForeground(Color.WHITE);
        bot1.setBackground(Color.BLUE);
        bot1.setBounds(300, 300, 100, 40);
        bot1.addActionListener(accion);
        }
    
    
    ActionListener accion = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            if (GrupoBot.isSelected(null)){
                    JOptionPane.showMessageDialog(panel, "Por favor seleccione alguno");
            }else{

                 if(r1.isSelected()){
                     Interes inte = new Interes();
                     inte.setVisible(true);
                     dispose();
                 }
                 if(r2.isSelected()){
                     Tinteres Ti = new Tinteres();
                     Ti.setVisible(true);
                     dispose();
                 }
                 if(r3.isSelected()){
                     ValorFinal vf = new ValorFinal();
                     vf.setVisible(true);
                     dispose();
                 }
                 if(r4.isSelected()){
                     ValorPresente vp = new ValorPresente();
                     vp.setVisible(true);
                     dispose();
                 }
                 if(r5.isSelected()){
                     Tiempo T = new Tiempo();
                     T.setVisible(true);
                     dispose();
                 }
            }
        }
        
    };
    
      public static void main(String[] args) {
        IngEconomica ie = new IngEconomica();
        ie.setVisible(true);
    }
    
    
}



    

    
