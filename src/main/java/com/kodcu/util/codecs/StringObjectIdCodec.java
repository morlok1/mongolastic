package com.kodcu.util.codecs;

import org.bson.BsonWriter;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.ObjectIdCodec;
import org.bson.types.ObjectId;

public class StringObjectIdCodec extends ObjectIdCodec {

    @Override
    public void encode(BsonWriter writer, ObjectId value, EncoderContext encoderContext) {
        writer.writeString(value.toHexString());
    }
}
