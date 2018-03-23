package com.example.mp4.theenglishgentleman.mp4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class EnglishGentlemanTest {

    @Autowired
    EnglishGentleman englishGentleman;

    @Test
    void hadAgoodDay() {
        // precondition or setup
        // action or calculate result
        // assertions
        englishGentleman.read(new Newspaper());
        englishGentleman.smoke(new Cigar());

        boolean hadAgoodDay = englishGentleman.hadAgoodDay();

        assertEquals(true, hadAgoodDay);
    }
}