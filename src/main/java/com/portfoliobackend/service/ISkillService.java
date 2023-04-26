package com.portfoliobackend.service;

import com.portfoliobackend.model.Skill;

import java.util.List;

public interface ISkillService {

    public List<Skill> verSkills();
    public void crearSkill(Skill skill, Long id);
    public void borrarSkill(Long id);
    public Skill buscarSkill(Long id);

}
