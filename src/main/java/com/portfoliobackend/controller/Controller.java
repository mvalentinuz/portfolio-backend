package com.portfoliobackend.controller;

import com.portfoliobackend.model.*;
import com.portfoliobackend.service.IEducacionService;
import com.portfoliobackend.service.IExperienciaService;
import com.portfoliobackend.service.IInformacionPersonalService;
import com.portfoliobackend.service.IProyectoService;
import com.portfoliobackend.service.ISkillService;
import com.portfoliobackend.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Controller {
    @Autowired
    private IUsuarioService usuarioService;
    @Autowired
    private ISkillService skillService;
    @Autowired
    private IProyectoService proyectoService;
    @Autowired
    private IInformacionPersonalService infoService;
    @Autowired
    private IExperienciaService expService;
    @Autowired
    private IEducacionService eduService;

    @PostMapping("/iniciar-sesion")
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {
        Usuario user= usuarioService.verUsuarios().get(0);
        if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @PostMapping("/new/usuario")
    public void agregarUsuario(@RequestBody Usuario user){
        usuarioService.crearUsuario(user);
    }
    @GetMapping("/ver/usuarios")
    @ResponseBody
    public List<Usuario> verUsuarios(){
        return usuarioService.verUsuarios();
    }
    @DeleteMapping("/delete/usuario/{id}")
    public void borrarUsuario(@PathVariable Long id){
        usuarioService.borrarUsuario(id);
    }

    @PostMapping("/new/skill")
    public void agregarSkill(@RequestBody Skill skill){
        Usuario user= usuarioService.verUsuarios().get(0);
        skillService.crearSkill(skill, user.getId());
    }
    @GetMapping("/ver/skills")
    @ResponseBody
    public List<Skill> verSkills(){
        return skillService.verSkills();
    }
    @DeleteMapping("/delete/skill/{id}")
    public void borrarSkill(@PathVariable Long id){
        skillService.borrarSkill(id);
    }

    @PostMapping("/new/proyecto")
    public void agregarProyecto(@RequestBody Proyecto proyecto){
        Usuario user= usuarioService.verUsuarios().get(0);
        proyectoService.crearProyecto(proyecto, user.getId());
    }
    @GetMapping("/ver/proyectos")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyectoService.verProyectos();
    }
    @DeleteMapping("/delete/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectoService.borrarProyecto(id);
    }

    @PostMapping("/new/infopersonal")
    public void agregarInfoPersonal(@RequestBody InformacionPersonal info){
        infoService.crearInfoPersonal(info);
    }
    @GetMapping("/ver/infopersonales")
    @ResponseBody
    public List<InformacionPersonal> verInfoPersonales(){
        return infoService.verInfoPersonales();
    }
    @DeleteMapping("/delete/infopersonal/{id}")
    public void borrarInfoPersonal(@PathVariable Long id){
        infoService.borrarInfoPersonal(id);
    }
    @PatchMapping("/edit/infopersonal")
    public void editarInfoPersonal(@RequestBody InformacionPersonal info){
    infoService.editarInfoPersonal(info);
    }

    @PostMapping("/new/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia experiencia){
        Usuario user= usuarioService.verUsuarios().get(0);
        expService.crearExperiencia(experiencia, user.getId());
    }
    @GetMapping("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expService.verExperiencias();
    }
    @DeleteMapping("/delete/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expService.borrarExperiencia(id);
    }

    @PostMapping("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion educacion){
        Usuario user= usuarioService.verUsuarios().get(0);
        eduService.crearEducacion(educacion, user.getId());
    }
    @GetMapping("/ver/educaciones")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return eduService.verEducaciones();
    }
    @DeleteMapping("/delete/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduService.borrarEducacion(id);
    }
}
