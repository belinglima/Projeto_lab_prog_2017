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
    public void configurar_connection(String usuario, String senha, String banco_de_dados) {

        try {

            this.connection_string = ("jdbc:mysql://"
                    + //uri da conexão
                    "localhost/"
                    + //endereço do banco  de dados
                    banco_de_dados
                    + //tabela do banco de dados
                    "?user=" + usuario
                    +//usuario do banco de dados
                    //"&password=" +  +// senha
                    "&useSSL=false" // por algum motivo idiota eu preciso botar isso
                    );

            this.connection = DriverManager.getConnection(this.connection_string);

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");

        };

    }

    ;

	//inserir dados no banco de dados
        
        public boolean checarUsuario(String usuario, String senha) {

        try {
            boolean usuarioliberado = false;
            this.SQL = "SELECT * FROM usuarios WHERE user='" + usuario + "' AND password='" + senha + "'";
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            while (resultado.next()) {

                usuarioliberado = true;

            };

            return usuarioliberado;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return false;

        }

    }

    ;
        
        //checar se o usuario já está cadastrado
        
        public boolean usuarioExiste(String usuario) {

        try {

            boolean existe = false;
            this.SQL = "SELECT * FROM usuarios WHERE user='" + usuario + "'";
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            while (resultado.next()) {

                existe = true;

            };

            return existe;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return true;

        }

    }

    ;
        
        // cadastrar usuario
        
        public boolean usuarioCadastrar(String nome, String user, String password, String email, String cpf) {

        try {

            this.SQL = "INSERT INTO usuarios (nome, user, password, email, cpf) VALUES (?,?,?,?,?)";

            PreparedStatement preparedStmt = this.connection.prepareStatement(this.SQL);

            preparedStmt.setString(1, nome);
            preparedStmt.setString(2, user);
            preparedStmt.setString(3, password);
            preparedStmt.setString(4, email);
            preparedStmt.setString(5, cpf);
            preparedStmt.execute();

            return true;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return true;

        }

    }

    ;
        
        // recuperar usuarios
        
        public ResultSet buscarUsuarios() {

        try {
            this.SQL = "SELECT * FROM usuarios";
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            return resultado;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return null;

        }

    }

    // recuperar ID
    public int usuarioID(String user) {

        try {

            int id = 0;
            this.SQL = "SELECT * FROM usuarios WHERE user='" + user + "'";
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            while (resultado.next()) {

                id = resultado.getInt("id");

            };

            return id;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return 0;

        }

    }

    // remover usuario
    public boolean removerUsuario(int id) {

        try {

            this.SQL = "DELETE FROM usuarios WHERE id=?";

            PreparedStatement preparedStmt = this.connection.prepareStatement(this.SQL);

            preparedStmt.setInt(1, id);
            preparedStmt.execute();

            return true;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");

            return false;

        }

    }

    // cadastrar evento
    public boolean eventoCadastrar(int criador_id, String cpf, String instituição, String horas, String local, String nome) {

        try {

            this.SQL = "INSERT INTO eventos (criador_id, cpf, instituicao, horas, local, nome) VALUES (?,?,?,?,?,?)";

            PreparedStatement preparedStmt = this.connection.prepareStatement(this.SQL);

            preparedStmt.setInt(1, criador_id);
            preparedStmt.setString(2, cpf);
            preparedStmt.setString(3, instituição);
            preparedStmt.setString(4, horas);
            preparedStmt.setString(5, local);
            preparedStmt.setString(6, nome);
            preparedStmt.execute();

            return true;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");

            return false;

        }

    }

    ;

        // recuperar eventos
                
        public ResultSet buscarEventos() {

        try {
            this.SQL = "SELECT * FROM eventos";
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            return resultado;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return null;

        }

    }

    // remover usuario
    public boolean removerEvento(int id) {

        try {

            this.SQL = "DELETE FROM eventos WHERE id=?";

            PreparedStatement preparedStmt = this.connection.prepareStatement(this.SQL);

            preparedStmt.setInt(1, id);
            preparedStmt.execute();

            return true;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");

            return false;

        }

    }

    // cadastrar participante
    public boolean cadastrarParticipante(String nome, String cpf, String email, String fone) {

        try {

            this.SQL = "INSERT INTO participante (nome, cpf, email, fone) VALUES (?,?,?,?)";

            PreparedStatement preparedStmt = this.connection.prepareStatement(this.SQL);

            preparedStmt.setString(1, nome);
            preparedStmt.setString(2, cpf);
            preparedStmt.setString(3, email);
            preparedStmt.setString(4, fone);
            preparedStmt.execute();

            return true;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");

            return false;

        }

    }

    // remover participante
    public boolean removerParticipante(int id) {

        try {

            this.SQL = "DELETE FROM participante WHERE id=?";

            PreparedStatement preparedStmt = this.connection.prepareStatement(this.SQL);

            preparedStmt.setInt(1, id);
            preparedStmt.execute();

            return true;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");

            return false;

        }

    }

    // recuperar dados do participante
    public ResultSet buscarParticipante(int id) {

        try {
            this.SQL = "SELECT * FROM participante WHERE id=" + id;
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            return resultado;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return null;

        }

    }

    // buscar participantes
    public ResultSet buscarParticipantes() {

        try {
            this.SQL = "SELECT * FROM participante";
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            return resultado;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return null;

        }

    }

    // recuperar dados do participante
    public ResultSet buscarEvento(int id) {

        try {
            this.SQL = "SELECT * FROM eventos WHERE id=" + id;
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            return resultado;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return null;

        }

    }

    // checar se o certificado existe
    public boolean checarCertificado(int evento_id, int participante_id) {

        try {

            boolean existe = false;
            this.SQL = "SELECT * FROM certificado WHERE evento_id='" + evento_id + "' AND participante_id='" + participante_id + "'";
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            while (resultado.next()) {

                existe = true;

            };

            return existe;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return true;

        }

    }

    // emitir certificado
    public boolean emitirCertificado(int evento_id, int participante_id, String md5_hash) {

        try {

            this.SQL = "INSERT INTO certificado (evento_id, participante_id, hash) VALUES (?,?,?)";

            PreparedStatement preparedStmt = this.connection.prepareStatement(this.SQL);

            preparedStmt.setInt(1, evento_id);
            preparedStmt.setInt(2, participante_id);
            preparedStmt.setString(3, md5_hash);
            preparedStmt.execute();

            return true;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");

            return false;

        }

    }

    // buscar certificado
    public ResultSet buscarCertificado(String hash) {

        try {
            this.SQL = "SELECT * FROM certificado WHERE hash='" + hash + "'";
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            return resultado;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return null;

        }

    }

        // listar certificados
    public ResultSet listarCertificados() {

        try {
            this.SQL = "SELECT * FROM certificado";
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            return resultado;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return null;

        }

    }
    
    // buscar eventos
    public ResultSet buscarEventos(String name) {

        try {
            this.SQL = "SELECT * FROM eventos WHERE nome like '%" + name + "%'";
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            return resultado;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return null;

        }

    }

    // buscar usuarios
    public ResultSet buscarUsuarios(String name) {

        try {
            this.SQL = "SELECT * FROM usuarios WHERE nome like '%" + name + "%'";
            Statement statement = this.connection.createStatement();
            ResultSet resultado = statement.executeQuery(this.SQL);

            return resultado;

        } catch (SQLException zika) {
            System.out.println(zika.getMessage());
            System.out.println("zikou");
            return null;

        }

    }

}
