import domain.Hospital;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospitalParserTest {

    // alt + insert

    @Test
    @DisplayName("test doing well parse id")
    void parseId() {
        HospitalParser hp = new HospitalParser();
        Hospital hospital = hp.parser("eee");
        Assertions.assertEquals("1",hospital.getId());
    }
}