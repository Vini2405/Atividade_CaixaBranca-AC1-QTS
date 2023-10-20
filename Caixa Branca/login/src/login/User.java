package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/* Classe User é responsável por estabelecer uma conexão com o banco de dados, 
 * validar as credenciais do usuário e armazenar o nome do mesmo. 
 */
public class User {

	 /* Método conectarBD: Responsável por estabelecer uma conexão com o banco de dados.
     * @return: retorna a conexão do banco de dados, para que seja possível usá-la em outros métodos. 
     */
    public Connection conectarBD(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=1opes&password=123";
            conn = DriverManager.getConnection(url);
        }catch (Exception e) { }
        return conn;}
    
    // As variaveis da classe são definidas e inicializadas
    // A variavel nome guardará o nome do usuario, caso este consiga fazer login.
    public String nome="";
    
    /* A variavel booleana result serve para marcar se o usuário efetuou o login ou não.
     * Caso o login seja bem-sucedido, o valor será alterado para True.
     */
    public boolean result = false;
    
    /* Método verificarUsuario: Esse método é o responsável por fazer a consulta MYSQL 
     * com o login e senha informados pelo usuario, para então determinar se o login foi bem-sucedido ou não.
     * @return: valor booleano que indica se o login foi bem-sucedido ou não.
     */
    public boolean verificarUsuario(String login, String senha){
        String sql = "";
        Connection conn = conectarBD();
        
        //INSTRUÇÃO SQL
        
        /* Concatenação de String predefinida + login e senha inseridos pelo usuário, 
         * gerando a linha de SQL que realizará a consulta.
         */
        sql += "select nome from usuarios ";
        sql +="where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "';";
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            /* O bloco de comando "if" verifica se houve um retorno da consulta realizada anteriormente.
             * Caso for false, será lançado um erro.
             * Caso for true, o código continua, e consequentemente, as variaveis "result" e "nome" recebem novos valores.
             */
            if(rs.next()){
                result = true;
                nome = rs.getString("nome");}
            
        }catch (Exception e) { }
        return result; }   
    } //fim da classe
