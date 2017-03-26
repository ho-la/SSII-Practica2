package ssii.practica2.restController;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ssii.practica2.model.Usuario;
import ssii.practica2.service.UsuarioService;


@RestController
public class UsuarioRestController {
	@Autowired
	private UsuarioService userService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<Usuario> listOneUsers() {
        Usuario users = userService.getUsuarioPorNombre("Antonio");
        
        if(users==null){
            return new ResponseEntity<Usuario>(HttpStatus.NO_CONTENT);
            //You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<Usuario>(users, HttpStatus.OK);
    }
	@RequestMapping(value = "/allUser", method = RequestMethod.GET)
    public ResponseEntity<List<Usuario>> listAllUsers() {
        List<Usuario> users = userService.getUsuarios();
        Usuario aux = new Usuario();
        aux.setNombre("hola");
        users.add(aux);
        if(users.isEmpty()){
            return new ResponseEntity<List<Usuario>>(HttpStatus.NO_CONTENT);
            //You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Usuario>>(users, HttpStatus.OK);
    }
	@RequestMapping("/foo")
	public ModelAndView handleFoo(Model model) throws IOException {
	    //response.sendRedirect("pagina");//(HttpServletResponse response)
		//Usuario prueba = new Usuario();
		//prueba.setNombre("Alexey");
		//repositorioUsuarios.save(prueba);
		List<Usuario> users= userService.getUsuarios();
		System.out.println(users.size());
		model.addAttribute("usuarios",  userService.getUsuarios());
	    ModelAndView mav = new ModelAndView("user");
	    return mav;
	}
	
	@RequestMapping(value = "/user/{index}", method = RequestMethod.GET)
	public Usuario getPelicula(@PathVariable("index") int index) {
		return userService.getUsuariosById(index);
	}
}
