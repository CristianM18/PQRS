package com.proyecto.empleados.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.proyecto.empleados.Entity.Radicado;
import com.proyecto.empleados.service.RadicadoService;


@Controller
public class EmpleadoController {

    @Autowired
    private RadicadoService RadicadoService;

    public EmpleadoController(RadicadoService RadicadoService) {
        this.RadicadoService = RadicadoService;
    }

    @GetMapping("/")
    public String loginEmpleados(Model model) {
        model.addAttribute("empleados", RadicadoService.getAllRadicado());
        return "empleados";
    }

    @GetMapping("/empleados")
    public String listEmpleados(Model model) {
        model.addAttribute("empleados", RadicadoService.getAllRadicado());
        return "empleados";
    }

    @GetMapping("/empleados/new")
    public String createEmpleadoForm(Model model) {

        Radicado empleado = new Radicado();

        model.addAttribute("empleado", empleado);

        return "create_empleado";
    }

    
    @PostMapping("/empleados")
    public String saveEmpleado(@ModelAttribute("empleado") Radicado empleado) {
        RadicadoService.saveRadicado(empleado);
        return "redirect:/empleados";
    }
    
}
