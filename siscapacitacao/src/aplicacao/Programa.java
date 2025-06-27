package aplicacao;

import entidades.Curso;
import entidades.ServidorPublico;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Programa {

        // Lista de Servidores
        List<ServidorPublico> servidores = new ArrayList<>();
        // Lista de Cursos
        List<Curso> cursos = new ArrayList<>();

        /**
         * Metodo que adiciona o servidor instaciado na nossa lista de Servidores
         */
        public void adicionarServidorPublico(){
            int matricula = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Matrícula"));
            String nome = JOptionPane.showInputDialog(null, "Informe o nome do servidor");
            String orgao = JOptionPane.showInputDialog(null, "Informe o Órgão");
            String cargo = JOptionPane.showInputDialog(null, "Informe o Cargo do servidor");
            String lotacao = JOptionPane.showInputDialog(null, "Informe a Lotação do servidor");
            String email = JOptionPane.showInputDialog(null, "Informe o Email do servidor");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o Salario do servidor"));
            ServidorPublico servidor = new ServidorPublico(matricula, nome, orgao, salario,
            cargo, lotacao, email);
            servidores.add(servidor);
        }

        /**
         * Metodo que lista todos nossos servidores adicionados na lista de Servidores
         */
        public void listarServidores(){
           for (ServidorPublico servidor: servidores){
               System.out.println(servidor);
           }
        }
//        public void listarServidores(int matricula){
//            boolean encontrou = false;
//            for (ServidorPublico servidor : servidores){
//                if (servidor.getMatricula() == matricula){
//                    System.out.println(servidor);
//                    encontrou = true;
//                    break;
//                }
//            }
//            if (!encontrou){
//                JOptionPane.showMessageDialog(null,
//                        "Servidor não encontrado!");
//            }
//        }
        public void listarServidores(String nome){
            boolean encontrou = false;
            for (ServidorPublico servidor : servidores){
                if (servidor.getNome() == nome){
                    System.out.println(servidor);
                    encontrou = true;
                    break;
            }
        }
        if (!encontrou){
            JOptionPane.showMessageDialog(null,
                    "Servidor não encontrado!");
        }
    }

//        alterarServidorPublico()
//        excluirServidorPublico()
//        excluirServidorPublico()
//        calcularFolhaServidoresPublicos()
    public static void main(String[] args) {
            Programa programa = new Programa();
            programa.adicionarServidorPublico();
            programa.adicionarServidorPublico();
            programa.listarServidores();
//            programa.listarServidores(Integer.parseInt(JOptionPane.showInputDialog
//                    (null, "Informe a matrícula que deseja pesquisar")));
//            programa.listarServidores(Integer.parseInt(JOptionPane.showInputDialog
//                (null, "Informe a matrícula que deseja pesquisar")));
        programa.listarServidores(JOptionPane.showInputDialog
                  (null, "Informe o nome que deseja pesquisar"));
    }
}
