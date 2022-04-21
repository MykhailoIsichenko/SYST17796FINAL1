/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4project;

/**
 *
 * @author mikei
 */
 import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
   
	@Test
public void maltiplication() {
		Calculator sut = new Calculator();
		int expected = 10;
		int actual = (int) sut.maltiplication(5, 2);
		assertThat(actual,is(expected));
	}
}
