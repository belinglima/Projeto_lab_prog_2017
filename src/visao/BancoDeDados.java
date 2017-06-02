package visao;
import java.sql.*;

//classe

public class BancoDeDados {

	// aqueles atributos marotos 
	
	int status;
	String SQL = new String();
	SQLException exception;
	Connection connection = null;

	String connection_string = new String();
	
	//definir conexão
	public void configurar_connection(String usuario, String senha, String banco_de_dados){
                
		try {

			this.connection_string = ("jdbc:mysql://" + //uri da conexão
	        	                          "localhost/" +    //endereço do banco  de dados
			    	                  banco_de_dados + //tabela do banco de dados
                                                  "?user=" + usuario +//usuario do banco de dados
                                                  "&password=" + senha +// senha
                                                  "&useSSL=false" // por algum motivo idiota eu preciso botar isso
                                                  );

			this.connection = DriverManager.getConnection(this.connection_string);

		} catch (SQLException zika) {
			System.out.println(zika.getMessage());
			System.out.println("zikou");

		};

	};

        
	//inserir dados no banco de dados
        
        public boolean checarUsuario(String usuario, String senha){
            
            try {
                boolean usuarioliberado = false;
                this.SQL = "SELECT * FROM usuarios WHERE user='"+usuario+"' AND password='"+senha+"'";
                Statement statement = this.connection.createStatement();
                ResultSet resultado = statement.executeQuery(this.SQL);
                
                while (resultado.next()){
                
                    usuarioliberado = true;
                
                };
                
                return usuarioliberado;     
                
                
                
                            
            } catch (SQLException zika) {
			System.out.println(zika.getMessage());
			System.out.println("zikou");
                        return false;

		}
                        
        };
}
