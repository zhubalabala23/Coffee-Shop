package cafetuto;

public class CafeTuto {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
