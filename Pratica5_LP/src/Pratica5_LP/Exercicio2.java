package Pratica5_LP;
import javax.swing.JOptionPane;
import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int opcao,j;
	    ArrayList<String>redes = new ArrayList();
	    
	    do
	     {
	     String menu= JOptionPane.showInputDialog("1-Cadastrar\n2-Excluir\n3-Pesquisar\n4-Sair");
	     opcao = Integer.parseInt(menu);
	     switch (opcao)
	        {
	             case 1:
	                String nome= JOptionPane.showInputDialog("Digite o Nome: ");
	          	    String telefone= JOptionPane.showInputDialog("Digite o telefone: ");
	          	    String usuario= JOptionPane.showInputDialog("Digite o usuário do Instagram: ");
	          	    String email= JOptionPane.showInputDialog("Digite o e-mail: ");
	                
	          	    redes.add(nome+"; "+telefone+"; "+usuario+"; "+email);
	                
	          	    JOptionPane.showMessageDialog(null, "Inserido com Sucesso");
	                break;
	             
	             case 2:
	                 String remove= JOptionPane.showInputDialog("Digite uma informação do cadastro:");
	                 
	                 try {
	                	 if(redes.size()>0) {
		                	 for(int i=0;i<redes.size();i++){
		                         if(redes.get(i).contains(remove)){
		                             JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
		                             redes.remove(i);
		                         }
		                         else {
			                		 JOptionPane.showMessageDialog(null, "Não encontrado");
			                	 }
		                     }
	                	 }
	                	 else {JOptionPane.showMessageDialog(null, "Lista vazia!");}
	                  
	                 } catch (Exception e) {
	                      
	                	  	System.out.printf("\nErro! " , e.getMessage());
	                	  	e.getMessage();
	                  }                  
	          	      break;
	             
	      	                
	             case 3:
	            	 String pesquisa= JOptionPane.showInputDialog("Digite uma informação do cadastro:");
	            	 try {
	            		 if(redes.size()>0) {
	            			 for(int i=0;i<redes.size();i++){
		            			 if(redes.get(i).contains(pesquisa)){
		            				 JOptionPane.showMessageDialog(null, "Encontrado!");
		            				 JOptionPane.showMessageDialog(null, redes.get(i));
		            				 break;
		       	            	 }
		            			 else {
		            				 JOptionPane.showMessageDialog(null, "Não encontrado");
		            			 }
		            		 }
	            		 }
	            		 else {JOptionPane.showMessageDialog(null, "Lista vazia!");}
                	 
                  } catch (Exception e) {
                      
                	  	System.out.printf("\nErro! " , e.getMessage());
                	  	e.getMessage();
                  }                 
	                    break;
	             case 4:
	                 break;
	             
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
	        }
	     } while (opcao!=4);
	}
	

	}


