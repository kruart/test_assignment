package com.bintime.service.impl;

import com.bintime.model.Line;
import com.bintime.service.LineService;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Contain unit-tests for {@link LineServiceImpl}
 *
 * @author Krukovskiy Arthur
 *
 */
public class LineServiceImplTest {
    private LineService service;

    @Before
    public void setup() {
        service = new LineServiceImpl();
    }

    @Test
    public void testSaveLine() throws Exception {
        List<Line> linesAfterParsing = service.saveLine(mockPopulate());

        assertEquals("xyz", linesAfterParsing.get(0).getValue());
        assertEquals(4, linesAfterParsing.get(0).getCount());

        assertEquals("yyy", linesAfterParsing.get(1).getValue());
        assertEquals(2, linesAfterParsing.get(1).getCount());
    }

    @Test
    public void testGetNumberOfLines() throws Exception {
        assertEquals(0, service.getNumberOfLines());
        service.saveLine(mockPopulate());
        assertEquals(3, service.getNumberOfLines());
    }

    private String[] mockPopulate() {

        return new String[]{"xyz", "xyz", "yyy", "xyz", "yyy", "smile", "xyz"};
    }
}