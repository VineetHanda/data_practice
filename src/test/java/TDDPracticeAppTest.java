import com.data.practice.TDDPracticeJavaApp;
import org.junit.Test;

public class TDDPracticeAppTest {

    TDDPracticeJavaApp practiceApp = new TDDPracticeJavaApp();

    @Test
    public void checkNegativeNumber() {
        assert(practiceApp.checkNumberInRange(-4) == false);
    }

    @Test
    public void checkOutOfRangeNumber() {
        assert(practiceApp.checkNumberInRange(11) == false);
    }

    @Test
    public void checkNullNumber() {
        assert(practiceApp.checkNumberInRange(null) == false);
    }

    @Test
    public void checkZeroNumber() {
        assert(practiceApp.checkNumberInRange(0) == true);
    }

    @Test
    public void checkTenNumber() {
        assert(practiceApp.checkNumberInRange(10) == true);
    }

    @Test
    public void checkRightRangeNumber() {
        assert(practiceApp.checkNumberInRange(6) == true);
    }
}
