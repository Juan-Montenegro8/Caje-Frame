package presentarcaje;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class jose extends JFrame{
    private JPanel panel;
    private JLabel saludo;
    private JLabel saludo1;
    private JButton boton;
    private JButton boton1;
    private JTextField tex;
    private JTextField tex1;
    private JPasswordField pss;
    private JPasswordField pss1;
    private JRadioButton jja1;
    private JRadioButton jja;
    
    double saldo;
    
    public double getSal() {
        return saldo;
    }

    public void setSal(double saldo) {
        this.saldo = saldo;
    }

    public jose(double saldo) {
        setBounds(50,50,500,650);
        setTitle ("cajero");
        iniciarcomponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.saldo=saldo;
        
    }
    private void iniciarcomponentes(){
        cPanel();
        cEtiquitausu();
        ctexusu();
        cEtiquitacontra();
        ctextcontra();
        cBoton();
        cBoton1();
        cEtiqui();
        jj();
        jaj();
        cBoton2();
    }
    private void cPanel(){
        panel= new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void cEtiquitausu(){
        JLabel eti=new JLabel("Usuario");
        eti.setBounds(200, 10, 200, 30);
        eti.setFont(new Font("arial",0,15));
        panel.add(eti);
    }
    private void ctexusu(){
        tex=new JTextField();
        tex.setBounds(150, 50, 150, 40);
        panel.add(tex);
        }
    private void cEtiquitacontra(){
        JLabel eti=new JLabel("Contaseña");
        eti.setBounds(190, 100, 200, 30);
        eti.setFont(new Font("arial",0,15));
        panel.add(eti);
    }
    private void ctextcontra(){
        pss=new JPasswordField();
        pss.setBounds(150, 140, 150, 40);
        panel.add(pss);
        }
    private void cEtiqui(){
        JLabel eti=new JLabel("desea impimir su recibo");
        eti.setBounds(145, 200, 200, 30);
        eti.setFont(new Font("arial",0,15));
        panel.add(eti);
    }
    private void jj(){
        jja1= new JRadioButton ("si");
        jja1.setBounds(150, 220, 40, 40);
        panel.add(jja1);
        
        jja= new JRadioButton ("no");
        jja.setBounds(250, 220, 40, 40);
        panel.add(jja);
    }
    private void jaj(){
        boton=new JButton("retiro");  
        boton.setBounds(150, 280, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);
        
        ActionListener oo=(ActionEvent ae) -> {
            saludo.setText("ingrese valor a retirar");
            tex=new JTextField();
            tex.setBounds(50, 490, 300, 40);
            panel.add(tex);
            boton1=new JButton("retiro");
            boton1.setBounds(50, 540, 150, 40);
            boton1.setFont(new Font("arial",0,15));
            panel.add(boton1);
        };
        boton.addActionListener(oo);
    }
    
    
    private void cBoton(){
        
        boton=new JButton("transferencia");  
        boton.setBounds(80, 330, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);
        
        saludo= new JLabel();
        saludo.setBounds(50, 450, 400, 40);
        saludo.setFont(new Font("arial",0,15));
        panel.add(saludo);
        
        saludo1= new JLabel();
        saludo1.setBounds(250, 450, 400, 40);
        saludo1.setFont(new Font("arial",0,15));
        panel.add(saludo1);
        
        ActionListener oo=(ActionEvent ae) -> {
            saludo.setText("valor transferencia");
            saludo1.setText("numero otra cuenta");
            tex1=new JTextField();
            tex1.setBounds(50, 490, 150, 40);
            panel.add(tex1);
            tex=new JTextField();
            tex.setBounds(250, 490, 150, 40);
            panel.add(tex);
            boton1=new JButton("transferir");
            boton1.setBounds(50, 540, 150, 40);
            boton1.setFont(new Font("arial",0,15));
            panel.add(boton1);
            
        };
        boton.addActionListener(oo);
        }
private void cBoton1(){
    boton=new JButton("cambio clave");  
        boton.setBounds(250, 330, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);
       
        ActionListener oo=(ActionEvent ae) -> {
            saludo.setText("nueva clave");
            saludo1.setText("confrimar");
            pss=new JPasswordField();
            pss.setBounds(50, 490, 150, 40);
            panel.add(pss);
            pss1=new JPasswordField();
            pss1.setBounds(250, 490, 150, 40);
            panel.add(pss1);
            boton1=new JButton("cambiar");
            boton1.setBounds(50, 540, 150, 40);
            boton1.setFont(new Font("arial",0,15));
            panel.add(boton1);
        };
        boton.addActionListener(oo);
}

    private void cBoton2(){
        boton=new JButton("mirar sado");  
        boton.setBounds(150, 380, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);
        
        ActionListener oo=(ActionEvent ae) -> {
            saludo.setText("su saldo es de "+getSal());
        };
        boton.addActionListener(oo);
    }
        }