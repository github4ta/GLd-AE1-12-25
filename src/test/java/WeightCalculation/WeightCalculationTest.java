package WeightCalculation;
import core.BaseSeleniumTest;
import org.junit.jupiter.api.Test;

public class WeightCalculationTest extends BaseSeleniumTest {

    private static final String EXPECTED_RESULT_IDEAL = "Идеальная масса тела";
    private static final String EXPECTED_RESULT_MINIMUM = "Слишком малая масса тела";
    private static final String EXPECTED_RESULT_MAXIMUM = "Значительный избыток массы тела, тучность";
    private static final String EXPECTED_TIP_NO_NAME = "Не указано имя.";
    private static final String EXPECTED_TIP_NO_HEIGHT = "Рост должен быть в диапазоне 50-300 см.";
    private static final String EXPECTED_TIP_NO_WEIGHT = "Вес должен быть в диапазоне 3-500 кг.";
    private static final String EXPECTED_TIP_NO_GENDER = "Не указан пол.";

    @Test
    public void checkCalculate() {
        String name = "John";
        String height = "180";
        String weight = "75";
        String gender = "male";
        MainPage mainPage = new MainPage();
        mainPage.weightCalculate(name, height, weight, gender, EXPECTED_RESULT_IDEAL);
    }

    @Test
    public void checkMinimumValuesCalculate() {
        String name = "John";
        String height = "50";
        String weight = "3";
        String gender = "male";
        MainPage mainPage = new MainPage();
        mainPage.weightCalculate(name, height, weight, gender, EXPECTED_RESULT_MINIMUM);
    }

    @Test
    public void checkMaximumValuesCalculate() {
        String name = "John";
        String height = "300";
        String weight = "500";
        String gender = "male";
        MainPage mainPage = new MainPage();
        mainPage.weightCalculate(name, height, weight, gender, EXPECTED_RESULT_MAXIMUM);
    }

    @Test
    public void checkGenderFemaleCalculate() {
        String name = "Jan";
        String height = "160";
        String weight = "56";
        String gender = "female";
        MainPage mainPage = new MainPage();
        mainPage.weightCalculate(name, height, weight, gender, EXPECTED_RESULT_IDEAL);
    }

    @Test
    public void checkNoNameCalculate() {
        String name = "";
        String height = "180";
        String weight = "75";
        String gender = "male";
        MainPage mainPage = new MainPage();
        mainPage.weightCalculateNegative(name, height, weight, gender, EXPECTED_TIP_NO_NAME);
    }

    @Test
    public void checkNoHeightCalculate() {
        String name = "John";
        String height = "";
        String weight = "500";
        String gender = "female";
        MainPage mainPage = new MainPage();
        mainPage.weightCalculateNegative(name, height, weight, gender, EXPECTED_TIP_NO_HEIGHT);
    }

    @Test
    public void checkNoWeightCalculate() {
        String name = "John";
        String height = "75";
        String weight = "";
        String gender = "female";
        MainPage mainPage = new MainPage();
        mainPage.weightCalculateNegative(name, height, weight, gender, EXPECTED_TIP_NO_WEIGHT);
    }

    @Test
    public void checkNoGenderCalculate() {
        String name = "John";
        String height = "180";
        String weight = "75";
        String gender = "";
        MainPage mainPage = new MainPage();
        mainPage.weightCalculateNegative(name, height, weight, gender, EXPECTED_TIP_NO_GENDER);
    }

    @Test
    public void checkNoParamsCalculate() {
        String name = "";
        String height = "";
        String weight = "";
        String gender = "";
        String expectedTips = EXPECTED_TIP_NO_NAME + "\n" +
                EXPECTED_TIP_NO_HEIGHT + "\n" +
                EXPECTED_TIP_NO_WEIGHT + "\n" +
                EXPECTED_TIP_NO_GENDER;
        MainPage mainPage = new MainPage();
        mainPage.weightCalculateNegativeAll(name, height, weight, gender, expectedTips);
    }
}
