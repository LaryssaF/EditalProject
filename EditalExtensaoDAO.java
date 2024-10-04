/*
 * import java.sql.Connection; import java.sql.PreparedStatement; import
 * java.sql.SQLException;
 * 
 * import org.postgresql.core.ConnectionFactory;
 * 
 * import com.example.EditalProject.Entity.EditalExtensao;
 * 
 * public class EditalExtensaoDAO { public void insere(EditalExtensao edital) {
 * try (Connection conexao = ConnectionFactory.getConnection()) { // Inserir os
 * dados em uma tabela PreparedStatement stmt = conexao.
 * prepareStatement("INSERT INTO tabela_edital_extensao (titulo, descricao, prazo, criterios_selecao, requisitos) VALUES (?, ?, ?, ?, ?)"
 * ); stmt.setString(1, edital.getTitulo()); stmt.setString(2,
 * edital.getDescricao()); stmt.setDate(3,
 * java.sql.Date.valueOf(edital.getPrazo())); stmt.setString(4,
 * edital.getCriteriosSelecao()); stmt.setString(5, edital.getRequisitos());
 * stmt.executeUpdate(); } catch (SQLException e) {
 * System.err.println("Erro ao conectar com o banco de dados: " +
 * e.getMessage()); } } }
 * 
 */