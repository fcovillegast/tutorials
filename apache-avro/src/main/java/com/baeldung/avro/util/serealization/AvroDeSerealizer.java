package com.baeldung.avro.util.serealization;

import com.baeldung.avro.util.model.AvroHttpRequest;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class AvroDeSerealizer<T> {

    private static Logger logger = LoggerFactory.getLogger(AvroDeSerealizer.class);

    public SpecificRecord deSerealizeAvroHttpRequestJSON(byte[] data, T reference) {
        DatumReader<SpecificRecord> reader = new SpecificDatumReader<SpecificRecord>((Class<SpecificRecord>) reference);
        Decoder decoder = null;
        try {
            decoder = DecoderFactory.get()
                .jsonDecoder(AvroHttpRequest.getClassSchema(), new String(data));
            return reader.read(null, decoder);
        } catch (IOException e) {
            logger.error("Deserialization error" + e.getMessage());
        }
        return null;
    }

    public SpecificRecord deSerealizeAvroHttpRequestBinary(byte[] data, T reference) {
        DatumReader<SpecificRecord> employeeReader = new SpecificDatumReader<SpecificRecord>((Class<SpecificRecord>) reference);
        Decoder decoder = DecoderFactory.get()
            .binaryDecoder(data, null);
        try {
            return employeeReader.read(null, decoder);
        } catch (IOException e) {
            logger.error("Deserialization error" + e.getMessage());
        }
        return null;
    }
}
