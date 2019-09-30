package com.baeldung.avro.util.model;

import org.apache.avro.Schema;
import org.apache.avro.specific.SpecificRecord;
import org.apache.avro.specific.SpecificRecordBase;

public class Employed extends SpecificRecordBase implements SpecificRecord {


    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public Object get(int i) {
        return null;
    }

    @Override
    public void put(int i, Object o) {

    }

    private int yearOld;
    private Integer qJobs;

    public static Employed newBuilder() {
        return new Employed();
    }

    public int getYearOld() {
        return yearOld;
    }

    public Employed setYearOld(int yearOld) {
        this.yearOld = yearOld;
        return this;
    }

    public Integer getqJobs() {
        return qJobs;
    }

    public Employed setqJobs(Integer qJobs) {

        this.qJobs = qJobs;
        return this;
    }
}
