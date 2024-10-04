/*
 * package com.example.EditalProject.Controllers;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.PostMapping; import
 * org.springframework.web.bind.annotation.RequestBody; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.example.EditalProject.Entity.CoordenadorExtensao; import
 * com.example.EditalProject.Entity.CoordenadorInovacao; import
 * com.example.EditalProject.Entity.CoordenadorPesquisa; import
 * com.example.EditalProject.Entity.User; import
 * com.example.EditalProject.Repository.UserRepository;
 * 
 * @RestController
 * 
 * @RequestMapping("/users") public class UserController {
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * @PostMapping("/usuario") public User criarUsuarioGeral(@RequestBody User
 * user) { return userRepository.save(user); }
 * 
 * @PostMapping("/coordenador-pesquisa") public User
 * criarCoordenadorPesquisa(@RequestBody CoordenadorPesquisa coordenador) {
 * return userRepository.save(coordenador); }
 * 
 * @PostMapping("/coordenador-extensao") public User
 * criarCoordenadorExtensao(@RequestBody CoordenadorExtensao coordenador) {
 * return userRepository.save(coordenador); }
 * 
 * @PostMapping("/coordenador-inovacao") public User
 * criarCoordenadorInovacao(@RequestBody CoordenadorInovacao coordenador) {
 * return userRepository.save(coordenador); } }
 */