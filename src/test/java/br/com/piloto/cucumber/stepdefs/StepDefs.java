package br.com.piloto.cucumber.stepdefs;

import br.com.piloto.PilotoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = PilotoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
