import javax.swing.JOptionPane;
public class Principal {
    public static void main(string[] args){
        int numero;
        numero = Integer.parselnt(JOptionPane.showInputDialog("Insira um nuemro: "));
        
        if ((numero % 10)== 0 ){
            JOptionPane.showMessageDialog(null, "É multiplo de 10 !");
        }else{
            if((numero % 2)== 0){
                JOptionPane.showMessageDialog(null,"É multiplo de 2 !");
            }else{ 
                if((numero % 5)== 0){
                JOptionPane.showMessageDialog(null,"É multipo de 5 ! ");
                }else{
                    JOptionPane.showMessageDialog(null,"Não é multiplo destes!");
                    
                }
                }
        }
             
    }
    
}