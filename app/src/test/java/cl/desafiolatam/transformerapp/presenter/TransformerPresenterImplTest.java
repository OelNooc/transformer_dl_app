package cl.desafiolatam.transformerapp.presenter;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import cl.desafiolatam.transformerapp.TransformerPresenterImpl;
import cl.desafiolatam.transformerapp.TransformerView;

@RunWith(MockitoJUnitRunner.class)
public class TransformerPresenterImplTest {

    @Mock
    private TransformerView view;
    private TransformerPresenterImpl presenter;

    @Before
    public void setUp() throws Exception {
        view = mock(TransformerView.class);
        presenter = new TransformerPresenterImpl();
        presenter.setView(view);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setDate() {
    }

    @Test
    public void getStringDate() {
    }

    @Test
    public void getDaysOnly() {
    }

    @Test
    public void getWeeksOnly() {
    }

    @Test
    public void getTimeStamp() {
    }

    @Test
    public void getDateFormatOne() {
    }

    @Test
    public void getDateFormatTwo() {
    }

    @Test
    public void getDateFormatThree() {
    }

    @Test
    public void getDateFormatFour() {
    }
}