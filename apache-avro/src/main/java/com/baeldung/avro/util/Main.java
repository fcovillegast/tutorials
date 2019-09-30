package com.baeldung.avro.util;

import avro.shaded.com.google.common.collect.Lists;
import com.baeldung.avro.util.model.Active;
import com.baeldung.avro.util.model.AvroHttpRequest;
import com.baeldung.avro.util.model.ClientIdentifier;
import com.baeldung.avro.util.model.Employed;
import com.baeldung.avro.util.serealization.AvroDeSerealizer;
import com.baeldung.avro.util.serealization.AvroSerealizer;
import org.apache.avro.SchemaBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String ...args) {
        System.out.println("Main...");

        Employed employed = Employed.newBuilder().setqJobs(10).setqJobs(2);
        AvroSerealizer serealizer = new AvroSerealizer();
        byte[] resp = serealizer.serealizeAvroHttpRequestJSON(employed);



    }
}
