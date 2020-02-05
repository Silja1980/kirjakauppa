package bookstore.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bookstore.bookstore.domain.kirja;
import bookstore.bookstore.domain.kirjareposity;



@Controller
public class kirjacontroller {
	@Autowired
	private kirjareposity repository; 
	
    @RequestMapping(value= "/kirjalista")
    public String studentList(Model model) {	
        model.addAttribute("kirjat", repository.findAll());
        return "kirjalista";
    }
  
    @RequestMapping(value = "/add")
    public String lisaaKirja(Model model){
    	model.addAttribute("kirja", new kirja());
        return "lisaakirja";
    }     
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(kirja kirja){
        repository.save(kirja);
        return "redirect:kirjalista";
    }    

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteKirja(@PathVariable("id") Long kirjaid, Model model) {
    	repository.deleteById(kirjaid);
        return "redirect:../kirjalista";
    }    

	
	
}
