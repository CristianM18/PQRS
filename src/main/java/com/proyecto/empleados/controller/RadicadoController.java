package com.proyecto.empleados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.proyecto.empleados.Entity.Radicado;
import com.proyecto.empleados.service.RadicadoService;


@Controller
public class RadicadoController {

    @Autowired
    private RadicadoService RadicadoService;

    public RadicadoController(RadicadoService RadicadoService) {
        this.RadicadoService = RadicadoService;
    }

    @GetMapping("/")
    public String loginRadicado(Model model) {
        model.addAttribute("radicados", RadicadoService.getAllRadicado());
        return "radicado";
    }

    @GetMapping("/radicados")
    public String listRadicado(Model model) {
        model.addAttribute("radicados", RadicadoService.getAllRadicado());
        return "radicado";
    }

    @GetMapping("/radicados/new")
    public String createRadicadoForm(Model model) {

        Radicado radicado = new Radicado();

        model.addAttribute("radicado", radicado);

        return "crear_radicado";
    }

    @GetMapping("/radicados/see/{id}")
    public String editEmpleadoForm(@PathVariable Long id, Model model) {
        Radicado st = RadicadoService.getRadicadoById(id);

        model.addAttribute("radicado", st);

        return "consultar_radicado";
    }

    @PostMapping("/radicados/{id}")
    public String updateEmpleado(@PathVariable Long id,
            @ModelAttribute("radicado") Radicado radicado,
            Model model) {
        // sacar el estudiante de la b.d. por el id
        Radicado existentRadicado = RadicadoService.getRadicadoById(id);
        // cargarlo
        existentRadicado.setId(id);
        existentRadicado.setNoradicado(radicado.getNoradicado());
        existentRadicado.setCedula(radicado.getCedula());
        existentRadicado.setTiporadicado(radicado.getTiporadicado());
        existentRadicado.setEstadoradicado(radicado.getEstadoradicado());
        existentRadicado.setFecharadicado(radicado.getFecharadicado());
        existentRadicado.setComentarioradicado(radicado.getComentarioradicado());
        existentRadicado.setAnexoradicado(radicado.getAnexoradicado());
        existentRadicado.setJustificacionradicado(radicado.getJustificacionradicado());

        // guardar el estudiante actualizado
        RadicadoService.updateRadicado(existentRadicado);

        return "redirect:/radicados";
    }
    
    @PostMapping("/radicados")
    public String saveRadicado(@ModelAttribute("radicados") Radicado radicado) {
        RadicadoService.saveRadicado(radicado);
        return "redirect:/radicados";
    }
    
}
