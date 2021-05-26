
package calculadorajava;

import br.com.andre.javacalculadora.visao.JFrTela;

/**
 *
 * @author Andre
 */
public class Principal {

    
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrTela().setVisible(true);
            }
        });
    }
    
}
