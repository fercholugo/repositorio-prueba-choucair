/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebafernandolugo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 *
 * @author FERAN
 */
public class RecruitmentPage {
    
    public static final Target RECRUITMENT_MENU = Target.the("menú de reclutamiento")
            .located(By.xpath("//span[contains(@class, 'oxd-text') and contains(@class, 'oxd-main-menu-item--name') and text()='Recruitment']"));
    
    public static final Target ADD_BUTTON = Target.the("botón de agregar")
            .located(By.xpath("//button[contains(@class, 'oxd-button--medium') and contains(@class, 'oxd-button--secondary') and contains(., 'Add')]"));
    
    public static final Target FIRST_NAME = Target.the("campo de nombre")
            .located(By.xpath("//input[contains(@class, 'oxd-input--active') and contains(@class, 'orangehrm-firstname') and @placeholder='First name']"));
    
    public static final Target LAST_NAME = Target.the("campo de apellido")
            .located(By.xpath("//input[contains(@class, 'oxd-input--active') and contains(@class, 'orangehrm-lastname') and @placeholder='Surname']"));
    
    public static final Target EMAIL = Target.the("campo de email")
                .located(By.xpath("((//input[@class='oxd-input oxd-input--active' and @placeholder='Type here'])[1]"));
    
    public static final Target CONTACT_NUMBER = Target.the("campo de celular")
                .located(By.xpath("((//input[@class='oxd-input oxd-input--active' and @placeholder='Type here'])[2]"));
    
    public static final Target VACANCY = Target.the("lista de vacantes")
            .located(By.xpath("(//div[contains(@class, 'oxd-select-text') and contains(@class, 'oxd-select-text--active') and .//div[text()='-- Select --']])[1]"));
    
    
    public static final Target SAVE_BUTTON = Target.the("botón de guardar")
            .located(By.cssSelector("button[type='submit']"));
    
    public static final Target CANDIDATE_LIST = Target.the("lista de candidatos")
            .located(By.cssSelector(".oxd-table-body"));
    
    //pendiente verificar
    public static final Target CANDIDATE_STATUS = Target.the("estado del candidato")
            .located(By.xpath("//div[contains(@class, 'oxd-table-cell')][6]"));
}
