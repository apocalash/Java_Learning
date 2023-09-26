import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import  org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester{
    @InjectMocks
    MathApplication mathApplication = new MathApplication();
    @Mock
    CalculatorService calculatorService;

    @Test
    public void testAdd(){
        when(calculatorService.add(10.0,20.0)).thenReturn(30.0);
        assertEquals(mathApplication.add(10.0,20.0),30.0,0);
    }
}