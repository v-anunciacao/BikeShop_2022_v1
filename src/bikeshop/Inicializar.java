package bikeshop;

import bikeshop.modelos.Inventario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author victo
 */
public class Inicializar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inventario i = new Inventario();
        i.CarregarItens();
        i.ExibirItens();
        
    }

    private static BufferedReader BufferedReader(FileReader fileReader) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
