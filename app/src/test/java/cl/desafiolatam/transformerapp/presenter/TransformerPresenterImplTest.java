package cl.desafiolatam.transformerapp.presenter;

import static org.mockito.Mockito.mock;

import org.junit.After;
import org.junit.Before;
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
}
