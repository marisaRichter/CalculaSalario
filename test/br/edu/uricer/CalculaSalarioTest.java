/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class CalculaSalarioTest {
    
    Funcionario funcionario;   
    
    @Test
    public void dev(){        
        funcionario = new Funcionario("Dev", "dev@mail.com", (new BigDecimal(3000)), "DESENVOLVIMENTO"); 
        BigDecimal salario = funcionario.getSalarioLiquido();
        
        assertEquals(new BigDecimal(4000), salario);
        
    }
    /*
    @Test
    public void dba(){        
        funcionario = new Funcionario("Dba", "dba@mail.com", 2000, "DBA");        
    }
    
    @Test
    public void test(){        
        funcionario = new Funcionario("TEST", "test@mail.com", 2000, "TESTADOR");      
    }
    
    @Test
    public void ger(){     
        funcionario = new Funcionario("Ger", "ger@mail.com", 5000, "GERENTE"); 
    }*/
}
