/*
 * package com.example.EditalProject.services;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * import com.example.EditalProject.Entity.CoordenadorPesquisa; import
 * com.example.EditalProject.Entity.EditalInovacao; import
 * com.example.EditalProject.Entity.EditalPesquisa; import
 * com.example.EditalProject.Repository.CoordenadorPesquisaRepository; import
 * com.example.EditalProject.Repository.EditalPesquisaRepository;
 * 
 * import jakarta.transaction.Transactional;
 * 
 * @Service public class EditalPesquisaService {
 * 
 * private EditalPesquisaRepository editalPesquisaRepository; private
 * CoordenadorPesquisaRepository coordenadorPesquisaRepository;
 * 
 * public void EditalService(EditalPesquisaRepository editalPesquisaRepository,
 * CoordenadorPesquisaRepository coordenadorPesquisaRepository) {
 * this.editalPesquisaRepository = editalPesquisaRepository;
 * this.coordenadorPesquisaRepository = coordenadorPesquisaRepository; }
 * 
 * @Transactional public EditalPesquisa criarEdital(EditalPesquisa editalDTO,
 * Long idCoordenador) { CoordenadorPesquisa coordenador =
 * coordenadorPesquisaRepository.findById(idCoordenador) .orElseThrow();
 * 
 * EditalPesquisa edital = new EditalPesquisa();
 * edital.setTitulo(editalDTO.getTitulo());
 * edital.setPrazo(editalDTO.getPrazo());
 * edital.setDescricao(editalDTO.getDescricao());
 * edital.setRequisitos(editalDTO.getRequisitos());
 * edital.setCriteriosSelecao(editalDTO.getCriteriosSelecao());
 * 
 * return editalPesquisaRepository.save(edital); }
 * 
 * @Transactional public void removerEdital(Long idEdital) { EditalPesquisa
 * edital = editalPesquisaRepository.findById(idEdital) .orElseThrow();
 * 
 * editalPesquisaRepository.delete(edital); } }
 */

