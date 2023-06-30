package ModuloPrincipal;

import ModuloCliente.Cliente;
import ModuloCliente.TelaCliente;
import ModuloFuncionario.Funcionario;
import ModuloFuncionario.TelaFuncionario;
import com.mycompany.projetomodularizado.Pessoa;
import com.mycompany.projetomodularizado.TelaPessoa;

public class GerenciadorGenerico {
    public void gerenciar(TelaPessoa tp) {
        Pessoa p = getPessoaType(tp);
        int opc;
        do{
            opc = tp.menu();
            switch(opc){
                case 1 -> tp.cadastrar(p);
                case 2 -> tp.apresentar(p);
            }
        } while(opc!=0);
    }
    private Pessoa getPessoaType(TelaPessoa tp){
        if(tp instanceof TelaCliente){
            return new Cliente();
        }else if(tp instanceof TelaFuncionario){
            return new Funcionario();
        }
        return null;
    }
}
