/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebafernandolugo.questions;

import com.pruebafernandolugo.ui.RecruitmentPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

/**
 *
 * @author FERAN
 */
public class CandidateStatus implements Question<String> {

    public static Question<String> value() {
        return new CandidateStatus();
    }
        
    
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RecruitmentPage.CANDIDATE_STATUS).answeredBy(actor);
    }
    
    
    
    
}
