package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job = new Job();
        Job jobTwo = new Job();
        assertEquals(1, job.getId());
        assertFalse(job.equals(jobTwo));
        assertTrue(job.getId() != jobTwo.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

        assertTrue("Product tester".equals(job.getName()));
        assertTrue( job.getEmployer() instanceof Employer );
        assertTrue( job.getEmployer().getValue().equals("ACME") );

    }

    @Test
    public void testJobsForEquality(){
        Job jobOne = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

        Job jobTwo = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );

        assertFalse( jobOne.equals(jobTwo) );

    }

    @Test
    public void toStringTest(){
        String testString = "ID:  1\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence";

        Job job = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location(),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );


        assertFalse( testString.equals(job.toString(job)) );


    }

    @Test
    public void toStringTestTwo(){
        String testString = "\n" +
                "ID:  1\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence" +
                "\n";

        Job job = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location(),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );


        assertTrue( testString.equals(job.toString(job)) );


    }

}
