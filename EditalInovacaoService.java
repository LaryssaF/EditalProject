/*
 * package com.example.EditalProject.services;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * import com.example.EditalProject.Entity.CoordenadorInovacao; import
 * com.example.EditalProject.Entity.EditalExtensao; import
 * com.example.EditalProject.Entity.EditalInovacao;
 * 
 * import com.example.EditalProject.Repository.CoordenadorInovacaoRepository;
 * import com.example.EditalProject.Repository.EditalInovacaoRepository;
 * 
 * 
 * import jakarta.transaction.Transactional;
 * 
 * @Service public class EditalInovacaoService {
 * 
 * private EditalInovacaoRepository editalInovacaoRepository; private
 * CoordenadorInovacaoRepository coordenadorInovacaoRepository;
 * 
 * public void EditalService(EditalInovacaoRepository editalPesquisaRepository,
 * CoordenadorInovacaoRepository coordenadorInovacaoRepository) {
 * this.editalInovacaoRepository = editalPesquisaRepository;
 * this.coordenadorInovacaoRepository = coordenadorInovacaoRepository; }
 * 
 * @Transactional public EditalInovacao criarEdital(EditalInovacao editalDTO,
 * Long idCoordenador) { CoordenadorInovacao coordenador =
 * coordenadorInovacaoRepository.findById(idCoordenador) .orElseThrow();
 * 
 * EditalInovacao edital = new EditalInovacao();
 * edital.setTitulo(editalDTO.getTitulo());
 * edital.setPrazo(editalDTO.getPrazo());
 * edital.setDescricao(editalDTO.getDescricao());
 * edital.setRequisitos(editalDTO.getRequisitos());
 * edital.setCriteriosSelecao(editalDTO.getCriteriosSelecao());
 * 
 * return editalInovacaoRepository.save(edital); }
 * 
 * @Transactional public void removerEdital(Long idEdital) { EditalInovacao
 * edital = editalInovacaoRepository.findById(idEdital) .orElseThrow();
 * 
 * editalInovacaoRepository.delete(edital); } }
 * 
 */