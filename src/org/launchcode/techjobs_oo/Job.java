package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(){
       this.id = nextId;
       nextId ++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency =coreCompetency;
    }

    public int getId() {
        return id;
    }


    //getters and setters


    public String setName(){
        return name;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId() &&
                Objects.equals(getName(), job.getName()) &&
                Objects.equals(getEmployer(), job.getEmployer()) &&
                Objects.equals(getLocation(), job.getLocation()) &&
                Objects.equals(getPositionType(), job.getPositionType()) &&
                Objects.equals(getCoreCompetency(), job.getCoreCompetency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());
    }

    public Employer getEmployer(){
        return employer;
    }

    public void setEmployer(Employer employer){
        this.employer = employer;
    }

    public Location getLocation(){
        return location;
    }

    public void setLocation(Location location){
        this.location = location;
    }

    public PositionType getPositionType(){
        return positionType;
    }

    public void setPositionType(PositionType positionType){
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency(){
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency){
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        return toString(this);
    }

    public String toString(Job job) {
        return "\n" +
                "ID:  "+getToStringValue(job.getId())+"\n" +
                "Name: "+getToStringValue(job.getName())+"\n" +
                "Employer: "+getToStringValue(job.getEmployer().getValue()) +"\n" +
                "Location: "+getToStringValue(job.getLocation().getValue())+"\n" +
                "Position Type: "+getToStringValue(job.getPositionType().getValue())+"\n" +
                "Core Competency: "+getToStringValue(job.getCoreCompetency().getValue())+"" +
                "\n";
    }


    private Object getToStringValue(Object data){
        if( data == null || "".equals(data)){
            return "Data not available";
        }
        return data;
    }


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
