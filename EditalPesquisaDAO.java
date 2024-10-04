/*
 * import java.sql.Connection; import java.sql.PreparedStatement; import
 * java.sql.SQLException;
 * 
 * public class EditalPesquisaDAO { public void insere(EditalPesquisa edital) {
 * try (Connection conexao = ConnectionFactory.getConnection()) { // Inserir os
 * dados em uma tabela PreparedStatement stmt = conexao.
 * prepareStatement("INSERT INTO tabela_edital_pesquisa (titulo, descricao, prazo, criterios_selecao, requisitos) VALUES (?, ?, ?, ?, ?)"
 * ); stmt.setString(1, edital.getTitulo()); stmt.setString(2,
 * edital.getDescricao()); stmt.setDate(3,
 * java.sql.Date.valueOf(edital.getPrazo())); stmt.setString(4,
 * edital.getCriteriosSelecao()); stmt.setString(5, edital.getRequisitos());
 * stmt.executeUpdate(); } catch (SQLException e) {
 * System.err.println("Erro ao conectar com o banco de dados: " +
 * e.getMessage()); } } }
 */