/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebafernandolugo.orangehrmautomation.stepdefinitions;

import com.pruebafernandolugo.questions.CandidateStatus;
import com.pruebafernandolugo.tasks.AddCandidate;
import com.pruebafernandolugo.tasks.Login;
import com.pruebafernandolugo.ui.RecruitmentPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import java.util.List;
import java.util.Map;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.questions.Text;
import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author FERAN
 */
public class ContratacionStepDefinitions {
    
    @Managed(driver = "chrome")
    public WebDriver hisBrowser;
    
    private Actor actor = Actor.named("Reclutador");
    
    @Dado("que el usuario ha iniciado sesión en OrangeHRM")
    public void queElUsuarioHaIniciadoSesiónEnOrangeHRM() {
        actor.can(BrowseTheWeb.with(hisBrowser));
        actor.wasAbleTo(
                Open.url("https://opensource-demo.orangehrmlive.com/"),
                Login.withCredentials("Admin", "admin123")
        );
    }
    
    @Cuando("el usuario navega a la sección de Recruitment")
    public void elUsuarioNavegaALaSecciónDeRecruitment() {
        // La navegación se realiza en la tarea AddCandidate
    }
    
    @Y("agrega un nuevo candidato con la siguiente información:")
    public void agregaUnNuevoCandidatoConLaSiguienteInformación(List<Map<String, String>> candidateInfo) {
        Map<String, String> info = candidateInfo.get(0);
        actor.attemptsTo(
                AddCandidate.withInfo(
                        info.get("Nombre"),
                        info.get("Apellido"),
                        info.get("Email"),
                        info.get("Vacante")
                )
        );
    }
    
    @Entonces("el candidato debe aparecer en la lista de candidatos")
        public void elCandidatoDebeAparecerEnLaListaDeCandidatos() {
            actor.should(
                    seeThat("el candidato en la lista",
                            Text.of(RecruitmentPage.CANDIDATE_LIST),
                            equalTo(actor.recall("fullName"))
                    )
            );
    }

    
    @Y("el estado del candidato debe ser {string}")
    public void elEstadoDelCandidatoDebeSer(String expectedStatus) {
        actor.should(
                seeThat("el estado del candidato", 
                        CandidateStatus.value(), 
                        equalTo(expectedStatus))
        );
    }   
    
    
    
    
    
    
    
    
    
}
