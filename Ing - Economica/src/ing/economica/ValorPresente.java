package ing.economica;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValorPresente extends IngEconomica{
        
    private JPanel panel_2;
    private JLabel eti1;
    private JLabel eti2;
    private JLabel eti3;
    private JLabel eti4;
    private JLabel eti5;
    private JTextField cajatexto1;
    private JTextField cajatexto2;
    private JTextField cajatexto3;
    private JButton calcular;
    private JButton salir;
    private JButton inicio;

    
    public ValorPresente(){
        setSize(500, 500);
        setTitle("Valor Presente");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Metodo2s();
}
    
    private void Metodo2s(){
        Panel2();
        Etiquetas();
        BotonCalcular();
        BotonSalir();
        BotonInicio();
    }
    
    private void Panel2(){
        panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBackground(Color.GRAY);
        getContentPane().add(panel_2);
    }
    
    private void Etiquetas(){
        
        eti5 =  new JLabel();
        panel_2.add(eti5);
        eti5.setText(" VALOR PRESENTE ");
        eti5.setOpaque(true);
        eti5.setBounds(170, 20, 220, 20);
        eti5.setForeground(Color.CYAN);
        eti5.setFont(new Font("Arial",1,20));
        eti5.setBackground(Color.GRAY);
        
        eti1 = new JLabel("Ingrese el Valor Final");
        panel_2.add(eti1);
        eti1.setFont(new Font("System",1,16));
        eti1.setForeground(Color.CYAN);
        eti1.setBounds(50, 80, 200, 20);
        
        eti2 = new JLabel("Ingrese la Tasa de interes");
        panel_2.add(eti2);
        eti2.setFont(new Font("System",1,16));
        eti2.setForeground(Color.CYAN);
        eti2.setBounds(50, 150, 200, 20);
        
        eti3 = new JLabel("Ingrese el Tiempo (años)");
        panel_2.add(eti3);
        eti3.setFont(new Font("System",1,16));
        eti3.setForeground(Color.CYAN);
        eti3.setBounds(50, 220, 200, 20);
        
        eti4 = new JLabel("Resultado: ");
        panel_2.add(eti4);
        eti4.setFont(new Font("System",1,16));
        eti4.setForeground(Color.CYAN);
        eti4.setBounds(50, 400, 350, 20);
        
        
        cajatexto1 = new JTextField();
        panel_2.add(cajatexto1);
        cajatexto1.setBounds(50, 100, 100, 20);
        
        cajatexto2 = new JTextField();
        panel_2.add(cajatexto2);
        cajatexto2.setBounds(50, 170, 100, 20);
        
        cajatexto3 = new JTextField();
        panel_2.add(cajatexto3);
        cajatexto3.setBounds(50, 250, 100, 20);
    }

    private void BotonCalcular(){
        
        calcular = new JButton("CALCULAR");
        panel_2.add(calcular);
        calcular.setFont(new Font("System",1,12));
        calcular.setForeground(Color.WHITE);
        calcular.setBackground(Color.BLUE);
        calcular.setBounds(230, 300, 100, 40);
        calcular.addActionListener(oyente3);
        
    }
    
    ActionListener oyente3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            
        int vf;
        int i;
        int T;
        int vp;
        vf = Integer.parseInt(cajatexto1.getText());
        i = Integer.parseInt(cajatexto2.getText());
        T = Integer.parseInt(cajatexto3.getText());
        
        vp = vf/(1+i*T);
        
        eti3.setText("El valor presente es de : " + vp);
        
        }
    };
    
    
    
    private void  BotonSalir(){
        
        salir = new JButton("SALIR");
        panel_2.add(salir);
        salir.setFont(new Font("System",1,12));
        salir.setForeground(Color.WHITE);
        salir.setBackground(Color.BLUE);
        salir.setBounds(350, 300, 100, 40);
        salir.addActionListener(oyente2);
    }
    
    ActionListener oyente2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            System.exit(0);
        }
    };
    
    private void  BotonInicio(){
        
        inicio = new JButton("INICIO");
        panel_2.add(inicio);
        inicio.setFont(new Font("System",1,12));
        inicio.setForeground(Color.WHITE);
        inicio.setBackground(Color.BLUE);
        inicio.setBounds(110, 300, 100, 40);
        inicio.addActionListener(oyente4);
    }
    
    ActionListener oyente4 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            
            IngEconomica ieco = new IngEconomica();
            ieco.setVisible(true);
            dispose();
        }
    };
    
}