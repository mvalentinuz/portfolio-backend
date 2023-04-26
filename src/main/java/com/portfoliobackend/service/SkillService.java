package com.portfoliobackend.service;

import com.portfoliobackend.model.Skill;
import com.portfoliobackend.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService implements ISkillService{

    @Autowired
    public SkillRepository skillRepository;
    @Override
    public List<Skill> verSkills() {
        return skillRepository.findAll();
    }

    @Override
    public void crearSkill(Skill skill, Long id) {
        skill.setUsuario_id(id);
    skillRepository.save(skill);
    }

    @Override
    public void borrarSkill(Long id) {
    skillRepository.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
        return skillRepository.findById(id).orElse(null);
    }
}
