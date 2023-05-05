package com.proyecto.empleados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        return "radicados";
    }

    @GetMapping("/radicados")
    public String listRadicado(Model model) {
        model.addAttribute("radicados", RadicadoService.getAllRadicado());
        return "radicados";
    }

    @GetMapping("/radicados/new")
    public String createRadicadoForm(Model model) {

        Radicado radicado = new Radicado();

        model.addAttribute("radicado", radicado);

        return "create_radicado";
    }

    
    @PostMapping("/radicados")
    public String saveRadicado(@ModelAttribute("radicado") Radicado radicado) {
        RadicadoService.saveRadicado(radicado);
        return "redirect:/radicados";
    }
    
}
