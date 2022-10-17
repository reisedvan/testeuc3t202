package testeemaula;

import java.sql.Date;
import testeemaula.cadastrodeclientes.entity.Cliente;

public class TesteEmAula {
    
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.setCpf("000.000.000-00");
        c.setNome("Edvan");
        c.setSobrenome("Reis");
        c.setData_nascimento(new Date(System.currentTimeMillis()));
        System.out.println(c);
    
    }
    
}
