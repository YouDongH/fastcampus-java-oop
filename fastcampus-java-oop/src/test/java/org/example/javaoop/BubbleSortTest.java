package org.example.javaoop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("given_List_WhenExcutingThenReturnSortedList")
    @Test
    void given_List_WhenExcutingThenReturnSortedList() {
        //Given
        BubbleSort<Integer>bubbleSort= new BubbleSort<>();
        // When
        List<Integer> actual=bubbleSort.sort(List.of(3,4,5,1,2));
        //Then
        assertEquals(List.of(1,2,3,4,5), actual);


    }
}