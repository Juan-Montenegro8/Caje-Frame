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
    private JTextField texto;
    private JTextField texto1;
    private JPasswordField pss;
    private JPasswordField pss1;
    private JRadioButton RButon1;
    private JRadioButton RButon;
    
    double saldo;
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
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
        cBotonTransferencia();
        cBotonCambioClave();
        cEtiquetaImpresion();
        rButtonSiNo();
        jButtonRetiro();
        cBotonMirarSaldo();
    }
    private void cPanel(){
        panel= new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    private void cEtiquitausu(){
        JLabel etiquetaUsu=new JLabel("Usuario");
        etiquetaUsu.setBounds(200, 10, 200, 30);
        etiquetaUsu.setFont(new Font("arial",0,15));
        panel.add(etiquetaUsu);
    }
    private void ctexusu(){
        texto=new JTextField();
        texto.setBounds(150, 50, 150, 40);
        panel.add(texto);
        }
    private void cEtiquitacontra(){
        JLabel etiquetaContraseña=new JLabel("Contaseña");
        etiquetaContraseña.setBounds(190, 100, 200, 30);
        etiquetaContraseña.setFont(new Font("arial",0,15));
        panel.add(etiquetaContraseña);
    }
    private void ctextcontra(){
        pss=new JPasswordField();
        pss.setBounds(150, 140, 150, 40);
        panel.add(pss);
        }
    private void cEtiquetaImpresion(){
        JLabel etiquetaImpresion=new JLabel("Desea impimir su recibo");
        etiquetaImpresion.setBounds(145, 200, 200, 30);
        etiquetaImpresion.setFont(new Font("arial",0,15));
        panel.add(etiquetaImpresion);
    }
    private void rButtonSiNo(){
        RButon1= new JRadioButton ("si");
        RButon1.setBounds(150, 220, 40, 40);
        panel.add(RButon1);
        
        RButon= new JRadioButton ("no");
        RButon.setBounds(250, 220, 40, 40);
        panel.add(RButon);
    }
    private void jButtonRetiro(){
        boton=new JButton("retiro");  
        boton.setBounds(150, 280, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);
        
        ActionListener oo=(ActionEvent ae) -> {
            saludo.setText("ingrese valor a retirar");
            texto=new JTextField();
            texto.setBounds(50, 490, 300, 40);
            panel.add(texto);
            boton1=new JButton("retiro");
            boton1.setBounds(50, 540, 150, 40);
            boton1.setFont(new Font("arial",0,15));
            panel.add(boton1);
        };
        boton.addActionListener(oo);
    }
    
    
    private void cBotonTransferencia(){
        
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
            texto1=new JTextField();
            texto1.setBounds(50, 490, 150, 40);
            panel.add(texto1);
            texto=new JTextField();
            texto.setBounds(250, 490, 150, 40);
            panel.add(texto);
            boton1=new JButton("transferir");
            boton1.setBounds(50, 540, 150, 40);
            boton1.setFont(new Font("arial",0,15));
            panel.add(boton1);
            
        };
        boton.addActionListener(oo);
        }
    private void cBotonCambioClave(){
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

    private void cBotonMirarSaldo(){
        boton=new JButton("mirar sado");  
        boton.setBounds(150, 380, 150, 40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);
        
        ActionListener oo=(ActionEvent ae) -> {
            saludo.setText("su saldo es de "+getSaldo());
        };
        boton.addActionListener(oo);
    }
}