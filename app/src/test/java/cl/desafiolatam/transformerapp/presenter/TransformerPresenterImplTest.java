package cl.desafiolatam.transformerapp.presenter;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import cl.desafiolatam.transformerapp.TransformerPresenterImpl;
import cl.desafiolatam.transformerapp.TransformerView;

@RunWith(MockitoJUnitRunner.class)
public class TransformerPresenterImplTest {

    @Mock
    private TransformerView view;
    private TransformerPresenterImpl presenter;
    private final Calendar calendarDate =
            Calendar.getInstance(TimeZone.getTimeZone("UTC"));


    @Before
    public void setUp() throws Exception {
        view = mock(TransformerView.class);
        presenter = new TransformerPresenterImpl();
        presenter.setView(view);
        calendarDate.set(2022,2,14);
        Long date = calendarDate.getTime().getTime();
        presenter.setDate(date);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void setDate() {
        Long esperado = calendarDate.getTime().getTime();
                //verify(view).showDateResult();
        assertEquals(esperado, presenter.getTimeStamp());
    }

    @Test
    public void getStringDate() {
        SimpleDateFormat format = new SimpleDateFormat("EEEE, MMMM d, yyyy", Locale.getDefault());
        format.setTimeZone(TimeZone.getTimeZone("UTC"));
        String  dateString = format.format(calendarDate.getTime());

        assertEquals(dateString, presenter.getStringDate());
    }

    @Test
    public void getDaysOnlyCorrecto() {
        String dia1 = "Día del mes: 14";
        //String dia2 = "Día del mes: 12";

        assertEquals(dia1, presenter.getDaysOnly());
    }
    @Test
    public void getDaysOnlyIncorrecto() {
        String dia2 = "Día del mes: 12";

        assertNotEquals(dia2, presenter.getDaysOnly());
    }

    @Test
    public void getWeeksOnlyCorrecto() {
        String semana1 = "Semana del año: 12";
        assertEquals(semana1, presenter.getWeeksOnly());
    }
    @Test
    public void getWeeksOnlyIncorrecto() {
        String semana1 = "Semana del año: 10";
        assertNotEquals(semana1, presenter.getWeeksOnly());
    }

    @Test
    public void getTimeStampCorrecto() {
        Long timeStamp1 = calendarDate.getTimeInMillis();
        assertEquals(timeStamp1, presenter.getTimeStamp());
    }
    @Test
    public void getTimeStampIncorrecto() {
        Long timeStamp1 = calendarDate.getTimeInMillis() + 2;
        assertNotEquals(timeStamp1, presenter.getTimeStamp());
    }

    @Test
    public void getDateFormatOneCorrecto() {
        String formato1 = "14/03/2022";

        assertEquals(formato1, presenter.getDateFormatOne());
    }
    @Test
    public void getDateFormatOneIncorrecto() {
        String formato2 = "14-03-2022";

        assertNotEquals(formato2, presenter.getDateFormatOne());
    }

    @Test
    public void getDateFormatTwoCorrecto() {
        String formato1 = "14 - 03 - 2022";

        assertEquals(formato1, presenter.getDateFormatTwo());
    }
    @Test
    public void getDateFormatTwoIncorrecto() {
        String formato2 = "14/03/2022";

        assertNotEquals(formato2, presenter.getDateFormatTwo());
    }

    @Test
    public void getDateFormatThreeCorrecto() {
        String formato1 = "lun., mar. 14, 2022";

        assertEquals(formato1, presenter.getDateFormatThree());
    }
    @Test
    public void getDateFormatThreeIncorrecto() {
        String formato2 = "14/03/2022";

        assertNotEquals(formato2, presenter.getDateFormatThree());
    }

    @Test
    public void getDateFormatFourCorrecto() {
        String formato1 = "lunes 14";

        assertEquals(formato1, presenter.getDateFormatFour());
    }
    @Test
    public void getDateFormatFourIncorrecto() {
        String formato2 = "14/03/2022";

        assertNotEquals(formato2, presenter.getDateFormatFour());
    }

}