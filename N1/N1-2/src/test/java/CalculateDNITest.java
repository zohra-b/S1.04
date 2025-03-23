    import org.CalculateDNI;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.params.ParameterizedTest;
    import org.junit.jupiter.params.provider.MethodSource;

    import java.util.stream.Stream;

    import static org.junit.jupiter.api.Assertions.assertEquals;

    class CalculateDNITest {
        CalculateDNI calculateDni;

        @BeforeEach
        void setUp(){
            calculateDni = new CalculateDNI();
        }
        public static Stream <Object[]> datas(){
           return Stream.of(new Object[][]{
                   { 12345678, "Z" },
                   { 52416987, "X" },
                   { 78945612, "K" },
                   { 36985214, "H" },
                   { 98712365, "E" },
                   { 14785236, "P" },
                   { 65478912, "M" },
                   { 25896314, "Q" },
                   { 85214796, "A" },
                   { 41526378, "Q" }
           });
        }
        @ParameterizedTest
        @MethodSource("datas")
        void CalculateDniTest(int number, String letter){
            assertEquals(calculateDni.calculateDni(number), letter);
        }


    }
